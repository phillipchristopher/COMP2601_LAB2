import java.util.Objects;

/**
 * Models a parent with general information and behaviours.
 *
 * @author Margaryta L
 * @author Chris H
 */
public class Parent
        extends Employee
        implements Comparable<Parent>
{
    private final int weeklyHoursWithKids;
    
    public static final int    MIN_HOURS         = 0;
    public static final double OVERTIME_PAY_RATE = -2.0;
    public static final String DRESS_CODE        = "anything";
    public static final String WORK_VERB         = "care";
    
    /**
     * Constructor
     * @param name Parent's name.
     * @param weeklyHoursWithKids Hours spent with kids in a week.
     */
    public Parent(final String name,
                  final int    weeklyHoursWithKids)
    {
        super(name);
        
        if(weeklyHoursWithKids < MIN_HOURS)
        {
            throw new IllegalArgumentException("Invalid hours: " + weeklyHoursWithKids);
        }
        this.weeklyHoursWithKids = weeklyHoursWithKids;
    }
    
    /**
     * Returns hours spent with kids in a week.
     * @return weekly hours.
     */
    public int getWeeklyHoursWithKids()
    {
        return weeklyHoursWithKids;
    }
    
    /**
     * Returns a string of a dress code for a parent.
     * @return DRESS_CODE.
     */
    @Override
    public String getDressCode()
    {
        return DRESS_CODE;
    }
    
    /**
     * Returns true/false if a parent is paid salary.
     * @return False.
     */
    @Override
    public boolean isPaidSalary()
    {
        return false;
    }
    
    /**
     * Returns true/false if post secondary is required for a parent.
     * @return False.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return false;
    }
    
    /**
     * Returns a work verb for a parent.
     * @return WORK_VERB.
     */
    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }
    
    /**
     * Overwrites default getPaid() method for a parent.
     * @return False.
     */
    @Override
    public boolean getsPaid()
    {
        return false;
    }
    
    /**
     * Compares two parents and returns true/false if they are equal in their weekly hours.
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
        
        if(!(o instanceof Parent))
        {
            return false;
        }
        
        Parent that;
        that = (Parent) o;
        
        return this.weeklyHoursWithKids == that.weeklyHoursWithKids;
    }
    
    /**
     * Returns object's hash code.
     * @return Hash code.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), weeklyHoursWithKids);
    }
    
    /**
     * Compares two parents.
     * Parents who spend the most hours/week with their kids are considered “highest”.
     * @param o the object to be compared.
     * @return 0 Difference in hours.
     */
    @Override
    public int compareTo(final Parent o)
    {
        return this.weeklyHoursWithKids - o.weeklyHoursWithKids;
    }
    
    /**
     * Returns a string with parent's details.
     * @return String with details.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "Parent{" +
                "weeklyHoursWithKids=" + weeklyHoursWithKids +
                "}\n";
    }
}
