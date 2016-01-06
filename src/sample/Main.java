package sample;




import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import static javafx.stage.Modality.WINDOW_MODAL;
import javafx.stage.Stage;
import static javax.swing.SwingConstants.NORTH;

/**
 *
 * @author jackill
 */
public class MyScene extends Application {
    TextField TextTarget;
    Label labelOpisanie;
    TextArea TextOpisanie;
    Label labelDate;
    DatePicker date;
    Label labelCategory;
    ListView<String> categoryList;
    Button buttonPlusCategory;
    Button buttonEnter;
    Button buttonStory;
    CheckBox checkBox1;
    Label labelcheckBox1;
    CheckBox checkBox2;
    Label labelcheckBox2;
    CheckBox checkBox3;
    Label labelcheckBox3;
    CheckBox checkBox4;
    Label labelcheckBox4;
    CheckBox checkBox5;
    Label labelcheckBox5;
    CheckBox checkBox6;
    Label labelcheckBox6;
    RadioButton radioSelectionDate;
    RadioButton radioSelectionName;
    ToggleGroup group;
    Label labelradioSelectionDate;
    Label labelradioSelectionName;
    Button buttonDelete;
    Label HistoryZapisey;
    Separator separatorOfSides;
    Separator separatorOfcategory;
    Separator separatorOfcategory1;
    Separator separatorOfcategory2;
    
