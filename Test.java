package test;

public class Test {
	public static final int ROWS=5;
	public static void main(String[] args) {
		int currentnumber=1;
		for(int i=1;i<=ROWS;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(currentnumber + " ");
				currentnumber++;
			}
			System.out.println();
		}
	}

}
