import java.util.Scanner;
 public class insertStaticArray{
  public static void main(String args[]){
   int pos,x;
   Scanner s=new Scanner(System.in);
   int a[]=new int[6];
   System.out.println("Enter all the elements:");
   for(int i=0;i<5;i++){
    a[i]=s.nextInt();
    }
   do{
   System.out.println("Enter the position where you want to insert:");
   pos=s.nextInt();
   }while(pos>=6);
   System.out.println("Enter the Element to Insert Array");
   x=s.nextInt();
   for(int i=4;i>=(pos-1);i--){
    a[i+1]=a[i];
    }
    a[pos-1]=x;
    System.out.println("After Inserting:");
    for(int i=0;i<5;i++){
     System.out.print(a[i]+",");
     }
     System.out.print(a[5]+"\n");
   }
  }
