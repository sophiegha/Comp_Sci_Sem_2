package pkg;

public class Gizmo
{ 
   private String maker; 
   private boolean isE; 
   private double cost; 
   public Gizmo(String maker, boolean isE){
      this.maker = maker; 
      this.isE = isE; 
   }
   public String getMaker(){
      return maker; 
   }
   public boolean isElectronic(){
      return isE; 
   }
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
   public boolean equals(Gizmo other){
      return this.maker == other.maker; 
   }
}
