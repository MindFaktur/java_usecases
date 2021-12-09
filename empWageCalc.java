public class empWageCalc{
	static int isFullTime = 2;
	static int isPartTime = 1;
	static int wagePerHr = 20;
	static int fullDayHr = 8;
	static int partDayHr = 4;

	public static void main(String[] args){
		if ( isFullTime == random_num() ){
			System.out.println("Employee has worked full time");
			System.out.println("Daily wage is " + daily_wage(wagePerHr,fullDayHr));
		}else if ( isPartTime == random_num() ){
			System.out.println("Employee has worked part time");
			System.out.println("Daily wage is " + daily_wage(wagePerHr,partDayHr));
		}else{
			System.out.println("Employee was absent and daily wage is 0");
		}
	}

	public static int daily_wage(int x, int y){
		return x * y;
	}

	public static int random_num(){
		return (int)(Math.random() * 10 % 3);
	}
}
