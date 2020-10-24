/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapps1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Mantaf (Moch Mahfudz Yahya | Eksc1 | 19201226)
 */
public class MyApps1 extends Application {
    
    public void start(Stage window){
        //// --- VBox ---
        //// VBox index = new VBox();
        //// Scene scene_dasar = new Scene(index, 400, 400);
                
        //// --- GridPane ---
        GridPane index = new GridPane();
        index.setMinSize(400,200);
        index.setPadding(new Insets(10,10,10,10));
        index.setVgap(10);
        index.setHgap(10);
        index.setAlignment(Pos.CENTER);
        
        //// Form Nama 
        Text t_nama = new Text("Nama");
        Text titik_1 = new Text(":");
        TextField tf_nama = new TextField();
        
        // Form Telepon 
        Text t_telepon = new Text("Telepon");
        Text titik_2 = new Text(":");
        TextField tf_telepon = new TextField();
        
        // Form Alamat 
        Text t_alamat = new Text("Alamat");
        Text titik_3 = new Text(":");
        TextField tf_alamat = new TextField();
        
        // Tombol 
        TilePane tpane = new TilePane();
        Button btKirim = new Button("Kirim");
        Button btHapus = new Button("Hapus");
        tpane.setOrientation(Orientation.HORIZONTAL);
        tpane.setAlignment(Pos.CENTER);
        tpane.getChildren().addAll(btKirim, btHapus);
        
        // --- Initial To Grip Pane ---
       
        // Nama
        index.add(t_nama,0,0);
        index.add(titik_1,1,0);
        index.add(tf_nama,2,0);
        
        // Telepon
        index.add(t_telepon,0,1);
        index.add(titik_2,1,1);
        index.add(tf_telepon,2,1);
        
        // Alamat
        index.add(t_alamat,0,2);
        index.add(titik_3,1,2);
        index.add(tf_alamat,2,2);
        
        // Tombol
        index.add(tpane,2,3);
        
        // Window Title
        window.setTitle("Form Pendaftaran Event");
        
        // Call Window
        Scene scene_dasar = new Scene(index);
        window.setScene(scene_dasar);
        
        // Show Windows
        window.show();
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }
}
