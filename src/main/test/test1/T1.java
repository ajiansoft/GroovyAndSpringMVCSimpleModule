package test1;


import com.study.test.services.test1Service.IAction;
import com.study.test.services.test2Service.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
		IAction a = (IAction)context.getBean("action");
        Scanner in = new Scanner(System.in);
        while (true) {
            if (in.next().equalsIgnoreCase("break"))break;
            System.out.println("输入任意键");
            a.execute(in.next());
        }

		Country c1 = (Country) context.getBean("country1");
		System.out.println(c1.toString());
		Country c2 = (Country) context.getBean("country2");
		System.out.println(c2.toString());


	}

}
