package br.com.claudiobs07.bookpub;

import br.com.claudiobs07.bookpub.command.BookCountRunner;
import br.com.claudiobs07.bookpub.command.StartupRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookpubApplication {

    @Bean
    public StartupRunner schedulerRunner() {
	return new StartupRunner();
    }

    @Bean
    public BookCountRunner counterRunner() {
	return new BookCountRunner();
    }

    public static void main(String[] args) {
	    SpringApplication.run(BookpubApplication.class, args);
    }
}
