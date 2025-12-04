public class LogisticDelivery{
    public static void main(String... args){

System.out.println(calcDelivery(25));
}

public static int calcDelivery(int succesfulDelivery){
int ridersWage;
if(succesfulDelivery <  50){
ridersWage = succesfulDelivery * 160 + 5000;
}else if(succesfulDelivery >= 50 && succesfulDelivery <= 59){

ridersWage = succesfulDelivery * 200 + 5000;
}else if(succesfulDelivery >= 60 && succesfulDelivery <= 69){
ridersWage = succesfulDelivery * 250 + 5000;

}else{

ridersWage = succesfulDelivery * 500 + 5000;
}
return ridersWage;
}

}
