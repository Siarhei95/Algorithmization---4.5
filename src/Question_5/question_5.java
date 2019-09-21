package Question_5;
import java.util.*;

public class question_5 {
    public static void main(String[] args) {
        searchMaxElement();
    }

     public static void searchMaxElement(){
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         System.out.print("Please, enter the size of array n: ");
         int n = scanner.nextInt();
         int[]a = new int[n];
         for(int i=0; i<n; i++){
             a[i]=random.nextInt(50);
         }
         System.out.println("Divers array values" + Arrays.toString(a)); // исходные данные массива
         Arrays.sort(a);
         System.out.println("Sorted array: " + Arrays.toString(a)); //чтобы найти предпоследний максимальный элемент, выполним сортировку массива
         int max = 0;
         for(int i=0; i<a.length-1; i++){ //предмаксимальное число будет -шаг
            if(a[i]>max){
                max = a[i];
            }
         }
         System.out.println("Pre Max array value: " + max);
    }
}
