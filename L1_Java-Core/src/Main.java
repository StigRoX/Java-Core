public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[] {
                new Barrier(20),
                new Barrier(50),
                new Barrier(40),
                new Pool(100),
                new Barrier(60),
                new Pool(150)
        };

        Course course = new Course(obstacles);

        Team team = new Team(
                new Member("Андрей", 160, 55),
                new Member("Борис", 90, 70),
                new Member("Василий", 200, 80),
                new Member("Геннадий", 170, 65)
        );
        team.showInfo();
        System.out.println();
        course.pass(team);
        team.showResults();
    }
}
