public class Printer {
    private int pagesLeft;
    private int toner;

    public Printer(int pagesLeft, int toner){
        this.pagesLeft = pagesLeft;
        this.toner = toner;
    }

    public int getPagesLeft(){
        return this.pagesLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public boolean hasEnoughPaper(int numberOfPagesToPrint){
        return this.pagesLeft >= numberOfPagesToPrint;
    }

    public boolean hasEnoughToner(int tonerNeeded){
        return this.toner > tonerNeeded;
    }

    public void print(int pages, int copies){
        int pagesToPrint = pages * copies;
        int tonerNeeded = pagesToPrint;
        //The above helps document, but should I just use pagesToPrint for both?

        if (hasEnoughPaper(pagesToPrint) && hasEnoughToner(tonerNeeded)){
            this.pagesLeft -= pagesToPrint;
            this.toner -= tonerNeeded;
        }
    }

}
