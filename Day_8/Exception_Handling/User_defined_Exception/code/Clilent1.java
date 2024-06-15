package code;

public class Clilent1 {
    static void disp()throws MyExcep{
        Calcu c = new Calcu();
        int result = 0;
        result = c.sqr(-9);
        System.out.println(result);
    }
    public static void main(String[] args) {
        try{
            disp();
        }catch(Exception e){
            System.out.println(e);
        }System.out.println("Done");
    }
    
}