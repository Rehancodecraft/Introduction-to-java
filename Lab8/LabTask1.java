import java.util.Arrays;
import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        int [] ratingsinArray = (Input());
        count_students_with_rating(ratingsinArray);
        Average(ratingsinArray);
    }
    public static int[] Input(){
        int[] ratingsinArray = new int[40]; 
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i< ratingsinArray.length;i++){
            System.out.print("Enter the rating of food out of 10 : ");
            ratingsinArray[i] = input.nextInt();
        }
        return ratingsinArray;

    }
    public static void Average(int [] ratings){
        int sum = 0;
        for(int i = 0; i<ratings.length;i++){
            sum = sum + ratings[i];
        }
        int average = sum / ratings.length;
        System.out.println("Average: " + average);
    }
    public static void count_students_with_rating(int [] ratingsinArray){
        boolean [ ] processed = new boolean[ratingsinArray.length];
        for(int i = 0; i<ratingsinArray.length;i++){
            if(!processed[i]){
                int counter = 0;
                for(int j = 0; j< ratingsinArray.length;j++){
                    if(
                        ratingsinArray[i] == ratingsinArray[j])
                        {
                        counter++;
                        processed[j] = true;
                        }
                }
                System.out.println(counter +" Student rated " + ratingsinArray[i] );
            }
        }
    }
    
}
