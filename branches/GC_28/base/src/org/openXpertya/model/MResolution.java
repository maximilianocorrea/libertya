/*
 *    El contenido de este fichero está sujeto a la  Licencia Pública openXpertya versión 1.1 (LPO)
 * en tanto en cuanto forme parte íntegra del total del producto denominado:  openXpertya, solución 
 * empresarial global , y siempre según los términos de dicha licencia LPO.
 *    Una copia  íntegra de dicha  licencia está incluida con todas  las fuentes del producto.
 *    Partes del código son CopyRight (c) 2002-2007 de Ingeniería Informática Integrada S.L., otras 
 * partes son  CopyRight (c) 2002-2007 de  Consultoría y  Soporte en  Redes y  Tecnologías  de  la
 * Información S.L.,  otras partes son  adaptadas, ampliadas,  traducidas, revisadas  y/o mejoradas
 * a partir de código original de  terceros, recogidos en el  ADDENDUM  A, sección 3 (A.3) de dicha
 * licencia  LPO,  y si dicho código es extraido como parte del total del producto, estará sujeto a
 * su respectiva licencia original.  
 *     Más información en http://www.openxpertya.org/ayuda/Licencia.html
 */



package org.openXpertya.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.openXpertya.util.CCache;

/**
 * Descripción de Clase
 *
 *
 * @version    2.2, 12.10.07
 * @author     Equipo de Desarrollo de openXpertya    
 */

public class MResolution extends X_R_Resolution {

    /**
     * Descripción de Método
     *
     *
     * @param ctx
     * @param R_Resolution_ID
     *
     * @return
     */

    public static MResolution get( Properties ctx,int R_Resolution_ID ) {
        Integer     key      = new Integer( R_Resolution_ID );
        MResolution retValue = ( MResolution )s_cache.get( key );

        if( retValue != null ) {
            return retValue;
        }

        retValue = new MResolution( ctx,R_Resolution_ID,null );

        if( retValue.getID() != 0 ) {
            s_cache.put( key,retValue );
        }

        return retValue;
    }    // get

    /** Descripción de Campos */

    private static CCache s_cache = new CCache( "R_Resolution",10 );

    /**
     * Constructor de la clase ...
     *
     *
     * @param ctx
     * @param R_Resolution_ID
     * @param trxName
     */

    public MResolution( Properties ctx,int R_Resolution_ID,String trxName ) {
        super( ctx,R_Resolution_ID,trxName );
    }    // MResolution

    /**
     * Constructor de la clase ...
     *
     *
     * @param ctx
     * @param rs
     * @param trxName
     */

    public MResolution( Properties ctx,ResultSet rs,String trxName ) {
        super( ctx,rs,trxName );
    }    // MResolution
}    // MResolution



/*
 *  @(#)MResolution.java   02.07.07
 * 
 *  Fin del fichero MResolution.java
 *  
 *  Versión 2.2
 *
 */
