package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso iniciante de Java.");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso iniciante de JavaScript.");
        curso2.setCargaHoraria(60);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Primeira mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls");
        bootcamp.setDescricao("Bootcamp de nivel Inicial para desenvolvedores Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        DEV devNelci = new DEV();
        devNelci.setNome("Nelci");
        devNelci.inscreverBootcamp(bootcamp);

        //Algumas impressoes chamando os metodos para visualizacao.
        System.out.println("Conteudos inscritos de Nelci: " + devNelci.getConteudosInscritos());
        System.out.println("XP Inicial: "+ devNelci.calcularTotalXp());
        devNelci.progredir();
        System.out.println("Conteudos concluidos de Nelci: " + devNelci.getConteudosConcluidos());
        System.out.println("XP Atual: "+ devNelci.calcularTotalXp());
        System.out.println("Conteudos pendentes de Nelci: " + devNelci.getConteudosInscritos());
        devNelci.progredir();
        devNelci.progredir();
        System.out.println("Conteudos concluidos de Nelci: " + devNelci.getConteudosConcluidos());
        System.out.println("XP Atual: "+ devNelci.calcularTotalXp());
        devNelci.progredir(); //aqui devera carregar a mensagem do metodo "Voce nao esta matriculado em nenhum bootcamp"
        System.out.println("Conteudos pendentes de Nelci: " + devNelci.getConteudosInscritos()); //nao mostrara nenhum conteudo pendente


    }
}
