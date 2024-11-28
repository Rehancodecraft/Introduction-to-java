public class Main {
    public static void main(String[] args) {
        
      Books b1 = new Books();
      b1.display();
      Newspaper n1 = new Newspaper();
      n1.display();
      b1 = n1;
      b1.display();

    }
    
}
