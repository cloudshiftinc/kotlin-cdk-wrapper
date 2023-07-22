@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder =
      CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.builder()

  /**
   * @param customizedCapacityMetricSpecification The customized capacity metric specification.
   */
  public
      fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: IResolvable) {
    cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification)
  }

  /**
   * @param customizedCapacityMetricSpecification The customized capacity metric specification.
   */
  public
      fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty) {
    cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification)
  }

  /**
   * @param customizedLoadMetricSpecification The customized load metric specification.
   */
  public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
    cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
  }

  /**
   * @param customizedLoadMetricSpecification The customized load metric specification.
   */
  public
      fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty) {
    cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
  }

  /**
   * @param customizedScalingMetricSpecification The customized scaling metric specification.
   */
  public
      fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable) {
    cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
  }

  /**
   * @param customizedScalingMetricSpecification The customized scaling metric specification.
   */
  public
      fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty) {
    cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
  }

  /**
   * @param predefinedLoadMetricSpecification The predefined load metric specification.
   */
  public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
    cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
  }

  /**
   * @param predefinedLoadMetricSpecification The predefined load metric specification.
   */
  public
      fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty) {
    cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
  }

  /**
   * @param predefinedMetricPairSpecification The predefined metric pair specification from which
   * Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
   */
  public fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: IResolvable) {
    cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification)
  }

  /**
   * @param predefinedMetricPairSpecification The predefined metric pair specification from which
   * Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
   */
  public
      fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty) {
    cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification)
  }

  /**
   * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
   */
  public
      fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable) {
    cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
  }

  /**
   * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
   */
  public
      fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty) {
    cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
  }

  /**
   * @param targetValue Specifies the target utilization. 
   *
   * Some metrics are based on a count instead of a percentage, such as the request count for an
   * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
   * specifies one of these metrics, specify the target utilization as the optimal average request or
   * message count per instance during any one-minute interval.
   */
  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty =
      cdkBuilder.build()
}
