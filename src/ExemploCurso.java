import java.util.*;
import java.util.stream.Collectors;

class Curso{
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

}
public class ExemploCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        // equivalente usando Method reference
        cursos.sort(Comparator.comparing(Curso::getAlunos));
//        cursos.forEach(System.out::println); // <--- retorna o objeto. seria necessário customizar o toString
//        cursos.forEach(c -> System.out.println(c.getNome()));

//        cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
//        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(curso -> System.out.println(curso.getNome()));
//        cursos
//                .stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .map(Curso::getAlunos)
//                .forEach(System.out::println);

//        cursos
//                .stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .map(c -> c.getAlunos())
//                .forEach(total -> System.out.println(total));
//        cursos.forEach(c -> System.out.println(c.getNome()));


//        int sum = cursos
//                .stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .mapToInt(c -> c.getAlunos())
//                .sum();
//
//        System.out.println(sum);

//        Optional<Curso> optionalCurso = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .findAny();
//        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 1000)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        cursos
                .stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(c -> c.getAlunos())
                .average();
//       cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
//       cursos.stream().forEach(curso -> System.out.println(curso.getNome()));
        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
//        System.out.println(map);

    }
}
