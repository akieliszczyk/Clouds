//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cloud cirrus = new Cloud(1,2,3);

    }

}

    class Cloud {
        Cloud(int colour, int size, int height) {
            this.colour = colour;
            this.size = size;
            this.height = height;

        }

        int colour;
        int size;
        int height;

    }