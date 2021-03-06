package io.github.conanchen.message.graphql.model;

import java.util.Collection;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class MessageGQO implements NodeGQO{

    private Collection<ConversationGQO> isPartOf;
    @javax.validation.constraints.NotNull
    private PersonGQO sender;
    private java.util.Date dateSent;
    private PersonGQO toRecipient;
    private java.util.Date dateRead;
    private java.util.Date dateReceived;
    private Collection<PersonGQO> recipient;
    @javax.validation.constraints.NotNull
    private String text;
    private Collection<CommentGQO> comments;
    private Collection<ActionUnionGQO> potentialActions;
    @javax.validation.constraints.NotNull
    private String id;

    public MessageGQO() {
    }

    public MessageGQO(Collection<ConversationGQO> isPartOf, PersonGQO sender, java.util.Date dateSent, PersonGQO toRecipient, java.util.Date dateRead, java.util.Date dateReceived, Collection<PersonGQO> recipient, String text, Collection<CommentGQO> comments, Collection<ActionUnionGQO> potentialActions, String id) {
        this.isPartOf = isPartOf;
        this.sender = sender;
        this.dateSent = dateSent;
        this.toRecipient = toRecipient;
        this.dateRead = dateRead;
        this.dateReceived = dateReceived;
        this.recipient = recipient;
        this.text = text;
        this.comments = comments;
        this.potentialActions = potentialActions;
        this.id = id;
    }

    public Collection<ConversationGQO> getIsPartOf() {
        return isPartOf;
    }
    public void setIsPartOf(Collection<ConversationGQO> isPartOf) {
        this.isPartOf = isPartOf;
    }

    public PersonGQO getSender() {
        return sender;
    }
    public void setSender(PersonGQO sender) {
        this.sender = sender;
    }

    public java.util.Date getDateSent() {
        return dateSent;
    }
    public void setDateSent(java.util.Date dateSent) {
        this.dateSent = dateSent;
    }

    public PersonGQO getToRecipient() {
        return toRecipient;
    }
    public void setToRecipient(PersonGQO toRecipient) {
        this.toRecipient = toRecipient;
    }

    public java.util.Date getDateRead() {
        return dateRead;
    }
    public void setDateRead(java.util.Date dateRead) {
        this.dateRead = dateRead;
    }

    public java.util.Date getDateReceived() {
        return dateReceived;
    }
    public void setDateReceived(java.util.Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Collection<PersonGQO> getRecipient() {
        return recipient;
    }
    public void setRecipient(Collection<PersonGQO> recipient) {
        this.recipient = recipient;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public Collection<CommentGQO> getComments() {
        return comments;
    }
    public void setComments(Collection<CommentGQO> comments) {
        this.comments = comments;
    }

    public Collection<ActionUnionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(Collection<ActionUnionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}