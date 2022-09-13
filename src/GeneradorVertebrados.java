public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camello13", "Mamifero55"); 
        miVertebrados[1] = new Vertebrado("Vaca15", "Mamifero26");
        miVertebrados[2] = new Vertebrado("Tiburón32", "Pez30"); 
        
        return miVertebrados;
    }
}
