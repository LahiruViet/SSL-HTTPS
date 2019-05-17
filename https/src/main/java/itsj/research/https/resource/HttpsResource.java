package itsj.research.https.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsResource {

    @GetMapping("/")
    public String helloHttps(){
        return "Hello ! you are secured with HTTPS";
    }
}
