@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingCustomizedScalingMetricPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty.Builder
      = CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty.builder()

  private val _metricDataQueries: MutableList<Any> = mutableListOf()

  /**
   * @param metricDataQueries One or more metric data queries to provide the data points for a
   * scaling metric. 
   * Use multiple metric data queries only if you are performing a math expression on returned data.
   */
  public fun metricDataQueries(vararg metricDataQueries: Any) {
    _metricDataQueries.addAll(listOf(*metricDataQueries))
  }

  /**
   * @param metricDataQueries One or more metric data queries to provide the data points for a
   * scaling metric. 
   * Use multiple metric data queries only if you are performing a math expression on returned data.
   */
  public fun metricDataQueries(metricDataQueries: Collection<Any>) {
    _metricDataQueries.addAll(metricDataQueries)
  }

  /**
   * @param metricDataQueries One or more metric data queries to provide the data points for a
   * scaling metric. 
   * Use multiple metric data queries only if you are performing a math expression on returned data.
   */
  public fun metricDataQueries(metricDataQueries: IResolvable) {
    cdkBuilder.metricDataQueries(metricDataQueries)
  }

  public fun build(): CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty {
    if(_metricDataQueries.isNotEmpty()) cdkBuilder.metricDataQueries(_metricDataQueries)
    return cdkBuilder.build()
  }
}
