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
}
