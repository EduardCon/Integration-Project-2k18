package ApplicationLayer;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;

public class TUI {

    private static Client client;

    public static void main(String[] args) throws IOException, NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidParameterSpecException {
        client=new Client("Eduard C ");
        client.connect();

        //client.sendToProceessingLayer("Test", 54323);
        //client.sendToProceessingLayer("Test 2", 54323);

    }
}
