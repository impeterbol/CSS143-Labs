/** for Class Design - IntList  */

import java.io.*;

public class IntList {   //or IntList, caps at 100 elements with no bullet-proofing or bounds checks, etc.
 	private int numElements = 0;
 	private int[] data = new int[100];

 	public void add(int  n) {

 		data[numElements++] = n;
 	}

 	public String toString() {
 		String retVal = "";
 		for(int i = 0; i < numElements; i++) {
 			retVal += data[i]+",";
 		}
 		return retVal;
 	}
	public int sum() {
 		int res = 0;
 		for(int i=0;i<data.length;i++){
 			res+=data[i];
		}
 		return res;
	}

	public int indexOf(int target) {

		for(int i=0;i<data.length;i++){
			if(data[i]==target){
				return data[i];
			}

		}
		return -1;
	}

	public void save(){

 		String fileName = "someFile.txt";
		PrintWriter outputStream = null;

		try {
			outputStream = new PrintWriter(new FileOutputStream(fileName));
		}
		catch (FileNotFoundException e){
			System.out.println("THis is a filenotfound");
			System.exit(0);
		}
		System.out.println("Writing to file");

		for(int i=0;i<data.length;i++){
			outputStream.println(data[i]);

		}
		outputStream.close();
	}
	//main goes here from the lab
	public static void main(String[] args) {
		IntList a = new IntList();
		a.add(95); a.add(100); a.add(58);
		System.out.println(a.toString() );
		System.out.println(a.sum() );
		System.out.println(a.indexOf(100)); //uncomment these to work on next
		System.out.println(a.indexOf(20));
		a.save(); //removed System.out.println as it prevented printing
	}
}
