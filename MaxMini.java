public class MaxMini {
    public static int[] getNumbers(int numbers[]){
        int MaxMini[] = new int[2];
        MaxMini[0] = Integer.MIN_VALUE; // - infinity 
        MaxMini[1] = Integer.MAX_VALUE; // + infinity

        for(int i = 1 ; i < numbers.length ; i++){
            if( MaxMini[0] < numbers[i]) {
                MaxMini[0] = numbers[i];
             }
            if( MaxMini[1] > numbers[i] ){
                MaxMini[1] = numbers[i] ;
            } 
        }
        return MaxMini;
    }  
    
    public static void main(String args[]){
    int numbers[] = {1,3,5,7,9};
    int MaxMini[] = getNumbers(numbers);
    System.out.println("Largest Number is "+MaxMini[0]);
    System.out.println("Samllest Number is "+MaxMini[1]);
    }
}
