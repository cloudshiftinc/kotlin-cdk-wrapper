@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.refactorspaces.CfnRoute

@CdkDslMarker
public class CfnRouteDefaultRouteInputPropertyDsl {
  private val cdkBuilder: CfnRoute.DefaultRouteInputProperty.Builder =
      CfnRoute.DefaultRouteInputProperty.builder()

  /**
   * @param activationState If set to `ACTIVE` , traffic is forwarded to this route’s service after
   * the route is created. 
   */
  public fun activationState(activationState: String) {
    cdkBuilder.activationState(activationState)
  }

  public fun build(): CfnRoute.DefaultRouteInputProperty = cdkBuilder.build()
}
