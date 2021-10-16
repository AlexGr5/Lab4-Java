import java.util.Scanner;

// Класс Класс
public class MyClass
{
    private String className = "";          		// Название класса
    private String yearOfStudy = "";        		// Год обучения
    private int contStuds = 0;              		// Текущее кол-во учеников
    private Student[] students = new Student[32];   	// Массив учеников

    
// Конструктор
public MyClass()
{
    className = "";
    yearOfStudy = "";
    contStuds = 0;
    Student S = new Student();
    S.Null();
    for (int i = 0; i < 32; i++)
    {
        students[i] = S;
    }
}

// Очищение полей структуры Класс
public void Null()
{
    className = "";
    yearOfStudy = "";
    contStuds = 0;
    Student S = new Student();
    S.Null();
    for (int i = 0; i < 32; i++)
    {
        students[i] = S;
    }
}

// Инициализация структуры Класс
public void Set(String Name, String Year, Student mas[], int LenStud)
{
    this.className = Name;
    this.yearOfStudy = Year;
    this.contStuds = 0;
    Student S = new Student();
    S.Null();
    for (int i = 0; i < 32 && i < LenStud; i++)
    {
        students[i] = mas[i];
    }
}


// Функции получения значений полей
public String GetName()
{
    return className;
}

public String GetYear()
{
    return yearOfStudy;
}



// Ввод данных в структуру Класс
public void InpNameYear()
{
    //Scanner in = new Scanner(System.in);
    String os = System.getProperty("os.name");
    String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
    Scanner in = new Scanner(System.in, consoleEncoding);
    System.out.print("Введите название класса: ");
    className = in.nextLine();
    System.out.println("");
    System.out.print("Введите год обучения: ");
    yearOfStudy = in.nextLine();
    System.out.println("");
}

// Добавление к классу ченика
public boolean AddStud(Student st)
{
    boolean fl = false;
    if (contStuds < 20)
    {
        students[contStuds] = st;
        contStuds++;
        fl = true;
    }

    return fl;
}

// Вывод данных из структуры Класс
// fl_out (0 или 1)
public void DisplayShortInfo()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Название класса: " + className);
    System.out.println("Год обучения: " + yearOfStudy);
    System.out.println("");
    System.out.println("Ученики:");

    int i = 0;
    while (students[i].GetFam() != "")
    {
        students[i].DisplayShortInfo();
        i++;
    }

}

// Выод всех данных из структуры Класс
public void DispFullInfo()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Название класса: " + className);
    System.out.println("Год обучения: " + yearOfStudy);
    System.out.println("");
    System.out.println("Ученики:");

    int i = 0;
    while (students[i].GetFam() != "")
    {
        students[i].DispFullInfo();
        i++;
    }
}

// Функция по нахождению лучших учеников в классе
public boolean BestStud()
{
    double[] mas_m = new double[32];
    boolean exit = false;

    for (int i = 0; i < 32; i++)
    {
        mas_m[i] = 0;
    }

    int i = 0;
    int k = 0;
    double sum = 0;
    while (students[i].GetFam() != "")
    {
        int j = 0;
        k = 0;
        sum = 0;
        while (students[i].GetLessByNumber(j).GetNameLess() != "")
        {
            sum += students[i].GetMarkByNumber(j).Get();
            k++;
            j++;
        }
        mas_m[i] = sum / k;
        i++;
    }

    if (i > 0)
    {
        double maxM = 0;
        maxM = mas_m[0];
        for (int j = 0; j < i; j++)
        {
            if (maxM < mas_m[j])
                maxM = mas_m[j];
        }

        for (int j = 0; j < i; j++)
        {
            if (mas_m[j] == maxM)
                students[j].DisplayShortInfo();
        }

        exit = true;
    }

    return exit;
}

// Функция по нахождению худших учеников в классе
public boolean BedStud()
{
    double[] mas_m = new double[32];
    boolean exit = false;

    for (int i = 0; i < 32; i++)
    {
        mas_m[i] = 0;
    }

    int i = 0;
    int k = 0;
    double sum = 0;
    while (students[i].GetFam() != "")
    {
        int j = 0;
        k = 0;
        sum = 0;
        while (students[i].GetLessByNumber(j).GetNameLess() != "")
        {
            sum += students[i].GetMarkByNumber(j).Get();
            k++;
            j++;
        }
        mas_m[i] = sum / k;
        i++;
    }

    if (i > 0)
    {
        double minM = 0;
        minM = mas_m[0];
        for (int j = 0; j < i; j++)
        {
            if (minM > mas_m[j])
                minM = mas_m[j];
        }

        for (int j = 0; j < i; j++)
        {
            if (mas_m[j] == minM)
                students[j].DisplayShortInfo();
        }
        exit = true;
    }

    return exit;
}


}