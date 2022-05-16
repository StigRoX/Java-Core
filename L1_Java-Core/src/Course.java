public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void pass(Team team) {
        for(Member member: team.members) {
            boolean passed = true;
            for(Obstacle obstacle: this.obstacles) {
                if(!obstacle.passBy(member)) {
                    passed = false;
                }
            }
            if(passed) {
                member.passDistance();
            }
        }
    }
}
