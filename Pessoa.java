public class Pessoa {

    private int codigo;
    private String nome;
    private String rua;
    private String cidade;

    public Pessoa(int codigo, String nome, String rua, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
    }

    public String toCsv() {
        return codigo + ";" + nome + ";" + rua + ";" + cidade;
    }

    // Getters and setters (opcional)
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }
}