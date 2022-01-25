public class ArraysWithMethodsLecture {
    public static void main(String[] args) {

        int[] array = randomArray(5);
        printArray(array);
        System.out.println(checkArray(array, 10));
    }

    public static int[] randomArray(int size){
        int array[] = new int[size];
        for (int x = 0; x < size; x++) {
            array[x] = (int) (Math.random() * 10) + 1;
        }
        return array;
    }

    public static void printArray(int[] a){
        System.out.print("{");
        for (int x = 0; x < a.length; x++){
            System.out.print(" " + a[x] + " ");
            if (x < a.length - 1)
                System.out.print("|");
        }
        System.out.println("}");
    }

    public static String checkArray(int[] a, int c){
        for (int x = 0; x < a.length; x++)
            if (a[x] == c)
                return "The number " + c + " was initially found at element " + x +" of this array.";
        return "The number " + c + " was not found in this array.";
    }
}
