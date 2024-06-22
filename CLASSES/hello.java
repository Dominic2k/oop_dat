package CLASSES;

public class hello {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(++a+1);// 3 | a = 2
        System.out.println(a++); // 2 | a = 3
        System.out.println(++a); // 4 | a = 4
        a++; // a = 5
        System.out.println(++a+1); // 7 | a = 6
        System.out.println(a+++1); // 7 | a = 7
        
        System.out.println(++a+1); // 9 | a = 8
        ++a; // a = 9
        System.out.println(++a+1); // 11 | a = 10
        System.out.println(a); //10
        // 3 2 4 7 7 9 11 10
    }
}
