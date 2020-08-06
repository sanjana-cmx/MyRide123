package com.myride.notification.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NotificationDetails {
	private String id;
	private String subject;
	private String body;
	private List<String> attachment;
	private String entityType;
}
