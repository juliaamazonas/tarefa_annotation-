package br.com.jamazonasa;


@Tabela(valor = "cliente")
public class Cliente {
    private Long codigo;
    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(Long codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
}
