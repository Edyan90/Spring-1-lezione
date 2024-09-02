package EddyTurpo.Spring_first_lesson.confBeans;


import EddyTurpo.Spring_first_lesson.entities.Drink;
import EddyTurpo.Spring_first_lesson.entities.Menu;
import EddyTurpo.Spring_first_lesson.entities.Pizza;
import EddyTurpo.Spring_first_lesson.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CiboConfig {
    //Toppings
    @Bean
    public Toppings cheese(){
        return new Toppings("Cheese",0.69,92);
    }
    @Bean
    public Toppings ham(){
        return new Toppings("Ham",0.99,35);
    }
    @Bean
    public Toppings onions(){
        return new Toppings("Onions",0.69,22);
    }
    @Bean
    public Toppings pineapple(){
        return new Toppings("Pineapplee",0.79,24);
    }
    @Bean
    public Toppings salame(){
        return new Toppings("Salami",0.99,86);
    }
    @Bean
    public Toppings tomato(){
        return new Toppings("Tomato",1.0,100);
    }

    //Pizze
    @Bean
    public Pizza margherita(){
        Pizza pizza=new  Pizza("Margherita",7.0,1104);
        pizza.addTopping(cheese());
        pizza.addTopping(tomato());
        pizza.setNome("Margherita");
        return pizza;
    }
    @Bean
    public Pizza hawaiana(){
        Pizza pizza=margherita();
        pizza.addTopping(ham());
        pizza.addTopping(pineapple());
        pizza.setNome("Hawaiana");
        return pizza;
    };
    @Bean
    public Pizza salami(){
        Pizza pizza=margherita();
        pizza.addTopping(salame());
        pizza.setNome("Salami");
        return pizza;
    }

    //Drinks
    @Bean
    public Drink lemonade(){
        return new Drink("Lemonade",1.29,128);
    }
    @Bean
    public Drink water(){
        return new Drink("Water",1.29,0);
    }
    @Bean
    public Drink wine(){
        return new Drink("Wine",7.49,607);
    }

    //MENU FINALE
    @Bean
    public Menu menu(){
        Menu menu=new Menu();
        menu.addCibo(margherita());
        menu.addCibo(hawaiana());
        menu.addCibo(salami());
        menu.addCibo(cheese());
        menu.addCibo(ham());
        menu.addCibo(onions());
        menu.addCibo(pineapple());
        menu.addCibo(salame());
        menu.addCibo(lemonade());
        menu.addCibo(water());
        menu.addCibo(wine());
        return menu;
    }
}
