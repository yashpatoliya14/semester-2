class UseOfStatic{
    static int count=0;
    UseOfStatic(){
        count++;
    }
}

public class Lab5e {
    public static void main(String[] args) {
        UseOfStatic s1 = new UseOfStatic();
        UseOfStatic s2 = new UseOfStatic();
        UseOfStatic s3 = new UseOfStatic();
        UseOfStatic s4 = new UseOfStatic();
        UseOfStatic s5 = new UseOfStatic();
        UseOfStatic s6 = new UseOfStatic();
        UseOfStatic s7 = new UseOfStatic();
        System.out.println(UseOfStatic.count);
    }
}
