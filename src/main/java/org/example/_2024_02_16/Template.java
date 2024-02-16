package org.example._2024_02_16;

public class Template {

    public int id;
    public String name;
    public String dep;
    private double price = 9999999;

    public Template() {
    }

    public Template(int id, String name, String dep) {
        this.id = id;
        this.name = name;
        this.dep = dep;
    }

    public Template(int id, String name, String dep, double price) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void upPrice() {
        price = price * 1.2;
    }

    private void changeTemplateName(String newTemplateName) {
        name = newTemplateName;
        System.out.println("New Tenplate name is: " + newTemplateName);
    }

    @Override
    public String toString() {
        return "Template{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dep='" + dep + '\'' +
                ", price=" + price +
                '}';
    }
}