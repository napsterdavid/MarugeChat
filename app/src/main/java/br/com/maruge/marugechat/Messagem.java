package br.com.maruge.marugechat;
/**
 * Created by Jefferson David on 30/04/2017.
 */
public class Messagem {
    private int id;
    private String data;
    private String msg;
    private String titulo;
    // Id da Messagem
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // Data da messagem
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    // Messagem
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    // Titulo da Massagem
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) {this.titulo = titulo;
    }
    @Override
    public String toString() {
        return this.data;
    }
    public void add(Messagem messagem) {

    }
}
