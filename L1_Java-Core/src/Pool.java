public class Pool implements Obstacle {
    private int length;

    public Pool(int length) {
        this.length = length;
    }

    public boolean passBy(Member member) {
        return member.swim(this.length);
    }
}
