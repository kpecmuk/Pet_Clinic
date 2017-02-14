package ru.kpecmuk.clinic.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;

/**
 * @since 14.02.2017
 */
public class Validator implements Closeable {
    private static final Logger LOG = LoggerFactory.getLogger(Validator.class);
    private final IO io;


    public Validator(final IO io) {
        this.io = io;
    }

    public boolean compare(final String msg, final String answer) {
        System.out.print(msg);
        return answer.equals(io.read());
    }

    public int getInt(String message) {
        boolean invalid;
        do {
            try {
                System.out.print(message);
                return Integer.valueOf(io.read());
            } catch (NumberFormatException n) {
                invalid = true;
                System.out.println("Error read of int, Please enter new one.");
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    public double getDouble(String message) {
        boolean invalid = false;
        do {
            try {
                this.io.println(message);
                return Double.valueOf(this.io.read());
            } catch (NumberFormatException n) {
                n.printStackTrace();
                LOG.error("Convert number error", n);
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    public String getString(String message) {
        System.out.print(message);
        return this.io.read();
    }

    public int getIntFromList(final String msg, final Collection<Integer> keys) {
        boolean invalid;
        do {
            try {
                System.out.print(msg);
                final int result = Integer.valueOf(io.read());
                if (keys.contains(result)) {
                    return result;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException n) {
                invalid = true;
                System.out.println("Error read of int, Please enter new one.");
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() throws IOException {
    }
}
