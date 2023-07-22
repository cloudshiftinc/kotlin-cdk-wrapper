@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterUnauthenticatedPropertyDsl {
  private val cdkBuilder: CfnCluster.UnauthenticatedProperty.Builder =
      CfnCluster.UnauthenticatedProperty.builder()

  /**
   * @param enabled Unauthenticated is enabled or not. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Unauthenticated is enabled or not. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnCluster.UnauthenticatedProperty = cdkBuilder.build()
}
