package test.andre.inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.client.RestTemplateBuilder;


import java.beans.BeanProperty;
import java.net.URI;

@RestController
public class InventoryResource {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    private RestTemplate client;

    @GetMapping("/inventory")
    public String getInventory() {
        return "Coming from Inventory service";        
    }

    @GetMapping("/backend") 
    public String getFromBackend(){

        //client = new RestTemplate();
        URI uri = URI.create("http://localhost:8081/backend");
        return ("Fetch this from backend : " + client.getForObject(uri, String.class));
    }
}