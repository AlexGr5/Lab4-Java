import java.util.Scanner;

// Класс Оценка
public class Mark
{
    private int value = 0;          // Оценка


    	// Конструктор
	public Mark()
	{
	    value = 0;
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
	    //Scanner in = new Scanner(System.in);
	    String os = System.getProperty("os.name");
            String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
            Scanner in = new Scanner(System.in, consoleEncoding);
	    String str = new String();
	    //value = in.nextInt();
	    int fl = 0;
	    int number = 0;
	    while (fl == 0)
	    {
		System.out.print("Введите оценку: ");
		
		if (in.hasNextInt()) {
          	 	number = in.nextInt();
			str = in.nextLine();
           		value = number;
		        fl = 1;
       		} 
		else {
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
	

}
