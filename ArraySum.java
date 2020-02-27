
public class ArraySum {

	public int sumOfArray(Integer[] myArray, int i) {
		
	if(i==-1)
		
	return 0;
	
	return myArray[i]+sumOfArray(myArray,i-1);
	
	}
}
