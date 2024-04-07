package models;

public class MenuItem {
    private int id;
    private String nomeItem;
    private double preco;
    private String tipo_pedido;
    private int usuario_id;

    public MenuItem(int id, String nomeItem, double preco, String tipo_pedido, int usuario_id) {
        this.id = id;
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.tipo_pedido = tipo_pedido;
        this.usuario_id = usuario_id;
    }

    public int getId() {
        return id;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo_pedido() {
        return tipo_pedido;
    }

    public int getUsuario_id() {
        return usuario_id;
    }
    
    
}
