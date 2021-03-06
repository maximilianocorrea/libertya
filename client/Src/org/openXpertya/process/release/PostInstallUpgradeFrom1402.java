package org.openXpertya.process.release;

import org.openXpertya.JasperReport.MJasperReport;
import org.openXpertya.model.MAttachment;
import org.openXpertya.model.MProcess;
import org.openXpertya.process.PluginPostInstallProcess;
import org.openXpertya.util.DB;
import org.openXpertya.utils.JarHelper;

public class PostInstallUpgradeFrom1402 extends PluginPostInstallProcess {

	/** UID del informe de Movimientos de artículo detallado */
	protected final static String PRODUCT_MOVEMENTS_DETAILED_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010092";
	protected final static String PRODUCT_MOVEMENTS_DETAILED_JASPER_REPORT_FILENAME = "ProductMovementsWithStockBalance.jasper";
	
	/** UID del Informe de Libro de IVA */
	protected final static String LIBRO_IVA_REPORT_JASPER_REPORT_UID = "LIVA2CORE-AD_JasperReport-1010047-20121031201418";
	protected final static String LIBRO_IVA_REPORT_JASPER_REPORT_FILENAME = "InformeLibroIVA.jasper";
	
	/** UID del Subreporte de impuestos del Informe de Libro de IVA */
	protected final static String LIBRO_IVA_TAX_SUBREPORT_JASPER_REPORT_UID = "LIVA2CORE-AD_JasperReport-1010053-20121031201630";
	protected final static String LIBRO_IVA_TAX_SUBREPORT_JASPER_REPORT_FILENAME = "SubReport_TaxInformeLibroIva.jasper";
	
	/** UID del Libro de Mayor */
	protected final static String DIARIO_DEL_MAYOR_JASPER_REPORT_UID = "CORE-AD_JasperReport-1000007";
	protected final static String DIARIO_DEL_MAYOR_JASPER_REPORT_FILENAME = "DiarioMayor.jasper";
	
	/** UID del Informe de Ventas por Provincia */
	protected final static String REPORT_SALES_BY_PROVINCE_REPORT_UID = "CORE-AD_Process-1010380";
	protected final static String REPORT_SALES_BY_PROVINCE_REPORT_FILENAME = "report_sales_by_province.jrxml";
	
	/** UID del Informe de Libro Diario */
	protected final static String REPORT_JOURNAL_BOOK_REPORT_UID = "CORE-AD_Process-1010379";
	protected final static String REPORT_JOURNAL_BOOK_REPORT_FILENAME = "LibroDiario.jrxml";
	
	/** UID del Informe de inventario de bienes de uso */
	protected final static String INVENTORY_ASSETS_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010046";
	protected final static String INVENTORY_ASSETS_JASPER_REPORT_FILENAME = "InventoryAssetsReport.jasper";
	
	/** UID del informe de Precios Actualizados */
	protected final static String UPDATED_PRICES_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010095";
	protected final static String UPDATED_PRICES_JASPER_REPORT_FILENAME = "UpdatedPrices.jasper";
	
	/** UID del Informe de Comprobantes por Titular de Tarjeta */
	protected final static String INVOICES_BY_CREDIT_CARD_OWNER_REPORT_UID = "CORE-AD_Process-1010381";
	protected final static String INVOICES_BY_CREDIT_CARD_OWNER_REPORT_FILENAME = "InvoicesByCreditCardOwner.jrxml";

	/** Informe de Recibos de Cliente */
	protected final static String CUSTOMER_RECEIPT_JASPER_REPORT_UID = "CORE-AD_JasperReport-1000016";
	protected final static String CUSTOMER_RECEIPT_JASPER_REPORT_FILENAME = "ReciboCliente.jasper";
	
	/** IVA Ventas General */
	protected final static String IVA_VENTA_GENERAL_REPORT_UID = "CORE-AD_Process-1010324";
	protected final static String IVA_VENTA_GENERAL_REPORT_FILENAME = "Iva_Ventas.jrxml";
	
