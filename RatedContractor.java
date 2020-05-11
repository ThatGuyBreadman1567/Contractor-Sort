
public class RatedContractor 
{
	private String contractor;
	private int rating;
	
	public RatedContractor(String name, int r)
	{
		contractor = name;
		rating = r;
		
	}
	
	public String getContractor()
	{
		return contractor;
	}
	
	public int getRating()
	{
		return rating;
	}

}
