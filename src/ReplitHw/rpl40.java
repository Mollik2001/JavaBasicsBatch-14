package ReplitHw;

import java.util.Scanner;

public class rpl40 {
	public static void main(String[] args) {
		System.out.println("Enter name of the instructor");
		
				Scanner input = new Scanner(System.in);
				 String name = input.next();
				String responsibility = null;
				input.nextLine();

				switch (name) {

				case "Asghar":
					responsibility = "Will take care of Java Assignment";
					break;

				case "Moazzam":
					responsibility = "Will take care of SDLC Assignment";
					break;

				case "Weqas":
					responsibility = "Will take care of Selenium Assignment";
					break;
				case "Asel":
					responsibility = "Will take care of every Assignment";
					break;
				default:
					responsibility = "Invalid instructor selected";
				}

		System.out.println(responsibility);


		  
			} 

		}
