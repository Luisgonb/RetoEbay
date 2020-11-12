package com.ebay.pruebas.Utils;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import javax.swing.JOptionPane;


public class ManejoExceptions {
	
	public String obtenerEstadoConexion () {
        String conStatus = null;
        try {
            URL url = new URL("https://co.ebay.com/");
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            huc.connect();
            conStatus = "Online";
            JOptionPane.showMessageDialog(null, "El estado de internet está: "+conStatus);
        } catch (Exception e) {
            conStatus = "Offline";
            JOptionPane.showMessageDialog(null, "El estado de internet está: "+conStatus);
        }       
        return conStatus;
    }    
}
