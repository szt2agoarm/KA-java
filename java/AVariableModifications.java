public class AVariableModifications {
    public static void main(String[] args) {
        int a = 3;
        // increase the value of variable "a" by 10 and print the new value
        a = a + 10;
        System.out.println(a);

        int b = 100;
        // decrease the value of b by 7 and print the new value
        b = b - 7;
        System.out.println(b);

        int c = 44;
        // double the value of c and print the new value
        c = c * 2;
        System.out.println(c);

        int d = 125;
        // divide the value of d by 5 and print the new value
        d = d % 5;
        System.out.println(d);

        int e = 8;
        // cube the value of e and print the new value
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // determine if f1 is greater than f2 (print as a boolean)
        if (f1 > f2) {
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        

        int g1 = 350;
        int g2 = 200;
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)
        
        if (g2 * 2 > g1) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }

        int h = 135798745;
        // determine if h has 11 as a divisor (print as a boolean)
        if (h % 11 ==0){
        System.out.println(true);
    } else{
        System.out.println(false);
    }

        int i1 = 10;
        int i2 = 3;
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)
        if (i1 > i2 && i1 * i1 < i2 * i2 * i2){
            System.out.println(true);
        } else{
            System.out.println(false);
        }


        int j = 1521;
        // determine if j is divisible by 3 or 5 (print as a boolean)
        if (j % 3 == 0 || j % 5 == 0){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

    }
}
