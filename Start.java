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
		
	    // �������� �������� �������
		//----------------------------------
		Teacher[] teachers = new Teacher[3];
	 	Lesson[] lessons = new Lesson[3];
		Mark[] marks1 = new Mark[3];
		Mark[] marks2 = new Mark[3];
		Mark[] marks3 = new Mark[3];
		Student[] students = new Student[3];
		MyClass classNum1 = new MyClass();
		//----------------------------------

		// ������������� ����� �������� �������
		//---------------------------------------------------------------------------------
		int j = 0;
		for (j = 0; j < 3; j++)
			teachers[j] = new Teacher();
		teachers[0].Set("�������", "������", "����������");
		teachers[1].Set("�����������", "�������", "����������");
		teachers[2].Set("�������", "�������", "�����������");
		
		for (j = 0; j < 3; j++)
			lessons[j] = new Lesson();
		lessons[0].Set("�����", teachers[0]);
		lessons[1].Set("��������������", teachers[1]);
		lessons[2].Set("����������", teachers[2]);
		
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
		students[0].Set("�������", "�����", "����������", marks1, 3, lessons, 3);
		students[1].Set("���������", "��������", "�����������", marks2, 3, lessons, 3);
		students[2].Set("������", "�������", "�������", marks3, 3, lessons, 3);

		classNum1.Set("2�", "2010", students, 3);
		//----------------------------------------------------------------------------------

		int i = 0;
		
		
		*/
		
		/*
		
		// ����� ���� ������ �� �����:
		//----------------------------------------------------------------------------------
		
		System.out.println("����� ���� ��������:");
		for (i = 0; i < 3; i++)
			teachers[i].DisplayInfo();

		System.out.println("\n\n");

		System.out.println("����� ���� ������:");
		for (i = 0; i < 3; i++)
			lessons[i].DisplayInfo();

		System.out.println("\n\n");

		System.out.println("����� ���� ��������:");
		for (i = 0; i < 3; i++)
			students[i].DisplayShortInfo();

		System.out.println("\n\n");

		System.out.println("����� ������ ��������:");
		classNum1.DisplayShortInfo();		
		
		//----------------------------------------------------------------------------------

		System.out.println("\n\n");
		
		// ������ � ������ ������� � ������
		//----------------------------------------------------------------------------------
        System.out.println("************************������� ������ ������ �������� � ������***************************");
		System.out.println("������ ������� ������ �1:");
		classNum1.BestStud();
		System.out.println("***************************************************");

        System.out.println("\n\n");
	
		System.out.println("************************������� ������ ������ �������� � ������***************************");
		System.out.println("������ ������� ������ �1:");
		classNum1.BedStud();
		System.out.println("***************************************************");
		//----------------------------------------------------------------------------------
		
		System.out.println("\n\n");
		
		//System.out.println("���� ����� ������� �������� �� ������� ����� �������:");				
		//teachers[0].InpFIO();
		//teachers[0].DisplayInfo();
		*/
		
		/*
		
		System.out.println("6) ������������������ ������ � �������� ��������");
		System.out.println("===========================================================================================");
		System.out.println("�� ������� �������� ������ ������");
		marks1[0].Set(4);
		marks1[1].Set(4);
		marks1[2].Set(4);
		for (i = 0; i < 3; i++)
			marks1[i].DisplayValue();
		
		
		System.out.println("\n\n");
		
		System.out.println("7) ������������������ ������� �������������� �������� �� ������ ����� ��������������� �����");
		System.out.println("===========================================================================================");
		System.out.println("�� ������� �������� ������ Student � Mark");
		Mark markAuxiliary = new Mark();
		markAuxiliary = students[0].GetMarkByNumber(1);
		markAuxiliary.DisplayValue();
		
		
		System.out.println("\n\n");
		
		System.out.println("8) ������������������ �������� ������������� ��������� this");
		System.out.println("===========================================================================================");
		System.out.println("�� ������� ������ ������");
		// ������������ �������� ������ Mark:
		Mark List1 = new Mark(1);
		Mark List2 = new Mark(2);
		Mark List3 = new Mark(3);
		Mark List4 = new Mark(4);

		Mark.NewList();
		
		// ����� ����������� ������������ �������:
		Mark.reprint();

		// ��������� ��������� ����������� � ������������ ������:
		List1.Add(); List2.Add(); List3.Add(); List4.Add();

		// ������ � �������� ������� �������� ��������� ������:
		Mark.reprint();
		
		System.out.println("\n\n");
		
		System.out.println("9) ������������������ ��������� ����� (String)");
		System.out.println("===========================================================================================");
		System.out.println("�� ������� ������ �������, ��������� �����\n");

		System.out.println("� ��������:");
		teachers[0].DisplayInfo();
		teachers[1].DisplayInfo();
		if (teachers[0].GetFam().equals(teachers[1].GetFam()))
			System.out.println("������� ����������!\n");
		else
			System.out.println("������� ������!\n");
		
		System.out.println("�� ������� ������ �������, ���������� �� ���� ����� ��������");
		teachers[0].AdditionSapces();
		teachers[0].DisplayInfo();
		System.out.println();
		
		System.out.println("�� ������� ������ �������, ���������");
		System.out.println(teachers[0].First4SimbFromFIO());
		
		*/
		
		/*
		// ������������ �8
		//===========================================================================================================
		System.out.print("������������ 8:\n\n");
		System.out.print("=========\n�������������� ���� ������� �� �++, C# � Java ����� ���������� � ���� �� �������\n��� ������� ������ ������������ ���� � ������ ������������ ������.\n=========\n\n");

		System.out.print("(�������������� ����������� ���� ������\'Mark\' \'lastMark\'�\n����������� ������ ������ \'NewList\' � \'reprint\')\n\n");
		
		// ������������ �������� ������ Mark:
		Mark List1 = new Mark(1);
		Mark List2 = new Mark(2);
		Mark List3 = new Mark(3);
		Mark List4 = new Mark(4);

		System.out.print("����� ����������� ������������ �������: \'����� ������\'\n\n");
		// ����� ����������� ������������ �������:
		Mark.NewList();

		System.out.print("����� ����������� ������������ �������: \'���������� ������\'\n\n");
		// ����� ����������� ������������ �������:
		Mark.reprint();

		System.out.print("\n\n���������� ��������� � ������.\n\n");
		// ��������� ��������� ����������� � ������������ ������:
		List1.Add(); List2.Add(); List3.Add(); List4.Add();

		System.out.print("����� ����������� ������������ �������: \'���������� ������\'\n\n");
		System.out.print("===================================\n");
		// ������ � �������� ������� �������� ��������� ������:
		Mark.reprint();
		System.out.print("\n===================================\n");
		
		*/
		
		
		// �������� �������� �������
		//----------------------------------
		Teacher[] teachers = new Teacher[3];
	 	Lesson[] lessons = new Lesson[3];
		Mark[] marks1 = new Mark[3];
		Mark[] marks2 = new Mark[3];
		Mark[] marks3 = new Mark[3];
		Student[] students = new Student[3];
		MyClass classNum1 = new MyClass();
		//----------------------------------

		// ������������� ����� �������� �������
		//---------------------------------------------------------------------------------
		int j = 0;
		for (j = 0; j < 3; j++)
			teachers[j] = new Teacher();
		teachers[0].Set("�������", "������", "����������");
		teachers[1].Set("�����������", "�������", "����������");
		teachers[2].Set("�������", "�������", "�����������");
		
		for (j = 0; j < 3; j++)
			lessons[j] = new Lesson();
		lessons[0].Set("�����", teachers[0]);
		lessons[1].Set("��������������", teachers[1]);
		lessons[2].Set("����������", teachers[2]);
		
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
		students[0].Set("�������", "�����", "����������", marks1, 3, lessons, 3);
		students[1].Set("���������", "��������", "�����������", marks2, 3, lessons, 3);
		students[2].Set("������", "�������", "�������", marks3, 3, lessons, 3);

		classNum1.Set("2�", "2010", students, 3);
		//----------------------------------------------------------------------------------
		
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher("�����������");
		Teacher teacher3 = new Teacher("�������", "�������", "�����������");

		System.out.println("������������ 9");
		System.out.println();
		System.out.println("������������ ������ �������:");
		System.out.println("1) ����������� ��� ����������:");
		teacher1.DisplayInfo();
		System.out.println("2) ����������� � 1-�� ����������:");
		teacher2.DisplayInfo();
		System.out.println("3) ����������� � �����������:");
		teacher3.DisplayInfo();
		System.out.println("\n\n");


		Lesson lesson1 = new Lesson();
		Lesson lesson2 = new Lesson("��������������");
		Lesson lesson3 = new Lesson("����������", teachers[2]);

		System.out.println("������������ ������ ����:");
		System.out.println("1) ����������� ��� ����������:");
		lesson1.DisplayInfo();
		System.out.println("2) ����������� � 1-�� ����������:");
		lesson2.DisplayInfo();
		System.out.println("3) ����������� � �����������:");
		lesson3.DisplayInfo();
		System.out.println("\n\n");



		Mark markParamLess = new Mark(), markParam = new Mark(3);

		System.out.println("������������ ������ ������:");
		System.out.println("1) ����������� ��� ����������:");
		markParamLess.DisplayValue();
		System.out.println("2) ����������� � 1-�� ����������, �� �� � �����������:");
		markParam.DisplayValue();
		System.out.println("\n\n");



		Student uchenik1 = new Student(), uchenik2 = new Student("���������"), uchenik3 = new Student("���������", "��������", "�����������", marks2, 3, lessons, 3);
		System.out.println("������������ ������ ������:");
		System.out.println("1) ����������� ��� ����������:");
		uchenik1.DisplayShortInfo();
		System.out.println("2) ����������� � 1-�� ����������:");
		uchenik2.DisplayShortInfo();
		System.out.println("3) ����������� � �����������:");
		uchenik3.DisplayShortInfo();
		System.out.println("\n\n");

		MyClass class1 = new MyClass(), class2 = new MyClass("5�"), class3 = new MyClass("2�", "2010", students, 3);
		System.out.println("������������ ������ ��� �����:");
		System.out.println("1) ����������� ��� ����������:");
		class1.DisplayShortInfo();
		System.out.println("2) ����������� � 1-�� ����������:");
		class2.DisplayShortInfo();
		System.out.println("3) ����������� � �����������:");
		class3.DisplayShortInfo();
		System.out.println("\n\n");



		Teacher[] teacherArr = new Teacher[3];
		for (j = 0; j < 3; j++)
			teacherArr[j] = new Teacher("������" + (j + 1));
		System.out.println("���������������� ��������� ������ ������������� � ����� ����������:");
		for (j = 0; j < 3; j++)
			teacherArr[j].DisplayInfo();
		System.out.println("\n\n");



		System.out.println("������������������ �������� ����� ������ � �������� ������������:");
		Mark markTestCopy1 = new Mark(4), markTestCopy2 = new Mark(5);

		//markTestCopy2 = markTestCopy1.ShallowCopy();
		markTestCopy2 = markTestCopy1;

		System.out.println("������������� ����� 1-�� ������� �� 2-��:");
		markTestCopy1.DisplayValue();
		markTestCopy2.DisplayValue();
		System.out.println("");
		System.out.println("��������� 1-�� �������, � 2-�� �� ���������:");
		markTestCopy1.Set(3);
		markTestCopy1.DisplayValue();
		markTestCopy2.DisplayValue();
		System.out.println("");

		markTestCopy1.Set(4);
		markTestCopy2 = new Mark(markTestCopy1);

		System.out.println("�������� ����� 1-�� ������� �� 2-��:");
		markTestCopy1.DisplayValue();
		markTestCopy2.DisplayValue();
		System.out.println("");
		System.out.println("��������� 1-�� �������, � 2-�� �� ���������:");
		markTestCopy1.Set(3);
		markTestCopy1.DisplayValue();
		markTestCopy2.DisplayValue();
		System.out.println("\n\n");
	}
}
