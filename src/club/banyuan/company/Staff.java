//创建普通员工类
package club.banyuan.company;
public class Staff{
	private String name;
	private int worktime;
	private int pay = 3000;

	public void setStaff(String name, int worktime){
		this.worktime = worktime;
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int getPay(){
		return pay;
	}

	public int calPay(int worktime){
		if(worktime > 196){
			pay = pay + (worktime - 196) * 200;
		}else{
			return pay;
		}
		return pay;
	}

}