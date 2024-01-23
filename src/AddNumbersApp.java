
public class AddNumbersApp {
	public static void main(String[] args) {
        Numbers numbers = new Numbers(5, 10);
        int num1 = numbers.getNumber1();
        int num2 = numbers.getNumber2();
        int sum = num1 + num2;

        
        System.out.println("Собир на броевите: " + sum);
}
}