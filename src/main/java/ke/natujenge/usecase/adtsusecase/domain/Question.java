package ke.natujenge.usecase.adtsusecase.domain;

public class Question {
    private String studentEmail;

    private String question;

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "studentEmail='" + studentEmail + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
