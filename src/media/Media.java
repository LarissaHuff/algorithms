package media;

import java.util.ArrayList;
import java.util.List;

public class Media {
    List<Integer> notas = new ArrayList<>();

    public void adicionaNotas(Integer nota) {
        if (nota >= 0 && nota <= 100) {
            notas.add(nota);
        } else
            System.out.println("erro nota fora do padrão.");
    }

    public void calculaMedia() {
        Integer total = 0;
        for (int i = 0; i < notas.size(); i++) {
            total += notas.get(i);
        }
        Integer media = total / notas.size();
        System.out.println(media);
    }

}
