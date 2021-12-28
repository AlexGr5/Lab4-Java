package School;

import java.util.Scanner;

interface IHuman
{
    // Ввод ФИО человека
    void InpFIO();

    // Вывод человека
    void DisplayInfo();

    // Виртуальная/не виртуальная функция вывода сообщения на екран, кем является человек (рабочим, учителем, учеником)
    String WhoIs();
}


// Класс Персона
public /*abstract*/ class Persone implements IHuman {
	
	protected String fam = "";        // Фамилия
	protected String name = "";       // Имя
	protected String otch = "";       // Отчество


	// Конструктор
	public Persone()
	{
	    fam = "";
	    name = "";
	    otch = "";
	}
	
	// Конструктор с одним параметром
    public Persone(String Fam)
    {
        fam = Fam;
        name = "";
        otch = "";
    }

    // Конструктор с параметрами
    public Persone(String Fam, String Name, String Otch)
    {
        fam = Fam;
        name = Name;
        otch = Otch;
    }
	
	// Фун-ии получения данных из полей
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
	
	// Установить фамилию
    public void SetFam(String Fam)
    {
        fam = Fam;
    }

    // Установить имя
    public void SetName(String Name)
    {
        name = Name;
    }

    // Установить отчество
    public void SetOtch(String Otch)
    {
        otch = Otch;
    }
	
	// Инициализация класса Персона
	public void Set(String Fam_s, String Name_s, String Otch_s)
	{
	    this.fam = Fam_s;
	    this.name = Name_s;
	    this.otch = Otch_s;
	}
	
	// Ввод человека
	public void InpFIO()
	{
	    //String encoding = System.getProperty("console.encoding", "utf-8");
	    //Scanner in = new Scanner(System.in, encoding);

	    //String os = System.getProperty("os.name");
        //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        //Scanner in = new Scanner(System.in, consoleEncoding);

	    Scanner in = new Scanner(System.in);  
	    System.out.println("Введите Фамилию: ");
	    fam = in.nextLine();
	    System.out.println("Введите имя: ");
	    name = in.nextLine();
	    System.out.println("Введите отчество: ");
	    otch = in.nextLine();
	    in.close();
	}
	
	// Вывод человека
	public void DisplayInfo()
	{
	    System.out.println("ФИО: " + fam + " " + name + " " + otch);
	
	}
	
	// Обработка строк
	public void AdditionSapces()
	{
		fam = fam + "  ";
		name = name + "  ";
		otch = otch + "  ";
	}
	
	// Обработка строк, сосздание новой строки из подстрок
	public String First4SimbFromFIO()
	{
		return (fam.substring(0, 4) + name.substring(0, 4) + otch.substring(0, 4));
	}
	
	// Виртуальная/не виртуальная функция вывода сообщения на екран, кем является человек (рабочим, учителем, учеником)
    public String WhoIs()
    {
        return "рабочий";
    }

    // Сказать привет
    public void SayHello()
    {
    	System.out.println( WhoIs() + " говорит привет!");
    }
    
    // Поверхностная копия
    public Persone ShallowCopy()
    {
        return (Persone)this;
    }

    // Конструктор копирования (Глубокая копия)
    public Persone(Persone otherMark)
    {
        fam = otherMark.fam;
        name = otherMark.name;
        otch = otherMark.otch;
    }
    
    // Метод ToString
    public String ToString()
    {
        return (fam + " " + name + " " + otch);
    }


}
