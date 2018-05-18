package br.com.claudiobs07.bookpub;

import br.com.claudiobs07.bookpub.command.StartupRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BookpubApplication {

    @Bean
    public StartupRunner schedulerRunner() {
	return new StartupRunner();
    }

    public static void main(String[] args) {
	    SpringApplication.run(BookpubApplication.class, args);
    }
}
