package strategy;

class Navigator {
    private RouteStrategy rs;

    void setRouteStrategy(RouteStrategy rs) {
        this.rs = rs;
    }

    void buildRoute(String A, String B) {
        rs.buildRoute(A, B);
    }
}

public class NavApp {
    public static void main(String[] args) {
        Navigator nav = new Navigator();
        nav.setRouteStrategy(new Walking());

        nav.buildRoute("A", "B");
    }
}
