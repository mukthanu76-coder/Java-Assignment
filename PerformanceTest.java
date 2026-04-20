package StringOpe;
public class PerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        // Test for StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuffer.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        // Test for StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        // Output Results
        System.out.println("StringBuffer Time: " + timeBuffer + " ns");
        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

        // Final Strings Length (just to verify)
        System.out.println("Length using StringBuffer: " + sbuffer.length());
        System.out.println("Length using StringBuilder: " + sbuilder.length());
    }
}