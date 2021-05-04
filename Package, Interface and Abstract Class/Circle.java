package Package2;

public class Circle implements Area{
    int r = 0;
    double ar = 0;

    public void input()
    {
        r = 5;
    }
   
    public void compute()
    {
        ar = PI * r * r;
    }
    
   public void print() {
    	System.out.println("Area of circle:"+ar);
    }	
}