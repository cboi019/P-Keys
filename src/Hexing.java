public class Hexing {
    public static String GetHex(byte[] bytes){
        try{
            StringBuilder hex = new StringBuilder();
            for (byte b: bytes){
                hex.append(String.format("%02x", b));
            }
            return hex.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
