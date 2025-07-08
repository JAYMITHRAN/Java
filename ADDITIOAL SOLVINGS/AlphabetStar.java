import java.util.*;
class Friday{
  public static void main(String[]args)
  {
    Scanner jarvis = new Scanner(System.in);
    int a = jarvis.nextInt();  
    //Letter A
    // for(int i=0;i<a;i++){
    //   for(int j=0;j<a;j++){
    //     if(i==0 && j==0 || i==0 && j==a-1){
    //       System.out.print("  ");
    //       continue;
    //     }
    //     else if(i==a/2 ||j==0 || j==a-1 || i==0 && j<a)
    //     System.out.print("* ");
    //     else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    //Letter B 
    // for(int i=0;i<a;i++){
    //   for(int j=0;j<a;j++){
    //     if(j==0 ||(i==0 && j<a-1) || (i==a-1 && j<a-1) ||(i==a/2 && j<a-1) ||(j==a-1 && i%2!=0)){
    //     System.out.print("* ");  
    //     }
    //     else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    //Letter C
    // for(int i=0;i<a;i++){
    //   for(int j=0;j<a;j++){
    //     if(j==0 ||(i==0 && j<a) || (i==a-1 && j<a)){
    //     System.out.print("* ");  
    //     }
    //     else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    // Letter D
    // for(int i=0;i<a;i++){
    //   for(int j=0;j<a;j++){
    //     if(j==0 ||(i==0 && j<a-1) || (i==a-1 && j<a-1) ||(i==a/2 && j==a-1) ||(j==a-1 && i%2!=0)){
    //     System.out.print("* ");  
    //     }
    //     else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    // Letter E
    // for(int i=0;i<a;i++){
    //   for(int j=0;j<a;j++){
    //     if(j==0 ||(i==0 && j<a) || (i==a-1 && j<a) ||(i==a/2 && j<a)){
    //     System.out.print("* ");  
    //     }
    //     else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    // Letter F
    // for(int i=0;i<a;i++){
    //   for(int j=0;j<a;j++){
    //     if(j==0 ||(i==0 && j<a) ||(i==a/2 && j<a)){
    //     System.out.print("* ");  
    //     }
    //     else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
    // Letter G
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
        if(j==0 ||(i==0 && j<a) ||(i==a/2 && j<a)){
        System.out.print("* ");  
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    
    jarvis.close();
  }
}