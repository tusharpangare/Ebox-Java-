//Stall.java


public interface Stall {
    abstract void display();
}



//GoldStall.java


public class GoldStall implements Stall {
    private String stallName,ownerName;
    private Integer cost,tvSet;
    
    GoldStall() {}
    
    GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }
    
    @Override
    public void display() {
        System.out.println(String.format("Stall Name:%s\nCost:%d.Rs\nOwner Name:%s\nNumber of TV sets:%d",this.stallName,this.cost,this.ownerName,this.tvSet));
    }
    
    public void setStallName(String stallName) {
        this.stallName = stallName;
    }
    
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setTvSet(Integer tvSet) {
        this.tvSet = tvSet;
    }
    
    public String getStallName() {
       return this.stallName;
    }
    
    public Integer getCost() {
       return this.cost;
    }
    
    public String getOwnerName() {
       return this.ownerName;
    }
    
    public Integer getTvSet() {
       return this.tvSet;
    }
}


//PremiumStall.java



public class PremiumStall implements Stall {
    private String stallName,ownerName;
    private Integer cost,projector;
    
    PremiumStall() {}
    
    PremiumStall(String stallName, Integer cost, String ownerName, Integer projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
    }
    
    @Override
    public void display() {
        System.out.println(String.format("Stall Name:%s\nCost:%d.Rs\nOwner Name:%s\nNumber of Projectors:%d",this.stallName,this.cost,this.ownerName,this.projector));
    }
    
    public void setStallName(String stallName) {
        this.stallName = stallName;
    }
    
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setProjector(Integer projector) {
        this.projector = projector;
    }
    
    public String getStallName() {
       return this.stallName;
    }
    
    public Integer getCost() {
       return this.cost;
    }
    
    public String getOwnerName() {
       return this.ownerName;
    }
    
    public Integer getProjector() {
       return this.projector;
    }
    
}



//ExecutiveStall.java



public class ExecutiveStall implements Stall {
    private String stallName,ownerName;
    private Integer cost,screen;
    
    ExecutiveStall() {}
    
    ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen=screen;
    }
    
    @Override
    public void display() {
        System.out.println(String.format("Stall Name:%s\nCost:%d.Rs\nOwner Name:%s\nNumber of Screens:%d",this.stallName,this.cost,this.ownerName,this.screen));
    }
    
    public void setStallName(String stallName) {
        this.stallName = stallName;
    }
    
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setScreen(Integer screen) {
        this.screen = screen;
    }
    
    public String getStallName() {
       return this.stallName;
    }
    
    public Integer getCost() {
       return this.cost;
    }
    
    public String getOwnerName() {
       return this.ownerName;
    }
    
    public Integer getScreen() {
       return this.screen;
    }
}

//Main.java



import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	  
	  Scanner sc = new Scanner(System.in);
        System.out.print("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall\n");
        int ch = Integer.parseInt(sc.nextLine());
        String[] details;

        switch(ch) {
            case 1:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
                details = sc.nextLine().split(",");
                GoldStall goldStall = new GoldStall(details[0],Integer.parseInt(details[1]),details[2],Integer.parseInt(details[3]));
                goldStall.display();
                break;
            case 2:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
                details = sc.nextLine().split(",");
                PremiumStall premiumStall = new PremiumStall(details[0],Integer.parseInt(details[1]),details[2],Integer.parseInt(details[3]));
                premiumStall.display();
                break;
            case 3:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
                details = sc.nextLine().split(",");
                ExecutiveStall executiveStall = new ExecutiveStall(details[0],Integer.parseInt(details[1]),details[2],Integer.parseInt(details[3]));
                executiveStall.display();
                break;
            default:
                System.out.println("Invalid Stall Type");
                break;
        }
        sc.close();
	}
}