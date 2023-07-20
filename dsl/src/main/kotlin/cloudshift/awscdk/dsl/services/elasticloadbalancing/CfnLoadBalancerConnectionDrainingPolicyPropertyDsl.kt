@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerConnectionDrainingPolicyPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder =
      CfnLoadBalancer.ConnectionDrainingPolicyProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnLoadBalancer.ConnectionDrainingPolicyProperty = cdkBuilder.build()
}
