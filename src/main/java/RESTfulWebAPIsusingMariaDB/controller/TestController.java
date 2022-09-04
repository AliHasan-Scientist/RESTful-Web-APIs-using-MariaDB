package RESTfulWebAPIsusingMariaDB.controller;

import RESTfulWebAPIsusingMariaDB.global.URI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(URI.initial)
public class TestController {
    public String Test() {
        return "Working ...";
    }
}
