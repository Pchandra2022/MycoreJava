package pcs.practice.collections;

public class Emps {
	private String e_no;
	private String e_nanme;
	private String e_sal;
	
	

	@Override
	public String toString() {
		return "Emps [e_no=" + e_no + ", e_nanme=" + e_nanme + ", e_sal=" + e_sal + "]";
	}

	public Emps(String e_no, String e_nanme, String e_sal) {
		super();
		this.e_no = e_no;
		this.e_nanme = e_nanme;
		this.e_sal = e_sal;
	}

	public String getE_no() {
		return e_no;
	}

	public void setE_no(String e_no) {
		this.e_no = e_no;
	}

	public String getE_nanme() {
		return e_nanme;
	}

	public void setE_nanme(String e_nanme) {
		this.e_nanme = e_nanme;
	}

	public String getE_sal() {
		return e_sal;
	}

	public void setE_sal(String e_sal) {
		this.e_sal = e_sal;
	}

}
