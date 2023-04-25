import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Class_1 {


    public static int[] ReadData(String file) {

        int[] numbers = new int[10];
        // String file_1 = "nums.txt";

        try {


            File obj_file = new File(file);

            Scanner obj_scan = new Scanner(obj_file);


            // int[] numbers = new int[10];

            for (int i = 0; i < 10; i++) {
                numbers[i] = obj_scan.nextInt();
            }

            obj_scan.close();

        } catch (FileNotFoundException e) {

            System.out.println("file not exist");

        }

        return numbers;

    }


    
    public static int SumArray(int[] array_1){



        int sum_1 = 0;

        for (int i = 0; i < array_1.length; i++)
        {
            sum_1 = sum_1 + array_1[i];
        }

        return sum_1;

    }


    public static void main(String[] args) {


        String file_1 = "nums.txt";

        int[] numbers = ReadData(file_1);

        for (int i = 0; i < 10; i++)
        {
            System.out.println(numbers[i]);
        }

        int[] array_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum_array = SumArray(array_1);

        System.out.println(sum_array);



    }






}
