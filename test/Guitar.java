import java.lang.System;


public class Guitar {
    public enum Type {
        ACOUSTIC, ELECTRIC;
        public String toString() {
            switch(this) {
                case ACOUSTIC: return "ac";
                case ELECTRIC: return "el";
                default: return "un";
            }
        }
    }
    private String sno, model;
    private Type type;
    public Guitar (String sno, Type type, String model) {
        this.sno = sno;
        this.model = model;
        this.type = type;
    }
    public String getSno() {
        return this.sno;
    }
    public String getType() {
        return this.type.toString();
    }
    public static void main(String[] args) {
        Guitar g = new Guitar("1", Type.ACOUSTIC, "top");
        System.out.println(g.getSno() + " " + g.getType());
    }
}
