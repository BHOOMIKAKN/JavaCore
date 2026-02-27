//---->>>>>> Two Pointer Problems   <<<<<-----
// Remove duplicates
// Move zeros to end
// Pair with given sum

class Pointerpro {
   public void remDup(int [] a) {
      boolean [] vis = new boolean[a.length];
      for(int i=0;i<a.length;i++) {
         if(vis[i]) continue;
         for(int j=i+1;j<a.length;j++) {
            if(a[i]==a[j]){
               vis[j]=true;
            }
         }
         System.out.println(a[i]+ " ");
      }
   }
   public void moveZeros(int [] a) {
      int j=0;
      for(int i=0;i<a.length;i++) {
         if(a[i] != 0) {
            a[j] = a[i];
            j++;
         }
      }
      while(j<a.length) {
         a[j] =0;
         j++;
      }
      for(int i=0;i<a.length;i++) {
         System.out.println(a[i]+ " ");
      }
   }
}
public class Array3 {
   public static void main(String[] args) {
      int arr[]= new int[5];
      arr[0]= 2;
      arr[1]= 1;
      arr[2]= 0;
      arr[3]= 4;
      arr[4]= 5;
      Pointerpro pro =new Pointerpro();
      pro.remDup(arr);
      pro.moveZeros(arr);

   } 
}
