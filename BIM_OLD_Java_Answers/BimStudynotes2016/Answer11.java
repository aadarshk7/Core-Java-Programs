package BimStudynotes2016;

public class Answer11 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,1,1,12,2,2,2,2,3,4,5,5,6,7,8,9,8,5,17,46};
		for(int i=0;i<30;i++) {
			if(arr[i]>16 &&arr[i]<47) {
				System.out.println(arr[i] + "  ");
			}
		}
	}
}











/*	int arr[] = new int[30];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter array upto 30");
			int num = sc.nextInt() % 50;
			arr[i] = num;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 16 && arr[i] < 47)
				
			{
				System.out.println(arr[i] + " ");
			}
		}
	}
}

 */
