package test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import service.DBOperationsService;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/cfg/applicationContext.xml");
		DBOperationsService service=context.getBean("empService",DBOperationsService.class);
//		System.out.println(service.registerEmp(4,"krishna","tester",10001));
		/*System.out.println("enter emp no :");
		Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		System.out.println(service.getEmpDetails(no));*/
//		System.out.println(service.getAllDetails());
//		System.out.println(service.changeByNo(15000,1));
//		System.out.println(service.removeByNo(4));
	}
}