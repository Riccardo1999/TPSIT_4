package verificaretta;

public class Retta {
    private double a=0;
    private double b=0;
    private double c=0;
    
    public Retta(){
    }
    
    public Retta(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public String getTipo(){
        if(a==0){
            return "Orizzontale";
        }
        if(b==0){
            return "Verticale";
        }
        return "Obliqua";
    }
    
    public boolean appartiene(double x, double y){
        System.out.println("= "+(((this.a*x)+(this.b*y)+this.c)));
        if(((this.a*x)+(this.b*y)+this.c)==0){
            return true;
        } else {
            return false;
        }
    }

    public String stampa() {
        String e = "";

        if (this.a != 0) {
            e += this.a + " x ";
        }
        if (this.b != 0) {
            if (this.b > 0 && this.a != 0) {
                e += "+ ";
            }
            e += this.b + " y ";
        }
        if (this.c != 0) {
            if (this.c > 0) {
                e = e + "+ ";
            }
            e += this.c;
        }
        e += " = 0";
        return e;
    }

}
