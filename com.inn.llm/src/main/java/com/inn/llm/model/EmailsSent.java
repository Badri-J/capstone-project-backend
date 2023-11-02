package com.inn.llm.model;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emails_sent")
@Data
@DynamicInsert
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
public class EmailsSent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "date")
	private Date date = Date.valueOf(LocalDate.now());
	
	@Column(name = "time")
	private String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	
	@Column(name = "to_mail")
	private String to_mail;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "body")
	private String body;
}
