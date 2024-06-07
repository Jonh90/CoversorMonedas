package com.alura.desafio.CoversorMoneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Conversor buscarMoneda(String mBase, String mConvertir) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3820d5e9be7e37f77b7bec09/pair/" + mBase + "/" + mConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la Moneda");
        }
    }
}
