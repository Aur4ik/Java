package fourth;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        // 1)
        // for(int i = 1; i <= 10; i++){
        //     for(int j = 1; j <= 10; j++){
        //         int result = i * j;
        //         System.out.println(i + " * " + j + " = " + result);
        //     }
        //     System.out.println("");
        // }
        //2)
        // for(int i = 1; i <= 4; i++){
            
        //     for(int j = 1; j <= 4; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }
        //3)
    //     for(int i = 0; i < 5; i++){
    //         for(int j = 0; j < i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("*");
    //     }
        //4)
        // int count = 0;

        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 10; j++) {
        //         int nums = i * 10 + j;

        //         if(nums % 2 ==0){
        //             count++;
        //         }
        //     }
        // }
        //5)
    //     int sum = 0;
    //     for (int i = 0; i < 100; i++) {
    //         for (int j = 0; j < i ; j++) {
    //             sum += j;
                
    //         }
    //     }
    //     System.out.println(sum);
        //6)
        // int[][]arr = new int[3][3];
        // int value = 0;
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         arr[i][j] = value;
        //         value++;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        // System.out.println(); 
        // }
        //7)
        // int[][]arr = new int[3][3];
        // int value = 0;
        // int sum = 0;
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         arr[i][j] = value;
        //         value++;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][j] + " ");
        //         sum += arr[i][j];

        //     }
        // System.out.println(); 
        // }
        // System.out.println(sum);

        //8)
        // int[][]arr = new int[3][3];
        // int value = 0;
        // int maxEl = arr[0][0];
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         arr[i][j] = value;
        //         value++;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][j] + " ");
        //         if (arr[i][j] > maxEl) {
        //             maxEl = arr[i][j];
        //         }
        //     }
        // System.out.println(); 
        // }
        // System.out.println(maxEl);

        //9)
        // int[][]arr = new int[3][3];
        // int value = 0;
        // int count = 0;
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         arr[i][j] = value;
        //         value++;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][j] + " ");
        //         boolean result = arr[i][j]%2 == 0;
        //         if(result == true){
        //             count++;
        //         }

                

        //     }
        // System.out.println(); 
        // }
        // System.out.println(count);
        //10)
        //int[][]arr = new int[3][3];
        // int value = 0;

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         arr[i][j] = value;
        //         value++;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][j] + " ");
        //         sum += arr[i][j];

        //     }
        // System.out.println("Сумма строки" + i + "=" + sum); 
        // }
        // System.out.println();
        //11)
        // int[][]arr = new int[3][3];
        // int value = 0;

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         arr[i][j] = value;
        //         value++;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][j] + " ");
        //         sum += arr[j][i];

        //     }
        // System.out.println("Сумма строки" + i + "=" + sum); 
        // }
        // System.out.println();
        //12)
        // int[][]arr = new int[3][3];
        // int value = 0;

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         arr[i][j] = value;
        //         value++;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     int sum = 0;
        //     sum += arr[i][i];
            
        // System.out.println("Сумма Главной диогонали" + sum); 
        // }
        // System.out.println();
        // //13)
        // int[][]arr = new int[3][3];
        // int value = 0;
        // int[][] transported  = new int[3][3];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         arr[i][j] = value;
        //         value++;
        //     }
        // }
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         transported[j][i] = arr[i][j];
        //     }       
        // }


        // System.out.println("Оригинал:");

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("Транспонированная:");

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(transported[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // 14)
        // int[][] arr = new int[5][5];
        // Random random = new Random();
        // System.out.println("Матрица:");

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         arr[i][j] = random.nextInt(50) + 1;
        //         System.out.print(arr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        // 15)
        // int[][] arr = new int[5][5];
        // int min = arr[0][0];
        // int minRow = 0;
        // int minCol = 0;

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         if (arr[i][j] < min) {
        //             min = arr[i][j];
        //             minRow = i;
        //             minCol = j;
        //         }
        //     }
        // }

        // System.out.println("\nМинимальный элемент: " + min +
        //         " (строка " + minRow + ", столбец " + minCol + ")");

        // 16)
        // int[][] arr = new int[5][5];
        // boolean symmetric = true;

        // for (int i = 0; i < 5; i++) {
        //     for (int j = i + 1; j < 5; j++) {
        //         if (arr[i][j] != arr[j][i]) {
        //             symmetric = false;
        //             break;
        //         }
        //     }
        // }

        // System.out.println("Матрица симметрична? " + symmetric);

        // 17)
        // int[][] arr = new int[5][5];
        // for (int j = 0; j < 5; j++) {
        //     int temp = arr[0][j];
        //     arr[0][j] = arr[4][j];
        //     arr[4][j] = temp;
        // }

        // System.out.println("\nПосле замены первой и последней строки:");

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print(arr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }

        // 18)
        // int[][] arr = new int[5][5];
        // int sum = 0;
        // int count = 25;

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         sum += arr[i][j];
        //     }
        // }

        // double average = (double) sum / count;

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         if (arr[i][j] < average) {
        //             arr[i][j] = 0;
        //         }
        //     }
        // }

        // System.out.println("\nПосле обнуления элементов меньше среднего (" + average + "):");

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print(arr[i][j] + "\t");
        //     }
        //     System.out.println();
        // }


    }

}
