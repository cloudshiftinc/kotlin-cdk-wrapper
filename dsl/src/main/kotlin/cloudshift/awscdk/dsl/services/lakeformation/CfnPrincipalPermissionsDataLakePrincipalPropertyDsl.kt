@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@CdkDslMarker
public class CfnPrincipalPermissionsDataLakePrincipalPropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.DataLakePrincipalProperty.Builder =
      CfnPrincipalPermissions.DataLakePrincipalProperty.builder()

  public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
    cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
  }

  public fun build(): CfnPrincipalPermissions.DataLakePrincipalProperty = cdkBuilder.build()
}
