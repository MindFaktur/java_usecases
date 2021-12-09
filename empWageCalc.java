public class empWageCalc{

	static int totalHr, totalFullDays, totalPartDays, totalAbsent, wagePerHr = 20, fullDayHr = 8, partDayHr = 4, workDays = 20;

	public static void main(String[] args){
		final int isFullTime = 2, isPartTime = 1;
		while ( totalHr < 100 && (totalFullDays + totalPartDays) < workDays ){
			int rand_num = random_num();
			switch ( rand_num ){
			case isFullTime:	totalHr += fullDayHr;
									totalFullDays++;
									break;
			case isPartTime:  totalHr += partDayHr;
									totalPartDays++;
									break;
			default:				totalAbsent++;
			}
		}

		result();
	}

	public static void result(){
		System.out.println("Total hours worked is " + totalHr + " & total wage for the month is " + daily_wage(totalHr,wagePerHr));
		System.out.println("Total days worked full time is " + totalFullDays);
		System.out.println("Total days worked part time is " + totalPartDays);
		System.out.println("Total days absent is " + totalAbsent);
	}

	public static int daily_wage(int x, int y){
		return x * y;
	}

	public static int random_num(){
		return (int)(Math.random() * 10 % 3);
	}

}
