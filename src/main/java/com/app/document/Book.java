package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class Book {
	@Id
	private String id;
	
	@NonNull
	private String bCode;
	@NonNull
	private String bAuth;
	@NonNull
	private Double bCost;

}
