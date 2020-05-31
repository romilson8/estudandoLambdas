import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambdas {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

//        Comparator<String> comparador = new ComparadorPorTamanho();
//        Collections.sort(palavras, comparador);
//        palavras.sort(comparador);

//        palavras.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if (s1.length() > s2.length()){
//                    return 1;
//                }
//                if (s1.length() < s2.length()) {
//                    return -1;
//                }
//                return 0;
//            }
//        });
//        palavras.sort((String s1, String s2) -> {
//                    if (s1.length() > s2.length())
//                        return 1;
//                    if (s1.length() < s2.length())
//                        return -1;
//                    return 0;
//                }
//        );
//        palavras.sort((s1, s2) -> {
//                    if (s1.length() > s2.length())
//                        return 1;
//                    if (s1.length() < s2.length())
//                        return -1;
//                    return 0;
//                }
//        );
//        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//        palavras.sort(Comparator.comparing(s -> s.length()));
        // Method reference ::
        palavras.sort(Comparator.comparing(String::length));
        palavras.sort(Comparator.comparingInt(String::length));
        System.out.println(palavras);


//        Consumer<String> consumidor = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        palavras.forEach(consumidor);
//
//        for ( String p : palavras) {
//            System.out.println(p);
//        }
//        palavras.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        palavras.forEach((String s) -> {
//                System.out.println(s);
//            }
//        );
//        palavras.forEach(p -> System.out.println(p));
        //são equivalentes
        palavras.forEach(System.out::println);



    }
}
class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

 class ComparadorPorTamanho implements Comparator<String> {

     @Override
     public int compare(String s1, String s2) {
         if (s1.length() > s2.length()){
             return 1;
         }
         if (s1.length() < s2.length()) {
             return -1;
         }
         return 0;
     }
 }