import java.util.ArrayList;
import java.util.List;

/**
 * Models a collection of different kinds of employees.
 *
 * @author Margaryta L
 * @author Chris H
 */
public class Employees
{
    private final List<Employee>            employees;
    private final List<HockeyPlayer>        hockeyPlayers;
    private final List<Professor>           professors;
    private final List<Parent>              parents;
    private final List<GasStationAttendant> attendants;
    
    /**
     * A constructor.
     * Creating objects for every kind of employee.
     */
    public Employees()
    {
        employees     = new ArrayList<>();
        hockeyPlayers = new ArrayList<>();
        professors    = new ArrayList<>();
        parents       = new ArrayList<>();
        attendants    = new ArrayList<>();
        
        final HockeyPlayer hp1;
        final HockeyPlayer hp2;
        final HockeyPlayer hp3;
        final HockeyPlayer hp4;
        final HockeyPlayer hp5;
        
        final Professor professor1;
        final Professor professor2;
        final Professor professor3;
        final Professor professor4;
        final Professor professor5;
        
        final Parent parent1;
        final Parent parent2;
        final Parent parent3;
        final Parent parent4;
        final Parent parent5;
        
        final GasStationAttendant gs1;
        final GasStationAttendant gs2;
        final GasStationAttendant gs3;
        final GasStationAttendant gs4;
        final GasStationAttendant gs5;
        
        hp1 =  new HockeyPlayer("Wayne Gretzky", 894);
        hp2 =  new HockeyPlayer("Who Ever",      0);
        hp3 =  new HockeyPlayer("Brent Gretzky", 1);
        hp4 =  new HockeyPlayer("Pavel Bure",    437);
        hp5 =  new HockeyPlayer("Jason Wilder",  0);
        
        professor1 = new Professor("Albert Einstein", "Physics");
        professor2 = new Professor("Jason Wilder",    "Computer Systems");
        professor3 = new Professor("Richard Feynman", "Physics");
        professor4 = new Professor("BCIT Instructor", "Computer Systems");
        professor5 = new Professor("Kurt Godel",      "Logic");
        
        parent1 = new Parent("Tiger Woods", 1);
        parent2 = new Parent("Super Mom",   168);
        parent3 = new Parent("Lazy Larry",  20);
        parent4 = new Parent("Ex Hausted",  168);
        parent5 = new Parent("Super Dad",   167);
        
        gs1 = new GasStationAttendant("Joe Smith",         10);
        gs2 = new GasStationAttendant("Tony Baloney",      100);
        gs3 = new GasStationAttendant("Benjamin Franklin", 100);
        gs4 = new GasStationAttendant("Mary Fairy",        101);
        gs5 = new GasStationAttendant("Bee See",           1);
        
        hockeyPlayers.add(hp1);
        hockeyPlayers.add(hp2);
        hockeyPlayers.add(hp3);
        hockeyPlayers.add(hp4);
        hockeyPlayers.add(hp5);
        
        professors.add(professor1);
        professors.add(professor2);
        professors.add(professor3);
        professors.add(professor4);
        professors.add(professor5);
        
        parents.add(parent1);
        parents.add(parent2);
        parents.add(parent3);
        parents.add(parent4);
        parents.add(parent5);
        
        attendants.add(gs1);
        attendants.add(gs2);
        attendants.add(gs3);
        attendants.add(gs4);
        attendants.add(gs5);
        
        //adding above objects to employees:
        employees.add(hp1);
        employees.add(hp2);
        employees.add(hp3);
        employees.add(hp4);
        employees.add(hp5);
        employees.add(professor1);
        employees.add(professor2);
        employees.add(professor3);
        employees.add(professor4);
        employees.add(professor5);
        employees.add(parent1);
        employees.add(parent2);
        employees.add(parent3);
        employees.add(parent4);
        employees.add(parent5);
        employees.add(gs1);
        employees.add(gs2);
        employees.add(gs3);
        employees.add(gs4);
        employees.add(gs5);
    }
    
    /**
     * Displaying equal employees based on their equals() method in a form of:
     * "Employee{name='Super Mom'}Parent{weeklyHoursWithKids=168}
     *  equals to Employee{name='Ex Hausted'}Parent{weeklyHoursWithKids=168}"
     */
    public void displayEquals()
    {
        final List<Employee> foundMatches;
        foundMatches = new ArrayList<>();
        
        for(Employee employee: employees)
        {
          for(Employee nextEmployee: employees)
          {
              if(employee instanceof HockeyPlayer && nextEmployee instanceof HockeyPlayer)
              {
                  employee = (HockeyPlayer)employee;
                  nextEmployee = (HockeyPlayer)nextEmployee;
                  
                  if(!foundMatches.contains(employee) && !foundMatches.contains(nextEmployee))
                  {
                      if(employee.equals(nextEmployee) && employee != nextEmployee)
                      {
                          foundMatches.add(employee);
                          foundMatches.add(nextEmployee);
                          
                          System.out.println(employee + " equals to " + nextEmployee);
                      }
                  }
              } else if(employee instanceof Professor && nextEmployee instanceof Professor)
              {
                  employee = (Professor)employee;
                  nextEmployee = (Professor)nextEmployee;
                  
                  if(!foundMatches.contains(employee) && !foundMatches.contains(nextEmployee))
                  {
                      if(employee.equals(nextEmployee) && employee != nextEmployee)
                      {
                          foundMatches.add(employee);
                          foundMatches.add(nextEmployee);
                          
                          System.out.println(employee + " equals to " + nextEmployee);
                      }
                  }
              } else if(employee instanceof Parent && nextEmployee instanceof Parent)
              {
                  employee = (Parent)employee;
                  nextEmployee = (Parent)nextEmployee;
                  
                  if(!foundMatches.contains(employee) && !foundMatches.contains(nextEmployee))
                  {
                      if(employee.equals(nextEmployee) && employee != nextEmployee)
                      {
                          foundMatches.add(employee);
                          foundMatches.add(nextEmployee);
                          
                          System.out.println(employee + " equals to " + nextEmployee);
                      }
                  }
              }else if(employee instanceof GasStationAttendant
                      && nextEmployee instanceof GasStationAttendant)
              {
                  employee = (GasStationAttendant)employee;
                  nextEmployee = (GasStationAttendant)nextEmployee;
                  
                  if(!foundMatches.contains(employee) && !foundMatches.contains(nextEmployee))
                  {
                      if(employee.equals(nextEmployee) && employee != nextEmployee)
                      {
                          foundMatches.add(employee);
                          foundMatches.add(nextEmployee);
                          
                          System.out.println(employee + " equals to " + nextEmployee);
                      }
                  }
              }
          }
        }
    }
    
    /**
     * Returns a list of employees.
     * @return A list of employees.
     */
    public List<Employee> getEmployees()
    {
        return employees;
    }
    
    /**
     * Returns a list of hockey players.
     * @return A list of hockey players.
     */
    public List<HockeyPlayer> getHockeyPlayers()
    {
        return hockeyPlayers;
    }
    
    /**
     * Returns a list of professors.
     * @return A list of professors.
     */
    public List<Professor> getProfessors()
    {
        return professors;
    }
    
    /**
     * Returns a list of parents.
     * @return A list of parents.
     */
    public List<Parent> getParents()
    {
        return parents;
    }
    
    /**
     * Returns a list of gas station attendants.
     * @return A list of gas station attendants.
     */
    public List<GasStationAttendant> getAttendants()
    {
        return attendants;
    }
}
