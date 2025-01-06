public class LabTask10 {
    public static void main(String[] args) {
        System.out.println("Degrees   "+"Radians   "+"Sine    "+"Cosine   "+"Tangent");
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        System.out.printf("   %d     %.4f    %.4f  %.4f   %.4f",degrees,radians,sin,cos,tan);
        System.out.println();
        degrees = 60;
        radians = Math.toRadians(degrees);
        sin = Math.sin(radians);
        cos = Math.cos(radians);
        tan = Math.tan(radians);
        System.out.printf("   %d     %.4f    %.4f  %.4f   %.4f",degrees,radians,sin,cos,tan);
        System.out.println();
    }
    
}
