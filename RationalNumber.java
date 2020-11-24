public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return (this.numerator / this.denominator);
  }

  public int getNumerator(){
    return this.numerator;
  }

  public int getDenominator(){
    return this.denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber reciprocal = new RationalNumber(this.numerator, this.denominator);
    return reciprocal;
  }

  public boolean equals(RationalNumber other){
    return (this.numerator == other.numerator && this.denominator == other.denominator);
  }

  public String toString(){
    return this.numerator + "/" + this.denominator;
  }

}
