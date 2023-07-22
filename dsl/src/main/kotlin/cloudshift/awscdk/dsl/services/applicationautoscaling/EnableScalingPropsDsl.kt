@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.applicationautoscaling.EnableScalingProps

@CdkDslMarker
public class EnableScalingPropsDsl {
  private val cdkBuilder: EnableScalingProps.Builder = EnableScalingProps.builder()

  /**
   * @param maxCapacity Maximum capacity to scale to. 
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity Minimum capacity to scale to.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): EnableScalingProps = cdkBuilder.build()
}