	/** UID del Informe de Ranking de Ventas */
	protected final static String SALES_RANKING_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010099";
	protected final static String SALES_RANKING_JASPER_REPORT_FILENAME = "SalesRanking.jasper";
	
	/** UID del reporte de Precios Diferidos */
	protected final static String DEFERRED_PRICES_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010078";
	protected final static String DEFERRED_PRICES_JASPER_REPORT_FILENAME = "DeferredPrices.jasper";
	
	/** UID del Informe de Venta/Compra de Entidades Financieras */
	protected final static String ENTIDADES_FINANCIERAS_SALES_PURCHASES_REPORT_UID = "CORE-AD_Process-1010358";
	protected final static String ENTIDADES_FINANCIERAS_SALES_PURCHASES_REPORT_FILENAME = "EntidadFinancieraSalesPurchases.jrxml";
	
	/** UID del Informe de Cuenta Corriente de Entidades Financieras */
	protected final static String ENTIDADES_FINANCIERAS_CURRENT_ACCOUNT_REPORT_UID = "CORE-AD_Process-1010360";
	protected final static String ENTIDADES_FINANCIERAS_CURRENT_ACCOUNT_REPORT_FILENAME = "EntidadFinancieraCuentaCorriente.jrxml";
	
	/** UID del Informe de Saldos de Entidades Financieras */
	protected final static String ENTIDADES_FINANCIERAS_BALANCES_REPORT_UID = "CORE-AD_Process-1010361";
	protected final static String ENTIDADES_FINANCIERAS_BALANCES_REPORT_FILENAME = "EntidadFinancieraBalances.jrxml";
	
	/** UID del Informe de Comprobante de Retención */
	protected final static String RPT_COMPROBANTE_RETENCION_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010081";
	protected final static String RPT_COMPROBANTE_RETENCION_JASPER_REPORT_FILENAME = "rpt_Comprobante_Retencion.jasper";
	
	/** UID del informe de movimientos de compra/venta por artículo */
	protected final static String PRODUCT_SALES_PURCHASE_MOVEMENTS_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010090";
	protected final static String PRODUCT_SALES_PURCHASE_MOVEMENTS_JASPER_REPORT_FILENAME = "ProductSalesPurchaseMovements.jasper";
	
	/** UID de la impresión de Factura Electrónica */
	protected final static String ELETRONIC_INVOICE_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010118";
	protected final static String ELETRONIC_INVOICE_JASPER_REPORT_FILENAME = "rpt_Factura_Electronica.jasper";
	
	/** UID del reporte de Movimientos por Artículo */
	protected final static String PRODUCT_MOVEMENTS_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010079";
	protected final static String PRODUCT_MOVEMENTS_JASPER_REPORT_FILENAME = "ProductMovements.jasper";
	
	/** UID del informe Historia de Artículos*/
	protected final static String HISTORIA_DE_ARTICULOS_REPORT_UID = "CORE-AD_Process-1010341";
	/** Nombre del .jrxml del informe Historia de Artículos*/
	protected final static String HISTORIA_DE_ARTICULOS_REPORT_FILENAME = "HistoriaDeArticulos.jrxml";
	
	/** UID del Informe de Cambio de Precios */
	protected final static String PRICE_CHANGING_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010121";
	protected final static String PRICE_CHANGING_JASPER_REPORT_FILENAME = "PriceChanging.jasper";
	
	/** UID del Informe de Cambio de Reglas de Precios */
	protected final static String UPDATED_DISCOUNT_SCHEMAS_REPORT_UID = "CORE-AD_Process-1010392";
	protected final static String UPDATED_DISCOUNT_SCHEMAS_REPORT_FILENAME = "UpdatedDiscountSchemas.jrxml";
	
