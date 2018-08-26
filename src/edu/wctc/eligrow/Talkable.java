package edu.wctc.eligrow;

/**
 * Created by mgreen14 on 12/27/17.
 */

/**
 * This interface is applied to all entities with the ability to speak.
 * @author Matt Green
 * @version 1.0
 */
public interface Talkable {

    /**
     * Causes entity to speak pre-coded line.
     * @author Matt Green
     * @version 1.0
     * @return Speech line
     */
    String talk();

    /**
     * Returns name of entity
     * @author Matt Green
     * @version 1.0
     * @return Name of entity
     */
    String getName();
}
