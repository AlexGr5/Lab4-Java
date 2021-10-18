import java.util.*;

// Класс Уроки
public class Lesson
{
    private String nameLesson = "";       	// Название предмета
    private Teacher teacher = new Teacher();    // Учитель

    	// Конструктор
	public Lesson()
	{
	    this.nameLesson = "";
	    this.teacher.Set("", "", "");
	}
	
	// Инициализация структуры Уроки
	public void Set(String Name_Less, Teacher t)
	{
	    nameLesson = Name_Less;
	    teacher = t;
	}
	
	// Обнуление полей
	public void Null()
	{
	    this.nameLesson = "";
	    this.teacher.Set("", "", "");
	}
	
	// Фун-ии получения данных из полей
	public String GetNameLess()
	{
	    return this.nameLesson;
	}
	
	public Teacher GetTeacher()
	{
	    return this.teacher;
	}
	
	// Ввод названия урока
	public void InpInConsol(Teacher t)
	{

	    //Scanner in = new Scanner(System.in);
	    String os = System.getProperty("os.name");
            String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
            Scanner in = new Scanner(System.in, consoleEncoding);
	    System.out.print("Введите название предмета: ");
	    nameLesson = in.nextLine();
	    System.out.println();
	    teacher = t;
	    in.close();
	
	}
	
	// Вывод уроков, передаем адрес, где будет храниться информация
	public void DisplayInfo()
	{
	    System.out.println("Название предмета: " + nameLesson);
	    teacher.DisplayInfo();
	}
	
	

}
