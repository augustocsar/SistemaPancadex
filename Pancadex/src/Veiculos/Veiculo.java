package Veiculos;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected int ano;
    protected String proprietario;

    public Veiculo(String placa, String modelo, int ano, String proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    // Getters
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public String getProprietario() { return proprietario; }
}