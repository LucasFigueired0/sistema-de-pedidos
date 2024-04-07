package services;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class UpdateStatusOrderApi {

    public static int atualizarStatusPedido(int pedidoId, int usuarioId, String novoStatus) throws IOException {

        String urlEndpoint = "http://localhost:8080/pedidos/atualizar-status";
      
        String jsonInputString = "{" +
                "\"pedidoId\":" + pedidoId + "," +
                "\"usuarioId\":" + usuarioId + "," +
                "\"novoStatus\":\"" + novoStatus + "\"" +
                "}";
   
        HttpClient httpClient = HttpClients.createDefault();
       
        HttpPut httpPut = new HttpPut(urlEndpoint);
      
        StringEntity entity = new StringEntity(jsonInputString);
        entity.setContentType("application/json");
        httpPut.setEntity(entity);
      
        httpPut.setHeader("Accept", "application/json");
        httpPut.setHeader("Content-type", "application/json");
      
        HttpResponse response = httpClient.execute(httpPut);
              
        int statusCode = response.getStatusLine().getStatusCode();      
        
        return statusCode;
    }
}
