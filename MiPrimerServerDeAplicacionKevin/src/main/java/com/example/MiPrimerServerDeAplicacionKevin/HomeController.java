package com.example.MiPrimerServerDeAplicacionKevin;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "Holis desde el server";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "Hola: "+nombre+" desde mi server";
    }

    @PostMapping("/mensaje")
    public String recibiMensaje(@RequestBody String mensaje) {
        return "Recibido: "+mensaje;

    }
}
