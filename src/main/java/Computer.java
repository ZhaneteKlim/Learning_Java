public class Computer {
    private int memory;
    private int cpu;
   private String name;
   Computer(int memory, int defCpu, String defName) {
       this.memory = memory;
       cpu = defCpu;
       name = defName;

   }

    void getCpu() {
        System.out.println(cpu);
    }
    void  getMemory(){
        System.out.println(memory);
    }
    void setMemory(int m) {
        memory = m;
    }
}
