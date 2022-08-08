class Break
{
	public static void main(String[]args)
	{
		int[]arr={10,20,30,40,50,60,70};
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println("index value "+i+" array value "+arr[i]); 
			
			if(i==3)
			{
				break;
			}
			
		}
	}
}	