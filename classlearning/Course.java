public class Course {
    private String title;
    private String code;
    private int credit;
    public void display(){
        System.out.println(title);
        System.out.println(code);
        System.out.println(credit);
    }
    // give the values to variables
    public void setTitle(String a){
        title = a;
    }
    public void setCode(String b){
        code = b;
    }
    public void setcredit(int c){
        credit = c;
    }
    public String getTitle(){
        return title;
    }
    public String getcode(){
        return code;
    }
    public int getcredit(){
        return credit;
    }
    // public course(){
    //     tilte = a;
    // }
    // public course(){

    // }
    public Course(){
        title = "pf";
        code = "cs101";
        credit = 4;
    }
    public Course(String a, String b, int c){
        title = a;
        code = b;
        credit = c;
    }
}
