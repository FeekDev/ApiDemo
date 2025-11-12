package com.sw2f.ApiDemo.Services;
import com.sw2f.ApiDemo.Repositorio.UsuarioRepositorio;
import com.sw2f.ApiDemo.Models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class UsuarioServices {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public ArrayList<Usuario> obtenerUsuarios() {
        return (ArrayList<Usuario>) usuarioRepositorio.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public boolean eliminar(int id) {
        try {
            usuarioRepositorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
