package club.banyuan.company;
public class JewelryCompany{
	public Staff[] staffArr = new Staff[100];
	private int count = 0;

	public void addStaff(Staff staff){
		staffArr[count++] = staff;
	}


	public void delStaff(String name){
		if(count == 0){
			System.out.println("无员工");
		}else{
			for(int i = 0; i < count; i++){
				if(staffArr[i].getName().equals(name)){
					for(int j = i; j < count - 1; j++){
						staffArr[j] = staffArr[j + 1];
					}count--;
				}
			}
		}

	}

	public void displayPay(String name){
		for(int i = 0; i < count; i++){
			if(staffArr[i].getName().equals(name)){
				System.out.println(name + "的工资是" + staffArr[i].getPay());
			}
		}
	}

	public void sumPay(){
		int sum = 0;
		for(int i = 0; i < count; i++){
			sum += staffArr[i].getPay();
		}
		System.out.println("员工工资总和为:" + sum);
	}

}