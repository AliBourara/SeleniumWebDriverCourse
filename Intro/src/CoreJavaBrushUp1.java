public class CoreJavaBrushUp1 {
    public static void main(String[] args) {

        // Todo ----Variables

        int myNum = 5;
        String myName = "Bourara";
        char letter = 'A';
        double dec = 5.99;
        float dec1 = 5.99f;
        boolean myCard = true;


        //* Print
        System.out.println("testing the print "+myNum);

        //? Array

        //Type name = new type[number of value]
        int[] arr = new int[5];
        //arr[position] = value
        arr[0] = 5 ;
        arr[1] = 3 ;
        arr[2] = 8 ;
        arr[3] = 1 ;
        arr[4] = 18 ;

        int[] arr1 = {1,2,4,5,6};
        String[] names = {
                "Salah ",
                "Fawzi",
                "Mohsen",
                "Mediha",
                "Chokri"
        };

        System.out.println("printing the index 1 of the arr1 "+arr1[1]);

        //Todo For loop

        System.out.println("printing the arr in for loop test");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Todo enhanced for loop

        for (String s:names) {
            System.out.println(s);
        }




    }
}
