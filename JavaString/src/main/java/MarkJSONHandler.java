public class MarkJSONHandler extends JSONHandler {

    MarkJSONHandler(String filename) {
        super(filename);
    }

    public Mark[] getMarks (String[][] marksData) {
        Mark[] marks = new Mark[marksData.length];

        for (int i = 0; i < marksData.length; i++) {
            String surname = marksData[i][0];
            String mark = marksData[i][1];
            String subj = marksData[i][2];

            marks[i] = new Mark(surname, mark, subj);
        }

        return marks;
    }
}