	/** UID del Reporte de Deudas de Cuentas Corrientes */
	protected final static String CURRENT_ACCOUNT_DEBTS_REPORT_UID = "CORE-AD_Process-1010394";
	protected final static String CURRENT_ACCOUNT_DEBTS_REPORT_FILENAME = "CurrentAccountDebts.jrxml";
	
	/** UID del Reporte de Artículos Pedidos */
	protected final static String ORDERED_PRODUCTS_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010122";
	protected final static String ORDERED_PRODUCTS_JASPER_REPORT_FILENAME = "OrderedProducts.jasper";
	
	/** UID del Reporte de Estados de Cheques */
	protected final static String REJECTED_CHECKS_REPORT_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010123";
	protected final static String REJECTED_CHECKS_REPORT_JASPER_REPORT_FILENAME = "RejectedChecks.jasper";
	
	/** UID del Informe de Ventas por Region */
	protected final static String VENTAS_POR_REGION_REPORT_UID = "CORE-AD_Process-1010399";
	protected final static String VENTAS_POR_REGION_REPORT_FILENAME = "VentasPorRegion.jrxml";
	
	/** UID del Informe de Compras por Region */
	protected final static String COMPRAS_POR_REGION_REPORT_UID = "CORE-AD_Process-1010400";
	protected final static String COMPRAS_POR_REGION_REPORT_FILENAME = "ComprasPorRegion.jrxml";
	
	/** UID del Informe de Cobranzas y Pagos */
	protected final static String INFORME_DE_COBRANZAS_Y_PAGOS_REPORT_UID = "CORE-AD_Process-1010401";
	protected final static String INFORME_DE_COBRANZAS_Y_PAGOS_REPORT_FILENAME = "InformeDeCobranzasYPagos.jrxml";
	
	/** UID del Informe de Declaración de Valores por Organización */
	protected final static String DECLARACION_VALORES_X_ORG_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010105";
	protected final static String DECLARACION_VALORES_X_ORG_JASPER_REPORT_FILENAME = "DeclaracionDeValoresXOrg.jasper";
	
	/** UID del Listado de Cupones de Tarjeta */
	protected final static String LISTADO_DE_CUPONES_DE_TARJETA_REPORT_UID = "CORE-AD_Process-1010405";
	protected final static String LISTADO_DE_CUPONES_DE_TARJETA_REPORT_FILENAME = "ListadoCuponesTarjeta.jrxml";

	/** UID del Reporte Consulta de CUIT de Cheque */
	protected final static String CONSULTA_CUIT_CHEQUE_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010124";
	protected final static String CONSULTA_CUIT_CHEQUE_JASPER_REPORT_FILENAME = "ConsultaCUITCheque.jasper";
	
	/** UID del Listado de Control de Facturas sin Remitos */
	protected final static String INVOICES_WITHOUT_INOUT_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010125";
	protected final static String INVOICES_WITHOUT_INOUT_JASPER_REPORT_FILENAME = "InvoicesWithoutInOut.jasper";
	
	/** UID del Listado de Recibos de Cliente/Ordenes de Pago */
	protected final static String RECEIVE_ORDER_PAYMENT_LIST_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010126";
	protected final static String RECEIVE_ORDER_PAYMENT_LIST_JASPER_REPORT_FILENAME = "OrderReceivesPaymentReport.jasper";
	
	/** UID del Listado de Cheques por Entidad Comercial */
	protected final static String CHECKS_BY_BUSINESS_JASPER_REPORT_UID = "CORE-AD_JasperReport-1010128";
	protected final static String CHECKS_BY_BUSINESS_JASPER_REPORT_FILENAME = "ChecksByBusiness.jasper";
	
	/** UID del Informe de Auditoría de Inventario Físico */
	protected final static String PHYSICAL_INVENTORY_AUDIT_REPORT_UID = "CORE-AD_Process-1010369";
	protected final static String PHYSICAL_INVENTORY_AUDIT_REPORT_FILENAME = "PhysicalInventoryAudit.jrxml";
	
