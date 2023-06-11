package org.example.entity;

public class ShareholderBrand {
    private int ids;
    private int isB;

    public ShareholderBrand(int ids, int isB) {
        this.ids = ids;
        this.isB = isB;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public int getIsB() {
        return isB;
    }

    public void setIsB(int isB) {
        this.isB = isB;
    }
}
