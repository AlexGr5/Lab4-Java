package School;
import java.util.Scanner;

//Класс Учитель
public class Teacher {

	private String fam = "";        // Фамилия
    private String name = "";       // Имя
    private String otch = "";       // Отчество


	// Конструктор
	public Teacher()
	{
	    fam = "";
	    name = "";
	    otch = "";
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
	
	// Инициализация структуры Учитель
	public void Set(String Fam_s, String Name_s, String Otch_s)
	{
	    this.fam = Fam_s;
	    this.name = Name_s;
	    this.otch = Otch_s;
	}
	
	// Ввод учителя
	public void InpFIO()
	{
	    //String encoding = System.getProperty("console.encoding", "utf-8");
	    //Scanner in = new Scanner(System.in, encoding);

	    //String os = System.getProperty("os.name");
        //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
        //Scanner in = new Scanner(System.in, consoleEncoding);

	    Scanner in = new Scanner(System.in);  
	    System.out.println("Введите Фамилию учителя: ");
	    fam = in.nextLine();
	    System.out.println("Введите имя учителя: ");
	    name = in.nextLine();
	    System.out.println("Введите отчество учителя: ");
	    otch = in.nextLine();
	    in.close();
	}
	
	// Вывод учителя
	public void DisplayInfo()
	{
	    System.out.println("ФИО учителя: " + fam + " " + name + " " + otch);
	
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
}
