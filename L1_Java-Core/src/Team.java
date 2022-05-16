public class Team {
    protected Member[] members;


    public Team(Member member1, Member member2, Member member3, Member member4) {
        this.members = new Member[] {member1, member2, member3, member4};
    }

    public void showInfo() {
        for(Member member: this.members) {
            member.showInfo();
        }
    }


    public void showResults() {
        System.out.println("Дистанцию прошли:");
        for(Member member: this.members) {
            if(member.isDistancePassed) {
                System.out.println(member.name);
            }
        }
    }
}
