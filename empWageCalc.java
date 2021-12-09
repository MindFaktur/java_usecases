public class empWageCalc{
	public static void main(String[] args){
		int val = 1 ; //is present
		if (val==random_num()){
			System.out.println("Employee is present");
		}else{
			System.out.println("Employee is absent");
		}
	}

	public static int random_num(){
		return (int)(Math.random()*10%2);
	}
}
