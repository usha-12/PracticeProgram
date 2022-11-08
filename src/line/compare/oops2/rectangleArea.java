package line.compare.oops2;
class Rectangle{
    int length;
    int width;

   public void dataGet(int x, int y){
        length = x;
        width = y;
    }
   public void Rect (){
        int result = length*width;
        System.out.println("Area of ="+result);
    }
}
public class rectangleArea {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.dataGet(12,30);
    }
}
