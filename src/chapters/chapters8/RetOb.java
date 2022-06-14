package chapters.chapters8;

public class RetOb {
    int a;
    RetOb(int i){
        a=i;
    }
    RetOb incrByTen(){
        RetOb ro =new RetOb(a+10);
        return ro;
    }
}
