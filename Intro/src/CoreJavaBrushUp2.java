import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {

    // if else

        int[] arr1 = {1,2,4,5,6,8,10,11,26,13,125};
        int pairs = 0;
        int nonPairs = 0;
        for (int i = 0; i < arr1.length; i++) {


            if(arr1[i]%2==0){
                pairs +=1;
            }else {
                nonPairs +=1;
            }
        }
        System.out.println("Numbers of pairs : "+ pairs);
        System.out.println("Numbers of Non pairs : "+ nonPairs);

        //? ArrayList dynamically change the size of the array
        //Create objet of the class - object.method
        ArrayList<String> a = new ArrayList<String>();
        a.add("Salah");
        a.add("Mohsen ");
        a.add("Nader");
        a.add("Faysal");
        a.remove(3);
        System.out.println(a.get(2));

        for (String s : a) {
            System.out.println(s);
        }

        //item is present in ArrayList
        System.out.println(a.contains("Nader"));

        //* Convert array to array list
        String[] carModels = {
                "Chevy",
                "VW",
                "BMW"
        };
        List<String> carModelsArrayList = Arrays.asList(carModels);


    }
}


