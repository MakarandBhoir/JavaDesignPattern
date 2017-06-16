package version1;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

	@Override
	public String toString() {
		return "\n Employee [getId()=" + getId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName()
				+ ", getEmail()=" + getEmail() + "]";
	}
    
}
