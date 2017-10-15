public class Math{
	private double num1, num2;
	public static double sum(double num1,double num2){
		return num1+num2;
	}
public static double mul(double num1,double num2){
		return num1*num2;

}
	public static void main(String[] args) {
		System.out.println("sum "+sum(2,3));
		System.out.println("mul"+mul(5,6));
	}
}
