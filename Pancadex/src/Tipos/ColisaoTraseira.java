package Tipos;

public class ColisaoTraseira implements TipoColisao {
    @Override
    public int getFatorRisco() {
        return 6;
    }

    @Override
    public String getDescricao() {
        return "Colisão Traseira";
    }
}