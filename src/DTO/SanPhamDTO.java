/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.sql.Blob; 
/**
 *
 * @author phatl
 */
public class SanPhamDTO {
    private Blob imageBlob ;
    private int price = 0;
    private String name;
    private String id ;
    private String trangthai;

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    public SanPhamDTO() {
    }
    private String kc;

    public Blob getImageBlob() {
        return imageBlob;
    }

    public void setImageBlob(Blob imageBlob) {
        this.imageBlob = imageBlob;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name ;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKc() {
        return kc;
    }

    public void setKc(String kc) {
        this.kc = kc;
    }

    public SanPhamDTO(Blob imageBlob, String name, String id, String kc) {
        this.imageBlob = imageBlob;
        this.name = name;
        this.id = id;
        this.kc = kc;
    } 
}
