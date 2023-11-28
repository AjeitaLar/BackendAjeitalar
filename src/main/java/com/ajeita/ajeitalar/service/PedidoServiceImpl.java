package com.ajeita.ajeitalar.service;

import com.ajeita.ajeitalar.model.Pedido;
import com.ajeita.ajeitalar.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido savePedido(Pedido pedido) {return pedidoRepository.save(pedido);}

    @Override
    public List<Pedido> getPedido(){ return  pedidoRepository.findAll();}

}
