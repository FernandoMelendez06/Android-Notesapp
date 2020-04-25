package notes.model;

public class Note {
    private String tittle;
    private String body;

    public Note(String tittle, String body) {
        this.tittle = tittle;
        this.body = body;
    }

    public String getTittle() {
        return tittle;
    }

    public String getBody() {
        return body;
    }
}
