package TP2_2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<Employe> LEmployes;
	public Departement(int idDep, int capacity) {
		this.idDep=idDep;
		LEmployes=new HashSet<Employe>();
	}
	/*ajouter un employe au département courant
	* la fonction n'ajoute que les employés ayants un CIN valide >0
	* ne pas oublier de mettre à jour le num dep de l'employe
	*
	*/
	public void ajoutEmploye(Employe E)
	{
		if(E.getCin()>0)
		{
			E.setIdDept(this.idDep);
			this.LEmployes.add(E);
		}
	}
	//retirer un employe du département courant
	public void retirerEmploye(Employe E)
	{
		LEmployes.remove(E);
	}
	//afficher détails du département
	public void afficheDep()
	{
		for(Employe E:LEmployes)
		{
			System.out.println(E.toString());
		}
	}
	//vérifier si un employé dont le cin est donné en paramètre
	// appartient au département courant ou pas
	public boolean existeE(int cin)
	{
		for(Employe E:LEmployes)
		{
			if(E.getCin()==cin)
				return true;
		}
		return false;
	}
	//retourner l'employé qui a le plus grand salaire ds le département
	// pensez un utiliser un treeSet
	public Employe getEmpSalMax()
	{
		TreeSet<Employe> l=new TreeSet<>(this.LEmployes);
		return  l.first();
	}
	public Set<Employe> getLEmployes() {
		return LEmployes;
	}
	public void setLEmployes(Set<Employe> lEmployes) {
		LEmployes = lEmployes;
	}
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
}
