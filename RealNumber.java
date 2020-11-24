public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
    return true;
  }

  public RealNumber add(RealNumber other){
    this.value += other.value;
     return null;
  }

}
