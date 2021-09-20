package br.com.raphael.raphael.service;

import br.com.raphael.raphael.model.Cliente;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ClienteService {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


    public List<Cliente> getClintes() throws JsonProcessingException {
        RestTemplate restTemplate = restTemplate(new RestTemplateBuilder());

        String fooResourceUrl = "http://localhost:8080/clientes/listarRest";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();

        List<Cliente> myObjects = mapper.readValue(response.getBody(), mapper.getTypeFactory().constructCollectionType(List.class, Cliente.class));

        myObjects.forEach(item -> System.out.println(item.toString()));

        return myObjects;
    }

}
