@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@CdkDslMarker
public class CfnPrincipalPermissionsDataCellsFilterResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.DataCellsFilterResourceProperty.Builder =
      CfnPrincipalPermissions.DataCellsFilterResourceProperty.builder()

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tableCatalogId(tableCatalogId: String) {
    cdkBuilder.tableCatalogId(tableCatalogId)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnPrincipalPermissions.DataCellsFilterResourceProperty = cdkBuilder.build()
}