	@Override
	protected String doIt() throws Exception {
		super.doIt();
		
		/*
		 * Actualizacion de binarios
		 * """"""""""""""""""""""""" 
		 * Utilizar SIEMPRE los métodos MJasperReport.updateBinaryData() y MProcess.addAttachment() 
		 * para la carga de informes tipo Jasper, el primero para la carga en AD_JasperReport y el 
		 * segundo en reportes dinámicos, los cuales van adjuntos en el informe/proceso correspondiente.
		 */
		
		// Movimientos de artículo detallado
		MJasperReport
				.updateBinaryData(
						get_TrxName(),
						getCtx(),
						PRODUCT_MOVEMENTS_DETAILED_JASPER_REPORT_UID,
						JarHelper
								.readBinaryFromJar(
										jarFileURL,
										getBinaryFileURL(PRODUCT_MOVEMENTS_DETAILED_JASPER_REPORT_FILENAME)));
		
		// Informe de Libro de IVA
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					LIBRO_IVA_REPORT_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(LIBRO_IVA_REPORT_JASPER_REPORT_FILENAME)));
		
		// Subreporte de impuestos del Informe de Libro de IVA
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					LIBRO_IVA_TAX_SUBREPORT_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(LIBRO_IVA_TAX_SUBREPORT_JASPER_REPORT_FILENAME)));
		
		// Informe de Libro del Mayor
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					DIARIO_DEL_MAYOR_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(DIARIO_DEL_MAYOR_JASPER_REPORT_FILENAME)));
				
		// Informe de Ventas por Provincia
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				REPORT_SALES_BY_PROVINCE_REPORT_UID,
				REPORT_SALES_BY_PROVINCE_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(REPORT_SALES_BY_PROVINCE_REPORT_FILENAME)));
		
		// Informe de Libro Diario
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				REPORT_JOURNAL_BOOK_REPORT_UID,
				REPORT_JOURNAL_BOOK_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(REPORT_JOURNAL_BOOK_REPORT_FILENAME)));
		
		// Informe de inventario de bienes de uso
		MJasperReport
		.updateBinaryData(
				get_TrxName(),
				getCtx(),
				INVENTORY_ASSETS_JASPER_REPORT_UID,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(INVENTORY_ASSETS_JASPER_REPORT_FILENAME)));

		// Reporte de precios actualizados
		MJasperReport
		.updateBinaryData(
				get_TrxName(),
				getCtx(),
				UPDATED_PRICES_JASPER_REPORT_UID,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(UPDATED_PRICES_JASPER_REPORT_FILENAME)));

		// Informe de Comprobantes por Titular de Tarjeta
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				INVOICES_BY_CREDIT_CARD_OWNER_REPORT_UID,
				INVOICES_BY_CREDIT_CARD_OWNER_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(INVOICES_BY_CREDIT_CARD_OWNER_REPORT_FILENAME)));
		
		// Actualización del reporte de Recibos de cliente
		MJasperReport
		.updateBinaryData(
				get_TrxName(),
				getCtx(),
				CUSTOMER_RECEIPT_JASPER_REPORT_UID,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(CUSTOMER_RECEIPT_JASPER_REPORT_FILENAME)));
		
		// Informe IVA Ventas General
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				IVA_VENTA_GENERAL_REPORT_UID,
				IVA_VENTA_GENERAL_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(IVA_VENTA_GENERAL_REPORT_FILENAME)));
		
		// Informe de Ranking de Ventas
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					SALES_RANKING_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(SALES_RANKING_JASPER_REPORT_FILENAME)));
		
		// Informe de Precios Diferidos
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					DEFERRED_PRICES_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(DEFERRED_PRICES_JASPER_REPORT_FILENAME)));
		
		// Informe de Cuenta Corriente de EF
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				ENTIDADES_FINANCIERAS_CURRENT_ACCOUNT_REPORT_UID,
				ENTIDADES_FINANCIERAS_CURRENT_ACCOUNT_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(ENTIDADES_FINANCIERAS_CURRENT_ACCOUNT_REPORT_FILENAME)));

		// Informe de Cuenta Corriente de EF
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				ENTIDADES_FINANCIERAS_SALES_PURCHASES_REPORT_UID,
				ENTIDADES_FINANCIERAS_SALES_PURCHASES_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(ENTIDADES_FINANCIERAS_SALES_PURCHASES_REPORT_FILENAME)));
		
		// Informe de Comprobante de Retención
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					RPT_COMPROBANTE_RETENCION_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(RPT_COMPROBANTE_RETENCION_JASPER_REPORT_FILENAME)));

		// Movimientos de venta/compra de artículo
		MJasperReport
				.updateBinaryData(
						get_TrxName(),
						getCtx(),
						PRODUCT_SALES_PURCHASE_MOVEMENTS_JASPER_REPORT_UID,
						JarHelper
								.readBinaryFromJar(
										jarFileURL,
										getBinaryFileURL(PRODUCT_SALES_PURCHASE_MOVEMENTS_JASPER_REPORT_FILENAME)));
		
		// Impresión de Factura Electrónica
		MJasperReport
				.updateBinaryData(
						get_TrxName(),
						getCtx(),
						ELETRONIC_INVOICE_JASPER_REPORT_UID,
						JarHelper
								.readBinaryFromJar(
										jarFileURL,
										getBinaryFileURL(ELETRONIC_INVOICE_JASPER_REPORT_FILENAME)));
		
		// Reporte de Movimiento por Artículos
		MJasperReport
		.updateBinaryData(
				get_TrxName(),
				getCtx(),
				PRODUCT_MOVEMENTS_JASPER_REPORT_UID,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(PRODUCT_MOVEMENTS_JASPER_REPORT_FILENAME)));

		// Informe de Historia de Artículos
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				HISTORIA_DE_ARTICULOS_REPORT_UID,
				HISTORIA_DE_ARTICULOS_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(HISTORIA_DE_ARTICULOS_REPORT_FILENAME)));
		
		// Informe de Cambio de Reglas de Precio
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				UPDATED_DISCOUNT_SCHEMAS_REPORT_UID,
				UPDATED_DISCOUNT_SCHEMAS_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(UPDATED_DISCOUNT_SCHEMAS_REPORT_FILENAME)));
		
		// Informe de Cambio de Reglas de Precio
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				CURRENT_ACCOUNT_DEBTS_REPORT_UID,
				CURRENT_ACCOUNT_DEBTS_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(CURRENT_ACCOUNT_DEBTS_REPORT_FILENAME)));
		
		// Reporte de Movimiento por Artículos
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					ORDERED_PRODUCTS_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(ORDERED_PRODUCTS_JASPER_REPORT_FILENAME)));
		
		// Reporte Estado de Cheques
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					REJECTED_CHECKS_REPORT_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(REJECTED_CHECKS_REPORT_JASPER_REPORT_FILENAME)));
		
		// Informe de Ventas por Region
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				VENTAS_POR_REGION_REPORT_UID,
				VENTAS_POR_REGION_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(VENTAS_POR_REGION_REPORT_FILENAME)));
		
		// Informe de Compras por Region
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				COMPRAS_POR_REGION_REPORT_UID,
				COMPRAS_POR_REGION_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(COMPRAS_POR_REGION_REPORT_FILENAME)));
		
		// Informe de Cobranzas y Pagos
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				INFORME_DE_COBRANZAS_Y_PAGOS_REPORT_UID,
				INFORME_DE_COBRANZAS_Y_PAGOS_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(INFORME_DE_COBRANZAS_Y_PAGOS_REPORT_FILENAME)));
		
		// Declaración de valores por organización
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					DECLARACION_VALORES_X_ORG_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(DECLARACION_VALORES_X_ORG_JASPER_REPORT_FILENAME)));
		
		// Historia de Artículos
		String getID_HistoriaDeArticulos_FromUID = " SELECT AD_Process_ID FROM AD_Process WHERE AD_ComponentObjectUID = ?";
		int historiaDeArticulos_Process_Record_ID = DB.getSQLValue(get_TrxName(), getID_HistoriaDeArticulos_FromUID, HISTORIA_DE_ARTICULOS_REPORT_UID);
		
		String getAttachment_HistoriaDeArticulos = "SELECT AD_Attachment_ID FROM AD_Attachment WHERE AD_Table_ID = ? AND Record_ID = ?";
		int historiaDeArticulos_Attachment_Record_ID = DB.getSQLValue(get_TrxName(), getAttachment_HistoriaDeArticulos, MProcess.Table_ID, historiaDeArticulos_Process_Record_ID);
		
		if(historiaDeArticulos_Attachment_Record_ID > 0){
			DB.executeUpdate("DELETE FROM AD_Attachment WHERE AD_Table_ID = "+ MProcess.Table_ID +" AND Record_ID = "+ historiaDeArticulos_Process_Record_ID, get_TrxName());
		}
		MAttachment att_HistoriaDeArticulos  = new MAttachment(getCtx(), 0, get_TrxName()); 
		att_HistoriaDeArticulos.setAD_Table_ID(MProcess.Table_ID);
		att_HistoriaDeArticulos.setRecord_ID(historiaDeArticulos_Process_Record_ID);
		att_HistoriaDeArticulos.addEntry("HistoriaDeArticulos.jrxml", JarHelper.readBinaryFromJar(jarFileURL,getBinaryFileURL(HISTORIA_DE_ARTICULOS_REPORT_FILENAME)));
		if(!att_HistoriaDeArticulos.save()){
			throw new Exception ("Error al guardar jrxml ");
		}
		
		// Listado de Cupones de Tarjeta
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				LISTADO_DE_CUPONES_DE_TARJETA_REPORT_UID,
				LISTADO_DE_CUPONES_DE_TARJETA_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(LISTADO_DE_CUPONES_DE_TARJETA_REPORT_FILENAME)));
		
		// Consulta de CUIT de Cheque
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					CONSULTA_CUIT_CHEQUE_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(CONSULTA_CUIT_CHEQUE_JASPER_REPORT_FILENAME)));
		
		// Listado de Control de Facturas sin Remito
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					INVOICES_WITHOUT_INOUT_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(INVOICES_WITHOUT_INOUT_JASPER_REPORT_FILENAME)));
		
		// Listado de Recibos de Cliente/Ordenes de Pago
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					RECEIVE_ORDER_PAYMENT_LIST_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(RECEIVE_ORDER_PAYMENT_LIST_JASPER_REPORT_FILENAME)));
		
		// Cheques por Entidad Comercial
		MJasperReport
			.updateBinaryData(
					get_TrxName(),
					getCtx(),
					CHECKS_BY_BUSINESS_JASPER_REPORT_UID,
					JarHelper
							.readBinaryFromJar(
									jarFileURL,
									getBinaryFileURL(CHECKS_BY_BUSINESS_JASPER_REPORT_FILENAME)));
		
		// Auditoría de Inventario Físico
		MProcess.addAttachment(
				get_TrxName(),
				getCtx(),
				PHYSICAL_INVENTORY_AUDIT_REPORT_UID,
				PHYSICAL_INVENTORY_AUDIT_REPORT_FILENAME,
				JarHelper
						.readBinaryFromJar(
								jarFileURL,
								getBinaryFileURL(PHYSICAL_INVENTORY_AUDIT_REPORT_FILENAME)));
		
		return " ";
	}

}
