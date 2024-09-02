package EddyTurpo.Spring_first_lesson.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

public class Pizza extends Cibo{
    private List<Toppings> toppings;

    public Pizza(String nome, Double prezzo, int calorie) {
        super(nome, prezzo, calorie);
        this.toppings = new ArrayList<>();
    }
    public void addTopping(Toppings toppings){
        this.toppings.add(toppings);
    }


    @Override
    public void printCiboDetails() {
        System.out.println("Pizza: " + getNome());
        System.out.println("Prezzo: " + getPrezzo());
        System.out.println("Calorie: " + getCalorie());
        System.out.println("Toppings: ");
        for (Toppings topping : toppings) {
            System.out.println(" - " + topping.getNome());
        }
    }
}
