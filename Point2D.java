package inheritance2;

public class Point2D {
    protected float x=0.0f;
    protected float y=0.0f;
    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(float[] arr){
        this.x=arr[0];
        this.y=arr[1];
        return arr;
    }
    public String toString(){
        return "point 2: x=  "+getX()+" y= "+getY();
    }
}
