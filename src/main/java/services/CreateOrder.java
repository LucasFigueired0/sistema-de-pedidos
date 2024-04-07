package services;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class CreateOrder {

    public static int criarPedido(String descricao, String status, double preco, int usuarioId) throws IOException {
        String urlEndpoint = "http://localhost:8080/pedidos/criar-pedido";
        
        String json = "{\"descricao\":\"" + descricao +
                "\",\"status\":\"" + status +
                "\",\"preco\":" + preco +
                ",\"usuarioId\":" + usuarioId +
                "}";
        
        HttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(urlEndpoint);

        StringEntity entity = new StringEntity(json);
        httpPost.setEntity(entity);

        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");

        HttpResponse response = httpClient.execute(httpPost);

        int statusCode = response.getStatusLine().getStatusCode();      

        return statusCode;
    }
}
