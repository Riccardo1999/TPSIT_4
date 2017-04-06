package naviga;

public class Barca {
    private int dx=0;
    private int dy=0;
    private int x=0;
    private int y=0;
    
    public Barca(int x, int y){
        this.dx=x;
        this.dy=y;
        this.x=x;
        this.y=y;
    }
    
    public int getdX(){
        return this.dx;
    }
    
    public int getdY(){
        return this.dy;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void muoviSopra(int y){
        if((this.y-y)<3){
            this.y=3;
        }else{
            this.y-=y;
        }
    }
    
    public void muoviSotto(int y){
        if((this.y+y)>268){
            this.y=268;
        }else{
            this.y+=y;
        }
    }
    
    public void muoviSinistra(int x){
        if((this.x-x)<12){
            this.x=12;
        }else{
            this.x-=x;
        }
    }
    
    public void muoviDestra(int x){
        if((this.x+x)>297){
            this.x=297;
        }else{
            this.x+=x;
        }
    }
}
