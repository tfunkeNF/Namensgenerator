package VornamenGenerator;

public class Name {
	
	public String vorname;
	public enum Geschlecht{
		MALE("male"),
		FEMALE("female");
		
		private String word;
		
		private Geschlecht(String word) {
			this.word = word;
		}
		@Override
		public String toString() {
			return this.word;
		}
	};
	
	public Geschlecht geschlecht;
	public Name() {
		
	}
	
	public void setVorname(String value) {
		this.vorname = value;
	}
	
	public String getVorname() {
		return this.vorname;
	}
	
	public void setGeschlecht(Geschlecht Geschlecht) {
		this.geschlecht = Geschlecht;
	}
	
	public Geschlecht getGeschlecht() {
		return geschlecht;
	}
	
	
		
	
	
		

}
