import java.util.*;
public class Salespersonsalary 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final double BASE_SALARY = 1000.0;
		final double COMMISION_RATE = 0.15;
		final int SENTINEL = -1;
		int sales;
		double salary;
		while(true) {
			System.out.print("Enter gross sales for the salesperson (or -1 to end)");
			sales = input.nextInt();
			if(sales==SENTINEL) {
				break;
		
			}
			salary = BASE_SALARY + (sales * COMMISION_RATE);
			System.out.printf("The saleperson's salary is : $%,.2f%n%n", salary);
		}
		System.out.println("bye");
		input.close();
			
	}
}
