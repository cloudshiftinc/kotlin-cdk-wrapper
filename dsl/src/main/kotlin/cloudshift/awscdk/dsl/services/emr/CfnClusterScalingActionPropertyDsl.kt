@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `ScalingAction` is a subproperty of the `ScalingRule` property type.
 *
 * `ScalingAction` determines the type of adjustment the automatic scaling activity makes when
 * triggered, and the periodicity of the adjustment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ScalingActionProperty scalingActionProperty = ScalingActionProperty.builder()
 * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .adjustmentType("adjustmentType")
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market("market")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-scalingaction.html)
 */
@CdkDslMarker
public class CfnClusterScalingActionPropertyDsl {
  private val cdkBuilder: CfnCluster.ScalingActionProperty.Builder =
      CfnCluster.ScalingActionProperty.builder()

  /**
   * @param market Not available for instance groups.
   * Instance groups use the market type specified for the group.
   */
  public fun market(market: String) {
    cdkBuilder.market(market)
  }

  /**
   * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling activity
   * makes when triggered, and the periodicity of the adjustment. 
   */
  public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
    cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
  }

  /**
   * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling activity
   * makes when triggered, and the periodicity of the adjustment. 
   */
  public
      fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: CfnCluster.SimpleScalingPolicyConfigurationProperty) {
    cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
  }

  public fun build(): CfnCluster.ScalingActionProperty = cdkBuilder.build()
}
