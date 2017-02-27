package ArchiForum.Domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by tmo on 27-2-2017.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Thread {

    @Id
    @GeneratedValue
    private int ThreadID;

    private String Subject;

    private String Description;

    private int NumberOfPosts;

    private Date DateTime;

    private Boolean Status;
}
