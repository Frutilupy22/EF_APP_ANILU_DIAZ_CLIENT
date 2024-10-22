package pe.edu.cibertec.ef_app_diaz_client.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AuthController {

    @GetMapping("/private")
    public String privateApi(){
        return "¡Bienvenido a la API privada! Aquí tienes acceso a información exclusiva.";
    }

}
