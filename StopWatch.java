
/**
 * Write a description of class Stopwatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StopWatch {
    
          private static long startTime = 0;
          private static long stopTime = 0;
          private static boolean running = false;
        
          public static void start() {
            startTime = System.currentTimeMillis();
            running = true;
          }
        
        
          public static void stop() {
            stopTime = System.currentTimeMillis();
            running = false;
          }
        
        
          //elaspsed time in milliseconds
          public String getElapsedTime() {
            long elapsed;
            String elapsed2;
            if (running) {
              elapsed = (System.currentTimeMillis() - startTime);
            } else {
              elapsed = (stopTime - startTime);
            }
            elapsed2 = String.valueOf(elapsed/1000) + "s";
        return elapsed2;
      }
    }
