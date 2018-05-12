public class Audience {
    // 表演之前
    public void takeSeats() {
        System.out.println("aop:before The audience is taking their seats.");
    }

    // 表演之前
    public void turnOffCellPhones() {
        System.out.println("aop:before The audience is turning off their cellphones");
    }

    // 表演之后
    public void applaud() {
        System.out.println("aop:after-returning CLAP CLAP CLAP CLAP CLAP");
    }

    // 表演失败之后
    public void demandRefund() { // <co id="co_demandRefund"/>
        System.out.println("aop:after-throwing Boo! We want our money back!");
    }
}