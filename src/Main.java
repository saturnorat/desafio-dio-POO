import java.util.ArrayList;
import java.util.List;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso c");
        curso2.setDescricao("descrição curso c");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLogan = new Dev();
        devLogan.setNome("Logan");
        devLogan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Logan: " + devLogan.getConteudosInscritos());
        devLogan.progredir();
        System.out.println("Conteúdos Inscritos Logan: " + devLogan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Logan: " + devLogan.getConteudosConcluidos());

        Dev devRaphael = new Dev();
        devRaphael.setNome("Raphael");
        devRaphael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Logan: " + devLogan.getConteudosInscritos());
        devRaphael.progredir();
        System.out.println("Conteúdos Inscritos Raphael: " + devRaphael.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Raphael: " + devLogan.getConteudosConcluidos());


    }
}
