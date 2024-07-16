package java0712;

public class BubbleEx {
	public static void printArr(int a[]) {
		for(int n :a) {
			System.out.print(n+",");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		int a[]  = {10,3,1,4,2};
		
		for(int i=0; i<a.length; i++) {
			for(int j =a.length-1; j>i; j--) {
				if(a[j] < a[j-1] ) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
//			System.out.println(a[i]);
			printArr(a);
		}
		printArr(a);
//			for(int n :a) {
//				System.out.println(n);
//			}
//		for(int i=0; i< a.length; i++) {
//			System.out.print(a[i]+", ");
//		}
		System.out.println();
	}
}
