package Helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {

    // I created this LoggerHelper page for practicing purposes to see how it works here. However, i did not know how to configure it.
        private static boolean root = false;

        public static Logger getLogger(Class cls) {
            if (root) {
                return Logger.getLogger(cls);
            }
            PropertyConfigurator.configure("log4j.properties");
            root = true;
            return Logger.getLogger(cls);
        }
        public static void main(String[] args) {
            Logger log = LoggerHelper.getLogger(LoggerHelper.class);
            log.info("I am Groot");
            log.info("55555");
            log.info("!!!!!!");
        }

    }

