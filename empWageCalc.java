public class empWageCalc{

	public static void main(String[] args){
		final int isFullTime = 2, isPartTime = 1, wagePerHr = 20, fullDayHr = 8, partDayHr = 4;

		int rand_num = random_num();
		switch ( rand_num ){
		case isFullTime:	System.out.println("Employee has worked full time");
								System.out.println("Daily wage is " + daily_wage(wagePerHr,fullDayHr));
								break;
		case isPartTime:  System.out.println("Employee has worked part time");
								System.out.println("Daily wage is " + daily_wage(wagePerHr,partDayHr));
								break;
		default:				System.out.println("Employee was absent and daily wage is 0");

		}
	}

	public static int daily_wage(int x, int y){
		return x * y;
	}

	public static int random_num(){
		return (int)(Math.random() * 10 % 3);
	}

}
