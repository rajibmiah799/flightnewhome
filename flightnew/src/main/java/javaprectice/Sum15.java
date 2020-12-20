package javaprectice;

public class Sum15 {

	public static void main(String[] args) {
		int [] num = { 10, 5, 2, 13, 5, 7, 8, 9,6};
		
		for(int i=0; i<num.length; i++) {
		 int v1 = num[i];
		 for(int j= i+1; j<num.length; j++) {
			 int v2 = num[j];
			 if((v1+v2)==15) {
				 System.out.println(v1+" ," +v2+ " makes it to 15");
			 }
		 }
		 

	}

}
}