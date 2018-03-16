package ua.training.model.entities;

import java.util.Date;

/**
 * Создать класс для единицы товара на складе (поля: товар, производитель,
 количество, дата изготовления, срок годности, поставщик, тел. поставщика, тел.
 производителя, цена за 1 ед.).
 */
public class Product implements Cloneable {
    private String name;
    private String manufacturer;
    private int amount;
    private Date dateOfManufacture;
    private Date dateOfExpiration;
    private String provider;
    private String providerPhone;
    private String manufacturerPhone;
    private int price;

    public Product() {
    }

    public Product(String name, String manufacturer, int amount, Date dateOfManufacture, Date dateOfExpiration, String provider, String providerPhone, String manufacturerPhone, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.amount = amount;
        this.dateOfManufacture = dateOfManufacture;
        this.dateOfExpiration = dateOfExpiration;
        this.provider = provider;
        this.providerPhone = providerPhone;
        this.manufacturerPhone = manufacturerPhone;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Date getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(Date dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    public String getManufacturerPhone() {
        return manufacturerPhone;
    }

    public void setManufacturerPhone(String manufacturerPhone) {
        this.manufacturerPhone = manufacturerPhone;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getAmount() != product.getAmount()) return false;
        if (getPrice() != product.getPrice()) return false;
        if (getName() != null ? !getName().equals(product.getName()) : product.getName() != null) return false;
        if (getManufacturer() != null ? !getManufacturer().equals(product.getManufacturer()) : product.getManufacturer() != null)
            return false;
        if (getDateOfManufacture() != null ? !getDateOfManufacture().equals(product.getDateOfManufacture()) : product.getDateOfManufacture() != null)
            return false;
        if (getDateOfExpiration() != null ? !getDateOfExpiration().equals(product.getDateOfExpiration()) : product.getDateOfExpiration() != null)
            return false;
        if (getProvider() != null ? !getProvider().equals(product.getProvider()) : product.getProvider() != null)
            return false;
        if (getProviderPhone() != null ? !getProviderPhone().equals(product.getProviderPhone()) : product.getProviderPhone() != null)
            return false;
        return getManufacturerPhone() != null ? getManufacturerPhone().equals(product.getManufacturerPhone()) : product.getManufacturerPhone() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getManufacturer() != null ? getManufacturer().hashCode() : 0);
        result = 31 * result + getAmount();
        result = 31 * result + (getDateOfManufacture() != null ? getDateOfManufacture().hashCode() : 0);
        result = 31 * result + (getDateOfExpiration() != null ? getDateOfExpiration().hashCode() : 0);
        result = 31 * result + (getProvider() != null ? getProvider().hashCode() : 0);
        result = 31 * result + (getProviderPhone() != null ? getProviderPhone().hashCode() : 0);
        result = 31 * result + (getManufacturerPhone() != null ? getManufacturerPhone().hashCode() : 0);
        result = 31 * result + getPrice();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", amount=" + amount +
                ", dateOfManufacture=" + dateOfManufacture +
                ", dateOfExpiration=" + dateOfExpiration +
                ", provider='" + provider + '\'' +
                ", providerPhone='" + providerPhone + '\'' +
                ", manufacturerPhone='" + manufacturerPhone + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}
