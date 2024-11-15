package Tipos;

public class ColisaoEngavetamento implements TipoColisao {
    @Override
    public int getFatorRisco() {
        return 8;
    }

    @Override
    public String getDescricao() {
        return "Engavetamento";
    }

}