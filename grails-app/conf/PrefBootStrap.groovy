/**
 * Created by ${USER} on ${DAY} ${MONTH_NAME_SHORT} ${YEAR}.
 * Creato dal plugin AlgosPref
 *
 * Classe di BootStrap in cui passa SEMPRE quando si lancia il programma
 * Passa anche in tutte le altre classi col suffisso -BootStrap
 *
 * Questa classe viene ricreata ogni volta che si installa il plugin
 * Viene cancellata quando si disinstalla il plugin
 */
public class PrefBootStrap {

    //--metodo invocato direttamente da Grails
    def init = { servletContext ->
    }// fine della closure

    //--metodo invocato direttamente da Grails
    def destroy = {
    }// fine della closure

}// fine della classe di tipo BootStrap
