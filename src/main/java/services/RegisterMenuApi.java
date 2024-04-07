package services;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class RegisterMenuApi {

    public static int registerMenu(String nomeItem, double preco, String tipoPedido, int usuarioId) throws IOException {
        
        HttpClient httpClient = HttpClients.createDefault();
       
        HttpPost httpPost = new HttpPost("http://localhost:8080/cardapio");

        
        String json
                = "{\"nomeItem\":\"" + nomeItem
                + "\",\"preco\":" + preco
                + ",\"tipo_pedido\":\"" + tipoPedido
                + "\",\"usuario_id\":" + usuarioId
                + "}";
        
        StringEntity entity = new StringEntity(json, StandardCharsets.UTF_8);
        httpPost.setEntity(entity);
       
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");
        
        HttpResponse response = httpClient.execute(httpPost);

        return response.getStatusLine().getStatusCode();
    }
}
