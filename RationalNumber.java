public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if (deno == 0) {
      nume = 0;
      deno = 1;
    }
    else if (nume == 0){
      denominator = 1;
    }
    else if (denominator < 0) {
      denominator = denominator * (-1);
      numerator = numerator * (-1);
      reduce();
    }
    else {
      reduce();
    }
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

  private static int gcd(int a, int b){
    int gcd = 0;
    /*
    for(int i = 1; i <= a && i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    */
    if (a > b) {
      for (int i = 0; i < a;) {
        int rem = a % b;
        if (rem == 0) {
          gcd = rem;
        }
        else {
          a = b;
          b = rem;
          i++;
        }
      }
    }
    else {
      for (int i = 0; i < b;) {
        int rem = b % a;
        if (rem == 0) {
          gcd = rem;
        }
        else {
          b = a;
          a = rem;
          i++;
        }
      }
    }
    return gcd;
  }

  private void reduce(){
    int gcd = gcd(this.numerator, this.denominator);
    this.numerator = this.numerator / gcd;
    this.denominator = this.denominator / gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber(0, 0);
    product.numerator = this.numerator * other.numerator;
    product.denominator = this.denominator * other.denominator;
    return product;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber(0, 0);
    quotient.numerator = this.denominator * other.numerator;
    quotient.denominator = this.numerator * other.denominator;
    return quotient;
  }

  public RationalNumber add(RationalNumber other){
    RationalNumber sum = new RationalNumber(0, 0);
    sum.denominator = gcd(this.denominator, other.denominator);
    int num1 = this.numerator * (sum.denominator / this.denominator);
    int num2 = other.numerator * (sum.denominator / other.denominator);
    sum.numerator = num1 + num2;
    return sum;
  }

}
