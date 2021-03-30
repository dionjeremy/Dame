package dame.pages.Resultats;

import java.net.URL;
//import java.util.Observable;
import java.util.ResourceBundle;

import dame.commandes.fermer_resultats.FermerResultats;
import dame.commandes.fermer_resultats.FermerResultatsPourEnvoi;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.SelectionMode;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import ntro.commandes.FabriqueCommande;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.Vue;

public class VueResultats implements Vue, Initializable {

	private FermerResultatsPourEnvoi fermerResultats;
	@FXML
	private Text donnees;
	@FXML
	private Button quitter;
//	private ObservableList<ObservableList> data;
//	private TableView tableView;
//	private TableColumn username;
//	private TableColumn results;
//	private TableColumn nbMove;
//	private TableColumn ptsPartie;
//	private TableColumn ptsTotal;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		DoitEtre.nonNul(quitter);

	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		quitter.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				fermerResultats.envoyerCommande();
				
			}
		});
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		fermerResultats = FabriqueCommande.obtenirCommandePourEnvoi(FermerResultats.class);
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);

	}

	public void rafraichirligne(String nomUsager, String resultat, int nbMouve, int ptsPart, int ptsTt) {
//				ObservableList<String> list = FXCollections.observableArrayList();
//				list.add(nomUsager);
//				list.add(resultat);
//				data.add(list);
		donnees.setText("\n" + nomUsager + "\t" + resultat + "\t\t\t" + nbMouve + "\t\t\t\t" + ptsPart + "\t\t\t"
				+ ptsTt + "\n");

	}
}