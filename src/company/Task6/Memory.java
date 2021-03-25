package company.Task6;

public class Memory {
    private final long free;
    private final long total;

    public Memory(long free, long total) {
        this.free = free;
        this.total = total;
    }
    public long used(){
        return total - free;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "free=" + free +
                ", total=" + total +
                ", used=" + used() +
                '}';
    }
}
