@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The conditions that trigger an automatic scaling activity and the definition of a CloudWatch
 * metric alarm.
 *
 * When the defined alarm conditions are met along with other trigger parameters, scaling activity
 * begins.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ScalingTriggerProperty scalingTriggerProperty = ScalingTriggerProperty.builder()
 * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
 * .metricName("metricName")
 * .period(Duration.minutes(30))
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
 * .threshold(123)
 * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingTrigger.html)
 */
@CdkDslMarker
public class EmrCreateClusterScalingTriggerPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ScalingTriggerProperty.Builder =
      EmrCreateCluster.ScalingTriggerProperty.builder()

  /**
   * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
   * When the defined alarm conditions are met along with other trigger parameters,
   * scaling activity begins.
   */
  public
      fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl()
    builder.apply(cloudWatchAlarmDefinition)
    cdkBuilder.cloudWatchAlarmDefinition(builder.build())
  }

  /**
   * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
   * When the defined alarm conditions are met along with other trigger parameters,
   * scaling activity begins.
   */
  public
      fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: EmrCreateCluster.CloudWatchAlarmDefinitionProperty) {
    cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
  }

  public fun build(): EmrCreateCluster.ScalingTriggerProperty = cdkBuilder.build()
}
