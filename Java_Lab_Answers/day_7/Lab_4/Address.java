package day_7.Lab_4;

public class Address {
	private String companyCity;
	private String companyState;
	private Company company;//Address has one Company
	
	public Address(String companyCity, String companyState) {
		this.companyCity = companyCity;
		this.companyState = companyState;
	}
	public String getCompanyCity() {
		return companyCity;
	}
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	public String getCompanyState() {
		return companyState;
	}
	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Address [companyCity=" + companyCity + ", companyState=" + companyState + "]";
	}
	
	
	

}
