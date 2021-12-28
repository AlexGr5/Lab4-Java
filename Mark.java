package School;
import java.util.Scanner;

//Класс Оценка
public class Mark<T> {

	private T value;          // Оценка
	
	private static Mark lastMark;
	private Mark prev;
	private Mark next;


	// Конструктор
	public Mark()
	{
	    //value = 0;
	}
	
	// Конструктор с параметрами
	public Mark(T value)
	{
		//this.value = 0;
        //if (IsRightMark(value))
            this.value = value;
	}
	
	// Инициализация структуры Оценка
	public void Set(T v)
	{
		//this.value = 0;
        //if (IsRightMark(v))
            this.value = v;
	}
	
	// Получение оценки
	public T Get()
	{
	    return value;
	}
	
	/*
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
	*/
	
	/*
	// Ввод данных в структуру Оценка
    public void InpMark()
    {
    	Scanner in = new Scanner(System.in);
    	String str = new String();
        //string mark;
    	int number = 0;
        //Console.Write("Введите оценку: ");
        //mark = Console.ReadLine();
    	System.out.print("Введите оценку: ");
        try                                                 // ищем исключения внутри этого блока и отправляем их в соответствующий обработчик catch          
        {
        	if (in.hasNextInt()) 
			{
		      	 	number = in.nextInt();
		      	 	str = in.nextLine();
		       		//value = number;
		      	 	Set(number);
		   	} 
        	else
        		throw new Exception("It string is not number!");       // выбрасывается исключение типа const char*
        }
        catch (Exception ex)                       // обработчик исключений типа const char*
        {
        	System.out.print("Error: " + ex.getMessage() + '\n');
            //std::cerr << "Error: " << "It string is not number!" << '\n';
        }
    }
    */
	
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
	
	
	// Поверхностная копия
    public Mark ShallowCopy()
    {
        return (Mark)this;
    }

    /*
    // Конструктор копирования (Глубокая копия)
    public Mark(Mark otherMark)
    {
        value = otherMark.value;
    }
    */
    
    // Проверка числа на подходяее для оценки
    public boolean IsRightMark(int mark)
    {
        boolean res = true;
        try                                                    // ищем исключения внутри этого блока и отправляем их в соответствующий обработчик catch
        {
            if (mark < 0 || mark > 5)                          // Если пользователь ввел неверное число, то выбрасывается исключение
                throw new Exception("Incorrect value.");       // выбрасывается исключение типа const char*
            return res;
        }
        catch (Exception ex)           						   // обработчик исключений типа const char*
        {
        	System.out.println("Error: " + ex.getMessage() + '\n');
            res = false;
            return res;
        }
        //return res;
    }
    
}
