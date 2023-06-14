public class Mark {
    private String _surname;
    private String _mark;
    private String _subject;

    Mark(String surname, String mark, String subject) {
        this._surname = surname;
        this._mark = mark;
        this._subject = subject;
    }

    @Override
    public String toString() {
        return "Студент " + this._surname + " получил " + this._mark + " по предмету " + this._subject;
    }
}
