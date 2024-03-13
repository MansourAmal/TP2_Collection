package TP2_2;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Entreprise {
	private String nomEntreprise;
	HashMap<Integer, Departement> Liste_Deps;
	private Departement deprc;
	public Entreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
		Liste_Deps=new HashMap<>();
	}
	public void ajoutDep(Departement d)
	{
		this.Liste_Deps.put(d.getIdDep(), d);
	}
	public void retirerDep(Departement d)
	{
	this.Liste_Deps.remove(d.getIdDep());
	}
	public void afficheE()
	{
		System.out.println("entreprise " + this.nomEntreprise + ":");
		Set<Entry<Integer,Departement>> s=this.Liste_Deps.entrySet();
		 for (Entry<Integer, Departement> e : s) {
			 System.out.println(e.getKey()+":"+e.getValue());
		 }
	}
	public void UpdateDep(Employe E, int idDep)
	{
		Collection <Departement> l = this.Liste_Deps.values();
		for(Departement d:l)
		{
			if(d.existeE(E.getCin()))
			{
				deprc=d;
				break;
			}
		}
		
	}
	public boolean existeD(Departement d) {
        return this.Liste_Deps.containsValue(d);
    }
	public void DepMinCapacity() {
	    int min = -1; 
	    Departement depMin = null;

	    for (Departement d : this.Liste_Deps.values()) {
	        if (min == -1 || d.getLEmployes().size() < min) {
	            min = d.getLEmployes().size();
	            depMin = d;
	        }
	    }
	        System.out.println("Département ayant le petit nombre des employées : " + depMin.getIdDep());
	   
	}
}
