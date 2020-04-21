class SortArr{
	public static void main(String[] args) {
		boolean isAsc;
		int key = 0;
		isAsc = (key == 0);
		int[] arr = new int[]{13,26,-3,4,54,26,37,18,69,-10};
		// for(int tmp:arr){
		// 	System.out.print(tmp + " ");
		// }
		// System.out.println();
		sort(arr, isAsc);


	}
	//输入isAsc判断升降序
	static void sort(int arr[], boolean isAsc){
		int n = arr.length;
		if(isAsc == false){//升序
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++ ){
					if(arr[i] > arr[j]){ 
						int temp = arr[j];
						arr[j] = arr [i];
						arr[i] = temp;
					}
				}
			}
		}else{//降序
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++ ){
					if(arr[i] < arr[j]){ 
						int temp = arr[j];
						arr[j] = arr [i];
						arr[i] = temp;
					}
				}
			}

		}
		print_arr(arr);
	}

	//方法重载，升序
	static void sort(int arr[]){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++ ){
				if(arr[j] > arr[i]){ 
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		print_arr(arr);
	}


	//打印数组
	static void print_arr(int arr[]){
		int count = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print("[" + i + "]" + "=" + arr[i] + " ");
			count++;
			if(count % 5 == 0){
				System.out.println();
			}
		}
	}
}
