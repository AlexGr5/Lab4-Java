package School;
import java.util.Scanner;

//����� �������
public class Teacher extends Persone implements IHuman {

	//private String fam = "";        // �������
    //private String name = "";       // ���
    //private String otch = "";       // ��������


	// �����������
	public Teacher()
	{
		super("", "", "");
	    //fam = "";
	    //name = "";
	    //otch = "";
	}
	
	// ����������� � ����� ����������
    public Teacher(String Fam)
    {
    	super(Fam, "", "");
        //fam = Fam;
        //name = "";
        //otch = "";
    }

    // ����������� � �����������
    public Teacher(String Fam, String Name, String Otch)
    {
    	super(Fam, Name, Otch);
        //fam = Fam;
        //name = Name;
        //otch = Otch;
    }
	
	// ���-�� ��������� ������ �� �����
	public String GetFam()
	{
	    return this.fam;
	}
	
	public String GetName()
	{
	    return this.name;
	}
	
	public String GetOtch()
	{
	    return this.otch;
	}
	
	// ���������� �������
    public void SetFam(String Fam)
    {
        fam = Fam;
    }

    // ���������� ���
    public void SetName(String Name)
    {
        name = Name;
    }

    // ���������� ��������
    public void SetOtch(String Otch)
    {
        otch = Otch;
    }
	
	// ������������� ��������� �������
	public void Set(String Fam_s, String Name_s, String Otch_s)
	{
	    this.fam = Fam_s;
	    this.name = Name_s;
	    this.otch = Otch_s;
	}
	
	// ���� �������
	/*@Override*/ public void InpFIO()
	{
	    //String encoding = System.getProperty("console.encoding", "utf-8");
	    //Scanner in = new Scanner(System.in, encoding);

	    //String os = System.getProperty("os.name");
        //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        //Scanner in = new Scanner(System.in, consoleEncoding);

	    Scanner in = new Scanner(System.in);  
	    System.out.println("������� ������� �������: ");
	    fam = in.nextLine();
	    System.out.println("������� ��� �������: ");
	    name = in.nextLine();
	    System.out.println("������� �������� �������: ");
	    otch = in.nextLine();
	    in.close();
	}
	
	// ����� �������
	@Override public void DisplayInfo()
	{
	    System.out.println("��� �������: " + fam + " " + name + " " + otch);
	
	}
	
	// ��������� �����
	public void AdditionSapces()
	{
		fam = fam + "  ";
		name = name + "  ";
		otch = otch + "  ";
	}
	
	// ��������� �����, ��������� ����� ������ �� ��������
	public String First4SimbFromFIO()
	{
		return (fam.substring(0, 4) + name.substring(0, 4) + otch.substring(0, 4));
	}
	
	// �����������/�� ����������� ������� ������ ��������� �� �����, ��� �������� ������� (�������, ��������, ��������)
	@Override public String WhoIs()
    {
        return "�������";
    }

    // ������� ������
    public void SayHello()
    {
    	System.out.println( WhoIs() + " ������� ������!");
    }
    
    // ������������� �����
    public Teacher ShallowCopy()
    {
        return (Teacher)this;
    }

    // ����������� ����������� (�������� �����)
    public Teacher(Teacher otherMark)
    {
        fam = otherMark.fam;
        name = otherMark.name;
        otch = otherMark.otch;
    }
    
}
