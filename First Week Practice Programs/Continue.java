class Continue
{
	public static void main(String[]args)
	{
		int[]arrvalue={1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
		int i;
		for(i=0;i<10;i++)
		{
			if(i<3)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}
}	
			