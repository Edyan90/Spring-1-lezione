package EddyTurpo.Spring_first_lesson;

import EddyTurpo.Spring_first_lesson.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFirstLessonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstLessonApplication.class, args);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringFirstLessonApplication.class);
		Menu menu=context.getBean(Menu.class);
		menu.printMenu();
		context.close();
	}

}
