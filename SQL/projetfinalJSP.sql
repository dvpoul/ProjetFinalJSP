create database projetFinalJSP
use ProjetFinalJSP
drop database ProjetFinalJSP
use CEGEP

create table stage (
	id_stage int IDENTITY primary key, 
	id_entreprise int foreign key references entreprise(id_entreprise),
	nom varchar(50),
	description varchar(1000),
	categorie varchar(100),
	date		datetime,
)

create table entreprise (
	id_entreprise int IDENTITY primary key, 
	id_categorie int foreign key references categorie(id_categorie),
	nom varchar(50),
	adresse varchar(50),
	courriel varchar(100),
	telephoneContact varchar(50),
	contact varchar(100)
)

create table categorie(
id_categorie int IDENTITY primary key,
description varchar (50),
)

create table evaluation (
	id_membre varchar(20) foreign key references etudiant(username),
	id_stage int foreign key references stage(id_stage),
	nombreEtoile int,
	commentaire varchar(2000),
)

create table stage_etudiant(
	id_etudiant varchar(20) foreign key references etudiant(username),
	stage int foreign key references stage(id_stage),
)

CREATE TABLE [dbo].[etudiant](
	[username] [varchar](20) not null primary key,
	[password] [varchar](max) not NULL,
	[nom] [varchar](50),
	[prenom] [varchar] (50),
	[status] [bit] NULL,
    [courriel] varchar(20), 
	[telephone] varchar(50),
	[programme] int foreign key references categorie(id_categorie),
)

CREATE TABLE [dbo].[roles](
	[username] varchar(20) not NULL,
	[role] [varchar](20) not NULL,
CONSTRAINT [FK_Roles] FOREIGN KEY([username])
REFERENCES [dbo].[Etudiant] ([username])
) 