import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==k){
        System.out.println(k+" is present in the array");
        break;
      }else{
         System.out.println(k+" is not present in the array");
        break;
      }
    }
    
  }
}