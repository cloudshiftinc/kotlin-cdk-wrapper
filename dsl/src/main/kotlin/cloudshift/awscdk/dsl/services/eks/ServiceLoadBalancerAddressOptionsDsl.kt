@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions

@CdkDslMarker
public class ServiceLoadBalancerAddressOptionsDsl {
  private val cdkBuilder: ServiceLoadBalancerAddressOptions.Builder =
      ServiceLoadBalancerAddressOptions.builder()

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): ServiceLoadBalancerAddressOptions = cdkBuilder.build()
}
