package ua.training.controller;

/**
 * Created by eugene on 27.07.17.
 */
public interface Regex {
    String NICKNAME_REGEX = "[A-Za-z@_0-9*&^%$#!]+";
    String COMMENT_REGEX = ".{6,150}";
    String HOME_PHONE_NUMBER = "\\d{3}-?\\d{2}-?\\d{2}";
    String MOBILE_PHONE_NUMBER_REGEX = "\\+?\\d{2}\\(?\\d{3}\\)?\\d{3}-?\\d{2}-?\\d{2}";
    String EMAIL_REGEX = "(.+)@(.+)";
    String SKYPE_REGEX = "[A-Za-z@_!?0-9\\.]+";

}
