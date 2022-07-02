package homework.bracechecker;

public class BraceChecker {

    private String text;


    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack st = new Stack();
//
        for (int i = 0; i < text.length(); i++) {
//
            switch (text.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    st.push(text.charAt(i));
                    break;

                case ')':
                    char value = (char) st.pop();
                    if (value != '(') {
                        System.out.println("error: " + i + " closed " + text.charAt(i) + " but opened " + value);
                    }
                    break;
                case ']':
                    char value1 = (char) st.pop();
                    if (value1 != '{') {
                        System.out.println("error: " + i + " closed " + text.charAt(i) + " but opened " + value1);
                    }
                    break;
                case '}':
                    char value2 = (char) st.pop();
                    if (value2 != '[') {
                        System.out.println("error: " + i + " closed " + text.charAt(i) + " but opened " + value2);
                    }
                    break;
                default:
            }
            char last;
            while ((last = (char) st.pop()) != 0) {
                System.out.println("error: Opend " + last + " but Not closed");
            }


//                    }
        }
    }
}







