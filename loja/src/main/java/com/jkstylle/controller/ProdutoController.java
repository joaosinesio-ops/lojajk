package com.jkstylle.controller;

import com.jkstylle.model.Produto;
import com.jkstylle.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/cadastrar")
    public String cadastrarProduto(@RequestBody Produto pd) {
        produtoRepository.save(pd);
        return "O produto - " + pd.getTipo() + " ,foi cadastrado com SUCESSO na JK !";
    }

        @GetMapping
        public List<Produto> listarProduto() {
            return produtoRepository.findAll(); }

        @DeleteMapping("/remover/{id}")
        public String deleteProduto(@PathVariable Long id ) {
            if (produtoRepository.existsById(id)) {
                produtoRepository.deleteById(id);
                return "Esse produto foi deletado com SUCESSO da JK  !!!";
            } else {
                return "ERROR esse produto não foi encontrado na JK !!!";
            }

        }



        @PutMapping("/editar/{id}")
        public String editarProdutos(@PathVariable Long id, @RequestBody Produto
                produtoatualizado) {
            if (produtoRepository.existsById(id)) {
                produtoatualizado.setId(id);
                produtoRepository.save(produtoatualizado);
                return "Produto da JK foi atualizado com SUCESSO!!!";
            } else {
                return "ERROR ao atualizar o produto!!!";
            }
        }
    }


