package School;
import java.util.Scanner;

//����� ������
public class Student extends Persone implements IHuman {

	//private String fam = "";            		// �������
    //private String name = "";           		// ���
    //private String otch = "";           		// ��������
    private Mark[] marks = new Mark[20];        // ������ ������
    private Lesson[] lessons = new Lesson[20];  // ������ ������
    private int countLess = 0;					// ���������� ������


	// �����������
	public Student()
	{
		super("", "", "");
	    //fam = "";
	    //name = "";
	    //otch = "";
	    Lesson L = new Lesson();
	    Mark M = new Mark();
	    L.Null();
	    M.Set(0);
	    for (int i = 0; i < 20; i++)
	    {
	        lessons[i] = L;
	    }
	
	    for (int i = 0; i < 20; i++)
	    {
	        marks[i] = M;
	    }
	}
	
	// ����������� � ����� ����������
    public Student(String Fam)
    {
    	super(Fam, "", "");
        //fam = Fam;
        //name = "";
        //otch = "";
        Lesson L = new Lesson();
        Mark M = new Mark();
        L.Null();
        M.Set(0);
        countLess = 0;
        for (int i = 0; i< 20; i++)
        {
            lessons[i] = L;
        }

        for (int i = 0; i< 20; i++)
        {
            marks[i] = M;
        }

    }

    // ����������� � �����������
    public Student(String Fam, String Name, String Otch, Mark[] mas_m, int LenMark, Lesson[] mas_l, int LenLess)
    {
    	super(Fam, Name, Otch);
        //this.fam = Fam;
        //this.name = Name;
        //this.otch = Otch;

        this.countLess = 0;

        int i = 0;
        for (i = 0; i < LenLess && i < 20; i++)
        {
            lessons[i] = mas_l[i];
            this.countLess++;
        }

        for (i = 0; i < LenMark && i < 20; i++)
        {
            marks[i] = mas_m[i];
        }
    }
	
	// �������� ���� ����� ��������� ������ (Student)
	public void Null()
	{
	
	    fam = "";
	    name = "";
	    otch = "";
	    Lesson L = new Lesson();
	    Mark M = new Mark();
	    L.Null();
	    M.Set(0);
	    this.countLess = 0;
	    for (int i = 0; i < 20; i++)
	    {
	        lessons[i] = L;
	    }
	
	    for (int i = 0; i < 20; i++)
	    {
	        marks[i] = M;
	    }
	}
	
	
	// ������� ��������� �������� �����
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
	
	public Mark GetMarkByNumber(int i)
	{
	    Mark m  = new Mark();
	    if (i < 20 && i > -1)
	        m = marks[i];
	    
	    return m;
	}
	
	public Lesson GetLessByNumber(int i)
	{
	    Lesson l = new Lesson();
	    if (i < 20 && i > -1)
	        l = lessons[i];
	
	    return l;
	}
	
	// ��������� �������
    public void SetFam(String Fam)
    {
        fam = Fam;
    }

    // ��������� �����
    public void SetName(String Name)
    {
        name = Name;
    }

    // ��������� ��������
    public void SetOtch(String Otch)
    {
        otch = Otch;
    }

    // ��������� ������
    public void SetMarks(Mark[] mas_m, int LenMark)
    {
        for (int i = 0; i < LenMark && i < 20; i++)
        {
            marks[i] = mas_m[i];
        }
    }

    // ��������� ������
    public void SetLessons(Lesson[] mas_l, int LenLess)
    {
        int i = 0;
        for (i = 0; i < LenLess && i < 20; i++)
        {
            lessons[i] = mas_l[i];
            this.countLess++;
        }
    }
	
	// ������������� ��������� ������
	public void Set(String Fam, String Name, String Otch, Mark mas_m[], int LenMark, Lesson mas_l[], int LenLess)
	{
	    this.fam = Fam;
	    this.name = Name;
	    this.otch = Otch;
	    
	    
	    int i = 0;
	    for ( i = 0; i < LenLess && i < 20; i++)
	    {
	        lessons[i] = mas_l[i];
	        this.countLess++;
	    }
	
	    for (i = 0; i < LenMark && i < 20; i++)
	    {
	        marks[i] = mas_m[i];
	    }
	}
	
