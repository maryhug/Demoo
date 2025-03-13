package com.example.demoo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String mostrarPaginaPrincipal() {
        return "index";  // Carga la vista index.html
    }
}
