import java.util.Scanner;

// ����� ������
public class Mark
{
    private int value = 0;          // ������


    	// �����������
	public Mark()
	{
	    value = 0;
	}
	
	// ������������� ��������� ������
	public void Set(int v)
	{
	    value = v;
	}
	
	// ��������� ������
	public int Get()
	{
	    return value;
	}
	
	// ���� ������ � ��������� ������
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
		System.out.print("������� ������: ");
		
		if (in.hasNextInt()) {
          	 	number = in.nextInt();
			str = in.nextLine();
           		value = number;
		        fl = 1;
       		} 
		else {
           		System.out.println("��������, �� ��� ���� �� �����. ������� ����� ������!");
			System.out.println("\n");
       		}
	    }
	    System.out.println();
	    in.close();
	}
	
	// ����� ������ �� ���������
	public void DisplayValue()
	{
	    System.out.println("������: " + value);
	
	}
	

}