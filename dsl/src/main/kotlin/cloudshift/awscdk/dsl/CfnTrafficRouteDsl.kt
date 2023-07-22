@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnTrafficRoute

/**
 * A traffic route, representing where the traffic is being directed to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnTrafficRoute cfnTrafficRoute = CfnTrafficRoute.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnTrafficRouteDsl {
  private val cdkBuilder: CfnTrafficRoute.Builder = CfnTrafficRoute.builder()

  /**
   * @param logicalId The logical id of the target resource. 
   */
  public fun logicalId(logicalId: String) {
    cdkBuilder.logicalId(logicalId)
  }

  /**
   * @param type The resource type of the route. 
   * Today, the only allowed value is 'AWS::ElasticLoadBalancingV2::Listener'.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTrafficRoute = cdkBuilder.build()
}
