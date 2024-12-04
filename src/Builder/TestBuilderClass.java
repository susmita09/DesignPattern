package Builder;

public class TestBuilderClass {
    public static void main(String[] args){
//        Computer.ComputerBuilder comp = new Computer.ComputerBuilder("500 GB", "8GB");
//        Computer computer = comp.setBluetoothEnabled(true).build();

        //if we have the getBuilder method

        Computer computer = Computer.getBuilder("300Gb","40gb").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }
}
