/** Modelo Generado - NO CAMBIAR MANUALMENTE - Copyright (C) 2006 FUNDESLE */
package org.openXpertya.model;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.openXpertya.util.*;
/** Modelo Generado por AD_Element
 *  @author Comunidad de Desarrollo openXpertya*         *Basado en Codigo Original Modificado, Revisado y Optimizado de:*         * Jorg Janke 
 *  @version  - 2009-10-22 14:51:26.446 */
public class X_AD_Element extends PO
{
/** Constructor estándar */
public X_AD_Element (Properties ctx, int AD_Element_ID, String trxName)
{
super (ctx, AD_Element_ID, trxName);
/** if (AD_Element_ID == 0)
{
setAD_Element_ID (0);
setColumnName (null);
setEntityType (null);	// U
setName (null);
setPrintName (null);
}
 */
}
/** Load Constructor */
public X_AD_Element (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=276 */
public static final int Table_ID=276;

/** TableName=AD_Element */
public static final String Table_Name="AD_Element";

protected static KeyNamePair Model = new KeyNamePair(276,"AD_Element");
protected static BigDecimal AccessLevel = new BigDecimal(4);

/** Load Meta Data */
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Element[").append(getID()).append("]");
return sb.toString();
}
/** Set AD_ComponentObjectUID */
public void setAD_ComponentObjectUID (String AD_ComponentObjectUID)
{
if (AD_ComponentObjectUID != null && AD_ComponentObjectUID.length() > 100)
{
log.warning("Length > 100 - truncated");
AD_ComponentObjectUID = AD_ComponentObjectUID.substring(0,100);
}
set_Value ("AD_ComponentObjectUID", AD_ComponentObjectUID);
}
/** Get AD_ComponentObjectUID */
public String getAD_ComponentObjectUID() 
{
return (String)get_Value("AD_ComponentObjectUID");
}
/** Set Component Version Identifier */
public void setAD_ComponentVersion_ID (int AD_ComponentVersion_ID)
{
if (AD_ComponentVersion_ID <= 0) set_Value ("AD_ComponentVersion_ID", null);
 else 
set_Value ("AD_ComponentVersion_ID", new Integer(AD_ComponentVersion_ID));
}
/** Get Component Version Identifier */
public int getAD_ComponentVersion_ID() 
{
Integer ii = (Integer)get_Value("AD_ComponentVersion_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set System Element.
System Element enables the central maintenance of column description and help. */
public void setAD_Element_ID (int AD_Element_ID)
{
set_ValueNoCheck ("AD_Element_ID", new Integer(AD_Element_ID));
}
/** Get System Element.
System Element enables the central maintenance of column description and help. */
public int getAD_Element_ID() 
{
Integer ii = (Integer)get_Value("AD_Element_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set DB Column Name.
Name of the column in the database */
public void setColumnName (String ColumnName)
{
if (ColumnName == null) throw new IllegalArgumentException ("ColumnName is mandatory");
if (ColumnName.length() > 40)
{
log.warning("Length > 40 - truncated");
ColumnName = ColumnName.substring(0,40);
}
set_Value ("ColumnName", ColumnName);
}
/** Get DB Column Name.
Name of the column in the database */
public String getColumnName() 
{
return (String)get_Value("ColumnName");
}
public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(getID(), getColumnName());
}
/** Set Description.
Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,255);
}
set_Value ("Description", Description);
}
/** Get Description.
Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
public static final int ENTITYTYPE_AD_Reference_ID=245;
/** Applications Integrated with openXpertya = A */
public static final String ENTITYTYPE_ApplicationsIntegratedWithOpenXpertya = "A";
/** Country Version = C */
public static final String ENTITYTYPE_CountryVersion = "C";
/** Dictionary = D */
public static final String ENTITYTYPE_Dictionary = "D";
/** User maintained = U */
public static final String ENTITYTYPE_UserMaintained = "U";
/** Customization = CUST */
public static final String ENTITYTYPE_Customization = "CUST";
/** Set Entity Type.
Dictionary Entity Type;
 Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.equals("A") || EntityType.equals("C") || EntityType.equals("D") || EntityType.equals("U") || EntityType.equals("CUST"));
 else throw new IllegalArgumentException ("EntityType Invalid value - Reference_ID=245 - A - C - D - U - CUST");
if (EntityType == null) throw new IllegalArgumentException ("EntityType is mandatory");
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,4);
}
set_Value ("EntityType", EntityType);
}
/** Get Entity Type.
Dictionary Entity Type;
 Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value("EntityType");
}
/** Set Comment/Help.
Comment or Hint */
public void setHelp (String Help)
{
if (Help != null && Help.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Help = Help.substring(0,2000);
}
set_Value ("Help", Help);
}
/** Get Comment/Help.
Comment or Hint */
public String getHelp() 
{
return (String)get_Value("Help");
}
/** Set Name.
Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,60);
}
set_Value ("Name", Name);
}
/** Get Name.
Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Set PO Description.
Description in PO Screens */
public void setPO_Description (String PO_Description)
{
if (PO_Description != null && PO_Description.length() > 255)
{
log.warning("Length > 255 - truncated");
PO_Description = PO_Description.substring(0,255);
}
set_Value ("PO_Description", PO_Description);
}
/** Get PO Description.
Description in PO Screens */
public String getPO_Description() 
{
return (String)get_Value("PO_Description");
}
/** Set PO Help.
Help for PO Screens */
public void setPO_Help (String PO_Help)
{
if (PO_Help != null && PO_Help.length() > 2000)
{
log.warning("Length > 2000 - truncated");
PO_Help = PO_Help.substring(0,2000);
}
set_Value ("PO_Help", PO_Help);
}
/** Get PO Help.
Help for PO Screens */
public String getPO_Help() 
{
return (String)get_Value("PO_Help");
}
/** Set PO Name.
Name on PO Screens */
public void setPO_Name (String PO_Name)
{
if (PO_Name != null && PO_Name.length() > 60)
{
log.warning("Length > 60 - truncated");
PO_Name = PO_Name.substring(0,60);
}
set_Value ("PO_Name", PO_Name);
}
/** Get PO Name.
Name on PO Screens */
public String getPO_Name() 
{
return (String)get_Value("PO_Name");
}
/** Set PO Print name.
Print name on PO Screens/Reports */
public void setPO_PrintName (String PO_PrintName)
{
if (PO_PrintName != null && PO_PrintName.length() > 60)
{
log.warning("Length > 60 - truncated");
PO_PrintName = PO_PrintName.substring(0,60);
}
set_Value ("PO_PrintName", PO_PrintName);
}
/** Get PO Print name.
Print name on PO Screens/Reports */
public String getPO_PrintName() 
{
return (String)get_Value("PO_PrintName");
}
/** Set Print Text.
The label text to be printed on a document or correspondence. */
public void setPrintName (String PrintName)
{
if (PrintName == null) throw new IllegalArgumentException ("PrintName is mandatory");
if (PrintName.length() > 60)
{
log.warning("Length > 60 - truncated");
PrintName = PrintName.substring(0,60);
}
set_Value ("PrintName", PrintName);
}
/** Get Print Text.
The label text to be printed on a document or correspondence. */
public String getPrintName() 
{
return (String)get_Value("PrintName");
}
}
