package com.example.NebulaMusic02.service;

import com.example.NebulaMusic02.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UsuarioService {

    private final Map<String, Usuario> usuarios=new ConcurrentHashMap<>();

    public UsuarioService() {
    }

    public void registrar(Usuario usuario){
        //if (existeCorreo(usuario.getCorreo())){
        //excepcion, validacion
        //   }
        usuarios.put(usuario.getCorreo(), usuario);
    }

    public boolean existeCorreo(String correo){
        return usuarios.containsKey(correo);
    }

    public boolean autenticar(String correo, String contrasenia){
        Usuario usuario=usuarios.get(correo);
        return usuario!=null&&usuario.getContrasenia().equals(contrasenia);
    }


}
