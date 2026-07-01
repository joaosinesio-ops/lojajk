package com.jkstylle.controller;

import com.jkstylle.model.Pedido;
import com.jkstylle.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping("/cadastrar")
    public Pedido cadastrarPedido(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @GetMapping
    public List<Pedido> listarPedido() {
        return pedidoRepository.findAll();
    }

    @DeleteMapping("/remover/{id}")
    public String deletePedido(@PathVariable Long id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
            return "O Pedido da JK está Removido com SUCESSO :) !";
        }else {
            return "ERROR não foi encontrado esse pedido na JK !!!";
        }

    }

    @PutMapping("/editar/{id}")
    public String editarPedidos(@PathVariable Long id, @RequestBody Pedido pedidoatualizado) {

       if (pedidoRepository.existsById(id)){
           pedidoatualizado.setId(id);
           pedidoRepository.save(pedidoatualizado);
           return "O Pedido da JK está atualizado com SUCESSO :) !";
       }
       else {
           return "ERROR ao atualizar o pedido !!!";
            }
        }

    }

