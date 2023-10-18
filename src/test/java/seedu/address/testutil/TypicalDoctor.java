package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GENDER_FEMALE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GENDER_MALE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NRIC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NRIC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_REMARK_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_REMARK_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Doctor;

/**
 * A utility class containing a list of {@code Patient} objects to be used in tests.
 */
public class TypicalDoctor {

    public static final Doctor ALICE = new DoctorBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withRemark("She likes aardvarks.").withGender("F").withIc("T0131267K")
            .withTags("friends").build();
    public static final Doctor BENSON = new DoctorBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25").withRemark("He can't take beer!")
            .withEmail("johnd@example.com").withPhone("98765432").withGender("M").withIc("T0131268K")
            .withTags("owesMoney", "friends").build();
    public static final Doctor CARL = new DoctorBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").withGender("M").withIc("T0131269K").build();
    public static final Doctor DANIEL = new DoctorBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withTags("friends")
            .withGender("M").withIc("T0131260K").build();
    public static final Doctor ELLE = new DoctorBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave").withGender("F").withIc("T0131261K").build();
    public static final Doctor FIONA = new DoctorBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").withGender("F").withIc("T0131262K").build();
    public static final Doctor GEORGE = new DoctorBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street").withGender("M").withIc("T0131263K").build();

    // Manually added
    public static final Doctor HOON = new DoctorBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").withGender("M")
            .withIc("T0131263J").build();
    public static final Doctor IDA = new DoctorBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").withGender("F").withIc("T0131263P")
            .build();

    // Manually added - Patient's details found in {@code CommandTestUtil}
    public static final Doctor AMY = new DoctorBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY)
            .withAddress(VALID_ADDRESS_AMY).withIc(VALID_NRIC_AMY).withGender(VALID_GENDER_FEMALE)
            .withRemark(VALID_REMARK_AMY)
            .withTags(VALID_TAG_FRIEND).build();
    public static final Doctor BOB = new DoctorBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB)
            .withAddress(VALID_ADDRESS_BOB).withIc(VALID_NRIC_BOB).withGender(VALID_GENDER_MALE)
            .withRemark(VALID_REMARK_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalDoctor() {
    } // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical patients.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Doctor doctor : getTypicalDoctors()) {
            ab.addDoctor(doctor);
        }
        return ab;
    }

    public static List<Doctor> getTypicalDoctors() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}