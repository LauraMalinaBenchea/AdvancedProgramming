public class Main {

    public static void doStuff(){
        int size = 5;

        //creez obiecte de tip Source si le introduc intr-un vector, folosit la afisarea informatiilor
        Source[] suppliers = new Source[size];
        Destination[] demanded = new Destination[size];
        Source S1 = new Source("S1");
        suppliers[0] = S1;
        Source S2 = new Source("S2");
        suppliers[1] = S2;
        Source S3 = new Source("S3");
        suppliers[2] = S3;

        //creez obiecte de tip Destination si le introduc intr-un vector, folosit la afisarea informatiilor
        Destination D1 = new Destination("D1");
        demanded[0] = D1;
        Destination D2 = new Destination("D2");
        demanded[1] = D2;
        Destination D3 = new Destination("D3");
        demanded[2] = D3;

        //ofer tipurile necesare obiectelor de tip Source
        S1.type = Source.SourceType.WAREHOUSE;
        S2.type = Source.SourceType.FACTORY;
        S3.type = Source.SourceType.FACTORY;
        Problem P1 = new Problem(size);

        //initializez matricea cu informatii, si vectorii cerere si oferta
        String[][] matrice = new String[size][size];

        //efectuez operatiile necesare
        P1.fillMatrixGiven(matrice, size, suppliers, demanded);
        P1.printMatrix(matrice, size);
    }

    public static void main(String[] args){
        doStuff();

    }
}
