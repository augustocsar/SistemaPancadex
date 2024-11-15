package Acidentes;

import java.time.LocalDateTime;

public class AcidenteCapotamento extends Ocorrencia {
    private int numeroCapotagens;
    private boolean carroAberto;

    public AcidenteCapotamento(LocalDateTime dataHora, String local, int gravidade,
            int numeroCapotagens, boolean carroAberto) {
        super(dataHora, local, gravidade);
        this.numeroCapotagens = numeroCapotagens;
        this.carroAberto = carroAberto;
    }

    @Override
    public int calcularNivelRisco() {
        int risco = super.getGravidade() * 2;
        if (carroAberto)
            risco += 3;
        return risco + numeroCapotagens;
    }

    @Override
    public String gerarRelatorio() {
        return String.format("Acidente de Capotamento em %s\n" +
                "Data/Hora: %s\n" +
                "Número de Capotagens: %d\n" +
                "Carro Aberto: %s\n" +
                "Gravidade: %d",
                getLocal(), getDataHora(), numeroCapotagens,
                carroAberto ? "Sim" : "Não", getGravidade());
    }
}