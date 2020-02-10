import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;
    private Printer printerWithoutToner;

    @Before
    public void before() {
        printer = new Printer(10, 10);
        printerWithoutToner = new Printer(10, 0);
    }

    @Test
    public void printer_starts_with_paper(){
        assertEquals(10, printer.getPagesLeft());
    }

    @Test
    public void printerHasEnoughPaper(){
        assertEquals(true, printer.hasEnoughPaper(5));
    }

    @Test
    public void can_print__enough_paper_and_toner(){
        printer.print(2, 2);
        assertEquals(6, printer.getPagesLeft());
    }

    @Test
    public void cannot_print__missing_paper(){
        printer.print(6, 3);
        assertEquals(10, printer.getPagesLeft());
    }

    @Test
    public void cannot_print__missing_toner(){
        printerWithoutToner.print(6, 1);
        assertEquals(10, printerWithoutToner.getPagesLeft());
    }

    @Test
    public void cannot_print__missing_paper_and_toner(){
        printer.print(6, 3);
        assertEquals(10, printer.getPagesLeft());
    }
}
