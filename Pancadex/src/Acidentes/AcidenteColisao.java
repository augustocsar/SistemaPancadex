package Acidentes;

import Tipos.TipoColisao;
import java.time.LocalDateTime;

public class AcidenteColisao extends Ocorrencia {
    private TipoColisao tipoColisao;
    private boolean envolveMotocicleta;

    public AcidenteColisao(LocalDateTime dataHora, String local, int gravidade,
            TipoColisao tipoColisao, boolean envolveMotocicleta) {
        super(dataHora, local, gravidade);
        this.tipoColisao = tipoColisao;
        this.envolveMotocicleta = envolveMotocicleta;
    }

    @Override
    public int calcularNivelRisco() {
        int risco = super.getGravidade();
        if (envolveMotocicleta)
            risco += 2;
        return risco + tipoColisao.getFatorRisco();
    }

    @Override
    public String gerarRelatorio() {
        return String.format("Acidente de Colisão em %s\n" +
                "Data/Hora: %s\n" +
                "Tipo de Colisão: %s\n" +
                "Envolve Motocicleta: %s\n" +
                "Gravidade: %d",
                getLocal(), getDataHora(), tipoColisao.getDescricao(),
                envolveMotocicleta ? "Sim" : "Não", getGravidade());
    }
}