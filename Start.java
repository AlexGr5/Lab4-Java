package School;
import java.util.Scanner;

public class Start {

	public static void main(String[] args)
	{
		//Scanner in = new Scanner(System.in);
        //String os = System.getProperty("os.name");
		//String consoleEncoding = System.getProperty("console.encoding", os.startsWith("Windows") ? "cp866" : "utf-8");
		//Scanner in = new Scanner(System.in, consoleEncoding);
		
		/*
		
	    // Создание обЪектов классов
		//----------------------------------
		Teacher[] teachers = new Teacher[3];
	 	Lesson[] lessons = new Lesson[3];
		Mark[] marks1 = new Mark[3];
		Mark[] marks2 = new Mark[3];
		Mark[] marks3 = new Mark[3];
		Student[] students = new Student[3];
		MyClass classNum1 = new MyClass();
		//----------------------------------

		// Инициализация полей объектов классов
		//---------------------------------------------------------------------------------
		int j = 0;
		for (j = 0; j < 3; j++)
			teachers[j] = new Teacher();
		teachers[0].Set("Иванова", "Марина", "Витальевна");
		teachers[1].Set("Погребнеков", "Николай", "Михайлович");
		teachers[2].Set("Баянова", "Людмила", "Анатольевна");
		
		for (j = 0; j < 3; j++)
			lessons[j] = new Lesson();
		lessons[0].Set("Химия", teachers[0]);
		lessons[1].Set("Обществознание", teachers[1]);
		lessons[2].Set("Математика", teachers[2]);
		
		for (j = 0; j < 3; j++)
		{
			marks1[j] = new Mark();
			marks2[j] = new Mark();
			marks3[j] = new Mark();
		}
		marks1[0].Set(4);
		marks1[1].Set(4);
		marks1[2].Set(4);
		marks2[0].Set(5);
		marks2[1].Set(4);
		marks2[2].Set(5);
		marks3[0].Set(5);
		marks3[1].Set(5);
		marks3[2].Set(5);
		
		for (j = 0; j < 3; j++)
			students[j] = new Student();
		students[0].Set("Сидоров", "Антон", "Витальевич", marks1, 3, lessons, 3);
		students[1].Set("Герасимов", "Владимир", "Анатольевич", marks2, 3, lessons, 3);
		students[2].Set("Иванов", "Николай", "Львович", marks3, 3, lessons, 3);

		classNum1.Set("2В", "2010", students, 3);
		//----------------------------------------------------------------------------------

		int i = 0;
		
		
		*/
		
		/*
		
		// Вывод всех данных на экран:
		//----------------------------------------------------------------------------------
		
		System.out.println("Вывод всех учителей:");
		for (i = 0; i < 3; i++)
			teachers[i].DisplayInfo();

		System.out.println("\n\n");

		System.out.println("Вывод всех уроков:");
		for (i = 0; i < 3; i++)
			lessons[i].DisplayInfo();

		System.out.println("\n\n");

		System.out.println("Вывод всех учеников:");
		for (i = 0; i < 3; i++)
			students[i].DisplayShortInfo();

		System.out.println("\n\n");

		System.out.println("Вывод Класса учеников:");
		classNum1.DisplayShortInfo();		
		
		//----------------------------------------------------------------------------------

		System.out.println("\n\n");
		
		// Лучшие и хучшие ученики в классе
		//----------------------------------------------------------------------------------
        System.out.println("************************Функция поиска лучших учеников в классе***************************");
		System.out.println("Лучшие ученики класса №1:");
		classNum1.BestStud();
		System.out.println("***************************************************");

        System.out.println("\n\n");
	
		System.out.println("************************Функция поиска худших учеников в классе***************************");
		System.out.println("Худшие ученики класса №1:");
		classNum1.BedStud();
		System.out.println("***************************************************");
		//----------------------------------------------------------------------------------
		
		System.out.println("\n\n");
		
		//System.out.println("Тест ввода русских символов на примере ввода учителя:");				
		//teachers[0].InpFIO();
		//teachers[0].DisplayInfo();
		*/
		
		/*
		
		System.out.println("6) Продемонстрировать работу с массивом объектов");
		System.out.println("===========================================================================================");
		System.out.println("На примере объектов класса Оценка");
		marks1[0].Set(4);
		marks1[1].Set(4);
		marks1[2].Set(4);
		for (i = 0; i < 3; i++)
			marks1[i].DisplayValue();
		
		
		System.out.println("\n\n");
		
		System.out.println("7) Продемонстрировать возврат целочисленного значения из метода через вспомогательный класс");
		System.out.println("===========================================================================================");
		System.out.println("На примере объектов класса Student и Mark");
		Mark markAuxiliary = new Mark();
		markAuxiliary = students[0].GetMarkByNumber(1);
		markAuxiliary.DisplayValue();
		
		
		System.out.println("\n\n");
		
		System.out.println("8) Продемонстрировать разумное использование оператора this");
		System.out.println("===========================================================================================");
		System.out.println("На примере класса Оценка");
		// Формирование объектов класса Mark:
		Mark List1 = new Mark(1);
		Mark List2 = new Mark(2);
		Mark List3 = new Mark(3);
		Mark List4 = new Mark(4);

		Mark.NewList();
		
		// Вызов статической компанентной функции:
		Mark.reprint();

		// Включение созданных компанентов в двусвязанный список:
		List1.Add(); List2.Add(); List3.Add(); List4.Add();

		// Печать в обратном порядке значений элементов списка:
		Mark.reprint();
		
		System.out.println("\n\n");
		
		System.out.println("9) Продемонстрировать обработку строк (String)");
		System.out.println("===========================================================================================");
		System.out.println("На примере класса Учитель, сравнение строк\n");

		System.out.println("У учителей:");
		teachers[0].DisplayInfo();
		teachers[1].DisplayInfo();
		if (teachers[0].GetFam().equals(teachers[1].GetFam()))
			System.out.println("Фамилии одинаковые!\n");
		else
			System.out.println("Фамилии разные!\n");
		
		System.out.println("На примере класса Учитель, добавление ко всем полям пробелов");
		teachers[0].AdditionSapces();
		teachers[0].DisplayInfo();
		System.out.println();
		
		System.out.println("На примере класса Учитель, подстроки");
		System.out.println(teachers[0].First4SimbFromFIO());
		
		*/
		
		
		// Лабораторная №8
		//===========================================================================================================
		System.out.print("Лабраторная 8:\n\n");
		System.out.print("=========\nМодифицировать ваши проекты на С++, C# и Java путем добавления в один из классов\nкак минимум одного статического поля и одного статического метода.\n=========\n\n");

		System.out.print("(Использовались статический член класса\'Mark\' \'lastMark\'и\nстатические методы класса \'NewList\' и \'reprint\')\n\n");
		
		// Формирование объектов класса Mark:
		Mark List1 = new Mark(1);
		Mark List2 = new Mark(2);
		Mark List3 = new Mark(3);
		Mark List4 = new Mark(4);

		System.out.print("Вызов статической компанентной функции: \'Новый список\'\n\n");
		// Вызов статической компанентной функции:
		Mark.NewList();

		System.out.print("Вызов статической компанентной функции: \'Напечатать список\'\n\n");
		// Вызов статической компанентной функции:
		Mark.reprint();

		System.out.print("\n\nДобавление элементов в список.\n\n");
		// Включение созданных компанентов в двусвязанный список:
		List1.Add(); List2.Add(); List3.Add(); List4.Add();

		System.out.print("Вызов статической компанентной функции: \'Напечатать список\'\n\n");
		System.out.print("===================================\n");
		// Печать в обратном порядке значений элементов списка:
		Mark.reprint();
		System.out.print("\n===================================\n");
		
	}
}
