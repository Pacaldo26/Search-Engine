
package search_engine;


public class SE_Account 
{
    private String name,lastname,email,password,username;
    public SE_Account(String NAME, String LASTNAME, String EMAIL,String USERNAME, String PASSWORD )
    {
        this.name= NAME;
        this.lastname=LASTNAME;
        this.email=EMAIL;
        this.password=PASSWORD;
        this.username=USERNAME;
    }
    public String setName(String NAME)
    {
        this.name=NAME;
        return this.name;
    }
      public String setLastname(String LASTNAME)
    {
        this.lastname=LASTNAME;
        return this.lastname;
    }
      public String setEmail(String EMAIL)
    {
        this.email=EMAIL;
        return this.email;
    }
      public String setUsername(String USERNAME)
    {
        this.username=USERNAME;
        return this.username;
    }
public String setPassword(String PASSWORD)
    {
        this.password=PASSWORD;
        return this.password;
    }
 public String getName()
    {
       
        return this.name;
    }
      public String getLastname()
    {
       
               
        return this.lastname;
    }
      public String getEmail()
    {

        return this.email;
    }
      public String getUsername()
    {
       
        return this.username;
    }
public String getPassword()
    {
       
        return this.password;
    }
}
