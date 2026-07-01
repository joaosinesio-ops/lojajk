package com.jkstylle.repository;

import com.jkstylle.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    boolean existsByTipo(String tipo);

    void deleteByTipo(String tipo);
}
