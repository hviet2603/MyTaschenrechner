package operator;

import static java.lang.Float.NaN;

public class operator {

    public float temp;
    public float oprd1 = 0;
    public float oprd2 = 0;
    public String token = "";

    public operator() {
        temp = 0;
    }

    public void execute(float x) {
        if ( (token.length() != 0) && (token.charAt(token.length()-1) == '+')) {
            this.add(x);
        }
        else if ( token.length() != 0 && token.charAt(token.length()-1) == '-') {
            this.sub(x);
        }
        else if ( token.length() != 0 && token.charAt(token.length()-1) == 'x') {
            this.mul(x);
        }
        else if ( token.length() != 0 && token.charAt(token.length()-1) == ':') {
            this.div(x);
        } else {
            temp = x;
            oprd1 = x;
            oprd2 = 0;
        }
    }

    public void add(float x) {
         oprd2 = x;
         temp = oprd1 + oprd2;
         oprd1 = temp;
         oprd2 = 0;
    }

    public void sub(float x) {
        oprd2 = x;
        temp = oprd1 - oprd2;
        oprd1 = temp;
        oprd2 = 0;
    }

    public void mul(float x) {
        oprd2 = x;
        temp = oprd1 * oprd2;
        oprd1 = temp;
        oprd2 = NaN;
    }

    public void div(float x) {
        oprd2 = x;
        temp = oprd1 / oprd2;
        oprd1 = temp;
        oprd2 = 0;
    }
}
