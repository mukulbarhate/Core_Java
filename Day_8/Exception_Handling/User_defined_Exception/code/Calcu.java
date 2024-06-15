package code;

public class Calcu {
    public int sqr(int num)throws MyExcep{
        if (num <=0) {
            throw new MyExcep("Zero or negative allowed");
        }
        return num*num;
    }
}
