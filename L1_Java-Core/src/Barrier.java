public class Barrier implements Obstacle{
    private int height;
    public Barrier(int height) {
        this.height = height;
    }

    public boolean passBy(Member member) {
        return member.jump(this.height);
    }
}
