package seedu.address.ui;

import static java.util.Objects.requireNonNull;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;

/**
 * A ui for the status bar that is displayed at the header of the application.
 */
public class ResultDisplay extends UiPart<Region> {

    private static final String FXML = "ResultDisplay.fxml";

    @FXML
    private TextArea resultDisplay;

    @FXML
    private StackPane placeHolder;

    public ResultDisplay() {
        super(FXML);
    }

    public void setFeedbackToUser(String feedbackToUser) {
        requireNonNull(feedbackToUser);
        resultDisplay.setText(feedbackToUser);
        placeHolder.getStyleClass().remove("exit-message");
    }

    /**
     * Displays the exit message in a green box.
     * This is specific to the ExitCommand.
     */
    public void setExitMessage(String message) {
        requireNonNull(message);
        resultDisplay.setText(message);

        if (!placeHolder.getStyleClass().contains("exit-message")) {
            placeHolder.getStyleClass().add("exit-message");
        }
    }
}
