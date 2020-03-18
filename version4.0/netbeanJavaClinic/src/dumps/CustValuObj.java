package dumps;

public class CustValuObj {
	public int cid;
	public String name;
	public String adres;
        
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public CustValuObj() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustValuObj(int c,String n,String a)
	{
		cid=c;
		name=n;
		adres=a;
	}
	public String toString()
	{
		return("Cid"+cid+",name"+name+",Address"+adres);
	}
	
    public String toXML()
    {
    	return "";
    }

}
