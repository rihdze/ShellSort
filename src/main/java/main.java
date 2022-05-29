import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random random = new Random();
        //Enter the size of the array here in ther brackets [], same number should go in the while(i < ) loop
        int arr[] = new int[200000];


        int i = 0;
        while(i < 200000){
            /////////////////////////////// MAXIMUM     MINIMUM      MINIMUM
            arr[i] = random.nextInt((999999999 - 10000) + 1) + 10000;
            i++;
        }
// WOULDN'T RECOMMEND USING THIS, BECAUSE THERE IS A LOT OF DATA AND THE SCREEN WILL BE FULL OF NUMBERS.
//        System.out.println("Starting array");
//        printArray(arr);

        long start = System.currentTimeMillis();
        shellSort(arr);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);
// WOULDN'T RECOMMEND USING THIS, BECAUSE THERE IS A LOT OF DATA AND THE SCREEN WILL BE FULL OF NUMBERS.
//        System.out.println("Sorted");
//        printArray(arr);

    }

    public static int shellSort(int arr[])
    {
        int n = arr.length;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temporaryArray = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap] > temporaryArray; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temporaryArray;
            }
        }
        return 0;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
