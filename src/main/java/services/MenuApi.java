package services;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.google.gson.Gson;
import models.MenuItem;

public class MenuApi {

    public static MenuItem[] listarMenu(int usuario_id) throws IOException
    {  
        String urlEndpoint = "http://localhost:8080/cardapio/listar-itens";
        
        String jsonInputString = "{\"usuarioId\":" + usuario_id + "}";
        
        HttpClient httpClient = HttpClients.createDefault();
                
        HttpPost httpPost = new HttpPost(urlEndpoint);        
       
        StringEntity entity = new StringEntity(jsonInputString);
        entity.setContentType("application/json");
        httpPost.setEntity(entity);        
       
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");
       
        HttpResponse response = httpClient.execute(httpPost);
       
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            result.append(line);
        }
        
        Gson gson = new Gson();
        MenuItem[] menuItens = gson.fromJson(result.toString(), MenuItem[].class);
        
        return menuItens;
    }
}
