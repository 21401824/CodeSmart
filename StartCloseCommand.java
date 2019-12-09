import java.util.Scanner;


public class StartCloseCommand {

	public static void main(String[] args) {
		// Using a scanner to get a command
		Scanner scan =new Scanner(System.in);
		System.out.println("Please Enter a command:");
		String Comm=scan.nextLine();
		// now using a switch statement to decide on entered command
		switch(Comm)
		{
		case("Start"):
			System.out.println("Marchine is started Started!!");
		break;
		case("Stop"):
			System.err.println("Marchine is Stopped!!");
		break;
		default:
			System.out.println("Command Doese Not Exist");

		}
	}

}
