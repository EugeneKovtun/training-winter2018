package ua.training.controller;

import ua.training.model.entities.Record;
import ua.training.view.View;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class RecordController {
    private Scanner scanner;
    private View view;

    public RecordController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public Record getNewRecord(Locale locale) {
        ControllerUtils utils = new ControllerUtils(scanner,view);
        Record record = new Record();
        String name = utils.inputStringWithScannerAndRegex(view.concatenateStrings
                (view.getStringByBundle(View.KEY_INPUT),
                        View.DELIMITER,view.getStringByBundle(View.KEY_NAME)),
                utils.getRegexByKey(locale,
                ControllerUtils.KEY_NAME));
        String surname = utils.inputStringWithScannerAndRegex(view.concatenateStrings
                        (view.getStringByBundle(View.KEY_INPUT),
                                View.DELIMITER,view.getStringByBundle(View.KEY_SURNAME)),
                utils.getRegexByKey(locale,
                        ControllerUtils.KEY_NAME));
        String nickname=utils.inputStringWithScannerAndRegex(view.concatenateStrings
                        (view.getStringByBundle(View.KEY_INPUT),
                                View.DELIMITER,view.getStringByBundle(View.KEY_NICKNAME)),
                Regex.NICKNAME_REGEX);
        String comment = utils.inputStringWithScannerAndRegex(view.concatenateStrings
                        (view.getStringByBundle(View.KEY_INPUT),
                                View.DELIMITER,view.getStringByBundle(View.KEY_COMMENT)),
                Regex.COMMENT_REGEX);
        String phone = utils.inputStringWithScannerAndRegex(view.concatenateStrings
                        (view.getStringByBundle(View.KEY_INPUT),
                                View.DELIMITER,view.getStringByBundle(View.KEY_PHONE)),
                Regex.MOBILE_PHONE_NUMBER_REGEX);
        String email = utils.inputStringWithScannerAndRegex(view.concatenateStrings
                        (view.getStringByBundle(View.KEY_INPUT),
                                View.DELIMITER,view.getStringByBundle(View.KEY_EMAIL)),
                Regex.EMAIL_REGEX);
        record.setName(name);
        record.setSurname(surname);
        record.setNickname(nickname);
        record.setComment(comment);
        record.setPhone(phone);
        record.setEmail(email);
        record.setLastChangeDate(new Date());
        return record;
    }
}
