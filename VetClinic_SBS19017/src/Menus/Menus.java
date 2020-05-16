package Menus;
import java.util.Scanner;
import DataFiles.AnimalData;
import DataFiles.StaffData;

public class Menus {

	public void MainMenu(StaffData stf,AnimalData ad) {
	System.out.println("::: Hey All You cool Cats & Kittens. :::");
	System.out.println("Please select A Menu Item "
			+ "\r\n(1)Animal Directory"
			+ "\r\n(2)Admin Directory");
	
	int i = scannerMethod();
	
	switch(i) {
		case 1: animalMenu(ad);break;
		case 2: adminMenu(stf);break;
		default: 
		}
	}
	public void animalMenu(AnimalData ad) {
	System.out.println("::: Animal Directory Services :::");
	System.out.println("Please select A Menu Item "
			+ "\r\n(1)Show All Animals"
			+ "\r\n(2)Show Animals by Type"
			+ "\r\n(3)Search by Name"
			+ "\r\n(4)List by Assigned Doctor"
			+ "\r\n(5)Full que");
	int i = scannerMethod();
		switch(i) {
			case 1: ad.showAllAnimals(); break;
			case 2: System.out.println("Staff Directory");break;
			case 3: System.out.println("TBD");break;
			case 4: System.out.println("TBD");break;
			case 5: System.out.println("TBD");break;
			default: 
		}
	}
	
	public void adminMenu(StaffData stf) {
		
	System.out.println("::: Staff Directory Services :::");
	System.out.println("Please select A Menu Item "
			+ "\r\n(1)Show All Staff"
			+ "\r\n(2)Show Staff by Type"
			+ "\r\n(3)Search by Name"
			+ "\r\n(4)Show Admin Staff + Tasks");
	int i = scannerMethod();
		switch(i) {
		case 1: stf.showAllStaff(); break;
		case 2: stf.ShowStaffTitle();break;
		case 3: stf.searchByName();break;
		case 4: stf.adminStaffTasks();break;
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
