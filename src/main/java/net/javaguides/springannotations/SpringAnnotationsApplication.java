package net.javaguides.springannotations;

import net.javaguides.springannotations.controller.MyController;
import net.javaguides.springannotations.controller.PizzaController;
import net.javaguides.springannotations.repository.MyRepository;
import net.javaguides.springannotations.scope.PrototypeBean;
import net.javaguides.springannotations.scope.SingletonBean;
import net.javaguides.springannotations.service.MyService;
import net.javaguides.springannotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
	}
}
