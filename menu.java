import java.util.*;

public class menu {
    // msg
    public static void msg() {
        System.out.println("|----------------------------------------|");
        System.out.println("|             Enter a number             |");
        System.out.println("|----------------------------------------|");
        System.out.println();
    }

    // back to menu
    public static void back() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("|----------------------------------------|");
        System.out.println("|   Enter a 0 for back to main menu      |");
        System.out.println("|----------------------------------------|");
        int back = sc.nextInt();
        if (back == 0) {
            main(null);
        }
    }

    // armstrong
    public static void armstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("|----------------------------------------|");
        System.out.println("|         You choose  Armstrong          |");
        msg();
        int a, in, r, cbrt, s = 0;
        in = sc.nextInt();
        a = in;
        while (in > 0) {
            r = in % 10;
            in = in / 10;
            cbrt = r * r * r;
            s = s + cbrt;
        }
        if (a == s) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + a + "    is a Armstrong number          |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + a + "    is not a Armstrong numb        |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // automorphic
    public static void automorphic() {
        Scanner sc = new Scanner(System.in);
        int in, sqrt, r;
        System.out.println("|----------------------------------------|");
        System.out.println("|         You choose  Automorphic        |");
        msg();
        in = sc.nextInt();
        sqrt = in * in;
        r = sqrt % 10;
        if (r == in) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is a Armstrong number          |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "  is not a Armstrong number        |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // buzz
    public static void buzz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("|----------------------------------------|");
        System.out.println("|             You choose buzz            |");
        msg();
        int in, a;
        in = sc.nextInt();
        if (in / 7 == 0 || in % 10 == 7) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is a Buzz number              |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is not a Buzz number          |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // duck
    public static void duck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("|----------------------------------------|");
        System.out.println("|             You choose duck            |");
        msg();
        int r, n, num;
        boolean flag = false;
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            if (r == 0) {
                flag = true;
            }
            num = num / 10;
        }
        if (flag) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + n + "    is a Duck number               |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + n + "    is not a Duck number            |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // even odd
    public static void evenodd() {
        Scanner sc = new Scanner(System.in);
        int in;
        System.out.println("|----------------------------------------|");
        System.out.println("|            You choose even-odd         |");
        msg();
        in = sc.nextInt();
        if (in == 0) {
            System.out.println("|---------------------------------------------|");
            System.out.println("|Number is Zero which is neither odd nor even |");
            System.out.println("|---------------------------------------------|");
        } else if (in % 2 == 0) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is a even number                 |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println(in + " number is Odd number");
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is a odd number                  |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // harshad
    public static void harshad() {
        Scanner sc = new Scanner(System.in);
        int in, a, r, s = 0;
        System.out.println("|----------------------------------------|");
        System.out.println("|            You choose Harshad          |");
        msg();
        in = sc.nextInt();
        a = in;
        while (a > 0) {
            r = a % 10;
            a = a / 10;
            s = s + r;
        }
        if (in % s == 0) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is a harshad number            |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is a not a harshad number       |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // neon
    public static void neon() {
        Scanner sc = new Scanner(System.in);
        int in, sqrt, r, s = 0;
        System.out.println("|----------------------------------------|");
        System.out.println("|            You choose Neon             |");
        msg();
        in = sc.nextInt();
        sqrt = in * in;
        while (sqrt > 0) {
            r = sqrt % 10;
            s = s + r;
            sqrt = sqrt / 10;
        }
        if (s == in) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is a Neon number                |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is not a Neon number            |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // palindrome
    public static void palindrome() {
        int in, num, r,
                rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("|----------------------------------------|");
        System.out.println("|            You choose Palindrome       |");
        msg();
        in = sc.nextInt();
        num = in;
        while (num > 0) {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        if (in == rev) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is a Palindrome number       |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + in + "    is not a palindrome number   |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // speacial
    public static void special() {
        int n, num, r,
                sumOfFactorial = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("|----------------------------------------|");
        System.out.println("|            You choose Special          |");
        msg();
        n = sc.nextInt();
        num = n;
        while (num > 0) {
            r = num % 10;
            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            sumOfFactorial = sumOfFactorial + fact;
            num = num / 10;
        }
        if (n == sumOfFactorial) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + n + "    is a special number            |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + n + "    is  not a special number        |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // spy
    public static void spy() {
        Scanner sc = new Scanner(System.in);
        int a, in, r, s = 0, m = 1;
        System.out.println("|----------------------------------------|");
        System.out.println("|               You choose Spy           |");
        msg();
        in = sc.nextInt();
        a = in;
        while (in != 0) {
            r = in % 10;
            in = in / 10;
            s = s + r;
            m = m * r;

        }
        if (s == m) {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + a + "    is a spy number               |");
            System.out.println("|----------------------------------------|");
        } else {
            System.out.println("|----------------------------------------|");
            System.out.println("|  " + a + "    is not a spy number           |");
            System.out.println("|----------------------------------------|");
        }
        back();
    }

    // main + menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // main menu
        System.out.println("|----------------------------------------|");
        System.out.println("|       Welcome to number programm       |");
        System.out.println("|----------------------------------------|");
        System.out.println();
        System.out.println("|----------------------------------------|");
        System.out.println("|  S.no. |     Number                    |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   1.   |  Armstrong Number             |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   2.   |  Automorphic Number           |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   3.   |  Buzz Number                  |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   4.   |  Duck Number                  |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   5.   |  Even or odd Number           |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   6.   |  Harshad Number               |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   7.   |  Neon Number                  |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   8.   |  Palindrome Number            |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   9.   |  Special Number               |");
        System.out.println("|--------|-------------------------------|");
        System.out.println("|   10.  |  Spy Number                   |");
        System.out.println("|--------|-------------------------------|");
        System.out.println();
        msg();
        int menuin = sc.nextInt();
        switch (menuin) {
            case 1:
                armstrong();
                break;
            case 2:
                automorphic();
                break;
            case 3:
                buzz();
                break;
            case 4:
                duck();
                break;
            case 5:
                evenodd();
                break;
            case 6:
                harshad();
                break;
            case 7:
                neon();
                break;
            case 8:
                palindrome();
                break;
            case 9:
                special();
                break;
            case 10:
                spy();
                break;
            default:
                System.out.println("Invalid Input please enter right number re-run program :)");
        }
    }

}