package TP2_2;

public class Test {
	 public static void main(String[] args) {
	      
	        Entreprise entreprise = new Entreprise("entreprise 1");

	        
	        
	        Departement department = new Departement(1, 10);
	        Departement department1 = new Departement(2, 10);

	        
	        entreprise.ajoutDep(department);
	        entreprise.ajoutDep(department1);
	      
	        Employe employee1 = new Employe(1, "amal", 900, 1);
	        Employe employee2 = new Employe(2, "souha", 760, 1);
	        Employe employee3 = new Employe(3, "sarra", 480, 2);

	      
	        department1.ajoutEmploye(employee1);
	        department1.ajoutEmploye(employee2);
	        department.ajoutEmploye(employee3);

	    
	        entreprise.afficheE();

	        
	        entreprise.DepMinCapacity();

	        entreprise.UpdateDep(employee1, 2);
	        department1.afficheDep();
	        
	        department.afficheDep();
	        
	        entreprise.retirerDep(department);
	        entreprise.afficheE();
			
	    }
}
