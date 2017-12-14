
import java.util.Date;

import data.agence.Agence;
import data.agence.Mandat;
import data.agence.Notaire;
import data.agence.Promesse;
import data.immo.Appartement;
import data.immo.Maison;
import data.immo.Terrain;
import data.pub.AnnoncePub;
import data.pub.TypeHtml;
import data.pub.TypeImg;
import data.pub.TypeTexte;
import data.pub.TypeVid;
import data.user.Entreprise;
import data.user.Envie;
import data.user.Personne;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.fxml.*;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
        Parent root = FXMLLoader.load(getClass().getResource("view/IHM.fxml"));
        primaryStage.setTitle("Timmo");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        
        System.out.println("Let's do some testing");
        
        // user
        
        Personne personne1 = new Personne("Michel", "20 Place du Riverain", "0612345678", "michel@gmail.com");
        
        Entreprise entreprise1 = new Entreprise("Eclipse", "3 Av du Sol", "0512345678", "eclipse@gmail.com",
        		"juridique", "12345678");
        
        Envie envie1 = new Envie("Maison", 125000.0, "Toulouse", null, 3);

        // immo
        
        Terrain terrain1 = new Terrain(15622, "2 Chemin de l'impair", "N-O", 3.43, new Date(20171122),
        		240.0, 12.0);
        
        Maison maison1 = new Maison(15623, "3 Chemin de l'impair", "N-O", 3.43, new Date(20171122),
        		240.0, 6, 2, "Charbon");
        
        Appartement appartement1 = new Appartement(15624, "4 Chemin de l'impair", "N-O", 3.43, new Date(20171122),
        		6, 3, 450.0);
        
        // pub
        
        AnnoncePub annoncePub1 = new AnnoncePub();
        
        TypeTexte typeTexte1 = new TypeTexte("Salut je suis un texte long");
        
        TypeHtml typeHtml1 = new TypeHtml("https://www.google.fr/");
        
        TypeImg typeImg1 = new TypeImg("https://pbs.twimg.com/media/Cs7BtAGXEAAqKJK.jpg");
        
        TypeVid typeVid1 = new TypeVid("https://youtu.be/2-8gsWZqDBM");
        
        // agence
        
        Mandat mandat1 = new Mandat(20.0, new Date(20171122), new Date(20171101), new Date(20171131),
        		maison1, entreprise1);
        
        Notaire notaire1 = new Notaire();
        
        Promesse promesse1 = new Promesse(12.0, "5 All�e de la Cigue", new Date(20171122), 3.69, 14.1,
        		terrain1 ,personne1, notaire1);
        
        Agence agence1 = new Agence("Timmo");
        
        System.out.println("Start APP");
        
        launch(args);
        
    }

}
