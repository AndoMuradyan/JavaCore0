package chapters.chapters8;

public class PassObjRe {
    int a, b;

    PassObjRe(int i, int j) {
        a = i;
        b = j;
    }

    void meth(PassObjRe p) {
        p.a *= 2;
        p.b /= 2;
    }
}
