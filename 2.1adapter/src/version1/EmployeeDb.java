package version1;

public class EmployeeDb implements Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDb(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
    @Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName()
				+ ", getEmail()=" + getEmail() + "]";
	}
    
}
