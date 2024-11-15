package Veiculos;

public class Carro extends Veiculo {
    private int numeroPortas;
    private boolean airbag;

    public Carro(String placa, String modelo, int ano, String proprietario, 
                 int numeroPortas, boolean airbag) {
        super(placa, modelo, ano, proprietario);
        this.numeroPortas = numeroPortas;
        this.airbag = airbag;
    }

    public int getNumeroPortas() { return numeroPortas; }
    public boolean temAirbag() { return airbag; }
}