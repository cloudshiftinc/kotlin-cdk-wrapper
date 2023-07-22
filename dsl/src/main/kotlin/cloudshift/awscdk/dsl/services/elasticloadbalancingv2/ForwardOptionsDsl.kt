@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions

/**
 * Options for `ListenerAction.forward()`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * ForwardOptions forwardOptions = ForwardOptions.builder()
 * .stickinessDuration(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class ForwardOptionsDsl {
  private val cdkBuilder: ForwardOptions.Builder = ForwardOptions.builder()

  /**
   * @param stickinessDuration For how long clients should be directed to the same target group.
   * Range between 1 second and 7 days.
   */
  public fun stickinessDuration(stickinessDuration: Duration) {
    cdkBuilder.stickinessDuration(stickinessDuration)
  }

  public fun build(): ForwardOptions = cdkBuilder.build()
}
