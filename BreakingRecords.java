import java.util.Scanner;

public class brokeScore{
public static void main(String[] args) {
    
    Scanner scan= new Scanner(System.in);
    int arraysize = scan.nextInt();
    int []  aar = new int [arraysize];

      for(int i = 0; i <= aar.length-1; i++ ){
          aar[i] = scan.nextInt();
       }



 int maxValue= aar[0];
 int minValue= aar[0];
 int count=  0;
 int sount = 0;


for(int i = 1 ; i<=aar.length-1; i++){

 if(maxValue<aar[i]){

    maxValue = aar[i];
    count++;
    }

 else if (minValue>aar[i]){
     minValue = aar[i];
     sount++;
    }

}



    int[] a = new int [2];

    a[0]= count;
    a[1] =sount;


    for(int i = 0; i<= a.length-1; i++ ){

    System.out.println(a[i]);

    }

  }
}