package models;

public class UserData {

    private int id;
    private String nomeFuncionario;
    private String email;
    private String nomeEmpresa;
    private String telefone;

    public UserData(int id, String nomeFuncionario, String email, String nomeEmpresa, String telefone) {
        this.id = id;
        this.nomeFuncionario = nomeFuncionario;
        this.email = email;
        this.nomeEmpresa = nomeEmpresa;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getEmail() {
        return email;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getTelefone() {
        return telefone;
    }
}
