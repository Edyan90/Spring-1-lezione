package EddyTurpo.Spring_first_lesson.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Menu {
    private List<Cibo> menu;

    public Menu() {
        this.menu = new ArrayList<>();
    }
    public void addCibo(Cibo cibo){
        this.menu.add(cibo);
    }

    public void printMenu() {
        for (Cibo cibo : menu) {
            cibo.printCiboDetails();
            System.out.println("----------");
        }
    }
}
