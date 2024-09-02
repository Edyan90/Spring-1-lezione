package EddyTurpo.Spring_first_lesson.confBeans;


import EddyTurpo.Spring_first_lesson.entities.Drink;
import EddyTurpo.Spring_first_lesson.entities.Menu;
import EddyTurpo.Spring_first_lesson.entities.Pizza;
import EddyTurpo.Spring_first_lesson.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
        return pizza;
    }
    @Bean
    public Pizza hawaiana(){
        Pizza pizza2=new Pizza("Hawaiana",7.5,2000);
        pizza2.addTopping(cheese());
        pizza2.addTopping(tomato());
        pizza2.addTopping(ham());
        pizza2.addTopping(pineapple());
        pizza2.setNome("Hawaiana");

        return pizza2;
    };
    @Bean
    public Pizza salami(){
        Pizza pizza3=new Pizza("Salami",8.0,3000);
        pizza3.addTopping(cheese());
        pizza3.addTopping(tomato());
        pizza3.addTopping(salame());
        pizza3.setNome("Salami");
        return pizza3;
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
