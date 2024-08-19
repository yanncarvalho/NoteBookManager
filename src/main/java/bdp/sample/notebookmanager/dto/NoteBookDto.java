package bdp.sample.notebookmanager.dto;

import bdp.sample.notebookmanager.entities.NoteBook;
import lombok.Data;

@Data
public class NoteBookDto {

    private String name;
    private double currentPrice;

    public NoteBook toNoteBook() {
        return new NoteBook(name, currentPrice);
    }
}
