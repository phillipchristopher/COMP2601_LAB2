import java.util.Objects;

/**
 * General abstract employee class for any profession.
 *
 * @author Margaryta L
 * @author Chris H
 */
public abstract class Employee
        implements Employable
{
    private final String name;
    
    /**
     * Constructor.
     * @param name Name of the employee.
     */
    public Employee(final String name)
    {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
       
        this.name = name;
    }
    
    /**
     * Returns employee name.
     * @return Returns name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Compares two employees and returns true/false if they are equal in name.
     * @param o Object to compare with.
     * @return True if names are equal / false if names are not equal
     */
    @Override
    public boolean equals(final Object o)
    {
        if(this == o)
        {
            return true;
        }
        
        if(o == null)
        {
            return false;
        }
        
        if(!(o instanceof Employee))
        {
            return false;
        }
        
        Employee that;
        that = (Employee)o;
        
        return this.name.equalsIgnoreCase(that.name);
    }
    
    /**
     * Returns object's hashcode.
     * @return Returns hashcode.
     */
    @Override
    public int hashCode()
    {
        return 0;
    }
    
    /**
     * Returns a string with object's details.
     * @return Returns a string.
     */
    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                "}";
    }
  
}
