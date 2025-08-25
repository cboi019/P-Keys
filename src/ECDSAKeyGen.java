import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;


public class ECDSAKeyGen {
    public static KeyPair GenKeyPair(String input) {
        try {
            Security.addProvider(new BouncyCastleProvider());

            KeyPairGenerator GenKey = KeyPairGenerator.getInstance("ECDSA", "BC");
            ECGenParameterSpec spec = new ECGenParameterSpec("secp256k1");
            GenKey.initialize(spec, new SecureRandom());

            return GenKey.generateKeyPair();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
