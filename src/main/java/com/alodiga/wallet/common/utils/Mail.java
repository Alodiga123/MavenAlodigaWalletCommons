/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alodiga.wallet.common.utils;
import java.io.Serializable;
import java.util.ArrayList;
import javax.activation.DataHandler;

/**
 *
 * @author ltoro
 */
public class Mail implements Serializable {

    private static final long serialVersionUID = 1L;
    /** Tema o asunto del correo. */
    private String subject;
    /** Cuerpo del correo. */
    private String body;
    /** Correo fuente. */
    private String from;
    /** Lista de destinos. */
    private ArrayList<String> to;
    private ArrayList<String> bcc;
    /** Lista de nombre de los archivos adjuntos **/
    private ArrayList<String> attachments;
    /** Lista de datahandler para adjuntar**/
    private ArrayList<DataHandler> dataHandlers;

    public Mail() {
        bcc = new ArrayList<String>();
        bcc.add(Constants.DEV_REPORT);
    }

    /**
     * Constructor de la clase Correo. Inicializa los datos del cuerpo del
     * correo.
     * @param subject	Tema o asunto del correo.
     * @param body		Cuerpo del correo.
     */
    public Mail(String subject, String body) {
        this.subject = subject;
        this.body = body;
        bcc = new ArrayList<String>();
        bcc.add(Constants.DEV_REPORT);
    }

    /**
     * Obtiene el cuerpo del correo.
     * @return java.lang.String
     */
    public String getBody() {
        return body;
    }

    /**
     * Establece el cuerpo del correo.
     * @param body	Cuerpo del correo.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Obtiene el tema o asunto del correo.
     * @return java.lang.String
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Establece el tema o asunto del correo.
     * @param subject	Tema del correo.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Obtiene la lista de destinatarios del correo.
     * @return java.util.ArrayList
     */
    public ArrayList<String> getTo() {
        return to;
    }

    /**
     * Establece la lista de destinatarios del correo.
     * @param to	Lista de destinatarios.
     */
    public void setTo(ArrayList<String> to) {
        this.to = to;
    }

    /**
     * Establece la lista de destinatarios del correo.
     * @param to	Lista de destinatarios.
     */
    public void setTo(String to) {
        ArrayList<String> listTo = new ArrayList<String>();
        listTo.add(to);
        this.to = listTo;
    }

    /**
     * Obtiene el correo fuente o origen del correo.
     * @return	java.lang.String
     */
    public String getFrom() {
        return from;
    }

    /**
     * Establece el correo fuente o origen del correo.
     * @param from	Correo fuente
     */
    public void setFrom(String from) {
        this.from = from;
    }

    public ArrayList<String> getBcc() {
        return bcc;
    }

    public void setBcc(ArrayList<String> bcc) {
        this.bcc = bcc;
    }

    public ArrayList<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<String> attachments) {
        this.attachments = attachments;
    }

    public ArrayList<DataHandler> getDataHandlers() {
        return dataHandlers;
    }

    public void setDataHandlers(ArrayList<DataHandler> dataHandlers) {
        this.dataHandlers = dataHandlers;
    }

}
