package com.jkstylle.repository;

import com.jkstylle.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    boolean existsById(Long Id);

    void deleteById(Long Id);
}

