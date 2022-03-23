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

    CONSTRAINT Customer_PK PRIMARY KEY (Username)
)ENGINE=InnoDB;

CREATE TABLE Medication(
                         Username       	Varchar (50)    NOT NULL ,
                         Id					int NOT NULL,
                         Dosage      		int,
                         Time_ 			    Varchar(50),
                         Medication      	Varchar (50),
                         Id_medication      int             NOT NULL ,
                         Date_ 				Varchar(50),

    CONSTRAINT Medication_PK PRIMARY KEY (id), FOREIGN KEY (Username) REFERENCES Customer(Username)
)ENGINE=InnoDB;



INSERT INTO Customer VALUES("Victor", "Password",19.50);

INSERT INTO Medication VALUES("Victor",0,5,"matin","doliprane",1,"24/03/2021");
INSERT INTO Medication VALUES("Victor",1,3,"matin","aspirine",1,"20/02/2021");

