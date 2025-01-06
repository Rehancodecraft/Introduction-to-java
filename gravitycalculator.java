class gravitycalculator{
    public static void main(String[]args){
        double gravity = -9.81;
        double initialvelocity = 0.0;
        double fallingtime = 10.0;
        double initialposition = 0.0;
        double finalposition = .5 * gravity *fallingtime* fallingtime;
        finalposition = finalposition + initialvelocity * fallingtime;
        finalposition = finalposition + initialposition;
        System.out.println("An objects's position after "+ fallingtime+ "seconds is " + finalposition + "m.");
    }
}