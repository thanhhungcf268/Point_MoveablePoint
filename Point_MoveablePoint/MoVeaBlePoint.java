package Point_MoveablePoint;

public class MoVeaBlePoint extends Point {
    private float xSpeed = 0.0f, ySpeed = 0.0f;
    public MoVeaBlePoint(){

    }
    public MoVeaBlePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoVeaBlePoint(float xSpeed, float ySpeed,float x,float y){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] array;
        return array =new float[]{xSpeed,ySpeed};
    }
    public MoVeaBlePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return "MoVeaBlePoint{" +
                "x="+ getX() +
                "y="+ getY()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
