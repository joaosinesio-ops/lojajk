package com.jkstylle.controller;

import com.jkstylle.model.Usuario;
import com.jkstylle.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
    public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List <Usuario> listarUsuario() {
        return usuarioRepository.findAll(); }

    @PostMapping("/cadastrar")
    public Usuario cadastrar (@RequestBody Usuario u) {
       return usuarioRepository.save(u);
    }

    @PutMapping("/editar/{id}")
    public String editarUsuario (@PathVariable Long id, @RequestBody Usuario dadosatualizado){

            if (usuarioRepository.existsById(id)) {
                dadosatualizado.setId(id);
                usuarioRepository.save(dadosatualizado);

                return "O Cliente da JK foi atualizado com SUCESSO !";
            }

    return "ERROR nenhum cliente da JK foi encontrado com esse ID !";
    }

    @DeleteMapping("/remover/{id}")
    public String excluirUsuario (@PathVariable Long id) {

        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);

        return "O Cliente da JK foi removido com SUCESSO !";
    } else {
        return "ERROR o Cliente com esse dado, não foi encontrado na JK!";
      }
    }


}
