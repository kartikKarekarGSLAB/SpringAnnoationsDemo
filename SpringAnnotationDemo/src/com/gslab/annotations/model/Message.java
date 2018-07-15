package com.gslab.annotations.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import com.gslab.annotations.model.Sender;

public class Message {
	private int id;
	private String message;
	private Sender sender;
	
	@Autowired
	public Message(int id, String message ,Sender sender) {
		super();
		this.id = id;
		this.message = message;
		this.sender = sender;
	}
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	public Sender getSender() {
		return sender;
	}
	@Autowired(required=false)
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	@Required
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", sender="+sender+ "]";
	}
	
}
