@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint

@CdkDslMarker
public class ApplicationLoadBalancerEndpointDsl(
  arg0: IApplicationLoadBalancer,
) {
  private val cdkBuilder: ApplicationLoadBalancerEndpoint.Builder =
      ApplicationLoadBalancerEndpoint.Builder.create(arg0)

  public fun preserveClientIp(preserveClientIp: Boolean) {
    cdkBuilder.preserveClientIp(preserveClientIp)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): ApplicationLoadBalancerEndpoint = cdkBuilder.build()
}
