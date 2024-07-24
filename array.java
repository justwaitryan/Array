
package tugasukl;


public class array {
    public static void main(String[] args) {
        System.out.println("Soal Array \n");
         System.out.println("No 1 : \n");
         int [] A1 = {-7,5,4,8};
         int [] B1 = {1,1,-4,9};
         
         System.out.println("Matriks A. ");
         for (int i = 0; i < A1.length; i++) {     
              System.out.print(A1[i] + " ");  
               if ( i == 1) {
                   System.out.println("");
            }
             
         }
         System.out.println("\n");  
         System.out.println("Matriks B. ");
         for (int i = 0; i < B1.length; i++) {     
              System.out.print(B1[i] + " ");  
               if ( i == 1) {
                   System.out.println("");
            }
              
         }
         System.out.println("\n");
         System.out.println("A-B = ");
         for (int i = 0; i < A1.length; i++) {
             for (int j = 0; j < B1.length; j++) {
                 
                 if (i == j) {
                     System.out.print(A1[i] - B1[j] + " ");
                 }
                 if (i == 1 && j == 1) {
                     System.out.println("");
                 }
             }
         }
         
         
        System.out.println("\n");
        System.out.println("No 2:\n");
        System.out.println("a)");
        int A2[][] = new int[2][2];
        A2[0][0] = 6;
        A2[0][1] = 3;
        A2[1][0] = 4;
        A2[1][1] = 8;

        int B2[][] = new int[2][1];
        B2[0][0] = 1;
        B2[1][0] = 2;
        
        int C2[][] = new int[2][1];

        System.out.println("Matriks A. ");
        for (int i = 0; i < A2.length; i++) {
            for (int j = 0; j < A2[1].length; j++) {
                System.out.print(A2[i][j] + " ");
            }

            System.out.println("");

        }
        System.out.println("");
        System.out.println("Matriks B. ");
        for (int i = 0; i < B2.length; i++) {
            for (int j = 0; j < B2[0].length; j++) {
                System.out.print(B2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("A x B = ");
        
        for (int i = 0; i < A2.length; i++) {
            for (int j = 0; j < B2[0].length; j++) {
                int total = 0;
                for (int k = 0; k < A2.length; k++) {
                total = total + (A2[i][k] * B2[k][j]);
                }
                C2[i][j] = total;
            }
            
        }
        for (int i = 0; i < C2.length; i++) {
            for (int j = 0; j < C2[0].length; j++) {
                System.out.print(C2[i][j]+ "");
            }
            System.out.println("");
        }
        
        
        System.out.println("\nb.\n");
        int A3[][] = new int[2][3];
        A3[0][0] = 6;
        A3[0][1] = 3;
        A3[0][2] = 2;
        A3[1][0] = 4;
        A3[1][1] = 2;
        A3[1][2] = 3;
        int B3[][] = new int[3][2];
        B3[0][0] = 1;
        B3[0][1] = 2;
        B3[1][0] = 2;
        B3[1][1] = 3;
        B3[2][0] = 3;
        B3[2][1] = 1;
        int C3[][] = new int[2][2];
        System.out.println("Matriks A.");
        for (int i = 0; i < A3.length; i++) {
            for (int j = 0; j < A3[0].length; j++) {
                System.out.print(A3[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("Matriks B.");
        for (int i = 0; i < B3.length; i++) {
            for (int j = 0; j < B3[0].length; j++) {
                System.out.print(B3[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");                
        System.out.println("A x B = ");
        for (int i = 0; i < A3.length; i++) {
            for (int j = 0; j < B3[0].length; j++) {
                int total = 0;
                for (int k = 0; k < A3.length; k++) {
                    total = total + (A3[i][k] * B3[k][j]);
                }
                C3[i][j] = total;
            }

        }
        for (int i = 0; i < C3.length; i++) {
            for (int j = 0; j < C3[0].length; j++) {
                System.out.print(C3[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
