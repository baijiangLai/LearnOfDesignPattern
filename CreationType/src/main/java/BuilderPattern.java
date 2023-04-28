public class BuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("inter", "sansung")
                .setDisplay("xiaomi")
                .setKeyboard("luoji")
                .setUsbCount(2)
                .build();
        System.out.println(computer.toString());
    }
}

class Computer {
    private final String cpu;//必须
    private final String ram;//必须
    private final int usbCount;//可选
    private final String keyboard;//可选
    private final String display;//可选

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    static class Builder {
        private final String cpu;//必须
        private final String ram;//必须
        private int usbCount;//可选
        private String keyboard;//可选
        private String display;//可选
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
