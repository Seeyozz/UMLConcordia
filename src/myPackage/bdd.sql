#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------
DROP DATABASE IF EXISTS customer;

CREATE DATABASE customer;

USE customer;

#------------------------------------------------------------
# Table: Customer
#------------------------------------------------------------

CREATE TABLE Customer(
                         Username       	Varchar (50)    NOT NULL ,
                         Password      		Varchar (50)	NOT NULL ,
                         BMI 			    double,

    CONSTRAINT Customer_PK PRIMARY KEY (Username) FOREIGN KEY (Id_medication)
)ENGINE=InnoDB;

CREATE TABLE Medication(
                         Username       	Varchar (50)    NOT NULL ,
                         Dosage      		int,
                         Time_ 			    Varchar(50),
                         Medication      	Varchar (50),
                         Id_medication      int             NOT NULL ,

    CONSTRAINT Medication_PK PRIMARY KEY (Username)
)ENGINE=InnoDB;



INSERT INTO Customer VALUES("Victor", "Password",19.50);

INSERT INTO Medication VALUES("Victor",5,"matin","doliprane",1);
INSERT INTO Medication VALUES("Victor",3,"matin","aspirine",1);
