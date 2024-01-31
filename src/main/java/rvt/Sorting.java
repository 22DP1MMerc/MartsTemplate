package rvt;

public class Sorting {


        public static int smallest(int[] numbers){

            int minValue = numbers[0];
 
            for (int i = 0; i < numbers.length; i++) {
 
            if (numbers[i] < minValue){
 
                minValue = numbers[i];
            }
        }
            return minValue;
        
}
        
        public static int indexOfSmallest(int[] numbers){

            int minValue = numbers[0];
 
            for (int i = 0; i < numbers.length; i++) {
 
            if (numbers[i] < minValue){
 
                minValue = i;
            }
        }
            return minValue;
}
        public static int indexOfSmallestFrom(int[] table, int startIndex) {
  
            int minValue = table[startIndex];
            int minIndex = startIndex;

 
            for (int i = startIndex; i < table.length; i++) {
 
            if (table[i] < minValue){
 
                minIndex = i;
                minValue = table[i];
            }
        }
            return minIndex;          
}
        public static void swap(int[] array, int index1, int index2) {
            int bruh = array[index1];
            int brah = array[index2];

            array[index1] = brah;
            array[index2] = bruh;
        }
}