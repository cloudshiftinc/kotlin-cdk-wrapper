@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * Contains load metric information for the `CustomizedLoadMetricSpecification` property of the
 * [AWS::AutoScaling::ScalingPolicy
 * PredictiveScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * PredictiveScalingCustomizedLoadMetricProperty predictiveScalingCustomizedLoadMetricProperty =
 * PredictiveScalingCustomizedLoadMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedloadmetric.html)
 */
@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingCustomizedLoadMetricPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.Builder =
      CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.builder()

  private val _metricDataQueries: MutableList<Any> = mutableListOf()

  /**
   * @param metricDataQueries One or more metric data queries to provide the data points for a load
   * metric. 
   * Use multiple metric data queries only if you are performing a math expression on returned data.
   */
  public fun metricDataQueries(vararg metricDataQueries: Any) {
    _metricDataQueries.addAll(listOf(*metricDataQueries))
  }

  /**
   * @param metricDataQueries One or more metric data queries to provide the data points for a load
   * metric. 
   * Use multiple metric data queries only if you are performing a math expression on returned data.
   */
  public fun metricDataQueries(metricDataQueries: Collection<Any>) {
    _metricDataQueries.addAll(metricDataQueries)
  }

  /**
   * @param metricDataQueries One or more metric data queries to provide the data points for a load
   * metric. 
   * Use multiple metric data queries only if you are performing a math expression on returned data.
   */
  public fun metricDataQueries(metricDataQueries: IResolvable) {
    cdkBuilder.metricDataQueries(metricDataQueries)
  }

  public fun build(): CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty {
    if(_metricDataQueries.isNotEmpty()) cdkBuilder.metricDataQueries(_metricDataQueries)
    return cdkBuilder.build()
  }
}
