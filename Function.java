public class Function{
public static void main(String... args){

int[] numbersList = {5,4,3,2,4,9};

System.out.println(largest(numbersList));
System.out.println(odd(numbersList));
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



public static boolean check(int inputNumber, int[] numbers ){
for(int number:numbers){
if(inputNumber == number){
return true;
}
        


}return false;


}

public static int[] odd(int[] numbers){
int[] numberOdd = {};
for(int number:numbers){
if(number % 2 != 0){

}

}

return numbers;
}

public static int isSum(int[] addition){

int total = 0;
for(int counter = 0; counter <= addition.length; counter++){
total += counter;

}

return total;
}


 

}
