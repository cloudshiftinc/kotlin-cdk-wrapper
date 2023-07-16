@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPermissions

@CdkDslMarker
public class CfnPermissionsDatabaseResourcePropertyDsl {
  private val cdkBuilder: CfnPermissions.DatabaseResourceProperty.Builder =
      CfnPermissions.DatabaseResourceProperty.builder()

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnPermissions.DatabaseResourceProperty = cdkBuilder.build()
}
