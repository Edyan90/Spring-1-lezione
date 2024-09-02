package EddyTurpo.Spring_first_lesson.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Cibo {
    protected String nome;
    protected Double prezzo;
    protected int calorie;

    public abstract void printCiboDetails();
}
