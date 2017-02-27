package ArchiForum.Domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by tmo on 27-2-2017.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Board {
    @Id
    private String name;

    private String Description;

    private int NumberOfThreads;

    //private Post LastPost;
}
