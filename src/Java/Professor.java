import java.util.Objects;

/**
 * Models a professor with general information and behaviours.
 *
 * @author Margaryta L
 * @author Chris H
 */
public class Professor
        extends Employee
        implements Comparable<Professor>
{
    private final String teachingMajor;
    public static final double OVERTIME_PAY_RATE = 2.0;
    public static final String HIGHER_MAJOR      = "Computer Systems";
    public static final String DRESS_CODE        = "fancy";
    public static final String WORK_VERB         = "teach";
    
    /**
     * Constructor.
     * @param name Professor's name.
     * @param teachingMajor Teaching major.
     */
    public Professor(final String name,
                     final String teachingMajor)
    {
        super(name);
        
        if(teachingMajor == null || teachingMajor.isBlank())
        {
            throw new IllegalArgumentException("Invalid major: " + teachingMajor);
        }
        this.teachingMajor = teachingMajor;
    }
    
    /**
     * Returns professor's teaching major.
     * @return Teaching major.
     */
    public String getTeachingMajor()
    {
        return teachingMajor;
    }
    
    /**
     * Returns dress code for a professor.
     * @return DRESS_CODE.
     */
    @Override
    public String getDressCode()
    {
        return DRESS_CODE;
    }
    
    /**
     * Returns true/false if a professor is paid salary.
     * @return True.
     */
    @Override
    public boolean isPaidSalary()
    {
        return true;
    }
    
    /**
     * Returns true/false if post secondary is required for a professor.
     * @return True.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return true;
    }
    
    /**
     * Returns a work verb for a professor.
     * @return WORK_VERB.
     */
    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }
    
    /**
     * Compares two professors and returns true/false if they are equal in their teaching major.
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
        
        if(!(o instanceof Professor))
        {
            return false;
        }
        
        Professor that;
        that = (Professor) o;
        
        return this.teachingMajor.equalsIgnoreCase(that.teachingMajor);
    }
    
    /**
     * Returns object's hash code.
     * @return Hash code.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), teachingMajor);
    }
    
    /**
     * Compares two professors.
     * Professors who teach Computer Science are considered “highest”; others are equal.
     * @param o the object to be compared.
     * @return 0 if objects are equal/ 1 if this objects is higher/ -1 if this object is lower
     */
    @Override
    public int compareTo(final Professor o)
    {
       if(this.teachingMajor.equalsIgnoreCase(HIGHER_MAJOR) && o.teachingMajor.equalsIgnoreCase(HIGHER_MAJOR))
       {
           return 0;
       } else if(this.teachingMajor.equalsIgnoreCase(HIGHER_MAJOR) && !o.teachingMajor.equalsIgnoreCase(HIGHER_MAJOR))
       {
           return 1;
       } else if(!this.teachingMajor.equalsIgnoreCase(HIGHER_MAJOR) && o.teachingMajor.equalsIgnoreCase(HIGHER_MAJOR))
       {
           return -1;
       }
       return 0;
    }
    
    /**
     * Returns a string with professor's details.
     * @return String with details.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "Professor{" +
                "teachingMajor='" + teachingMajor + '\'' +
                "}\n";
    }
}
