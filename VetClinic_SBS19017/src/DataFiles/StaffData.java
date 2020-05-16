package DataFiles;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Objects.AdminStaff;
import Objects.MedicalStaff;

public class StaffData {
//Staff data class to generates all staff titles and names. 
	public ArrayList <AdminStaff> adminStaffList;
	public ArrayList <MedicalStaff> medStaffList;
	public ArrayList<String> adminTitlesList;
	public ArrayList<String> medicalTitlesList;
	public ArrayList<String> staffNamesList;
	public ArrayList<String> salaryLevelList;
	public ArrayList<String> adminTaskList;
	int stafferID = 10010;
	
		//Creates Arraylist for adminJobTitle
		public void adminJobTitle() {
			adminTitlesList  = new ArrayList<String>();
			adminTitlesList.add("Recepionist");
			adminTitlesList.add("Cleaner");
			adminTitlesList.add("Accountant");
			adminTitlesList.add("Insurance Consultant");
		}	
		//Creates Arraylist for medicalJobTitle		
		public void medicalJobTitle() {
			medicalTitlesList = new ArrayList<String>(5);
			medicalTitlesList.add("General Vet");
			medicalTitlesList.add("Head Vetrinary Surgeon");
			medicalTitlesList.add("Vetrinary Surgeon");
			medicalTitlesList.add("Nurse");
			medicalTitlesList.add("anaesthesiologist");
		}
		//Creates Arraylist for staffNames
		public void staffNames()  {
		staffNamesList = new ArrayList<String>(10);
	
		staffNamesList.add("Adam");
		staffNamesList.add("Anne");
		staffNamesList.add("Steve");
		staffNamesList.add("Steph");
		staffNamesList.add("Michael");
		staffNamesList.add("Michaella");
		staffNamesList.add("John");
		staffNamesList.add("Johanna");
		staffNamesList.add("Ted");
		staffNamesList.add("Tyler");
		}
		//Creates Arraylist for SalaryLevel
		public void SalaryLevel() {
		salaryLevelList = new ArrayList<String>(4);
		
		salaryLevelList.add("A");
		salaryLevelList.add("B");
		salaryLevelList.add("C");			
		salaryLevelList.add("D");
		}
		//Creates Arraylist for adminTasks
		public void adminTasks() {
			adminTaskList = new ArrayList<String>(5);
			
			adminTaskList.add("Administration work");
			adminTaskList.add("Consulting");
			adminTaskList.add("assiting staff");			
			adminTaskList.add("house keeping");
			adminTaskList.add("End of day checks");
		}
		//Creates Arraylist for createStaffData
		public void createStaffData() {
			adminJobTitle();
			medicalJobTitle();
			staffNames();
			SalaryLevel();
			adminTasks();
			medStaffCreator();
			adminStaffCreator();
		}
	
