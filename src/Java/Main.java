import java.util.Collections;

/**
 * A main class for testing and implementing methods from all classes in the package.
 *
 * @author Margaryta L
 * @author Chris H
 */
public class Main
{
    public static void main(final String[] args)
    {
        final Employees e1;
        e1 = new Employees();
        
        System.out.println(e1.getHockeyPlayers());
        Collections.sort(e1.getHockeyPlayers());
        System.out.println(e1.getHockeyPlayers());

        System.out.println("---------------------");

        System.out.println(e1.getProfessors());
        Collections.sort(e1.getProfessors());
        System.out.println(e1.getProfessors());

        System.out.println("---------------------");

        System.out.println(e1.getParents());
        Collections.sort(e1.getParents());
        System.out.println(e1.getParents());

        System.out.println("---------------------");

        System.out.println(e1.getAttendants());
        Collections.sort(e1.getAttendants());
        System.out.println(e1.getAttendants());
        
        System.out.println("---------------------");
        System.out.println("Displaying equals:");
        System.out.println("---------------------");
        
        e1.displayEquals();
    }
}
