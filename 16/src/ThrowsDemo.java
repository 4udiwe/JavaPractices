public class ThrowsDemo {
    public void getDetails(String key) {
        try{
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
            System.out.println("key is not equal null");
        }catch (NullPointerException e){
            System.out.println("NPE found: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        String str = null;
        throwsDemo.getDetails(str);
        throwsDemo.getDetails("str");
    }
}
