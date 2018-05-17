package br.com.claudiobs07.bookpub.command;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;

public class StartupRunner implements CommandLineRunner {

    private final Log logger = LogFactory.getLog(getClass());

    @Override
    public void run(String... args) throws Exception {
        logger.info("Hello");
    }
}
