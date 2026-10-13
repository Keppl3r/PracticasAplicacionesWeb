package com.example.GameVault.controller;

import com.example.GameVault.model.Juego;
import com.example.GameVault.service.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class GameController {
    @Autowired
    JuegoService juegoService;

//   private static List <Juego> juegosDb=new ArrayList<>();
//   private static long idCounter=1;
//   private static String UPLOAD_DIR="src/main/resources/static/uploads";
    @GetMapping("/fragments-demo")
    public String fragments(){
    return"fragments-demo";
}

    @GetMapping({"/","/juegos"})
    public String juego(Model model){
        model.addAttribute("juegos",juegoService.listarTodos());

        return"juegos";
    }


    @GetMapping("/juegos/nuevo")
    public String formulario(){
        return"formulario";
    }

    @PostMapping("/juegos")
    public String guardarJuego(@RequestParam("titulo") String titulo,
                               @RequestParam("descripcion") String descripcion,
                               @RequestParam("portada") MultipartFile portada) {

       Juego juego= new Juego();
       juego.setTitulo(titulo);
       juego.setDescripcion(descripcion);
       juegoService.guardarJuego(juego, portada); // esto debe de ir en un imagenes service
        return "redirect:/juegos";
    }

}
