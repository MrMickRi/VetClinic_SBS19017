package Objects;


public class AdminStaff extends Staff{

	String adminTitle;
	String adminTask;

	public String getAdminTitle() {
		return adminTitle;
	}

	public void setAdminTitle(String adminTitle) {
		this.adminTitle = adminTitle;
	}
	
	public String getAdminTask() {
		return adminTask;
	}

	public void setAdminTask(String adminTask) {
		this.adminTask = adminTask;
	}
	

	public String toString() {
		return "Admin Staff "
				+ "["
				+":: Name=" + name 
				+":: StaffID =" + StaffID 
				+":: Admin Title =" + adminTitle 
				+":: SalaryLevel =" + SalaryLevel 
				+":: Admin Task =" + adminTask
				+"]";
	}	
}
