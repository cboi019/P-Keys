import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlockChain {
    public static void main(String[] args) {
        try{
            List<Block> block = new ArrayList<>();

            // Creating New Wallet

            String name = "Okoronkwo Charles";
            String  age = "23";
            String wallet = "BITCOIN WALLET";
            Date date = new Date(System.currentTimeMillis());

            String user = name + age + wallet;
            System.out.println("....Account Information....");
            System.out.println("Date Created: " + date);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Wallet: " + wallet);
            System.out.println("~~~~~~~");
            System.out.println("|ENTER|");
            System.out.println("~~~~~~~");
            System.out.println("Wallet Created Successfully!!!");
            System.out.println("=================================");

            KeyPair keyPair = ECDSAKeyGen.GenKeyPair(user);
            PrivateKey Sk = keyPair.getPrivate();
            PublicKey Pk = keyPair.getPublic();
            String SkHex = Hexing.GetHex(Sk.getEncoded());
            String PkHex = Hexing.GetHex(Pk.getEncoded());

            System.out.println("Private Key: " + SkHex.substring(0, 8) + "...." + SkHex.substring(SkHex.length() - 8) + " || " + " (DO NOT SHARE!!!)");
            System.out.println("Public Key: " + PkHex.substring(0, 8) + "...." + PkHex.substring(PkHex.length() - 8));
            System.out.println("=================================");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
