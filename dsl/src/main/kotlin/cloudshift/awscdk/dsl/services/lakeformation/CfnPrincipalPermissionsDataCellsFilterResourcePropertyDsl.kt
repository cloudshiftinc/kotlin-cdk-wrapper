@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@CdkDslMarker
public class CfnPrincipalPermissionsDataCellsFilterResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.DataCellsFilterResourceProperty.Builder =
      CfnPrincipalPermissions.DataCellsFilterResourceProperty.builder()

  /**
   * @param databaseName A database in the Data Catalog . 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param name The name given by the user to the data filter cell. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tableCatalogId The ID of the catalog to which the table belongs. 
   */
  public fun tableCatalogId(tableCatalogId: String) {
    cdkBuilder.tableCatalogId(tableCatalogId)
  }

  /**
   * @param tableName The name of the table. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnPrincipalPermissions.DataCellsFilterResourceProperty = cdkBuilder.build()
}
