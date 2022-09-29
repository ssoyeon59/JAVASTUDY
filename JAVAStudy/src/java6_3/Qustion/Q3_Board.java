package java6_3.Qustion;

public class Q3_Board {
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

    Q3_Board(String title, String content) {
        this(title, content, "로그인한 회원 아이디", "현재 컴퓨터 날짜", 0);
        /*this.title = title;
        this.content = content;
        this.writer = "로그인한 회원 아이디";
        this.date = "현재 컴퓨터 날짜";
        this.hitcount = 0; */
    }

    Q3_Board(String title, String content, String writer) {
        this(title, content, writer, "현재 컴퓨터 날짜", 0);
        /*this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = "현재 컴퓨터 날짜";
        this.hitcount = 0;*/
    }

    Q3_Board(String title, String content, String writer, String date) {
        this(title, content, writer, date, 0);
       /* this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = 0;*/
    }

    Q3_Board(String title, String content, String writer, String date, int hitcount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }
}
