package Menus;
import java.util.Scanner;
import DataFiles.AnimalData;
import DataFiles.StaffData;

public class Menus {

	public void MainMenu(StaffData stf,AnimalData ad) {
	System.out.println("::: Directory Selection Services :::");
	System.out.println("Please select A Menu Item "
			+ "\r\n(1)Animal Directory"
			+ "\r\n(2)Admin Directory"
			+ "\r\n(3)Exit Program");
	
	int i = scannerMethod();
	
	switch(i) {
		case 1: animalMenu(ad,stf);break;
		case 2: adminMenu(ad, stf);break;
		case 3: System.exit(0);break;
		default: 
		}
	}
	public void animalMenu(AnimalData ad,StaffData stf) {
	
	System.out.println("::: Animal Directory Services :::");
	System.out.println("Please select A Menu Item "
			+ "\r\n(1)Show All Animals"
			+ "\r\n(2)Show Animals by Type"
			+ "\r\n(3)Search by Name"
			+ "\r\n(4)List by Assigned Doctor"
			+ "\r\n(5)Full que"
			+ "\r\n(6)Back to Main Menu"
			+ "\r\n(7)Exit Program");
	
	int i = scannerMethod();
		switch(i) {
			case 1: ad.showAllAnimals(); 
					animalMenu(ad,stf);
					break;
			case 2: ad.ShowAnimalsbyType();
					animalMenu(ad,stf);
					break;
			case 3: ad.searchByName();
					animalMenu(ad,stf);
					break;
			case 4: ad.listAnimalsAndDoctors();
					animalMenu(ad,stf);
					break;
			case 5: System.out.println("TBD");
					animalMenu(ad,stf);
					break;
			case 6: MainMenu(stf, ad);
					animalMenu(ad,stf);
					break;
			case 7: System.exit(0);break;
			default: 
		}
	}
	
	public void adminMenu(AnimalData ad, StaffData stf) {
		
	System.out.println("::: Staff Directory Services :::");
	System.out.println("Please select A Menu Item "
			+ "\r\n(1)Show All Staff"
			+ "\r\n(2)Show Staff by Type"
			+ "\r\n(3)Search by Name"
			+ "\r\n(4)Show Admin Staff + Tasks"
			+ "\r\n(5)return to menu"
			+ "\r\n(6)Exit Program");
	int i = scannerMethod();
		switch(i) {
		case 1: stf.showAllStaff();
				adminMenu(ad,stf);
				break;
		case 2: stf.ShowStaffTitle();
				adminMenu(ad,stf);
				break;
		case 3: stf.searchByName();
				adminMenu(ad,stf);
				break;
		case 4: stf.adminStaffTasks();
				adminMenu(ad,stf);
				break;
		case 5: MainMenu(stf, ad);break;
		case 6: System.exit(0); break;
		default: 
		}
	}
	
	public int scannerMethod() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		return i;
	}
}
