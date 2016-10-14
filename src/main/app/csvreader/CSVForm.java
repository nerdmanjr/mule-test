package csvreader;

public class CSVForm {
	private String firstName;
	private String lastName;
	private String street1;
	private String zip1;
	private String street2;
	private String zip2;
	
	public CSVForm() {
	}

	public CSVForm(String firstName, String lastName, String street1, String zip1, String street2, String zip2) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.street1 = street1;
		this.zip1 = zip1;
		this.street2 = street2;
		this.zip2 = zip2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getZip1() {
		return zip1;
	}

	public void setZip1(String zip1) {
		this.zip1 = zip1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getZip2() {
		return zip2;
	}

	public void setZip2(String zip2) {
		this.zip2 = zip2;
	}

	@Override
	public String toString(){
		StringBuilder result = new StringBuilder("\n");
		result.append("Name: ").append(this.firstName).append(" ").append(this.lastName).append("\n");
		result.append("Street: ").append(this.street1).append(", ").append(this.street2).append("\n");
		result.append("ZIP: ").append(this.zip1).append("-").append(this.zip2).append("\n");
		
		return result.toString();
	}
}
