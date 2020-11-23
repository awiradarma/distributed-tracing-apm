package test.andre.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendResource {

    @GetMapping("/backend")
    public String getData() {
        return "Coming from Backend service";
        
    }
}
