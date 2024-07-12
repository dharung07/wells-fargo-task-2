package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
  @Id
  @GeneratedValue(
          strategy = GenerationType.AUTO
  )
  private Long clientId;

  @Column(nullable = false)
  private String firstName;

  @Column(nullable = false)
  private String lastName;

  @Column(nullable = false)
  private String address;

  @Column(nullable = false)
  private String phoneNumber;

  @Column(nullable = false)
  private String emailId;

  @ManyToOne()
  @JoinColumn(
          name = "advisor_id",
          referencedColumnName = "advisorId"
  )
  private Advisor advisor;

  protected Client() {}

  public Client(String firstName, String lastName, String address, String phoneNumber, String emailId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailId = emailId;
  }

  public Long getClientId() {return clientId;}

  public String getFirstName() {return firstName;}
  public void setFirstName(String firstName) {this.firstName = firstName;}

  public String getLastName() {return lastName;}
  public void setLastName(String lastName) {this.lastName = lastName;}

  public String getAddress() {return address;}
  public void setAddress(String address) {this.address = address;}

  public String getPhoneNumber() {return phoneNumber;}
  public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

  public String getEmailId() {return emailId;}
  public void setEmailId(String emailId) {this.emailId = emailId;}
}
