class CountMoney{
	public static void main(String [] args){
		int count = 0;
		int num = 100;
		int money = 150;
		int oneNum = 0;
		int twoNum = 0;
		int fiveNum = 0;
		// 可以小于数量，也可以小于钱数(one < 150; two < 150/2; five < 150/5)
		for(oneNum = 1; oneNum <= num; oneNum++){
			for(twoNum = 1; twoNum <= num; twoNum++){
				for(fiveNum = 1; fiveNum <= num; fiveNum++){
					if(oneNum + twoNum + fiveNum == 100 & oneNum + 2 * twoNum + 5 * fiveNum == money){
						System.out.println(oneNum + " " + twoNum + " " + fiveNum);
						count++;
					}
				}
			}
		}System.out.println(count);
	}
}