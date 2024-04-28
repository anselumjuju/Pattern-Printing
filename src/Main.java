class Main {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern9a(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
    }

    public static void pattern1(int n) {
        System.out.println("\nPattern 1:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        System.out.println("\nPattern 2:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        System.out.println("\nPattern 3:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        System.out.println("\nPattern 4:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        System.out.println("\nPattern 5:");
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = n - (Math.abs(i - n));
            for (int j = 1; j <= stars; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        System.out.println("\nPattern 6:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print((n - i) < j ? "*" : " ");
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        System.out.println("\nPattern 7:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++)
                System.out.print((n - i) < j ? "*" : " ");
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        System.out.println("\nPattern 8:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++)
                System.out.print(Math.abs(j - n) < i ? "*" : " ");
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        System.out.println("\nPattern 9:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                System.out.print(Math.abs(j - n) < i ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void pattern9a(int n) {
        System.out.println("\nPattern 9a:");
        for (int i = 1; i <= 2 * n - 1; i++) {
            int spaces = Math.abs(i - n);
            int stars = 2 * n - 2 * spaces;
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            for (int j = 1; j < stars; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        System.out.println("\nPattern 10:");
        for (int i = 1; i <= n; i++) {
            int spaces = Math.abs(i - n);
            int stars = i;
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            for (int j = 1; j <= stars; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        System.out.println("\nPattern 11:");
        for (int i = n; i >= 1; i--) {
            int spaces = Math.abs(i - n);
            int stars = i;
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            for (int j = 1; j <= stars; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        System.out.println("\nPattern 12:");
        for (int i = 1; i < 2 * n; i++) {
            int stars = Math.abs(i - n) + 1;
            int spaces = n - stars;
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            for (int j = 1; j <= stars; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        System.out.println("\nPattern 13:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (i == Math.abs(j - n) + 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        System.out.println("\nPattern 14:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < 2 * n; j++) {
                if (i == Math.abs(j - n) + 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        System.out.println("\nPattern 15:");
        for(int i=1;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                if(i<=n){
                    if(i==Math.abs(j-n)+1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }else{
                    if(5-Math.abs(i-n)==Math.abs(j-n)+1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

