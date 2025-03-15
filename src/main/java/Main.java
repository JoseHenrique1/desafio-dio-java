import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java iniciante", "Pilares de POO", 10);

        Curso curso2 = new Curso("Javascript iniciante", "Programação funcional", 10);

        Mentoria mentoria = new Mentoria("Mentoria java", "Aula ao vivo", LocalDate.now());


        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev("Jose");
        devJose.setNome("Camila");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devJose.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devJose.getConteudosConcluidos());
        System.out.println("XP:" + devJose.calcularTotalXp());

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
