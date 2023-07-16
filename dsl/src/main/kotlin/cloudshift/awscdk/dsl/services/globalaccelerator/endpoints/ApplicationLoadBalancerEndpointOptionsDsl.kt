@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpointOptions

@CdkDslMarker
public class ApplicationLoadBalancerEndpointOptionsDsl {
  private val cdkBuilder: ApplicationLoadBalancerEndpointOptions.Builder =
      ApplicationLoadBalancerEndpointOptions.builder()

  public fun preserveClientIp(preserveClientIp: Boolean) {
    cdkBuilder.preserveClientIp(preserveClientIp)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): ApplicationLoadBalancerEndpointOptions = cdkBuilder.build()
}
