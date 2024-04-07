package services;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class RegisterUserApi {

    public static String doPost(String email, String nome_empresa, String nome_funcionario, String senha, String telefone) throws IOException {
 
        HttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost("http://localhost:8080/usuario");
        
        String json
                = "{\"email\":\"" + email
                + "\",\"nome_empresa\":\"" + nome_empresa
                + "\",\"nome_funcionario\":\"" + nome_funcionario
                + "\",\"senha\":\"" + senha
                + "\",\"telefone\":\"" + telefone
                + "\"}";
              
        StringEntity entity = new StringEntity(json, StandardCharsets.UTF_8);
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

        return result.toString();
    }
}
