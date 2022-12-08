package advanceJava;
public class enumTypes {
    public static void main(String[] args) {
        Color c1 = Color.Red;
        System.out.println("Red Enum name: " + c1.name());
        System.out.println("Red Enum value: " + c1.getVal());

        for(Color color: Color.values()){
            System.out.println("Enum value: " + color.getVal());
        }

    }
}
