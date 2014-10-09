/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.outlook.services;

public class Message extends Item {
	private String subject;

	public String getSubject() {
		 return subject; 
	}

	public void setSubject(String value) { 
		subject = value; 
	}
	private ItemBody body;

	public ItemBody getBody() {
		 return body; 
	}

	public void setBody(ItemBody value) { 
		body = value; 
	}
	private String bodyPreview;

	public String getBodyPreview() {
		 return bodyPreview; 
	}

	public void setBodyPreview(String value) { 
		bodyPreview = value; 
	}
	private Importance importance;

	public Importance getImportance() {
		 return importance; 
	}

	public void setImportance(Importance value) { 
		importance = value; 
	}
	private boolean hasAttachments;

	public boolean getHasAttachments() {
		 return hasAttachments; 
	}

	public void setHasAttachments(boolean value) { 
		hasAttachments = value; 
	}
	private String parentFolderId;

	public String getParentFolderId() {
		 return parentFolderId; 
	}

	public void setParentFolderId(String value) { 
		parentFolderId = value; 
	}
	private Recipient from;

	public Recipient getFrom() {
		 return from; 
	}

	public void setFrom(Recipient value) { 
		from = value; 
	}
	private Recipient sender;

	public Recipient getSender() {
		 return sender; 
	}

	public void setSender(Recipient value) { 
		sender = value; 
	}
	private java.util.List<Recipient> toRecipients;

	public java.util.List<Recipient> getToRecipients() {
		 return toRecipients; 
	}

	public void setToRecipients(java.util.List<Recipient> value) { 
		toRecipients = value; 
	}
	private java.util.List<Recipient> ccRecipients;

	public java.util.List<Recipient> getCcRecipients() {
		 return ccRecipients; 
	}

	public void setCcRecipients(java.util.List<Recipient> value) { 
		ccRecipients = value; 
	}
	private java.util.List<Recipient> bccRecipients;

	public java.util.List<Recipient> getBccRecipients() {
		 return bccRecipients; 
	}

	public void setBccRecipients(java.util.List<Recipient> value) { 
		bccRecipients = value; 
	}
	private java.util.List<Recipient> replyTo;

	public java.util.List<Recipient> getReplyTo() {
		 return replyTo; 
	}

	public void setReplyTo(java.util.List<Recipient> value) { 
		replyTo = value; 
	}
	private String conversationId;

	public String getConversationId() {
		 return conversationId; 
	}

	public void setConversationId(String value) { 
		conversationId = value; 
	}
	private ItemBody uniqueBody;

	public ItemBody getUniqueBody() {
		 return uniqueBody; 
	}

	public void setUniqueBody(ItemBody value) { 
		uniqueBody = value; 
	}
	private java.util.Calendar dateTimeReceived;

	public java.util.Calendar getDateTimeReceived() {
		 return dateTimeReceived; 
	}

	public void setDateTimeReceived(java.util.Calendar value) { 
		dateTimeReceived = value; 
	}
	private java.util.Calendar dateTimeSent;

	public java.util.Calendar getDateTimeSent() {
		 return dateTimeSent; 
	}

	public void setDateTimeSent(java.util.Calendar value) { 
		dateTimeSent = value; 
	}
	private boolean isDeliveryReceiptRequested;

	public boolean getIsDeliveryReceiptRequested() {
		 return isDeliveryReceiptRequested; 
	}

	public void setIsDeliveryReceiptRequested(boolean value) { 
		isDeliveryReceiptRequested = value; 
	}
	private boolean isReadReceiptRequested;

	public boolean getIsReadReceiptRequested() {
		 return isReadReceiptRequested; 
	}

	public void setIsReadReceiptRequested(boolean value) { 
		isReadReceiptRequested = value; 
	}
	private boolean isDraft;

	public boolean getIsDraft() {
		 return isDraft; 
	}

	public void setIsDraft(boolean value) { 
		isDraft = value; 
	}
	private boolean isRead;

	public boolean getIsRead() {
		 return isRead; 
	}

	public void setIsRead(boolean value) { 
		isRead = value; 
	}
}