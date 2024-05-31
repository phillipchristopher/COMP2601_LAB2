/**
 *Interface with methods typical for employee objects.
 *
 * @author Margaryta L
 * @author Chris H
 */
public interface Employable
{
    /**
     * Returning true/false if employee has dress code
     * @return true is had dress code/false if does not have dress code
     */
    String getDressCode();
    
    /**
     * Returning true/false if employees is paid salary.
     * @return true if paid salary/false if does not.
     */
    boolean isPaidSalary();
    
    /**
     * Returning true/false if position requires post secondary education.
     * @return true if yes/false if no
     */
    boolean postSecondaryEducationRequired();
    
    /**
     * Returning string of a work verb for an employee.
     * @return String of a work verb.
     */
    String getWorkVerb();
    
    /**
     * Returning true/false if employee gets paid.
     * @return true by default
     */
    default boolean getsPaid()
    {
        return true;
    }
}
