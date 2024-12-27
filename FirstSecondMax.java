public class FirstSecondMax{
	public static void main(String[]args){
		int[]array = {5,3,4,1,2};
		int max = 0;
		int secondmax = 0;
		for(int i = 0; i < array.length;i++){
			if(array[i]>max){
				max = array[i];
			}
		}
		for(int j = 0; j < array.length;j++){
			if(array[j]>secondmax && array[j]<max)
				secondmax = array[j];
		}
		System.out.println("This is first maximum: "+ max);
		System.out.println("This is second maximum: " + secondmax);
	}
}
