import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de Java", 8);
        Curso curso2 = new Curso( "JavaScript", "Curso de JavaScript", 4);
        Mentoria mentoria = new Mentoria("Mentoria de Java", "Mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp( "Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);

        Dev raunerDev = new Dev( "Rauner");
        raunerDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rauner:" + raunerDev.getConteudosInscritos());
        raunerDev.progredir();
        raunerDev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rauner:" + raunerDev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rauner:" + raunerDev.getConteudosConcluidos());
        System.out.println("XP:" + raunerDev.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
