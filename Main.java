public class Main {
    public static void main(String[] args) {
        int startRange1 = 0;
        int endRange1 = 599;
        int startRange2 = 700;
        int endRange2 = 999;

        String baseFilename = "blk";
        String extension = ".enc";

        for (int i = startRange1; i <= endRange1; i++) {
            String currentFilename = baseFilename + String.format("%05d", i) + extension;
            String command = "openssl enc -aes-256-cbc -salt -in /home/blockchainnccs/blockchain-parser/result/" + currentFilename + " -out " + currentFilename + " -k \"12345678900987654321aquickbrownfoxjumpedoveralazydog12345678900987654321\"";
            System.out.println(command);
        }

        for (int i = startRange2; i <= endRange2; i++) {
            String currentFilename = baseFilename + String.format("%05d", i) + extension;
            String command = "openssl enc -aes-256-cbc -salt -in /home/blockchainnccs/blockchain-parser/result/" + currentFilename + " -out " + currentFilename + " -k \"12345678900987654321aquickbrownfoxjumpedoveralazydog12345678900987654321\"";
            System.out.println(command);
        }
    }
}

