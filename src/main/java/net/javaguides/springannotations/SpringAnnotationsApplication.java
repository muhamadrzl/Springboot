package net.javaguides.springannotations;

import net.javaguides.springannotations.controller.MyController;
import net.javaguides.springannotations.controller.PizzaController;
import net.javaguides.springannotations.propertysource.PropertySourceDemo;
import net.javaguides.springannotations.repository.MyRepository;
import net.javaguides.springannotations.scope.PrototypeBean;
import net.javaguides.springannotations.scope.SingletonBean;
import net.javaguides.springannotations.service.MyService;
import net.javaguides.springannotations.service.VegPizza;
import net.javaguides.springannotations.value.ValueAnnotations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
//		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
//
//		System.out.println(propertySourceDemo.getEmail());
//		System.out.println(propertySourceDemo.getHost());
//		System.out.println(propertySourceDemo.getPassword());
//		System.out.println(propertySourceDemo.getAppdescription());
//		System.out.println(propertySourceDemo.getAppname());
	}
}
