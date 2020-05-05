import java.util.ArrayList;

public class OnlinePurchaseManager
{
   /** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */
   private ArrayList<Gizmo> purchases;

   /** Fills the OnlinePurchaseManager with the data provided
    *  in an ArrayList of Gizmos.
    */
   public OnlinePurchaseManager(ArrayList<Gizmo> p)
   {
       purchases = p;
   }
   
   /** Returns the number of purchased Gizmo objects that are electronic and are
    *  manufactured by maker, as described in part (a).
    */
   public int countElectronicsByMaker(String maker)
   {   /* to be implemented in part (a) */ 
       
       // Your code here
       return 0;   // dummy answer so that it compiles
   }

   /** Returns true if any pair of adjacent purchased Gizmo objects are equivalent, and
    *  false otherwise, as described in part (b).
    */
   public boolean hasAdjacentEqualPair()
   {   /* to be implemented in part (b) */  
       
       // Your code here
       return false;   // dummy answer so that it compiles
   }

   // There may be instance variables, constructors, and methods not shown.
}
