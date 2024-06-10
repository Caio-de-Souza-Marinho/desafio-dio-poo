import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Um curso sobre a linguagem de programacao Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO Java");
        curso2.setDescricao("Um curso sobre programacao orientada a objetos em Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Uma mentoria sobre Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Um bootcampJava para aprender a linguagem Java");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Joao");
        dev1.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos inscritos " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("==============");
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos concluidos " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos inscritos " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXP());
        System.out.println("================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("==============");
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos concluidos " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("Conteudos inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXP());
    }
}