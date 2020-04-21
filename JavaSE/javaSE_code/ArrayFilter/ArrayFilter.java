class ArrayFilter{
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,-1,-2,-3,1,2,3};
		filtArray(arr);
	}

	static int[] filtArray(int [] arr){
			int n = arr.length;//数组长度
			int[] result = new int[n];
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++ ){
					if(arr[i] == arr[j]){
						arr[j] = arr[n - 1];
						n--;
						j--;
					}
				}
			}

			for(int i = 0; i < n; i++){
				result[i] = arr[i];
			}
			for(int tmp : result){
				System.out.print(tmp + " ");
			}

			
			System.out.println();
			return result;
		}
	}
