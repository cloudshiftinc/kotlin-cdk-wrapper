@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterPublicAccessPropertyDsl {
  private val cdkBuilder: CfnCluster.PublicAccessProperty.Builder =
      CfnCluster.PublicAccessProperty.builder()

  /**
   * @param type DISABLED means that public access is turned off.
   * SERVICE_PROVIDED_EIPS means that public access is turned on.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCluster.PublicAccessProperty = cdkBuilder.build()
}
