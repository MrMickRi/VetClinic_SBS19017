package Objects;



public class MedicalStaff extends Staff {

	String medicalTitle;

	public String getMedicalTitle() {
		return medicalTitle;
	}

	public void setMedicalTitle(String medicalTitle) {
		this.medicalTitle = medicalTitle;
	}

	@Override
	public String toString() {
		return "MedicalStaff "
				+ "["
				+":: Name=" + name 
				+":: StaffID =" + StaffID 
				+":: Medical Title =" + medicalTitle 
				+":: SalaryLevel =" + SalaryLevel 
				+"]";
	}	
}
