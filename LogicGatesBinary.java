public class App {
    public static void main(String[] args) {
        
        /*  AND  */
        int a = 0b1010000;
        int b = 0b0011010;
        System.out.println("\n\tAND\n");
        printBin(a);
        System.out.println(" ");
        printBin(b);
        System.out.println(" \n ");
        printBin(a & b);

        /*  OR  */
        int a1 = 0b1010001;
        int b1 = 0b0010100;
        System.out.println("\n\tOR\n");
        printBin(a1);
        System.out.println(" ");
        printBin(b1);
        System.out.println(" \n ");
        printBin(a1 | b1);

        /*  XOR  */
        int a2 = 0b1010001;
        int b2 = 0b0010100;
        System.out.println("\n\tXOR\n");
        printBin(a2);
        System.out.println("");
        printBin(b2);
        System.out.println(" \n ");
        printBin(a2 ^ b2);

        /*  NOT  */
        int a3 = 0b1001100111;
        System.out.println("\n\tNOT\n");
        printBin(a3);
        System.out.println(" \n ");
        printBin(-a3);
    }

    public static void printBin(int b){
        System.out.println("0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1));
    }
}
