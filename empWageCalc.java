public class empWageCalc{
	static int isPresent = 1;
	static int wagePerHr = 20;
	static int fullDayHr = 8;

	public static void main(String[] args){
		if (isPresent == random_num()){
			System.out.println("Employee is present");
			System.out.println("Daily wage is " + daily_wage());
		}else{
			System.out.println("Employee is absent");
			System.out.println("Daily wage is 0");
		}
	}

	public static int daily_wage(){
		return wagePerHr * fullDayHr;
	}

	public static int random_num(){
		return (int)(Math.random()*10%2);
	}
}
