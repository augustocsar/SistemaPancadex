package Gerenciador;

import Acidentes.Ocorrencia;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorOcorrencias {
    private List<Ocorrencia> ocorrencias;

    public GerenciadorOcorrencias() {
        this.ocorrencias = new ArrayList<>();
    }

    public void adicionarOcorrencia(Ocorrencia ocorrencia) {
        ocorrencias.add(ocorrencia);
    }

    public void ordenarPorRisco() {
        quickSort(0, ocorrencias.size() - 1);
    }

    private void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(inicio, fim);
            quickSort(inicio, pivo - 1);
            quickSort(pivo + 1, fim);
        }
    }

    private int particionar(int inicio, int fim) {
        int i = inicio - 1;
        int pivoRisco = ocorrencias.get(fim).calcularNivelRisco();

        for (int j = inicio; j < fim; j++) {
            if (ocorrencias.get(j).calcularNivelRisco() >= pivoRisco) {
                i++;
                Ocorrencia temp = ocorrencias.get(i);
                ocorrencias.set(i, ocorrencias.get(j));
                ocorrencias.set(j, temp);
            }
        }

        Ocorrencia temp = ocorrencias.get(i + 1);
        ocorrencias.set(i + 1, ocorrencias.get(fim));
        ocorrencias.set(fim, temp);

        return i + 1;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }
}