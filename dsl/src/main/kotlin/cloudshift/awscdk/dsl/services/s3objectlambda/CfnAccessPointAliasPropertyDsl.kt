@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointAliasPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.AliasProperty.Builder =
      CfnAccessPoint.AliasProperty.builder()

  /**
   * @param status The status of the Object Lambda Access Point alias. 
   * If the status is `PROVISIONING` , the Object Lambda Access Point is provisioning the alias and
   * the alias is not ready for use yet. If the status is `READY` , the Object Lambda Access Point
   * alias is successfully provisioned and ready for use.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param value The alias value of the Object Lambda Access Point. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAccessPoint.AliasProperty = cdkBuilder.build()
}
