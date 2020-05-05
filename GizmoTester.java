
/**
 * Used to test the Gizmo and OnlinePurchaseManager classes
 * Example from the 2019 APCS-A Course Description
 *
 * @author Michael Buescher at Hathaway Brown
 * @version 2020-05-05    // feliz cinco de mayo
 */
import java.util.ArrayList;

public class GizmoTester
{
    public static void main (String[] args)
    {
       ArrayList<Gizmo> p = new ArrayList<Gizmo>();
       p.add (new Gizmo("ABC", true));
       p.add (new Gizmo("ABC", false));
       p.add (new Gizmo("XYZ", true));
       p.add (new Gizmo("lmnop", false));
       p.add (new Gizmo("ABC", true));
       p.add (new Gizmo("ABC", false));

       OnlinePurchaseManager opm = new OnlinePurchaseManager(p);
       
       // Test code for part (a)
       // Should return 2, 0, 1, and 0, respectively
       System.out.println(opm.countElectronicsByMaker("ABC"));
       System.out.println(opm.countElectronicsByMaker("lmnop"));
       System.out.println(opm.countElectronicsByMaker("XYZ"));
       System.out.println(opm.countElectronicsByMaker("QRP"));
       
       // Test code for part (b)
       // Should return false
       System.out.println(opm.hasAdjacentEqualPair());
    }
}
