
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class test_some_code {

    public static void main(String[] args) {

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get("file.txt"))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] wordListOne = {"24/7","multiTier","30,000 foot","B-to-B","win-win","frontend", "web-based","pervasive", "smart", "sixsigma","critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", 
"value-added", "oriented", "centric", "distributed", 
"clustered", "branded","outside-the-box", "positioned", 
"networked", "focused", "leveraged", "aligned", 
"targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency", 
"strategy", "mindshare", "portal", "space", "vision", 
"paradigm", "mission"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        System.out.println(Math.random());
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}