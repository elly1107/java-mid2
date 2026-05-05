package collection.compare.test;

public enum Suit {
    SPADE("♠︎"),
    HEART("♥︎"),
    DIAMOND("⬥"),
    CLUB("♣︎")
    //Enum은 위 순서대로 순서를 정한다. 심지어 final이기 때문에 여기서 끝남.
    ;


    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
