package com.ajeita.ajeitalar.controller;

import com.ajeita.ajeitalar.model.Pedido;
import com.ajeita.ajeitalar.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AjeitaLar")
public class AjeitaLarController {

    @Autowired
    public PedidoService pedidoService;

    @PostMapping("CadastroPedido")
    public String add(@RequestBody Pedido pedido){
        pedidoService.savePedido(pedido);
        return "Pedido Cadastrado";
    }

    @GetMapping("ListarPedidos")
    public List<Pedido> list () {return pedidoService.getPedido();}
}
