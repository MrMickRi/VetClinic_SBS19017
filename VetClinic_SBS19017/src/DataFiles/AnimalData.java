package DataFiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

import Objects.Animals;

public class AnimalData {
	
	//Creation of arraylists to hold all data. 
	ArrayList<String>animalTypeList ;
	ArrayList<String>medicalConditionList;
	ArrayList<String>animalNames;
	ArrayList<Animals>animalList;
	
	//Creates Arraylist for animalTypes
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
	//Creates Arraylist for medical conditions. 
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
	//Creates Arraylist for animal names
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
	//initalizes All data 
	public void createAnimalData() {
		animalTypes();
		medicalConditions();
		animalNames();
		animalCreator();
	}
	//animalCreator creates an animal object refrences and adds to array list + Queue
	public void animalCreator() {
		//creates arraylist for animals
		animalList = new ArrayList<Animals>();
		//creates queue for animals
		Queue<Animals> animalQue = new LinkedList<Animals>();
		
		//intialize animal list to 1000 animals
		int animalsList = 1000;
		//random number refrence declaration
		Random randName = new Random();
		Random randType = new Random();
		Random randCondition = new Random();
		Random randAge = new Random();
		
		//for loop iterates throught he size of animal list incrementing 1 every loop. 
		//This loops creates a new animal object and uses the random refrences to assign a random : Name, Type, age , medical condition
		//Random name is set to Name array size 
		//Random type is set to Type Array size
		//Random codntion is set to Medical COndition Array Size
		//Random age is set bet 1 - 17 ( to allow for natural ages for animals. 
		//Each variable is set to the object and then added to both the array and the queue. 
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
			//ShowAllAnimals loops through the animalList array printing all objects within the array. 
			public void showAllAnimals() {
				//For loop goes through size of array incrementing by 1 every loop. 
				//for each loop it prints out the object at current index (i). 
				for (int i =0 ; i < animalList.size();i++) {
					System.out.println("Name : " + animalList.get(i).getName()
							+ "\r\nAge : "+ animalList.get(i).getAge()
							+ "\r\nType of animal : " + animalList.get(i).getType()
							+ "\r\nMedical Condition : "+ animalList.get(i).getCondition()+"\r\n");
					}
			}
			//ShowAnimalsByType takes in a user input, Stores theinput as a String. 
			//This string is then compared to the Variable Type for animal object. 
			//The answer to the comparison is stores in a boolean typeSearch.
			//If true, The array prints the animal object at index(i) and reloops after increment. 
			//If false, the array does not print the anmal object and reloops after increment. 
			public void ShowAnimalsbyType() {
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				String tempSearch = scan.nextLine();
				for(int i = 0;i < animalList.size();i++) {
					String tempType = animalList.get(i).getType();
					boolean typeSearch = tempSearch.equals(tempType);
					if(typeSearch != false){
						System.out.println("Name : " + animalList.get(i).getName()
								+ "\r\nAge : "+ animalList.get(i).getAge()
								+ "\r\nType of animal : " + animalList.get(i).getType()
								+ "\r\nMedical Condition : "+ animalList.get(i).getCondition()+"\r\n");
					}
				}
			}
			
			//SearchByName takes in a suer input, Stores the input as a String. 
			//this String it then compared to the variable Name for animal object. 
			//the answer to the comparison is storedint he boolean tempSearch. 
			//If true, the array prints the animal object at index(i) and reloops after increment. 
			//If False,The array doesnot print the animal object and reloops after increment.
			public void searchByName() {
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				String tempSearch = scan.nextLine();
				for(int i = 0;i < animalList.size();i++) {
					String tempName = animalList.get(i).getName();
					boolean nameSearch = tempSearch.equals(tempName);
					if(nameSearch != false){
						//Raw data Dump ---> //System.out.println(animalList.get(i));
						System.out.println("Name : " + animalList.get(i).getName()
								+ "\r\nAge : "+ animalList.get(i).getAge()
								+ "\r\nType of animal : " + animalList.get(i).getType()
								+ "\r\nMedical Condition : "+ animalList.get(i).getCondition()+"\r\n");
					}
				}
			}
			//List Animals and doctors is incomplete. 
			public void listAnimalsAndDoctors() {
				//todo pull animals from que. with doctors. 
			}
}