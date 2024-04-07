package models;

public class OrderedItem {
    private int id;
    private String descricao;
    private String status;
    private double preco;
    private int usuarioId;

    public OrderedItem(int id, String descricao, String status, double preco, int usuarioId) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
        this.preco = preco;
        this.usuarioId = usuarioId;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public double getPreco() {
        return preco;
    }

    public int getUsuarioId() {
        return usuarioId;
    }
}
