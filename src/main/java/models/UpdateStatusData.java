package models;

public class UpdateStatusData {

    private int pedidoId;
    private int usuarioId;
    private String novoStatus;

    public UpdateStatusData(int pedidoId, int usuarioId, String novoStatus) {
        this.pedidoId = pedidoId;
        this.usuarioId = usuarioId;
        this.novoStatus = novoStatus;
    }
    
}
