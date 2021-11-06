package School;
import java.util.Scanner;

//Класс Ученик
public class Student {

	private String fam = "";            		// Фамилия
    private String name = "";           		// Имя
    private String otch = "";           		// Отчество
    private Mark[] marks = new Mark[20];        // Массив оценок
    private Lesson[] lessons = new Lesson[20];  // Массив уроков


	// Конструктор
	public Student()
	{
	    fam = "";
	    name = "";
	    otch = "";
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
	
	// Очищение всех полей структуры Ученик (Student)
	public void Null()
	{
	
	    fam = "";
	    name = "";
	    otch = "";
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
	
	
	// Функции получения значений полей
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
	
	
	
	// Инициализация структуры Ученик
	public void Set(String Fam, String Name, String Otch, Mark mas_m[], int LenMark, Lesson mas_l[], int LenLess)
	{
	    this.fam = Fam;
	    this.name = Name;
	    this.otch = Otch;
	    
	    
	    int i = 0;
	    for ( i = 0; i < LenLess && i < 20; i++)
	    {
	        lessons[i] = mas_l[i];
	    }
	
	    for (i = 0; i < LenMark && i < 20; i++)
	    {
	        marks[i] = mas_m[i];
	    }
	}
	
	// Ввод ФИО ученика в структуру
	public void InpStudFIO()
	{
	    Scanner in = new Scanner(System.in);
	    //String os = System.getProperty("os.name");
	    //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
	    //Scanner in = new Scanner(System.in, consoleEncoding);
	    System.out.print("Введите Фамилию ученика: ");
	    fam = in.nextLine();
	    System.out.print("Введите Имя ученика: ");
	    name = in.nextLine();
	    System.out.print("Введите Отчество ученика: ");
	    otch = in.nextLine();
	    in.close();
	}
	
	// Добавление к ученику урока
	// 0 - не удачно, 1 - удачно
	public boolean AddLess(Lesson ls)
	{
	    boolean fl = false;
	
	    for (int i = 0; (i < 20) && (fl == false); i++)
	    {
	        if (lessons[i].GetNameLess() == "")
	        {
	            lessons[i] = ls;
	            fl = true;
	        }
	    }
	
	    return fl;
	}
	
	// Добавление к ученику урока и оценки
	// 0 - не удачно, 1 - удачно
	public boolean AddLessAndMark(Lesson ls, Mark m)
	{
	    boolean fl = false;
	
	    for (int i = 0; (i < 20) && (fl == false); i++)
	    {
	        if (lessons[i].GetNameLess() == "")
	        {
	            lessons[i] = ls;
	            marks[i] = m;
	            fl = true;
	        }
	    }
	
	    return fl;
	}
	
	// Добавление к ученику оценки к конкретному предмету
	// 0 - не удачно, 1 - удачно
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
	
	// Вывод ученика
	// Передаем ученика и флаг для различного вывода уроков и оценок
	// fl_out (0 или 1)
	public void DisplayShortInfo()
	{
	    System.out.println("ФИО ученика: " + fam + " " + name + " " + otch);
	
	    System.out.println("Уроки:");
	    int i = 0;
	    while (lessons[i].GetNameLess() != "")
	    {
	        System.out.println(" * " + lessons[i].GetNameLess() + " * " + marks[i].Get() + " * ");
	        i++;
	    }
	}
	
	
	
	
	// Вывод ученика с всеми предметами, даже пустыми
	public void DispFullInfo()
	{
	    System.out.println("ФИО ученика: " + fam + " " + name + " " + otch);
	
	
	    System.out.println("Уроки:");
	    for (int i = 0; i < 20; i++)
	    {
	        lessons[i].DisplayInfo();
	    }
	    System.out.println("Оценки:");
	    for (int i = 0; i < 20; i++)
	    {
	        marks[i].DisplayValue();
	    }
	}
}
