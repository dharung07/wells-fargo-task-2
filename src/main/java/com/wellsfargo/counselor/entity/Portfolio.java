package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

  @Id
  @GeneratedValue(
          strategy = GenerationType.AUTO
  )
  private Long portfolioId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(
          name = "client_id",
          referencedColumnName = "clientId"
  )
  private Client client;

  @Column(nullable = false)
  private String creationDate;

  protected Portfolio() {}

  public Portfolio(Client client, String creationDate) {
    this.client = client;
    this.creationDate = creationDate;
  }

  public Long getPortfolioId() {
    return portfolioId;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }
}
