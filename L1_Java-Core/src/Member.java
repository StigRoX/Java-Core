public class Member {
    protected String name;
    private int swimDistance;
    private int jumpHeight;

    protected boolean isDistancePassed;

    public Member(String name, int swimDistance, int jumpHeight) {
        this.name = name;
        this.swimDistance = swimDistance;
        this.isDistancePassed = false;
        this.jumpHeight = jumpHeight;
    }

    public void passDistance() {
        this.isDistancePassed = true;
    }

    public boolean jump(int height) {
        return this.jumpHeight >= height;
    }

    public boolean swim(int distance) {
        return this.swimDistance >= distance;
    }


    public void showInfo() {
        System.out.println("Имя: " + this.name +
                "\nДистанция плавания: " + this.swimDistance +
                "\nВысота прыжка: " + this.jumpHeight);
    }
}
