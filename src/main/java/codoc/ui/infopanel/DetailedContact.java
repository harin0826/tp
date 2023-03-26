package codoc.ui.infopanel;

import codoc.logic.commands.exceptions.CommandException;
import codoc.logic.parser.exceptions.ParseException;
import codoc.model.person.Person;
import codoc.ui.MainWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * DetailedContact controller for showing contact details at DetailedInfoPanel.
 */
public class DetailedContact extends DetailedInfo {

    private static final String FXML = "DetailedContact.fxml";

    @FXML
    private Label github;

    @FXML
    private Label email;

    @FXML
    private Label linkedin;

    private Person protagonist;

    /**
     * Creates a {@code DetailedContact} tab with the given {@code protagonist}.
     */
    public DetailedContact(Person protagonist) {
        super(FXML);
        this.protagonist = protagonist;
        github.setText(protagonist.getGithub().value);
        email.setText(protagonist.getEmail().value);
        linkedin.setText(protagonist.getLinkedin().value);
    }

}
