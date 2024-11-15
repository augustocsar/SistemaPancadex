package Acidentes;

import Veiculos.Veiculo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Ocorrencia {
    protected LocalDateTime dataHora;
    protected String local;
    protected int gravidade;
    protected List<Veiculo> veiculosEnvolvidos;

    public Ocorrencia(LocalDateTime dataHora, String local, int gravidade) {
        this.dataHora = dataHora;
        this.local = local;
        this.gravidade = gravidade;
        this.veiculosEnvolvidos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosEnvolvidos.add(veiculo);
    }

    public abstract int calcularNivelRisco();

    public abstract String gerarRelatorio();

    // Getters
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getLocal() {
        return local;
    }

    public int getGravidade() {
        return gravidade;
    }

    public List<Veiculo> getVeiculosEnvolvidos() {
        return veiculosEnvolvidos;
    }
}