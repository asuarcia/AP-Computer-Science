public class sixsendy {
    public static void main(String[] args) {
        String stopTalking = "I'm not sure what is happening";

        System.out.println(stopTalking.length());
        System.out.println(stopTalking.substring(7));
        System.out.println(stopTalking.substring(20));

        System.out.println(stopTalking.substring(7, 21));
        System.out.println(stopTalking.substring(7).length());
        System.out.println(stopTalking.substring(7, 21).length());

        System.out.println(stopTalking.charAt(6));
        System.out.println(stopTalking.indexOf("not"));
        System.out.println(stopTalking.lastIndexOf("not"));
        System.out.println(stopTalking.substirng(stopTalking.IndexOf("t")+1));


    }
}
