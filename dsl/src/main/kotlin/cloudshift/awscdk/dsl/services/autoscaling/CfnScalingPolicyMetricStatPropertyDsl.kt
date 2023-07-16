@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyMetricStatPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.MetricStatProperty.Builder =
      CfnScalingPolicy.MetricStatProperty.builder()

  public fun metric(metric: IResolvable) {
    cdkBuilder.metric(metric)
  }

  public fun metric(metric: CfnScalingPolicy.MetricProperty) {
    cdkBuilder.metric(metric)
  }

  public fun stat(stat: String) {
    cdkBuilder.stat(stat)
  }

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnScalingPolicy.MetricStatProperty = cdkBuilder.build()
}
