@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@CdkDslMarker
public class CfnSecurityProfileMetricToRetainPropertyDsl {
  private val cdkBuilder: CfnSecurityProfile.MetricToRetainProperty.Builder =
      CfnSecurityProfile.MetricToRetainProperty.builder()

  /**
   * @param metric A standard of measurement. 
   */
  public fun metric(metric: String) {
    cdkBuilder.metric(metric)
  }

  /**
   * @param metricDimension The dimension of the metric.
   */
  public fun metricDimension(metricDimension: IResolvable) {
    cdkBuilder.metricDimension(metricDimension)
  }

  /**
   * @param metricDimension The dimension of the metric.
   */
  public fun metricDimension(metricDimension: CfnSecurityProfile.MetricDimensionProperty) {
    cdkBuilder.metricDimension(metricDimension)
  }

  public fun build(): CfnSecurityProfile.MetricToRetainProperty = cdkBuilder.build()
}
