package com.lixiang;

public class FacadePattern {
    public static void main(String[] args) {
        String prove = new ZhengWuDaTing().prove();
        System.out.println(prove);
    }
}

class JieDaoBan {
    public String prove() {
        return "街道办";
    }
}


class DanWei {
    public String prove() {
        return "单位";
    }
}


class PaiChuSuo {
    public String prove() {
        return "派出所";
    }
}


class ZhengWuDaTing {
    PaiChuSuo paiChuSuo = new PaiChuSuo();
    JieDaoBan jieDaoBan = new JieDaoBan();
    DanWei danWei = new DanWei();
    public String prove() {
        return paiChuSuo.prove() + " + " + jieDaoBan.prove() + " + " + danWei.prove();
    }
}
