//创建普通员工类
class Staff{
	int worktime;
	int pay = 3000;
	String[] name;

	static int setWorktime(int time){
		worktime = time;
		return worktime;
	}

	static int calPay(int worktime){
		if(worktime > 196){
			pay = pay + (worktime - 196) * 200;
		}else{
			return pay;
		}
		return pay;
	}

}

//定义公司类
class JewelryCompany{
	String[] staffName = new String[10];

	static Staff add(staffName){


	}


	static Staff del(Staff name){

	}

	static Staff displayPay(Staff name){
		
	}

	static Staff sunPay(){

	}
}

class Main{
	public static void main(String[] args) {



	}
}





