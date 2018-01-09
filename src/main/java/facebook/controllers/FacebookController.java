package facebook.controllers;

import java.util.concurrent.atomic.AtomicLong;

import facebook.model.Greeting;
import facebook.javafx.RestJavaFXHelper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacebookController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(value = "/getouthtoken/{appId}/{appSecret}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getOauthToken(@PathVariable final String appId, @PathVariable final String appSecret) {
        String[] args = {appId, appSecret};
        String[] result = RestJavaFXHelper.main(args);
        return result[0];
    }
}