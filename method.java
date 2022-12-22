public class  method {
    public static String Name = "Coco";

    static void randevu() {
        System.out.println("turn up");
    }
    static void dolphin() {
        System.out.println("swim fish!!");

    }
    public static char getmiddleinitial() {
       return Name.charAt(0);
    }
    public static void main(String [] args){
        dolphin();
        randevu();
        System.out.println(getmiddleinitial());
    }
}
