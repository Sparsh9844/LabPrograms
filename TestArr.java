package myFunc;


class Array{
	public Array(int a[]) {
		for(int i=0; i< a.length; i++) {
			a[i] = i*5;
		}
		System.out.println("Array values:");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}
	
}
public class TestArr {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Array obj=new Array(arr);
	}

}
