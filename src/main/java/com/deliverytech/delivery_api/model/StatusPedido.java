package com.deliverytech.delivery_api.model;

public enum StatusPedido {

    // Momento emque foi criado o pedido pelo cliente, mas ainda não confirmado pelo restaurante
    CRIADO("Criado"),

    // Aguardando ser confirmado pelo restaurante
    PENDENTE("Pendente"),
    
    // Restaurante confirmou que recebeu o pedido e que vai prepará-lo
    CONFIRMADO("Confirmado"),

    // O restaurante está preparando o pedido
    PREPARNADO("Preparando"),

    // O pedido saiu para entrega
    SAIU_PARA_ENTREGA("Saiu Para Entrega"),

    // O pedido foi entregue ao cliente
    ENTREGUE("Entregue"),

    // O pedido foi cancelado pelo cliente ou restaurante
    CANCELADO("Cancelado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
