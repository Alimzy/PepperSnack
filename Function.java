import java.util.Arrays;
public class Function{
public static void main(String... args){

int[] numbersList = {5,4,3,2,4,9};

System.out.println(largest(numbersList));
System.out.println(Arrays.toString(odd(numbersList)));
System.out.println(Arrays.toString(even(numbersList)));
System.out.println(Arrays.toString(reverseArray(numbersList)));
System.out.println(check(90,numbersList));
System.out.println(isSum(numbersList));
}

public static int largest(int[] numbers){
int largestNumber = numbers[0];
for(int counter = 0; counter < numbers.length; counter++){
    if( numbers[counter] > largestNumber){
    largestNumber = numbers[counter];
}

}
return  largestNumber;
}

public static int[] reverseArray(int[] numbers){
int[] newArray = new int[numbers.length];
int counterTwo =0;
for(int counter = numbers.length-1; counter >=0 ; counter--){
newArray[counterTwo] = numbers[counter];
counterTwo++;

}

return newArray;
}

public static boolean check(int inputNumber, int[] numbers ){
for(int number:numbers){
if(inputNumber == number){
return true;
}
        


}return false;


}

public static int[] odd(int[] numbers){
int[] oddArray = new int[numbers.length/2];
int counter=0;
for(int number =0;number < numbers.length; number+=2){
 oddArray[counter]=numbers[number];
counter++;

}

return oddArray;
}


public static int[] even(int[] numbers){
int[] evenArray = new int[numbers.length/2];
int counter=0;
for(int number =1;number < numbers.length; number+=2){
evenArray[counter]=numbers[number];
counter++;

}

return evenArray;
}


public static int isSum(int[] addition){

int total = 0;
for(int counter = 0; counter <= addition.length; counter++){
total += counter;

}

return total;
}

//public static int[] concatenate(int[] numbersOne =, int[] numbersTwo =){
//String[] newArray = new String[numbersOne.length && numbersTwo.length]    
//for(int count = 0; count < newArray.length;count; count++){
//newArray = 
//
//
//}
//
//
//}
//
 

}
