/*
 * @(#)DBRes_sl.java   12.oct 2007  Versión 2.2
 *
 *    El contenido de este fichero está sujeto a la  Licencia Pública openXpertya versión 1.1 (LPO)
 * en tanto en cuanto forme parte íntegra del total del producto denominado:  openXpertya, solución 
 * empresarial global , y siempre según los términos de dicha licencia LPO.
 *    Una copia  íntegra de dicha  licencia está incluida con todas  las fuentes del producto.
 *    Partes del código son copyRight (c) 2002-2007 de Ingeniería Informática Integrada S.L., otras 
 * partes son  copyRight (c)  2003-2007 de  Consultoría y  Soporte en  Redes y  Tecnologías  de  la
 * Información S.L.,  otras partes son copyRight (c) 2005-2006 de Dataware Sistemas S.L., otras son
 * copyright (c) 2005-2006 de Indeos Consultoría S.L., otras son copyright (c) 2005-2006 de Disytel
 * Servicios Digitales S.A., y otras  partes son  adaptadas, ampliadas,  traducidas, revisadas  y/o 
 * mejoradas a partir de código original de  terceros, recogidos en el ADDENDUM  A, sección 3 (A.3)
 * de dicha licencia  LPO,  y si dicho código es extraido como parte del total del producto, estará
 * sujeto a su respectiva licencia original.  
 *    Más información en http://www.openxpertya.org/ayuda/Licencia.html
 */



package org.openXpertya.db;

import java.util.ListResourceBundle;

/**
 *  Connection Resource Strings
 *
 *  @author Comunidad de Desarrollo openXpertya
 *         *Basado en Codigo Original Modificado, Revisado y Optimizado de:
 *         *     MatjaÅ¾ Godec
 *  @version    $Id: DBRes_sl.java,v 1.3 2005/03/11 20:29:00 jjanke Exp $
 */
public class DBRes_sl extends ListResourceBundle {

    /** Data */
    static final Object[][]	contents	= new String[][] {
        { "CConnectionDialog", "Libertya povezava" }, { "Name", "Ime" }, { "AppsHost", "Programski streÅ¾nik" }, { "AppsPort", "Vrata programskega streÅ¾nika" }, { "TestApps", "Test programskega streÅ¾nika" }, { "DBHost", "StreÅ¾nik baze podatkov" }, { "DBPort", "Vrata baze podatkov" }, { "DBName", "Ime baze podatkov" }, { "DBUidPwd", "Uporabnik / geslo" }, { "ViaFirewall", "Skozi poÅ¾arni zid" }, { "FWHost", "PoÅ¾arni zid" }, { "FWPort", "Vrata poÅ¾arnega zidu" }, { "TestConnection", "Testiranje baze podatkov" }, { "Type", "Tip baze podatkov" }, { "BequeathConnection", "Bequeath Connection" }, { "Overwrite", "PrepiÅ¡i" }, { "RMIoverHTTP", "Tuneliraj objekte skozi HTTP" }, { "ConnectionError", "Napaka na povezavi" }, { "ServerNotActive", "StreÅ¾nik ni aktiven" }
    };

    //~--- get methods --------------------------------------------------------

    /**
     * Get Contsnts
     * @return contents
     */
    public Object[][] getContents() {
        return contents;
    }		// getContent
}	// Res



/*
 * @(#)DBRes_sl.java   02.jul 2007
 * 
 *  Fin del fichero DBRes_sl.java
 *  
 *  Versión 2.2  - Fundesle (2007)
 *
 */


//~ Formateado de acuerdo a Sistema Fundesle en 02.jul 2007
