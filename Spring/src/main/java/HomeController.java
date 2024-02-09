package main.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Bu, göndereceğimiz HTML dosyasının adını belirtir. Şu an için index.html olacak.
    }
}
