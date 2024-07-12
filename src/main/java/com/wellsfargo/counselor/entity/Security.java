package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long securityId;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String category;

  @Column(nullable = false)
  private Double purchasePrice;

  @Column(nullable = false)
  private String purchaseDate;

  @Column(nullable = false)
  private int quantity;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(
          name = "security_id",
          referencedColumnName = "securityId"
  )
  private Portfolio portfolio;

  protected Security() {}

  public Security(Portfolio portfolio, String name, String category, Double purchasePrice, String purchaseDate, int quantity) {
    this.portfolio = portfolio;
    this.name = name;
    this.category = category;
    this.purchasePrice = purchasePrice;
    this.purchaseDate = purchaseDate;
    this.quantity = quantity;
  }

  public long getSecurityId() {
    return securityId;
  }

  public Portfolio getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(Portfolio portfolio) {
    this.portfolio = portfolio;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getPurchasePrice() {
    return purchaseDate;
  }

  public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public String getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public float getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
