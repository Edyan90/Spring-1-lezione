package EddyTurpo.Spring_first_lesson.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Toppings extends Cibo{
    public Toppings(String nome, Double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }
    @Override
    public void printCiboDetails(){
        System.out.println("Nome: " + getNome());
        System.out.println("Prezzo: " + getPrezzo());
        System.out.println("Calorie: " + getCalorie());
    }
}
