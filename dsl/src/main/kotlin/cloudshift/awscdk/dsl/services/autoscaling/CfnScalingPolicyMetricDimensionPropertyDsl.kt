@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyMetricDimensionPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.MetricDimensionProperty.Builder =
      CfnScalingPolicy.MetricDimensionProperty.builder()

  /**
   * @param name The name of the dimension. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the dimension. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnScalingPolicy.MetricDimensionProperty = cdkBuilder.build()
}
