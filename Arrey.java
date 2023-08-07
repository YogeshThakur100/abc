 import java.util.*; 
class j62 {
    public static void main (String agrs []) {
        // int marks[] = new int [3];
        // marks[0] = 97;
        // marks[1] = 99;
        // marks[2] = 95;

        int marks [] = {99,98,97};
 

        for (int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
    }
 }

 class j63 {
    public static void main (String agrs []) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();

            int number[] = new int[n];

            for (int i=0; i<n; i++) {
                number[i] = sc.nextInt();
             }

            for (int i=0; i<n; i++) {
                System.out.println(number[i]);
            }
        }

    }
 }

 class j64 {
    public static void main (String agrs []) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();

            int input[] = new int[n];

            for(int i=0; i<n; i++) {
                input[i] = sc.nextInt();
            }
            int x = sc.nextInt();

            for (int i=0; i<n; i++) {
                if (input[i] == x) {
                    System.out.println("x is found at index:"+ i);
                }
            }
        }
    }
 }

 class j65 {
    public static void main (String args []) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();

            String names[] = new String [n];
            for (int i=0; i<n; i++) {
                names[i] = sc.next();
            }
            for (int i=0; i<n; i++) {
                System.out.println(names[i]);
            }
        }
    }
 }

 class j66 {
    public static void main (String agrs []) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter n:");
            int n = sc.nextInt();
            System.out.println("Enter m:");
            int m = sc.nextInt();

            int number[][] = new int[n][m];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    number[i][j] = sc.nextInt();

                }
            }

            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    System.out.print(number[i][j] + " ");
                }System.out.println();
            }
        }

        }

    }

    class j67 {
        public static void main (String agrs []) {
            try (Scanner sc = new Scanner (System.in)) {
                System.out.println("Enter n:");
                int n = sc.nextInt();
                System.out.println("Enter m:");
                int m = sc.nextInt();

                int number [][] = new int [n][m];
                //Input:
                for (int i=0; i<n; i++) {
                    for (int j=0; j<m; j++) {
                        number [i][j] = sc.nextInt();
                    }
                }

                int x = sc.nextInt();

                for (int i=0; i<n; i++) {
                    for (int j=0; j<m; j++) {
                        if (number[i][j] == x) {
                            System.out.println("X if found at location:"+i + " " +j);
                        
                    }
                }
      }
            }
    }
}

// Transverse of Matrix:
class j68 {
    public static void main (String args []) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int number [][] = new int [n][m];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    number [i][j] = sc.nextInt();
                }
            }

            for (int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    System.out.print(number [j][i]); 
                }System.out.println();
            }
        }
    }
}

//Spiral of Matrix:
class j69 {
    public static void main (String agrs []) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter n:");
            int n = sc.nextInt();
            System.out.println("Enter m:");
            int m = sc.nextInt();

            int number [][] = new int [n][m];

            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    number [i][j] = sc.nextInt();
                }
            }

            System.out.println("The Spiral of the given matrix is: ");

            int rowStart = 0;
            int rowEnd = n-1;
            int colStart = 0;
            int colEnd = m-1;

            while (rowStart <= rowEnd && colStart <= colEnd) {
                //1)
                
                for (int col=colStart; col<=colEnd; col++) {
                    System.out.print(number[rowStart][col] + " ");
                }
                rowStart++;

                //2)

                for (int row=rowStart; row<=rowEnd; row++) {
                    System.out.print(number[row][colEnd] + " ");
                }
                colEnd--;

                //3)

                for (int col=colEnd; col>=colStart; col--){
                    System.out.print(number[rowEnd][col] + " ");
                }
                rowEnd--;

                //4)

                for (int row=rowEnd; row>=rowStart; row--) {
                    System.out.print(number[row][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}

// Check_for_smallest_and_largest_value_in_arrey:
class j69 {
    public static void main (String args []) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();

            int number[] = new int [n];

            for (int i=0; i<n; i++) {
                number[i] = sc.nextInt();
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i=0; i<n; i++) {
                if (number[i] < min) {
                    min = number[i];
                }

                if (number[i] > max) {
                    max = number[i];
                }
                
            }
            System.out.println("Smallest number of the arrey is: " + min);
            System.out.print("Largest number of the arrey is: " + max);
        }
    }
}

//Check_for_accending_order:
class j69 {
    public static void main (String args[]) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();

            int number[] = new int [n];

            for (int i=0; i<n; i++) {
                number[i] = sc.nextInt();
            }

            boolean isAscending = true;

            for (int i=0; i<n-1; i++) {
                if (number[i] > number[i+1]) {
                    isAscending = false;
                }
            }

            if (isAscending) {
                System.out.println("Given arrey is in Ascending order");
            }
            else {
                System.out.println("Given arrey is not in Ascending order");
            }
        }
    }
}