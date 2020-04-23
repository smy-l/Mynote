package club.banyuan.company;

public class Main{
	public static void main(String[] args) {
		JewelryCompany salesCompany = new JewelryCompany();

		Staff s1 = new Staff();
		Staff s2 = new Staff();
		Staff s3 = new Staff();
		Staff s4 = new Staff();

		s1.setStaff("one",205);
		s2.setStaff("two",220);
		s3.setStaff("three",180);
		s4.setStaff("four",196);
		
		salesCompany.addStaff(s1);
		salesCompany.addStaff(s2);
		salesCompany.addStaff(s3);
		salesCompany.addStaff(s4);

		salesCompany.sumPay();
		salesCompany.delStaff("s3");
		salesCompany.sumPay();

	}
}