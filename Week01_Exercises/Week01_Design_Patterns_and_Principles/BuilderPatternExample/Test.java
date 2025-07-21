package BuilderPatternExample;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().setRAM("8gb").build();
        System.out.println(computer);

        //Order doesn't matter. Even if the values not assigned takes the default values.
        Computer com = new Computer.Builder().setCPU("Intel").setRAM("16gb").setStorage("SSD").build();
        System.out.println(com);
    }
}
