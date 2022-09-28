package structural.facede;

//facede
public class Computer {
    private Cpu cpu;
    private Disk disk;
    private Ram ram;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        ram = new Ram();
    }
    public void startComputer(){
        cpu.stop();
        ram.load(disk.getBootSector());
        cpu.start();
    }
}
