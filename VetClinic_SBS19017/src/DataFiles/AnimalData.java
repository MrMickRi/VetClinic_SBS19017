package DataFiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

import Objects.Animals;

public class AnimalData {
	ArrayList<String>animalTypeList ;
	ArrayList<String>medicalConditionList;
	ArrayList<String>animalNames;
	ArrayList<Animals>animalList;
	
	public void animalTypes() {
		animalTypeList = new ArrayList<String>();
		animalTypeList.add("Canine");
		animalTypeList.add("Feline");
		animalTypeList.add("Rabbit");
		animalTypeList.add("Bird");
		animalTypeList.add("Fish");
		animalTypeList.add("Horse");
		animalTypeList.add("Gerbil");
		animalTypeList.add("Hamster");
		animalTypeList.add("Woodland Critter");
		animalTypeList.add("llama");
	}	
	public void medicalConditions(){
		medicalConditionList=new ArrayList<String>();
		medicalConditionList.add("Broken Bone");
		medicalConditionList.add("Internal Bleeding");
		medicalConditionList.add("Infected laceration");
		medicalConditionList.add("Tumor");
		medicalConditionList.add("Cancer");
		medicalConditionList.add("Internal Infection");
		medicalConditionList.add("Rickets");
		medicalConditionList.add("Arthritis");
		medicalConditionList.add("Diabetes ");
		medicalConditionList.add("Distemper");
	}
	public void animalNames() {
		animalNames=new ArrayList<String>();
		animalNames.add("Rex");
		animalNames.add("Max");
		animalNames.add("Teddy");
		animalNames.add("Pinky");
		animalNames.add("Brand");
		animalNames.add("Hodor");
		animalNames.add("Tommy");
		animalNames.add("stinky");
		animalNames.add("limpy");
		animalNames.add("Barker");
		animalNames.add("Sargent");
		animalNames.add("Private");
		animalNames.add("Pilot");
	}
	public void createAnimalData() {
		animalTypes();
		medicalConditions();
		animalNames();
		animalCreator();
	}
	
	public void animalCreator() {
		animalList = new ArrayList<Animals>();
		Queue<Animals> animalQue = new LinkedList<Animals>();
		
		int animalsList = 1000;
		Random randName = new Random();
		Random randType = new Random();
		Random randCondition = new Random();
		Random randAge = new Random();
		
			for(int i=0;i < animalsList;i++) {
				
			Animals a = new Animals();

			int randint = randName.nextInt(animalNames.size());
			String tempName = animalNames.get(randint);
			
			int randint2 = randType.nextInt(animalTypeList.size());
			String tempType = animalTypeList.get(randint2);
			
			int randint3 = randCondition.nextInt(medicalConditionList.size());
			String tempMedical = medicalConditionList.get(randint3);
			
			int randint4 = randAge.nextInt(17);
			int tempAge = (randint4 + 1);
			
			a.setName(tempName);
			a.setAge(tempAge);
			a.setType(tempType);
			a.setCondition(tempMedical);
			animalList.add(a);
			animalQue.add(a);
			}
	}
			//ShowAllAnimals
			public void showAllAnimals() {
				for (int i =0 ; i < animalList.size();i++) {
					System.out.println(animalList.get(i));	
					}
			}
			//ShowAnimalsByType
			public void ShowAnimalsbyType() {
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				String tempSearch = scan.nextLine();
				for(int i = 0;i < animalList.size();i++) {
					String tempType = animalList.get(i).getType();
					boolean typeSearch = tempSearch.equals(tempType);
					if(typeSearch != false){
						System.out.println(animalList.get(i));
					}
				}
			}
			//Search By Name
			public void searchByName() {
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				String tempSearch = scan.nextLine();
				for(int i = 0;i < animalList.size();i++) {
					String tempName = animalList.get(i).getName();
					boolean nameSearch = tempSearch.equals(tempName);
					if(nameSearch != false){
						System.out.println(animalList.get(i));
					}
				}
			}
			//List Animals and doctors
			public void listAnimalsAndDoctors() {
				//todo pull animals from que. with doctors. 
			}
}