	// ���� ��� ������� � ���������
	public void InpStudFIO()
	{
	    Scanner in = new Scanner(System.in);
	    //String os = System.getProperty("os.name");
	    //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
	    //Scanner in = new Scanner(System.in, consoleEncoding);
	    System.out.print("������� ������� �������: ");
	    fam = in.nextLine();
	    System.out.print("������� ��� �������: ");
	    name = in.nextLine();
	    System.out.print("������� �������� �������: ");
	    otch = in.nextLine();
	    in.close();
	}
	
	// ���� ��� ������� � ���������
		@Override public void InpFIO()
		{
		    Scanner in = new Scanner(System.in);
		    //String os = System.getProperty("os.name");
		    //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
		    //Scanner in = new Scanner(System.in, consoleEncoding);
		    System.out.print("������� ������� �������: ");
		    fam = in.nextLine();
		    System.out.print("������� ��� �������: ");
		    name = in.nextLine();
		    System.out.print("������� �������� �������: ");
		    otch = in.nextLine();
		    in.close();
		}
	
	// ���������� � ������� �����
	// 0 - �� ������, 1 - ������
	public boolean AddLess(Lesson ls)
	{
	    boolean fl = false;
	
	    for (int i = 0; (i < 20) && (fl == false); i++)
	    {
	        if (lessons[i].GetNameLess() == "")
	        {
	            lessons[i] = ls;
	            this.countLess++;
	            fl = true;
	        }
	    }
	
	    return fl;
	}
	
	// ���������� � ������� ����� � ������
	// 0 - �� ������, 1 - ������
	public boolean AddLessAndMark(Lesson ls, Mark m)
	{
	    boolean fl = false;
	
	    for (int i = 0; (i < 20) && (fl == false); i++)
	    {
	        if (lessons[i].GetNameLess() == "")
	        {
	            lessons[i] = ls;
	            marks[i] = m;
	            this.countLess++;
	            fl = true;
	        }
	    }
	
	    return fl;
	}
	
	// ���������� � ������� ������ � ����������� ��������
	// 0 - �� ������, 1 - ������
	public boolean AddMark(Lesson ls, Mark m)
	{
	    boolean fl = false;
	
	    for (int i = 0; (i < 20) && (fl == false); i++)
	    {
	        if (lessons[i].GetNameLess() == ls.GetNameLess())
	        {
	            if (lessons[i].GetTeacher().GetFam() == ls.GetTeacher().GetFam())
	            {
	                if (lessons[i].GetTeacher().GetName() == ls.GetTeacher().GetName())
	                {
	                    if (lessons[i].GetTeacher().GetOtch() == ls.GetTeacher().GetOtch())
	                    {
	                        marks[i] = m;
	                        fl = true;
	                    }
	                }
	            }
	        }
	    }
	
	    return fl;
	}
	
	// ����� �������
	// �������� ������� � ���� ��� ���������� ������ ������ � ������
	public void DisplayShortInfo()
	{
	    System.out.println("��� �������: " + fam + " " + name + " " + otch);
	
	    System.out.println("�����:");
	    int i = 0;
	    for(i = 0; i < countLess; i++)
	    {
	        System.out.println(" * " + lessons[i].GetNameLess() + " * " + marks[i].Get() + " * ");
	    }
	}
	
	// ����� �������
	// �������� ������� � ���� ��� ���������� ������ ������ � ������
	@Override public void DisplayInfo()
	{
	    System.out.println("��� �������: " + fam + " " + name + " " + otch);
	
	    System.out.println("�����:");
	    int i = 0;
	    for(i = 0; i < countLess; i++)
	    {
	        System.out.println(" * " + lessons[i].GetNameLess() + " * " + marks[i].Get() + " * ");
	    }
	}
	
	
	
	
	// ����� ������� � ����� ����������, ���� �������
	public void DispFullInfo()
	{
	    System.out.println("��� �������: " + fam + " " + name + " " + otch);
	
	
	    System.out.println("�����:");
	    for (int i = 0; i < 20; i++)
	    {
	        lessons[i].DisplayInfo();
	    }
	    System.out.println("������:");
	    for (int i = 0; i < 20; i++)
	    {
	        marks[i].DisplayValue();
	    }
	}
	
	// �����������/�� ����������� ������� ������ ��������� �� �����, ��� �������� ������� (�������, ��������, ��������)
	@Override public String WhoIs()
    {
        return "������";
    }

    // ������� ������
    public void SayHello()
    {
    	System.out.println( WhoIs() + " ������� ������!");
    }
}
