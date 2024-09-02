package EddyTurpo.Spring_first_lesson.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Drink extends Cibo{
    public Drink(String nome, Double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }
    @Override
    public void printCiboDetails(){
        System.out.println("Nome: " + getNome());
        System.out.println("Prezzo: " + getPrezzo());
        System.out.println("Calorie: " + getCalorie());
    }
}
