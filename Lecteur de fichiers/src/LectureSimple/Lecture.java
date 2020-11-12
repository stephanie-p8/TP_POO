package LectureSimple;

import java.io.IOException;

/**
 * Interface poss�dant les m�thodes pour les diff�rents types de 
 * lecture d'un fichier
 * @author St�phanie PERAFAN
 * @version 1.0
 *
 */
public interface Lecture {
	/**
	 * @see LectureTypesFichiers#LireFichier()
	 * @throws IOException exception
	 */
	public void LireFichier() throws IOException;
	/**
	 * @see LectureTypesFichiers#LireFichierReverse()
	 * @throws IOException exception
	 */
	public void LireFichierReverse() throws IOException;
	/**
	 * @see LectureTypesFichiers#LirePalindrome()
	 * @throws IOException exception
	 */
	public void LirePalindrome() throws IOException;
	/**
	 * @see LectureTypesFichiers#differencesFichiers()
	 * @throws IOException exception
	 */
	public void differencesFichiers() throws IOException;

}
