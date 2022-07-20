package sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(Slf4jTest.class);

        // 记录info，传入参数 
        logger.info("abc {} {} {}","2022","22222", "7月");
        logger.trace("trace");
        logger.debug("debug");
        logger.error("error");
        logger.warn("warn");
    }
}
