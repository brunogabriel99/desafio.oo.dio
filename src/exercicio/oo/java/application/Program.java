package exercicio.oo.java.application;

import java.time.LocalDate;

import exercicio.oo.java.entities.Bootcamp;
import exercicio.oo.java.entities.Curso;
import exercicio.oo.java.entities.Dev;
import exercicio.oo.java.entities.Mentoria;

public class Program {

	public static void main(String[] args) {
		Curso cursoDio = new Curso();
        cursoDio.setTitulo("Curso Java");
        cursoDio.setDescricao("Neste curso, aprenda sobre o melhor da técnologia por trás da linguagem Java");
        cursoDio.setCargaHoraria(20);

        Curso cursoSpringBoot = new Curso();
        cursoSpringBoot.setTitulo("Curso Spring Boot");
        cursoSpringBoot.setDescricao("Aprenda sobre uns dos melhores frameworks do Java");
        cursoSpringBoot.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria eclipse");
        mentoria.setDescricao("Aprenda os Atalhos, os Truques e Plugins para ser mais produtivo no eclipse");
        mentoria.setData(LocalDate.now());

        Mentoria mentoriaMercadoJava = new Mentoria();
        mentoriaMercadoJava.setTitulo("Mentoria para iniciantes no java");
        mentoriaMercadoJava.setDescricao("veja como facilitar sua vida para entrar no mercado de trabalho");
        mentoriaMercadoJava.setData(LocalDate.now().plusDays(1));

        Bootcamp bootcampJavaGft = new Bootcamp();
        bootcampJavaGft.setNome("Bootcamp Java GFT");
        bootcampJavaGft.setDescricao("Neste Bootcamp aprenda sobre Java e conquiste sua vaga na GFT");
        bootcampJavaGft.getConteudos().add(cursoDio);
        bootcampJavaGft.getConteudos().add(cursoSpringBoot);
        bootcampJavaGft.getConteudos().add(mentoria);
        bootcampJavaGft.getConteudos().add(mentoriaMercadoJava);

        System.out.println("---------------------------------------------------------------------");

        Dev dev1 = new Dev();
        dev1.setNome("Bruno");
        dev1.inscreverBootcamp(bootcampJavaGft);
        System.out.println("Conteúdos Inscritos Bruno: " + dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Bruno: " + dev1.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Bruno: " + dev1.getConteudoConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Gabriel");
        dev2.inscreverBootcamp(bootcampJavaGft);
        System.out.println("Conteúdos Inscritos Gabriel: " + dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Gabriel: " + dev2.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Gabriel: " + dev2.getConteudoConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev dev3 = new Dev();
        dev3.setNome("Lucas");
        dev3.inscreverBootcamp(bootcampJavaGft);
        System.out.println("Conteúdos Inscritos Lucas: " + dev3.getConteudoInscritos());
        dev3.progredir();
        dev3.progredir();
        dev3.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Lucas: " + dev3.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Lucas: " + dev3.getConteudoConcluidos());
        System.out.println("XP: " + dev3.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");
    }

	}
