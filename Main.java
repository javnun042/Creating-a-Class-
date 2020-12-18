public class Invention {
  private String inventionName;
  private String inventor;
  public int inventionYear;
  private double hoursPerWeek;

  public Invention() {
    this.inventionName = "";
    this.inventor = "";
    this.inventionYear = 0;
    this.hoursPerWeek = 0;
  }

  public Invention(String inventionName, int inventionYear) {
    this.inventionName = inventionName;
    this.inventionYear = inventionYear;
  }

  public String getIName() {
    return this.inventionName;
  }

  public int getYear() {
    return this.inventionYear;
  }

  public String getName(){
    return this.inventor;
  }
  
  public double getHours(){
    return this.hoursPerWeek;
  }

  public String toString(){
    return this.inventionName + " , an innovative project created by " + this.inventor + " in the year " + this.inventionYear + " after spending an average of " + this.hoursPerWeek + " hours each week working on it!";
  }

}