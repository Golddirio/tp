package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Recovers previously undone versions of addressbook.
 */
public class RedoCommand extends Command {
    public static final String COMMAND_WORD = "redo";
    public static final String MESSAGE_SUCCESS = "Previously undone command has been recovered!";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.redoAddressBook();
        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof RedoCommand)) {
            return false;
        }

        return true;
    }
}
