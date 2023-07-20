@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions

@CdkDslMarker
public class NetworkForwardOptionsDsl {
  private val cdkBuilder: NetworkForwardOptions.Builder = NetworkForwardOptions.builder()

  public fun stickinessDuration(stickinessDuration: Duration) {
    cdkBuilder.stickinessDuration(stickinessDuration)
  }

  public fun build(): NetworkForwardOptions = cdkBuilder.build()
}
