import java.util.Scanner;

public class Scanr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);

        System.out.println("Pelease Enter your age");
        int age=scanner.nextInt();

        System.out.println("Pelease Enter your name");
        String name=scanner.nextLine();


        System.out.println(name+" is "+age+" years old");


		
		
	}

}
