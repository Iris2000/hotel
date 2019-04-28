package assignment;

public class book {
    
    private int ppNight;
    private double total;
    private String roomt;
    private String gtotal;
    private String packg;
    private long days;
    
    public book (String type, String gt, String packg, long day){
        this.roomt = type;
        this.gtotal = gt;
        this.packg = packg;
        this.days = day;
        
        setPrice(packg, type);
    }
    
    public void setPrice(String packg, String roomt){
        
        if (packg.equals("Standard Package") && roomt.equals("Single Room") )
	{
		ppNight = 88;
	}
	else if (packg.equals("Standard Package") && roomt.equals("Double Room"))
	{
		ppNight = 188;
	}
	else if (packg.equals("Standard Package") && roomt.equals("Family Room"))
	{
		ppNight = 288;
	}
	else if ((packg.equals("Breakfast Package") && roomt.equals("Single Room")) || (packg.equals("SPA Package") && roomt.equals("Single Room")))
	{
		ppNight = 99;
	}
        else if ((packg.equals("Breakfast Package") && roomt.equals("Double Room")) || (packg.equals("SPA Package") && roomt.equals("Double Room")) || (packg.equals("Explore Package") && roomt.equals("Double Room")))
	{
		ppNight = 199;
	}
	else if ((packg.equals("Breakfast Package") && roomt.equals("Family Room")) || (packg.equals("SPA Package") && roomt.equals("Family Room")) || (packg.equals("Explore Package") && roomt.equals("Family Room")))
	{
		ppNight = 320;
	}
	else if (packg.equals("Full Package") && roomt.equals("Single Room"))
	{
		ppNight = 120;
	}
	else if (packg.equals("Full Package") && roomt.equals("Double Room"))
	{
		ppNight = 220;
	}
	else
	{
		ppNight = 420;
	}
    }
    
    public int getPrice(){
        return ppNight;
    }
    
    public double Calculate (){
        total = days * getPrice();
        return total;
    }
   
    public String toString(){
        return "Package: " + packg + "\nRoom Type: " + roomt + "\nTotal Guest: " +
                gtotal + "\nTotal Days: " + days + "\nPrice: RM" + Calculate();
    }

}
