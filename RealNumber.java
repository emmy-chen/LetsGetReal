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
    return (this.value == other.value);
  }

  public RealNumber add(RealNumber other){
    RealNumber sum = new RealNumber(0);
    sum.value = this.value + other.value;
    return sum;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(0);
    product.value = this.value + other.value;
    return product;
  }
/*
  public RealNumber divide(RealNumber other){
    return (this.value /= other.value);
  }
  */

}
