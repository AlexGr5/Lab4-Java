package School;
import java.util.Scanner;

//Класс Оценка
public class Mark {

	private int value;          // Оценка
	
	private static Mark lastMark;
	private Mark prev;
	private Mark next;


	// Конструктор
	public Mark()
	{
	    value = 0;
	}
	
	// Конструктор с параметрами
	public Mark(int value)
	{
	    this.value = value;
	}
	
	// Инициализация структуры Оценка
	public void Set(int v)
	{
	    value = v;
	}
	
	// Получение оценки
	public int Get()
	{
	    return value;
	}
	
	// Ввод данных в структуру Оценка
	public void InpMark()
	{
	    Scanner in = new Scanner(System.in);
	    //String os = System.getProperty("os.name");
	    //String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
	    //Scanner in = new Scanner(System.in, consoleEncoding);
	    
	    String str = new String();
	    //value = in.nextInt();
	    int fl = 0;
	    int number = 0;
	    while (fl == 0)
	    {
			System.out.print("Введите оценку: ");
			
			if (in.hasNextInt()) 
			{
		      	 	number = in.nextInt();
		      	 	str = in.nextLine();
		       		value = number;
			        fl = 1;
		   	} 
			else 
			{
		       		System.out.println("Извините, но это явно не число. Введите число заново!");
		       		System.out.println("\n");
		   	}
	    }
	    System.out.println();
	    in.close();
	}
	
	// Вывод данных из структуры
	public void DisplayValue()
	{
	    System.out.println("Оценка: " + value);
	
	}
	
	// Новый список
	public static void NewList()
	{
		lastMark = null;
	}
	
	// Добавление элемента в конец списка
	public void Add()
	{
	    if (lastMark == null)
	        this.prev = null;
	    else 
	    { 
	        lastMark.next = this;
	        prev = lastMark;
	    }
	    lastMark = this;
	    this.next = null;
	}

	// Вывод на дисплей содержимого списка
	public static void reprint()
	{
	    Mark uk;   // Вспомогательная ссылка
	    uk = lastMark;
	    if (uk == null) 
	    { 
	    	System.out.println("Список пуст!"); 
	        return;
	    }
	    else 
	    	System.out.println("\nСодержимое списка:\n");

	    // Цикл печати в обратном порядке значений элементов списка:
	    while (uk != null)
	    {
	    	System.out.println(uk.value + "\t");
	        uk = uk.prev;
	    }
	}
}
