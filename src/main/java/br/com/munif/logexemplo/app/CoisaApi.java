package br.com.munif.logexemplo.app;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coisa")
public class CoisaApi {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "Hello";
    }

}
