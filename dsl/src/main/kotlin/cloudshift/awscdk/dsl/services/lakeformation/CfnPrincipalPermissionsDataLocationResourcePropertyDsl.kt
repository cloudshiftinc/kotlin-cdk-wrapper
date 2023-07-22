@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@CdkDslMarker
public class CfnPrincipalPermissionsDataLocationResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.DataLocationResourceProperty.Builder =
      CfnPrincipalPermissions.DataLocationResourceProperty.builder()

  /**
   * @param catalogId The identifier for the Data Catalog where the location is registered with AWS
   * Lake Formation . 
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies the data location
   * resource. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnPrincipalPermissions.DataLocationResourceProperty = cdkBuilder.build()
}
