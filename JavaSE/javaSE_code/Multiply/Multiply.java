class Multiply{
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		multiply(n1,n2);
	}

	static int multiply(int n1, int n2){
		int result = 0;//分情况讨论
		if(n1 > 0 && n2 > 0){
			for(int i = 1; i <= n2; i++){
				result = result + n1;
			}

		}else if(n1 < 0 && n2 < 0){
			n1 = n1 / (-1);
			n2 = n2 / (-1);
			for(int i = 1; i <= n2; i++){
				result = result + n1;
			}

		}else if(n1 == 0 || n2 == 0){

		}else if(n1 < 0 && n2 > 0){
			n1 = n1 / (-1);
			for(int i = 1; i <= n2; i++){
				result = result + n1;
			}
			result = result / (-1);

		}else if(n1 > 0 && n2 < 0){
			n2 = n2 / (-1);
			for(int i = 1; i <= n2; i++){
				result = result + n1;
			}
			result = result / (-1);
		}
		System.out.println(result);

		// if(n2 != 0 & n1 != 0){
		// 	n2 = 1 / n2;
		// 	result = n1 / n2;
		// 	System.out.println(result);
		// }else{
		// 	System.out.println("0");
		// }
		return result;
	}
}