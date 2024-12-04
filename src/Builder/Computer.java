package Builder;

public class Computer {
    //required parameters
    private String HDS;
    private String RAM;
    //optional parameter
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder){
          this.HDS = builder.HDS;
          this.RAM = builder.RAM;
          this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
          this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

//    inside this we can return the builder
    public static ComputerBuilder getBuilder(String hdd, String ram){

        return new ComputerBuilder(hdd,ram);
    }

    //we will only have getters for computer class
    public String getHDS() {
        return HDS;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    //builder class
    public static  class  ComputerBuilder{
        private String HDS;
        private String RAM;
        //optional parameter
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
       public ComputerBuilder(String HDS, String RAM){
           this.HDS = HDS;
           this.RAM = RAM;
       }
       public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
           this.isGraphicsCardEnabled = isGraphicsCardEnabled;
           return this;
       }
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
           //before building the object you can do some kind of validation
           return new Computer(this);
        }
    }
}
