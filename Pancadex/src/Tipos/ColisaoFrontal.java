package Tipos;

public class ColisaoFrontal implements TipoColisao {
    @Override
    public int getFatorRisco() {
        return 9;
    }

    @Override
    public String getDescricao() {
        return "Colisão Frontal";
    }
}