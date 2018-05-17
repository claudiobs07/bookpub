package br.com.claudiobs07.bookpub.command;

import br.com.claudiobs07.bookpub.repository.BookRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class BookCountRunner implements CommandLineRunner {

    private final Log logger = LogFactory.getLog(getClass());

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Number of books: " + bookRepository.count());
    }
}
