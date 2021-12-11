public class Student {
    private int Id;
    private String Name;
    private int Score;

    public Student(int Id, String Name, int Score) {
        setId(Id);
        setName(Name);
        setScore(Score);
    }

    public int getId() { return Id; }

    public void setId(int id) { Id = id; }

    public int getScore() { return Score; }

    public void setScore(int score) { Score = score; }

    public String getName() { return Name; }

    public void setName(String name) { Name = name; }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
