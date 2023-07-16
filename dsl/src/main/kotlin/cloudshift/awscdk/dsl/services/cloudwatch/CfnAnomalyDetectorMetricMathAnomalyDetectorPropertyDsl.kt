@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder =
      CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.builder()

  private val _metricDataQueries: MutableList<Any> = mutableListOf()

  public fun metricDataQueries(vararg metricDataQueries: Any) {
    _metricDataQueries.addAll(listOf(*metricDataQueries))
  }

  public fun metricDataQueries(metricDataQueries: Collection<Any>) {
    _metricDataQueries.addAll(metricDataQueries)
  }

  public fun metricDataQueries(metricDataQueries: IResolvable) {
    cdkBuilder.metricDataQueries(metricDataQueries)
  }

  public fun build(): CfnAnomalyDetector.MetricMathAnomalyDetectorProperty {
    if(_metricDataQueries.isNotEmpty()) cdkBuilder.metricDataQueries(_metricDataQueries)
    return cdkBuilder.build()
  }
}
