import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage() == bean2.getMessage());


        ApplicationContext applicationContextCat =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean3 =
                (Cat) applicationContextCat.getBean("cat");

        Cat bean4 =
                (Cat) applicationContextCat.getBean("cat");
        System.out.println(bean3 == bean4);
    }
}