package com.ajeita.ajeitalar.service;

import com.ajeita.ajeitalar.model.Pedido;

import java.util.List;

public interface PedidoService {

    public Pedido savePedido(Pedido pedido);

    public List<Pedido> getPedido();

}
