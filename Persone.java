package School;

import java.util.Scanner;

interface IHuman
{
    // ���� ��� ��������
    void InpFIO();

    // ����� ��������
    void DisplayInfo();

    // �����������/�� ����������� ������� ������ ��������� �� �����, ��� �������� ������� (�������, ��������, ��������)
    String WhoIs();
}


// ����� �������
public /*abstract*/ class Persone implements IHuman {
	
	protected String fam = "";        // �������
	protected String name = "";       // ���
	protected String otch = "";       // ��������


	// �����������
	public Persone()
	{
	    fam = "";
	    name = "";
	    otch = "";
	}
	
	// ����������� � ����� ����������
    public Persone(String Fam)
    {
        fam = Fam;
        name = "";
        otch = "";
    }

    // ����������� � �����������
    public Persone(String Fam, String Name, String Otch)
    {
        fam = Fam;
        name = Name;
        otch = Otch;
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
	
	// ������������� ������ �������
	public void Set(String Fam_s, String Name_s, String Otch_s)
	{
	    this.fam = Fam_s;
	    this.name = Name_s;
	    this.otch = Otch_s;
	}
	
	// ���� ��������
	public void InpFIO()
	{
	    //String encoding = System.getProperty("console.encoding", "utf-8");
	    //Scanner in = new Scanner(System.in, encoding);

	    //String os = System.getProperty("os.name");
        //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        //Scanner in = new Scanner(System.in, consoleEncoding);

	    Scanner in = new Scanner(System.in);  
	    System.out.println("������� �������: ");
	    fam = in.nextLine();
	    System.out.println("������� ���: ");
	    name = in.nextLine();
	    System.out.println("������� ��������: ");
	    otch = in.nextLine();
	    in.close();
	}
	
	// ����� ��������
	public void DisplayInfo()
	{
	    System.out.println("���: " + fam + " " + name + " " + otch);
	
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
    public String WhoIs()
    {
        return "�������";
    }

    // ������� ������
    public void SayHello()
    {
    	System.out.println( WhoIs() + " ������� ������!");
    }
    
    // ������������� �����
    public Persone ShallowCopy()
    {
        return (Persone)this;
    }

    // ����������� ����������� (�������� �����)
    public Persone(Persone otherMark)
    {
        fam = otherMark.fam;
        name = otherMark.name;
        otch = otherMark.otch;
    }
    
    // ����� ToString
    public String ToString()
    {
        return (fam + " " + name + " " + otch);
    }


}
