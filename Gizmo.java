public class Gizmo
{
   private String maker;
   private boolean electronic;
   
   /** Stores the maker and whether the Gizmo is electronic */
   public Gizmo (String m, boolean e)
   {
       maker = m;
       electronic = e;
   }
   
   /** Returns the name of the manufacturer of this Gizmo. */
   public String getMaker()
   {  return maker;  }

   /** Returns true if this Gizmo is electronic, and false otherwise. 
    */
   public boolean isElectronic()
   {  return electronic;  }

   /** Returns true if this Gizmo is equivalent to the Gizmo object 
    *  represented by the parameter, and false otherwise.
    */
   public boolean equals(Gizmo other)
   {  return ((this.maker == other.maker) &&
              (this.electronic == other.electronic));
   }

   // There may be instance variables, constructors, and methods not shown.
}
