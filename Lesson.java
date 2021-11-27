package School;
import java.util.*;

//����� �����
public class Lesson {

	private String nameLesson = "";       	// �������� ��������
    private Teacher teacher = new Teacher();    // �������

    // �����������
	public Lesson()
	{
	    this.nameLesson = "";
	    this.teacher.Set("", "", "");
	}
	
	// ����������� � ����� ����������
    public Lesson(String NameLesson)
    {
        nameLesson = NameLesson;
        teacher.Set("", "", "");
    }

    // ����������� � �����������
    public Lesson(String Name_Less, Teacher Teacher1)
    {
        nameLesson = Name_Less;
        teacher = Teacher1;
    }
	
    // ���������� �������� �����
    public void SetLesson(String NameLesson)
    {
        nameLesson = NameLesson;
    }

    // ���������� �������
    public void SetTeacher(Teacher Teacher1)
    {
        teacher = Teacher1;
    }
    
	// ������������� ��������� �����
	public void Set(String Name_Less, Teacher t)
	{
	    nameLesson = Name_Less;
	    teacher = t;
	}
	
	// ��������� �����
	public void Null()
	{
	    this.nameLesson = "";
	    this.teacher.Set("", "", "");
	}
	
	// ���-�� ��������� ������ �� �����
	public String GetNameLess()
	{
	    return this.nameLesson;
	}
	
	public Teacher GetTeacher()
	{
	    return this.teacher;
	}
	
	// ���� �������� �����
	public void InpInConsol(Teacher t)
	{

	    Scanner in = new Scanner(System.in);
	    //String os = System.getProperty("os.name");
        //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        //Scanner in = new Scanner(System.in, consoleEncoding);
	    System.out.print("������� �������� ��������: ");
	    nameLesson = in.nextLine();
	    System.out.println();
	    teacher = t;
	    in.close();
	
	}
	
	// ����� ������, �������� �����, ��� ����� ��������� ����������
	public void DisplayInfo()
	{
	    System.out.println("�������� ��������: " + nameLesson);
	    teacher.DisplayInfo();
	}
	
	// ����� ����� � ��������, ��� ���� ���� ����� �����
    public void DisplayImportantInfo()
    {
    	System.out.println("���� ���� ����� �����!\n");
        // ����� ������ ����� ��������� this
        this.DisplayInfo();
    }
}
