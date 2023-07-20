@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorMetricStatPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.MetricStatProperty.Builder =
      CfnAnomalyDetector.MetricStatProperty.builder()

  public fun metric(metric: IResolvable) {
    cdkBuilder.metric(metric)
  }

  public fun metric(metric: CfnAnomalyDetector.MetricProperty) {
    cdkBuilder.metric(metric)
  }

  public fun period(period: Number) {
    cdkBuilder.period(period)
  }

  public fun stat(stat: String) {
    cdkBuilder.stat(stat)
  }

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnAnomalyDetector.MetricStatProperty = cdkBuilder.build()
}
