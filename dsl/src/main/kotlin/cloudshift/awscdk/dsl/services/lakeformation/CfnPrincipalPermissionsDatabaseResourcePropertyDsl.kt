@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@CdkDslMarker
public class CfnPrincipalPermissionsDatabaseResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.DatabaseResourceProperty.Builder =
      CfnPrincipalPermissions.DatabaseResourceProperty.builder()

  /**
   * @param catalogId The identifier for the Data Catalog. 
   * By default, it is the account ID of the caller.
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param name The name of the database resource. 
   * Unique to the Data Catalog.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnPrincipalPermissions.DatabaseResourceProperty = cdkBuilder.build()
}