		//MedicalStaffCreator creates all admin staff and adds all objects created into an ArrayList for adminStaff
		public void medStaffCreator() {
		medStaffList = new ArrayList<MedicalStaff>();
		int medicalStaffNo = 30;
		Random rand = new Random();
		Random randSalary = new Random();
		Random randTitle = new Random();
		
			for(int i=0;i < medicalStaffNo;i++) {
				
			MedicalStaff m = new MedicalStaff();

			int randint = rand.nextInt(staffNamesList.size());
			String tempName = staffNamesList.get(randint);
			
			int randint2 = randSalary.nextInt(salaryLevelList.size());
			String tempSalary = salaryLevelList.get(randint2);
			
			int randint3 = randTitle.nextInt(medicalTitlesList.size());
			String tempTitle = medicalTitlesList.get(randint3);
			
			m.setName(tempName);
			m.setStaffID((stafferID + i));
			m.setSalaryLevel(tempSalary);
			m.setMedicalTitle(tempTitle);
			medStaffList.add(m);
			}
		
		}
		//AdminStaffCreator creates all admin staff and adds all objects created into an ArrayList for adminStaff
		public void adminStaffCreator() {
			adminStaffList = new ArrayList<AdminStaff>();
			int adminStaffNo = 10;
			Random rand = new Random();
			Random randSalary = new Random();
			Random randTitle = new Random();
			Random randTask = new Random();

			

				for(int i=0;i < adminStaffNo;i++) {
		
				AdminStaff a = new AdminStaff();

				int randint = rand.nextInt(staffNamesList.size());
				String tempName = staffNamesList.get(randint);
				
				int randint2 = randSalary.nextInt(salaryLevelList.size());
				String tempSalary = salaryLevelList.get(randint2);
				
				int randint3 = randTitle.nextInt(adminTitlesList.size());
				String tempTitle = adminTitlesList.get(randint3);
				
				int randInt4 = randTask.nextInt(adminTaskList.size());
				String tempTask = adminTaskList.get(randInt4);
				
				
				
				a.setName(tempName);
				a.setStaffID((stafferID + i + medStaffList.size()));
				a.setSalaryLevel(tempSalary);
				a.setAdminTitle(tempTitle);
				a.setAdminTask(tempTask);
				adminStaffList.add(a);
				}
			
			}
		//ShowAllStaff method prints all objects within staff med list and admin staff list. 
		public void showAllStaff() {
			for (int i =0 ; i < medStaffList.size();i++) {
				System.out.println(medStaffList.get(i));	
				}
			for (int i =0 ; i < adminStaffList.size();i++) {
			System.out.println(adminStaffList.get(i));	
			}
		}
		//ShowStaffTitle allows the user to select a job title and this will print all staff members with said job title. 
		public void ShowStaffTitle() {
			System.out.println("Please Select a Staff Title");
			System.out.println("1.)Recepionist"
					+ "2.)Cleaner"
					+ "3.)Accountant"
					+ "4.)Insurance Consultant"
					+ "5.)General Vet"
					+ "6.)Head Vetrinary Surgeon"
					+ "7.)Vetrinary Surgeon"
					+ "8.)Nurse"
					+ "9.)anaesthesiologist");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			switch(i) {
			case 1:
				checkAdminList("Recepionist");
				ShowStaffTitle();
			break;
			case 2:checkAdminList("Cleaner");
			ShowStaffTitle();
			break;
			case 3:checkAdminList("Accountant");
			ShowStaffTitle();
			break;
			case 4:checkAdminList("Insurance Consultant");
			ShowStaffTitle();
			break;
			case 5:checkMedicalList("General Vet");
			ShowStaffTitle();
			break;
			case 6:checkMedicalList("Head Vetrinary Surgeon");
			ShowStaffTitle();
			break;
			case 7:checkMedicalList("Vetrinary Surgeon");
			ShowStaffTitle();
			break;
			case 8:checkMedicalList("Nurse");
			ShowStaffTitle();
			break;
			case 9:checkMedicalList("anaesthesiologist");
			ShowStaffTitle();
			break;
			default:
				}
		}
		//SearchByName method allows the user to input a name. this will execute a for loop which will search both
		// the admin staff list and the medical staff list. 
		// if input name is the same as a name on either list it will print the name and continue to search.
		public void searchByName() {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String temp = scan.nextLine();
			for(int i = 0;i < adminStaffList.size();i++) {
				String tempTitle = adminStaffList.get(i).getName();
				boolean nameSearch = temp.equals(tempTitle);
				if(nameSearch != false){
					System.out.println(adminStaffList.get(i));
				}
			}	
		}
		//AdminStaffTasks prints out a list of admins and their current tasks. 
		public void adminStaffTasks() {
			for (int i =0 ; i < adminStaffList.size();i++) {
				System.out.println(adminStaffList.get(i).getName() + " is Currently doing "+adminStaffList.get(i).getAdminTask());	
				}
		}
		//checkadminList method passes through a jobTitle from ShowStaffTitle
		//A for loop then check the size of the admin staff array and itterates through
		//the array printing out the object which has the same JobTitle and adminTitle.
		public void checkAdminList(String jobTitle) {
			for(int i = 0;i < adminStaffList.size();i++) {
				String tempTitle = adminStaffList.get(i).getAdminTitle();
				if(tempTitle == jobTitle) {
					System.out.println(adminStaffList.get(i));
				}
			}		
		}
		
		//checkMedicalList method passes through a jobTitle from ShowStaffTitle
		//A for loop then check the size of the medical staff array and itterates through
		//the array printing out the object which has the same JobTitle and MedicalTitle. 
		public void checkMedicalList(String jobTitle) {
			for(int i = 0;i < medStaffList.size();i++) {
				String tempTitle = medStaffList.get(i).getMedicalTitle();
				if(tempTitle == jobTitle) {
					System.out.println(medStaffList.get(i));
				}
			}		
		}
}


