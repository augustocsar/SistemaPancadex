package Veiculos;

public class Moto extends Veiculo {
    private boolean partidaEletrica;
    private boolean abs;

    public Moto(String placa, String modelo, int ano, String proprietario, 
                boolean partidaEletrica, boolean abs) {
        super(placa, modelo, ano, proprietario);
        this.partidaEletrica = partidaEletrica;
        this.abs = abs;
    }

    public boolean temPartidaEletrica() { return partidaEletrica; }
    public boolean temABS() { return abs; }
}