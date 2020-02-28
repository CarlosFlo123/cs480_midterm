
public class TestMouse {
    public static void main(String argv[]) {
        Mouse jerry = new Mouse("Jerry", 4);
        Mouse mickey = new Mouse("Mickey", 4);
        System.out.println("======================> MOUSE MMA <========================");
        System.out.println("Are the mouses equal?: " + jerry.equals(mickey));
        while(true){
            jerry.fight();
            mickey.fight();
            if (jerry.isNormal() && !mickey.isNormal()){
                System.out.println("The winner-----> " + jerry);
                break ;
            }
            if(!jerry.isNormal() && mickey.isNormal()){
                System.out.println("The winner-----> " + mickey);
                break ;
            }
            else if(!jerry.isNormal() && !mickey.isNormal()){
                System.out.println("The losers-----> " + jerry + "\t" + mickey);
                break;
            }
        }
    }
}