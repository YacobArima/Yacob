public class LatihanD {
  String nama;
  String noplg;
  double pemakaian; 
  int biaya;

  public LatihanD(String n, String p, double pem) {
    nama = n;
    noplg = p;
    pemakaian = pem;
  }

  public void perhitunganbiaya() {
    if (pemakaian  <= 10){
        biaya = (int) (pemakaian * 1000);
    }else if(pemakaian >= 10 && pemakaian <= 20){
        biaya = (int) (10 * 1000 + (pemakaian - 10)* 2000);
    }else if (pemakaian > 20){
        biaya = (int) ( 10 * 1000 + 10 * 2000 + (pemakaian - 20) * 5000);
      }
  }
  
  public void print(){
      System.out.println("Biaya : "+ biaya);
  }
}