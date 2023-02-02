package Example;

public class CompanyBasics {
	
	private String name;
	private String part; // 이름, 부서
    private String addr; // 주소
    private String birthday; // 생일
    
    public CompanyBasics() {
		// TODO Auto-generated constructor stub
	}
    
    public CompanyBasics(String name, String part, String addr, String birthday) {
		super();
		this.name = name;
		this.part = part;
		this.addr = addr;
		this.birthday = birthday;
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Override
    public String toString() 
    {
        return "이름 : " + this.getName() +  
                "\n 부서 : " + this.getPart() +
                "\n 주소 : " + this.getAddr() + 
                "\n 생일 : " + this.getBirthday(); 
                
    }
    
}
