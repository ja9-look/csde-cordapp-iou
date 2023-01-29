package com.r3.developers.csdetemplate.utxoexample.workflows;

public class CreateNewChatFlowArgs{

    // Serialisation service requires a default constructor
    public CreateNewChatFlowArgs() {}

    private String chatName;
    private String message;
    private String otherMember;

    public CreateNewChatFlowArgs(String chatName, String message, String otherMember) {
        this.chatName = chatName;
        this.message = message;
        this.otherMember = otherMember;
    }

    public String getChatName() {
        return chatName;
    }

    public String getMessage() {
        return message;
    }

    public String getOtherMember() {
        return otherMember;
    }
}