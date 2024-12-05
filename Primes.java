public class Primes {

    // function builds an array type boolean sized n+1. return an array ranged from 2-n+1 with true value.
    public static boolean [] buildArr(int n){
        boolean [] arr = new boolean[n+1];
        for( int i=2; i<n+1; i++){
            arr[i]=true;
        }
        return arr;
    }

    //function gets an array type boolean. returns an array which points wheater the index is a prime number. 
    public static boolean [] indexIsPrime(boolean [] arr){
        for( int i=2; i<Math.sqrt(arr.length); i++){
            if(arr[i]){
                for( int j=i*i; j<arr.length; j+=i){
                    arr[j]=false;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Replace this statement with your code
        int  n= Integer.parseInt(args[0]);
        boolean [] build= buildArr(n);
        System.out.println("Prime numbers up to " + n + ":");
        boolean [] isPrime = indexIsPrime(build);
        int counter =0;
        for(int i=2; i< isPrime.length; i++){
            if(isPrime[i]==true){
                System.out.println(i);
                counter++;
            }
        }
        int percent = (int) (((double) counter / (double) n) * 100.00);
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }        

}
