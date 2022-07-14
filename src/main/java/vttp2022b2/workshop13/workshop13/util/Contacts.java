package vttp2022b2.workshop13.workshop13.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.ui.Model;

import vttp2022b2.workshop13.workshop13.model.Contact;

@Components("contacts")
public class Contacts {
    private static final Logger logger = LoggerFactory.getLogger(Contacts.class);

    public void saveContact(Contact ctc, Model model, ApplicationArguments appArgs) {
        String dataFileName = ctc.getId();
        Set<String> opsNames = appArgs.getOptionNames();
        String[] optNamesArr = opsNames.toArray(new String[opsNames.size()]);
        List <String> optValues = appArgs.getOptionValues(optNamesArr[]);
        String[] optValuesArr = optValues.toArray(new String[optValues.size()]);

        PrintWriter printWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(optValuesArr[0] + "/"+ dataFileName);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(ctc.getName());
            printWriter.println(ctc.getEmail());
            printWriter.println(ctc.getPhoneNumber());

        } catch (IOException e) {
            logger.error(e.getMessage());

        } finally {
            printWriter.close();
        }
        model.addAttribute("contact", new Contact(ctc.getId(), ctc.getName(), ctc.getEmail(), ctc.getPhoneNumber()));
    }
}
