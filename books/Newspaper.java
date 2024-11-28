public class Newspaper extends Books {
    private String headlines;
    private int pages;
    public Newspaper(){
        super();
        headlines = "COMSATS University shifted to Mars";
        pages = 99;
    }
    public void display(){
        System.out.println("title: " +title);
        System.out.println("pirce " + price);
        System.out.println("Headlines: "+ headlines);
        System.out.println("pages: " + pages);
    }
}