    @Override
    public void start(Stage primaryStage) {
      
        
        Pane root = new Pane();
        Label labelName = new Label("Название");
        labelName.setTranslateX(20);
        labelName.setTranslateY(20);
        root.getChildren().add(labelName);
        boolean resizable;
        resizable = root.isResizable();
        TextTarget = new TextField();
        TextTarget.setPromptText("Введите тему");
        TextTarget.setStyle(" -fx-background-color:#ffefd5;"
                + "-fx-border-width:1pt;-fx-font-weight:bold;"
                + "-fx-border-color:#cd853f;");
        TextTarget.setTranslateX(20);
        TextTarget.setTranslateY(40);  
        TextTarget.setPrefSize(300, 20);
        
        TextTarget.setTooltip(new Tooltip("Напишите свои цели"));
        root.getChildren().add(TextTarget);
        
        labelOpisanie = new Label("Описание");
        labelOpisanie.setTranslateX(20);
        labelOpisanie.setTranslateY(80);
        root.getChildren().add(labelOpisanie);
        
        TextOpisanie = new TextArea();
        TextOpisanie.setPromptText("Введите текст");
        TextOpisanie.setTranslateX(20);
        TextOpisanie.setTranslateY(100);  
        TextOpisanie.setStyle(" -fx-background-color:#ffefd5;"
                + "-fx-border-width:1pt;"
                + "-fx-border-color:#cd853f;");
        TextOpisanie.setWrapText(true);
        TextOpisanie.setEditable(true);
        TextOpisanie.setPrefSize(300, 150);
        TextOpisanie.positionCaret(NORTH);
        root.getChildren().add(TextOpisanie);
        
        labelDate = new Label("Дата");
        labelDate.setTranslateX(20);
        labelDate.setTranslateY(260);
        root.getChildren().add(labelDate);
        
        date = new DatePicker();
        date.setTranslateX(20);
        date.setTranslateY(280);
        root.getChildren().add(date);
        
        labelCategory = new Label("Категория");
        labelCategory.setTranslateX(20);
        labelCategory.setTranslateY(330);
        root.getChildren().add(labelCategory);
        
        
        categoryList = new ListView<>();
        ObservableList<String> itemCategoryList = FXCollections.observableArrayList(
                "Учеба", "Путешествия", "Работа", "Развлечения","Хобби", "Другое");
        categoryList.setItems(itemCategoryList);
        categoryList.setPrefSize(300, 50);
        categoryList.setTranslateX(20);
        categoryList.setTranslateY(350);
        categoryList.cellFactoryProperty();
        root.getChildren().add(categoryList);
        
        buttonPlusCategory = new Button("+");
        buttonPlusCategory.setTranslateX(290);
        buttonPlusCategory.setTranslateY(315);
        buttonPlusCategory.setPrefSize(30, 30);
        root.getChildren().add(buttonPlusCategory);
        
        buttonEnter = new Button("Записать");
        buttonEnter.setTranslateX(20);
        buttonEnter.setTranslateY(420);
        buttonEnter.setPrefSize(140, 30);
        root.getChildren().add(buttonEnter);  
       
        buttonStory = new Button("История");
        buttonStory.setTranslateX(180);
        buttonStory.setTranslateY(420);
        buttonStory.setPrefSize(140, 30);
        root.getChildren().add(buttonStory);
        
        buttonStory.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
    
        
        checkBox1 = new CheckBox();
        checkBox1.setTranslateX(360);
        checkBox1.setTranslateY(260);
        root.getChildren().add(checkBox1);
        
        labelcheckBox1 = new Label("Учеба");
        labelcheckBox1.setTranslateX(380);
        labelcheckBox1.setTranslateY(260);
        root.getChildren().add(labelcheckBox1);
        
        checkBox2 = new CheckBox();
        checkBox2.setTranslateX(360);
        checkBox2.setTranslateY(290);
        root.getChildren().add(checkBox2);
        
        labelcheckBox2 = new Label("Путешествия");
        labelcheckBox2.setTranslateX(380);
        labelcheckBox2.setTranslateY(290);
        root.getChildren().add(labelcheckBox2);
        
        checkBox3 = new CheckBox();
        checkBox3.setTranslateX(360);
        checkBox3.setTranslateY(320);
        root.getChildren().add(checkBox3);
        
        labelcheckBox3 = new Label("Работа");
        labelcheckBox3.setTranslateX(380);
        labelcheckBox3.setTranslateY(320);
        root.getChildren().add(labelcheckBox3);
        
        checkBox4 = new CheckBox();
        checkBox4.setTranslateX(360);
        checkBox4.setTranslateY(350);
        root.getChildren().add(checkBox4);
        
        labelcheckBox4 = new Label("Развлечение");
        labelcheckBox4.setTranslateX(380);
        labelcheckBox4.setTranslateY(350);
        root.getChildren().add(labelcheckBox4);
        
        checkBox5 = new CheckBox();
        checkBox5.setTranslateX(360);
        checkBox5.setTranslateY(380);
        root.getChildren().add(checkBox5);
        
        labelcheckBox5 = new Label("Хобби");
        labelcheckBox5.setTranslateX(380);
        labelcheckBox5.setTranslateY(380);
        root.getChildren().add(labelcheckBox5);
        
        checkBox6 = new CheckBox();
        checkBox6.setTranslateX(360);
        checkBox6.setTranslateY(410);
        root.getChildren().add(checkBox6);
        
        labelcheckBox6 = new Label("Другое");
        labelcheckBox6.setTranslateX(380);
        labelcheckBox6.setTranslateY(410);
        root.getChildren().add(labelcheckBox6);
        
        
        radioSelectionDate = new RadioButton();
        radioSelectionDate.setCursor(Cursor.CLOSED_HAND);
        radioSelectionDate.setTranslateX(500);
        radioSelectionDate.setTranslateY(260);
        root.getChildren().add(radioSelectionDate);
        
        radioSelectionName = new RadioButton();
        radioSelectionName.setCursor(Cursor.CLOSED_HAND);
        radioSelectionName.setTranslateX(500);
        radioSelectionName.setTranslateY(290);
        root.getChildren().add(radioSelectionName);
        
        group = new ToggleGroup();
        radioSelectionDate.setToggleGroup(group);
        radioSelectionName.setToggleGroup(group);
        
        labelradioSelectionDate = new Label("Сортировать по дате");
        labelradioSelectionDate.setTranslateX(520);
        labelradioSelectionDate.setTranslateY(260);
        root.getChildren().add(labelradioSelectionDate);
        
        labelradioSelectionName = new Label("Сортировать по названию");
        labelradioSelectionName.setTranslateX(520);
        labelradioSelectionName.setTranslateY(290);
        root.getChildren().add(labelradioSelectionName);
        
        buttonDelete = new Button("Удалить");
        buttonDelete.setTranslateX(530);
        buttonDelete.setTranslateY(420);
        buttonDelete.setPrefSize(120, 20);
        buttonDelete.setScaleX(1.5);
        buttonDelete.setScaleY(1.5);
        root.getChildren().add(buttonDelete);
        
        HistoryZapisey = new Label("История записей");
        HistoryZapisey.setTranslateX(360);
        HistoryZapisey.setTranslateY(20);
        root.getChildren().add(HistoryZapisey);
       
        Rectangle rectOfHistory = new Rectangle(360, 40, 300, 30);
        rectOfHistory.setFill(Color.GREEN);
        root.getChildren().add(rectOfHistory);
        
        separatorOfSides = new Separator();
        separatorOfSides.setLayoutX(340);
        separatorOfSides.setLayoutY(0);
        separatorOfSides.setPrefHeight(450);
        separatorOfSides.setOrientation(Orientation.VERTICAL);
        root.getChildren().add(separatorOfSides);
        
        separatorOfcategory = new Separator();
        separatorOfcategory.setLayoutX(470);
        separatorOfcategory.setLayoutY(250);
        separatorOfcategory.setPrefHeight(200);
        separatorOfcategory.setOrientation(Orientation.VERTICAL);
        root.getChildren().add(separatorOfcategory);
        
        separatorOfcategory1 = new Separator();
        separatorOfcategory1.setLayoutX(341);
        separatorOfcategory1.setLayoutY(250);
        separatorOfcategory1.setPrefWidth(340);
        separatorOfcategory1.setOrientation(Orientation.HORIZONTAL);
        root.getChildren().add(separatorOfcategory1);
        
        separatorOfcategory2 = new Separator();
        separatorOfcategory2.setLayoutX(471);
        separatorOfcategory2.setLayoutY(330);
        separatorOfcategory2.setPrefWidth(210);
        separatorOfcategory2.setOrientation(Orientation.HORIZONTAL);
        root.getChildren().add(separatorOfcategory2);
        
        buttonEnter.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
             HistoryZapisey.getText();
             TextOpisanie.getText();
             date.toString();
            }
        });
        
        
        Scene scene = new Scene(root, 690, 460);
        
        
        primaryStage.setTitle("Записная книга");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
