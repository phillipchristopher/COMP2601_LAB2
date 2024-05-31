import java.util.Objects;

/**
 * Models a hockey player with general information and behaviours.
 *
 * @author Margaryta L
 * @author Chris H
 */
public class HockeyPlayer
        extends Employee
        implements Comparable<HockeyPlayer>
{
    private final int numberOfGoals;
    
    public static final int    MIN_GOALS         = 0;
    public static final double OVERTIME_PAY_RATE = 0.0;
    public static final String DRESS_CODE        = "jersey";
    public static final String WORK_VERB         = "play";
    
    /**
     * Constructor.
     * @param name Player's name.
     * @param numberOfGoals Number of goals.
     */
    public HockeyPlayer(final String name,
                        final int    numberOfGoals)
    {
        super(name);
        
        if(numberOfGoals < MIN_GOALS)
        {
            throw new IllegalArgumentException("Invalid number of goals: " + numberOfGoals);
        }
        this.numberOfGoals = numberOfGoals;
    }
    
    /**
     * Returns number of goals scored.
     * @return Number of goals.
     */
    public int getNumberOfGoals()
    {
        return numberOfGoals;
    }
    
    /**
     * Returns a dress code for the hockey player.
     * @return DRESS_CODE.
     */
    @Override
    public String getDressCode()
    {
        return  DRESS_CODE;
    }
    
    /**
     * Returns true/false if a player is paid salary.
     * @return True.
     */
    @Override
    public boolean isPaidSalary()
    {
        return true;
    }
    
    /**
     * Returns true/false if post secondary is required for a hockey player.
     * @return False.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return false;
    }
    
    /**
     * Returns a work verb for a hockey player.
     * @return WORK_VERB.
     */
    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }
    
    /**
     * Compares two hockey players and returns true/false if they are equal in goals scored.
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
        
        if(!(o instanceof HockeyPlayer))
        {
            return false;
        }
        
        HockeyPlayer that;
        that = (HockeyPlayer) o;
        
        return this.numberOfGoals == that.numberOfGoals;
    }
    
    /**
     * Returns object's hash code.
     * @return Hash code.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), numberOfGoals);
    }
    
    /**
     * Compares two hockey players.
     * HockeyPlayers with the most goals are considered “highest”.
     * @param o the object to be compared.
     * @return Difference between number of goals.
     */
    @Override
    public int compareTo(final HockeyPlayer o)
    {
        return this.numberOfGoals - o.numberOfGoals;
    }
    
    /**
     * Returns a string with hockey player's details.
     * @return String with details.
     */
    @Override
    public String toString()
    {
        return super.toString() +
                "HockeyPlayer{" +
                "numberOfGoals=" + numberOfGoals +
                "}\n";
    }
}
