package capg_Day2;
//package capgemini.java2;


class Members{
	private String CrewCaptain;
	private String Swordsman;
	private String Cook;
	private String Navigator;
	private String Doctor;
	private String Sniper;
	private String Shipwrite;
	
	
	
	Members(String CrewCaptain,String Swordsman,String Cook,String Navigator,String Doctor,String Sniper,String Shipwrite){
		this.CrewCaptain = CrewCaptain;
		this.Swordsman = Swordsman;
		this.Cook = Cook;
		this.Navigator = Navigator;
		this.Doctor = Doctor;
		this.Sniper = Sniper;
		this.Shipwrite = Shipwrite;
	}
	
	
	//Settter
	
	public Members() {
		// TODO Auto-generated constructor stub
	}


	public void setCrewCaptain(String CrewCaptain) {
		this.CrewCaptain = CrewCaptain;
    }
	public void setSwordsman(String Swordsman) {
		this.Swordsman = Swordsman;
    }
	public void setCook(String Cook) {
		this.Cook = Cook;
    }
	public void setNavigator(String Navigator) {
		this.Navigator = Navigator;
    }
	public void setDoctor(String Doctor) {
		this.Doctor = Doctor;
    }
	public void setSniper(String Sniper) {
		this.Sniper = Sniper;
    }
	public void setShipwrite(String Shipwrite) {
		this.Shipwrite = Shipwrite;
    }
	
	//Getter
	public String getCrewCaptain() {
        return this.CrewCaptain;
    }
	public String getSwordsman() {
        return this.Swordsman;
    }
	public String getCook() {
        return this.Cook;
    }
	public String getNavigator() {
        return this.Navigator;
    }
	public String getDoctor() {
        return this.Doctor;
    }
	public String getSniper() {
        return this.Sniper;
    }
	public String getShipwrite() {
        return this.Shipwrite;
    }
	
	
	public void printDetails() {
        System.out.println("Pirate Name -" + this.CrewCaptain);
        System.out.println("Swordsman of crew -" + this.Swordsman);
        System.out.println("Cook of ship -" + this.Cook);
        System.out.println("Navigator -" + this.Navigator);
        System.out.println("Doctor -" + this.Doctor);
        System.out.println("Sniper of crew -" + this.Sniper);
        System.out.println("Shipwrite -" + this.Shipwrite);
    }
	
}


public class PirateCrew{
	public static void main(String[] args) {
		//Members Strawhats = new Members("Monkey D. Luffy","Roronoa Zoro","Vinsmoke Sanji","Catburgeler Nami","Tony Tony Chopper","Ussop","General Franky");
		//Strawhats.printDetails();
		
		Members Konoha = new Members();
		Konoha.setCrewCaptain("Naruto Uzumaki");
		Konoha.setSwordsman("Sasuke Uchiha");
		Konoha.setCook("Ramen Guy");
		Konoha.setNavigator("Kakshi Hatake");
		Konoha.setDoctor("Sakura Haruno");
		Konoha.setSniper("Shikarmaru Nara");
		Konoha.setShipwrite("Yamato");
		
		System.out.println("Captain"+Konoha.getCrewCaptain());
		System.out.println("Swordman"+Konoha.getSwordsman());
		System.out.println("Captain"+Konoha.getCook());
		System.out.println("Captain"+Konoha.getNavigator());
		System.out.println("Captain"+Konoha.getDoctor());
		System.out.println("Captain"+Konoha.getSniper());
		System.out.println("Captain"+Konoha.getShipwrite());
		
		
	}
}