public class practice1 {

    public void m1() throws Exception1 {
        throw new Exception1("Exception1");
    }
    public void m2() throws Exception2 {
        throw new Exception2("Exception2");
    }

    public void m() throws Exception {
        try {

            m3();
        } catch (Exception1 e) {
            throw new Exception(e);
        }
    }
    public void m3() throws Exception3 {
        throw new Exception3("Exception3");
    }
    public static void main(String[] args) {
        practice1 p = new practice1();

        try {
            p.m();
        } catch (Exception ex) {

            Throwable e = ex.getCause();

           if (e instanceof Exception3) {
                System.out.println( " handled exception3");
            } else {
                System.out.println("else condition");
            }
        }

    }
}
