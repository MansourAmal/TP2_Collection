package TP2_2;

public class Employe implements Comparable<Employe>{
	private int cin;
	private String nom;
	private float sal;
	private int idDept;
	public Employe(int cin, String nom, float sal,int id) {
		this.cin = cin;
		this.nom = nom;
		this.sal = sal;
		this.idDept=id;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getIdDept() {
		return idDept;
	}
	public void setIdDept(int idDept) {
		this.idDept = idDept;
	}
	@Override
	public String toString() {
		return "Employe [cin=" + cin + ", nom=" + nom + ", sal=" + sal + ", idDept=" + idDept + "]";
	}
	@Override
	public int compareTo(Employe o) {
		if(this.sal>o.sal)
			return -1;
		if(this.sal<o.sal)
			return 1;
		return 0;
	}

}
