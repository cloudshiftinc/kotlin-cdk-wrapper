@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnTrafficRoute

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
