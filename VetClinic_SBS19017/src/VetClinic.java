import DataFiles.AnimalData;
import DataFiles.StaffData;
import Menus.Menus;

public class VetClinic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generates all data for Staff & Animals
		StaffData stf = new StaffData();
		stf.createStaffData();
		AnimalData ad = new AnimalData();
		ad.createAnimalData();
		//Goes to menu Options
		Menus menu = new Menus();
		menu.MainMenu(stf,ad);
		
		
	}
}
