package pkg; 
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   public int countElectronicsByMaker(String mkr){
      int c = 0; 
      for(int i = 0; i < purchases.size(); i++){
         if(purchases.get(i).equals(mkr)){
         c++;
         }
      }
      return c; 
   }
   public boolean hasAdjacentEqualPair(){
      if(Gizmo.equals(Gizmo a)){
      }
      return false; 
   }
   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	ArrayList<Gizmo> cheap = purchases; 
   	for(int i = 0; i < purchases.size(); i++){
   	   if(purchases.get(i) < cheap){
   	      cheap = purchases.get(i);
   	   }
   	}
   	return cheap; 
   }
   
   
   public String toString(){
   	return "" + purchases;
   }
}
