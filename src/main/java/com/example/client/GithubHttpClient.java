package com.example.client;

import com.example.exceptions.ConectionErrorException;
import com.example.exceptions.UserNotFoundException;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class GithubHttpClient {

    private HttpClient client;
    private static final String BASE_URL = "https://api.github.com/users/";

    // para construir uma nova coneção com a API e guardar na memoria
    public GithubHttpClient(HttpClient client) {this.client = client;}

    public String buscarUsuario(String usuario) throws UserNotFoundException, ConectionErrorException{
        String endpoitGetUser = BASE_URL+usuario;

        try{
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(endpoitGetUser))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() ==404){ throw new UserNotFoundException("Usuário " + usuario+ " não encontrado no GitHub");}

        if (response.statusCode() !=200){ throw new ConectionErrorException("Erro na requisição: Status" +  response.statusCode());}

        return response.body();
    }
        catch (UserNotFoundException | ConectionErrorException e){throw e;}
        catch (Exception e){ throw new ConectionErrorException("Erro ao conectar: " + e.getMessage());}
    }
}
