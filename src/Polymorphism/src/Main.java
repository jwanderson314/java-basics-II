public class Main {
    public static void main(String[] args) {
        TypeofSport x = new Hockey("NHL");
        TypeofSport y = new Football("NFL");

        System.out.println(x.getLeader());
        System.out.println(y.getLeader());
    }
}