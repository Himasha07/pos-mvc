/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Himasha Lokusuriya
 */
public class ItemModel {
    private String itemcode;
    private String description;
    private String packSize;
    private Double unitPrize;
    private Integer qoh;
    
    public ItemModel(String text, String text1, String text2, double parseDouble){
        
    }

    public ItemModel(String itemcode, String description, String packSize, Double unitPrize, Integer qoh) {
        this.itemcode = itemcode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrize = unitPrize;
        this.qoh = qoh;
    }

    /**
     * @return the itemcode
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * @param itemcode the itemcode to set
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrize
     */
    public Double getUnitPrize() {
        return unitPrize;
    }

    /**
     * @param unitPrize the unitPrize to set
     */
    public void setUnitPrize(Double unitPrize) {
        this.unitPrize = unitPrize;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }
    
     
}