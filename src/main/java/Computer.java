public class Computer {
    private int memory;
    private int cpu;
   private String name;
   Computer(int memory, int defCpu, String defName) {
       this.memory = memory;
       cpu = defCpu;
       name = defName;

   }

    int getCpu() {
        System.out.println(cpu);
        return cpu;
    }
    int getMemory(){
        System.out.println(memory);
     return memory;

    }

    public String name() {
        return name;
    }
}

