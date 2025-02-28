package lab.tpo;

import lab.tpo.text.Body;
import lab.tpo.text.Fingers;
import lab.tpo.text.Kilobac;

public class Main {
    public static void main(String[] args) {
        Fingers fingers = new Fingers();
        Kilobac kilobac = new Kilobac();
        Body body = new Body(fingers, kilobac);

        body.approach();
        body.getFingers().curl();
        body.getKilobac().hold();
    }}