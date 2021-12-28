package School;
import java.util.Scanner;

//����� ������
public class Mark<T> {

	private T value;          // ������
	
	private static Mark lastMark;
	private Mark prev;
	private Mark next;


	// �����������
	public Mark()
	{
	    //value = 0;
	}
	
	// ����������� � �����������
	public Mark(T value)
	{
		//this.value = 0;
        //if (IsRightMark(value))
            this.value = value;
	}
	
	// ������������� ��������� ������
	public void Set(T v)
	{
		//this.value = 0;
        //if (IsRightMark(v))
            this.value = v;
	}
	
	// ��������� ������
	public T Get()
	{
	    return value;
	}
	
	/*
	// ���� ������ � ��������� ������
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
			System.out.print("������� ������: ");
			
			if (in.hasNextInt()) 
			{
		      	 	number = in.nextInt();
		      	 	str = in.nextLine();
		       		value = number;
			        fl = 1;
		   	} 
			else 
			{
		       		System.out.println("��������, �� ��� ���� �� �����. ������� ����� ������!");
		       		System.out.println("\n");
		   	}
	    }
	    System.out.println();
	    in.close();
	}
	*/
	
	/*
	// ���� ������ � ��������� ������
    public void InpMark()
    {
    	Scanner in = new Scanner(System.in);
    	String str = new String();
        //string mark;
    	int number = 0;
        //Console.Write("������� ������: ");
        //mark = Console.ReadLine();
    	System.out.print("������� ������: ");
        try                                                 // ���� ���������� ������ ����� ����� � ���������� �� � ��������������� ���������� catch          
        {
        	if (in.hasNextInt()) 
			{
		      	 	number = in.nextInt();
		      	 	str = in.nextLine();
		       		//value = number;
		      	 	Set(number);
		   	} 
        	else
        		throw new Exception("It string is not number!");       // ������������� ���������� ���� const char*
        }
        catch (Exception ex)                       // ���������� ���������� ���� const char*
        {
        	System.out.print("Error: " + ex.getMessage() + '\n');
            //std::cerr << "Error: " << "It string is not number!" << '\n';
        }
    }
    */
	
	// ����� ������ �� ���������
	public void DisplayValue()
	{
	    System.out.println("������: " + value);
	
	}
	
	// ����� ������
	public static void NewList()
	{
		lastMark = null;
	}
	
	// ���������� �������� � ����� ������
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

	// ����� �� ������� ����������� ������
	public static void reprint()
	{
	    Mark uk;   // ��������������� ������
	    uk = lastMark;
	    if (uk == null) 
	    { 
	    	System.out.println("������ ����!"); 
	        return;
	    }
	    else 
	    	System.out.println("\n���������� ������:\n");

	    // ���� ������ � �������� ������� �������� ��������� ������:
	    while (uk != null)
	    {
	    	System.out.println(uk.value + "\t");
	        uk = uk.prev;
	    }
	}
	
	
	// ������������� �����
    public Mark ShallowCopy()
    {
        return (Mark)this;
    }

    /*
    // ����������� ����������� (�������� �����)
    public Mark(Mark otherMark)
    {
        value = otherMark.value;
    }
    */
    
    // �������� ����� �� ��������� ��� ������
    public boolean IsRightMark(int mark)
    {
        boolean res = true;
        try                                                    // ���� ���������� ������ ����� ����� � ���������� �� � ��������������� ���������� catch
        {
            if (mark < 0 || mark > 5)                          // ���� ������������ ���� �������� �����, �� ������������� ����������
                throw new Exception("Incorrect value.");       // ������������� ���������� ���� const char*
            return res;
        }
        catch (Exception ex)           						   // ���������� ���������� ���� const char*
        {
        	System.out.println("Error: " + ex.getMessage() + '\n');
            res = false;
            return res;
        }
        //return res;
    }
    
}
