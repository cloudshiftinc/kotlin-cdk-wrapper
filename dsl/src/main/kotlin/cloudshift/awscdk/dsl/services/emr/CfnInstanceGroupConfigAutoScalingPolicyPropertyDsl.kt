@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

/**
 * `AutoScalingPolicy` defines how an instance group dynamically adds and terminates EC2 instances
 * in response to the value of a CloudWatch metric.
 *
 * For more information, see [Using Automatic Scaling in Amazon
 * EMR](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-automatic-scaling.html) in the
 * *Amazon EMR Management Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * AutoScalingPolicyProperty autoScalingPolicyProperty = AutoScalingPolicyProperty.builder()
 * .constraints(ScalingConstraintsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build())
 * .rules(List.of(ScalingRuleProperty.builder()
 * .action(ScalingActionProperty.builder()
 * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .adjustmentType("adjustmentType")
 * .coolDown(123)
 * .build())
 * // the properties below are optional
 * .market("market")
 * .build())
 * .name("name")
 * .trigger(ScalingTriggerProperty.builder()
 * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .metricName("metricName")
 * .period(123)
 * .threshold(123)
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic("statistic")
 * .unit("unit")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-autoscalingpolicy.html)
 */
@CdkDslMarker
public class CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl {
  private val cdkBuilder: CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder =
      CfnInstanceGroupConfig.AutoScalingPolicyProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
   * policy. 
   * Automatic scaling activity will not cause an instance group to grow above or below these
   * limits.
   */
  public fun constraints(constraints: IResolvable) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
   * policy. 
   * Automatic scaling activity will not cause an instance group to grow above or below these
   * limits.
   */
  public fun constraints(constraints: CfnInstanceGroupConfig.ScalingConstraintsProperty) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnInstanceGroupConfig.AutoScalingPolicyProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
