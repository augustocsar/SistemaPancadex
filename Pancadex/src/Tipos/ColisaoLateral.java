package Tipos;

public class ColisaoLateral implements TipoColisao {
    @Override
    public int getFatorRisco() {
        return 7;
    }

    @Override
    public String getDescricao() {
        return "Colisão Lateral";
    }
}