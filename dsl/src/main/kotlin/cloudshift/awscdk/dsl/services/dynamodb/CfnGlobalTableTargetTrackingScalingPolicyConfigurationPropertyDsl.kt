@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Defines a target tracking scaling policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * TargetTrackingScalingPolicyConfigurationProperty targetTrackingScalingPolicyConfigurationProperty
 * = TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html)
 */
@CdkDslMarker
public class CfnGlobalTableTargetTrackingScalingPolicyConfigurationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.Builder =
      CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.builder()

  /**
   * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
   * disabled.
   * The default value is `false` .
   */
  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
   * disabled.
   * The default value is `false` .
   */
  public fun disableScaleIn(disableScaleIn: IResolvable) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity completes
   * before another scale-in activity can start.
   */
  public fun scaleInCooldown(scaleInCooldown: Number) {
    cdkBuilder.scaleInCooldown(scaleInCooldown)
  }

  /**
   * @param scaleOutCooldown The amount of time, in seconds, after a scale-out activity completes
   * before another scale-out activity can start.
   */
  public fun scaleOutCooldown(scaleOutCooldown: Number) {
    cdkBuilder.scaleOutCooldown(scaleOutCooldown)
  }

  /**
   * @param targetValue Defines a target value for the scaling policy. 
   */
  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty =
      cdkBuilder.build()
}
