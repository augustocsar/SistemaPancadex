import Acidentes.*;
import Gerenciador.*;
import Tipos.*;
import Veiculos.*;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        // Criar gerenciador
        GerenciadorOcorrencias gerenciador = new GerenciadorOcorrencias();

        // Criar tipos de colisão
        TipoColisao frontal = new ColisaoFrontal();
        TipoColisao traseira = new ColisaoTraseira();
        TipoColisao lateral = new ColisaoLateral();
        TipoColisao engavetamento = new ColisaoEngavetamento();

        // Criar veículos
        Carro carro1 = new Carro("ABC1234", "Gol", 2020, "João", 2, true);
        Carro carro2 = new Carro("DEF5678", "Civic", 2021, "Pedro", 4, true);
        Carro carro3 = new Carro("GHI9012", "Corolla", 2022, "Ana", 4, false);
        Moto moto1 = new Moto("XYZ5678", "Honda", 2021, "Maria", true, false);
        Moto moto2 = new Moto("WXY4567", "Yamaha", 2023, "Carlos", true, true);

        // Criar acidentes
        AcidenteColisao acidente1 = new AcidenteColisao(
            LocalDateTime.now(),
            "Av. Principal",
            8,
            frontal,
            true
        );
        acidente1.adicionarVeiculo(carro1);
        acidente1.adicionarVeiculo(moto1);

        AcidenteCapotamento acidente2 = new AcidenteCapotamento(
            LocalDateTime.now(),
            "Rua Secundária",
            6,
            2,
            false
        );
        acidente2.adicionarVeiculo(carro2);

        AcidenteColisao acidente3 = new AcidenteColisao(
            LocalDateTime.now(),
            "Marginal Tietê",
            9,
            engavetamento,
            true
        );
        acidente3.adicionarVeiculo(carro1);
        acidente3.adicionarVeiculo(carro2);
        acidente3.adicionarVeiculo(carro3);

        AcidenteColisao acidente4 = new AcidenteColisao(
            LocalDateTime.now(),
            "Rua do Comércio",
            7,
            lateral,
            false
        );
        acidente4.adicionarVeiculo(moto1);
        acidente4.adicionarVeiculo(carro3);

        AcidenteCapotamento acidente5 = new AcidenteCapotamento(
            LocalDateTime.now(),
            "Rodovia SP-330",
            9,
            3,
            true
        );
        acidente5.adicionarVeiculo(carro1);

        AcidenteColisao acidente6 = new AcidenteColisao(
            LocalDateTime.now(),
            "Av. Paulista",
            6,
            traseira,
            false
        );
        acidente6.adicionarVeiculo(moto2);
        acidente6.adicionarVeiculo(carro2);

        AcidenteColisao acidente7 = new AcidenteColisao(
            LocalDateTime.now(),
            "Rua 25 de Março",
            8,
            lateral,
            true
        );
        acidente7.adicionarVeiculo(moto1);
        acidente7.adicionarVeiculo(moto2);

        AcidenteCapotamento acidente8 = new AcidenteCapotamento(
            LocalDateTime.now(),
            "Estrada Velha",
            7,
            1,
            false
        );
        acidente8.adicionarVeiculo(carro3);

        AcidenteColisao acidente9 = new AcidenteColisao(
            LocalDateTime.now(),
            "Av. Brasil",
            9,
            frontal,
            true
        );
        acidente9.adicionarVeiculo(carro1);
        acidente9.adicionarVeiculo(carro2);

        AcidenteColisao acidente10 = new AcidenteColisao(
            LocalDateTime.now(),
            "Rua da Consolação",
            7,
            engavetamento,
            true
        );
        acidente10.adicionarVeiculo(carro2);
        acidente10.adicionarVeiculo(carro3);
        acidente10.adicionarVeiculo(moto2);

        // Adicionar acidentes ao gerenciador
        gerenciador.adicionarOcorrencia(acidente1);
        gerenciador.adicionarOcorrencia(acidente2);
        gerenciador.adicionarOcorrencia(acidente3);
        gerenciador.adicionarOcorrencia(acidente4);
        gerenciador.adicionarOcorrencia(acidente5);
        gerenciador.adicionarOcorrencia(acidente6);
        gerenciador.adicionarOcorrencia(acidente7);
        gerenciador.adicionarOcorrencia(acidente8);
        gerenciador.adicionarOcorrencia(acidente9);
        gerenciador.adicionarOcorrencia(acidente10);

        // Ordenar e mostrar relatórios
        gerenciador.ordenarPorRisco();
        for (Ocorrencia ocorrencia : gerenciador.getOcorrencias()) {
            System.out.println(ocorrencia.gerarRelatorio());
            System.out.println("Nível de Risco: " + ocorrencia.calcularNivelRisco());
            System.out.println("--------------------");
        }
    }
}