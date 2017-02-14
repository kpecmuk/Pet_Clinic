package ru.kpecmuk.clinic.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @since 14.02.2017
 */
public class ConsoleIO implements IO {
    private static final Logger log = LoggerFactory.getLogger(ConsoleIO.class);
    private final Scanner scanner;
    private final PrintStream out;

    public ConsoleIO(final Scanner scanner, final PrintStream out) {
        this.scanner = scanner;
        this.out = out;
    }

    @Override
    public void println(Object value) {
        this.out.println(value);
    }

    @Override
    public String read() {
        return this.scanner.next();
    }
}
