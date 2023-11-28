package com.ajeita.ajeitalar.repository;

import com.ajeita.ajeitalar.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer> {
}
