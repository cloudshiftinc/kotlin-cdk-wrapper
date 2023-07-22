@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

/**
 * Information about the target group stickiness for a rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * TargetGroupStickinessConfigProperty targetGroupStickinessConfigProperty =
 * TargetGroupStickinessConfigProperty.builder()
 * .durationSeconds(123)
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgroupstickinessconfig.html)
 */
@CdkDslMarker
public class CfnListenerTargetGroupStickinessConfigPropertyDsl {
  private val cdkBuilder: CfnListener.TargetGroupStickinessConfigProperty.Builder =
      CfnListener.TargetGroupStickinessConfigProperty.builder()

  /**
   * @param durationSeconds The time period, in seconds, during which requests from a client should
   * be routed to the same target group.
   * The range is 1-604800 seconds (7 days).
   */
  public fun durationSeconds(durationSeconds: Number) {
    cdkBuilder.durationSeconds(durationSeconds)
  }

  /**
   * @param enabled Indicates whether target group stickiness is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether target group stickiness is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnListener.TargetGroupStickinessConfigProperty = cdkBuilder.build()
}
