package task4;

public enum Computer {
    Asus("Intel Core i7-11700KF LGA1200","8 x 3600 Mgz","ASUS VG278QR","1920x1080","32 Gb"), DELL("AMD Ryzen 5 2600 AM4","6 x 3600 Mgz","DELL E2420H","1920x1080","16 Gb"), MSI("Intel Core i5 10210U","1800 Mgz","MSI PRO MP271P","1920x1080","8 Gb"), Lenovo("Intel Core i7-11700KF LGA1200","8 x 3600 Mgz","Lenovo ThinkVision S27e-20","1920x1080","8 Gb");
    private Memory memory = new Memory();
    private Monitor monitor = new Monitor();
    private Processor processor = new Processor();
    Computer(String processor_name, String processor_power, String monitor_name, String monitor_permission, String memory_capacity)
    {
        Asus:
        {memory.setCapacity(memory_capacity);
            processor.setName(processor_name);};
        processor.setPower(processor_power);
        monitor.setName(monitor_name);
        monitor.setPermission(monitor_permission);
    }
    private boolean equals(Computer computer)
    {
        if (this.monitor.getName().equals(computer.monitor.getName()) && this.monitor.getPermission().equals(computer.monitor.getPermission()) && this.memory.getCapacity().equals(computer.memory.getCapacity()) && this.processor.getName().equals(computer.processor.getName()) && this.processor.getPower().equals(computer.processor.getPower()))
            return true;
        return false;
    }
}