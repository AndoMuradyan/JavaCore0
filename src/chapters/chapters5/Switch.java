package chapters.chapters5;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "zima";
                break;
            case 3:
            case 4:
            case 5:
                season = "vesna";
                break;
            case 6:
            case 7:
            case 8:
                season = "leta";
                break;
            case 9:
            case 10:
            case 11:
                season = "osen";
                break;
            default:
                season = " вЬ1МЫ1ПЛенным мес яцам";
        }
        System.out.println("Aпpeль относится к" + season + ".");
    }
}
