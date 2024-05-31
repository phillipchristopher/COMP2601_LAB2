import java.util.Objects;

/**
 * Models a gas station attendant with general information and behaviours.
 *
 * @author Margaryta L
 * @author Chris H
 */
public class GasStationAttendant
        extends Employee
        implements Comparable<GasStationAttendant>
{
    private final double numberOfDollarsStolenPerDay;
    public static final double MIN_DOLLARS       = 0.0;
    public static final double OVERTIME_PAY_RATE = 1.5;
    public static final String DRESS_CODE        = "uniform";
    public static final String WORK_VERB         = "pump";
    
    /**
     * Constructor.
     * @param name Attendant's name.
     * @param numberOfDollarsStolenPerDay Number of dollars stolen in a day.
     */
    public GasStationAttendant(final String name,
                               final double numberOfDollarsStolenPerDay)
    {
        super(name);
        
        if(numberOfDollarsStolenPerDay < MIN_DOLLARS)
        {
            throw new IllegalArgumentException("Invalid number: " + numberOfDollarsStolenPerDay);
        }
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }
    
    /**
     * Returns number of dollars stolen in a day.
     * @return Number of dollars stolen in a day.
     */
    public double getNumberOfDollarsStolenPerDay()
    {
        return numberOfDollarsStolenPerDay;
    }
    
    /**
     * Returns a string of a dress code for a gas station attendant.
     * @return DRESS_CODE.
     */
    @Override
    public String getDressCode()
    {
        return DRESS_CODE;
    }
    
    /**
     * Returns true/false if an attendant is paid salary.
     * @return False.
     */
    @Override
    public boolean isPaidSalary()
    {
        return false;
    }
    
    /**
     * Returns true/false if post secondary is required for an attendant.
     * @return False.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return false;
    }
    
    /**
     * Returns a work verb for an attendant.
     * @return WORK_VERB.
     */
    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }
    
    /**
     * Compares two attendants and returns true/false if they are equal in their dollars stolen per day.
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
        
        if(!(o instanceof GasStationAttendant))
        {
            return false;
        }
        
        GasStationAttendant that;
        that = (GasStationAttendant) o;
        
        return Double.compare(this.numberOfDollarsStolenPerDay, that.numberOfDollarsStolenPerDay) == 0;
    }
    
    /**
     * Returns object's hash code.
     * @return Hash code.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), numberOfDollarsStolenPerDay);
    }
    
    /**
     * Compares two attendants.
     * GasStationAttendants who steal the most per week are considered “highest”.
     * @param o the object to be compared.
     * @return 0 Difference in hours.
     */
    @Override
    public int compareTo(final GasStationAttendant o)
    {
        return (int)(this.numberOfDollarsStolenPerDay - o.numberOfDollarsStolenPerDay);
    }
    
    /**
     * Returns a string with attendant's details.
     * @return String with details.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "GasStationAttendant{" +
                "numberOfDollarsStolenPerDay=" + numberOfDollarsStolenPerDay +
                "}\n";
    }
}
