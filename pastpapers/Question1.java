//Creat an array of 50 students to store height and to find the maximum height
import java.util.*;
public class Question1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] height = new double [50];
        for(int i = 0; i < height.length;i++){
            System.out.println("Enter the height of " + (i+1) + " Student: ");
            height[i] = input.nextDouble();
        }
        double maxheight = 0;
        for(int j = 0; j < height.length;j++){
            if(maxheight<height[j]){
                maxheight = height[j];
            }
        }
        System.out.println("Maximum height is: " + maxheight);
    }
}