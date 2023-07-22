@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

@CdkDslMarker
public class CfnScalableTargetScalableTargetActionPropertyDsl {
  private val cdkBuilder: CfnScalableTarget.ScalableTargetActionProperty.Builder =
      CfnScalableTarget.ScalableTargetActionProperty.builder()

  /**
   * @param maxCapacity The maximum capacity.
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The minimum capacity.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): CfnScalableTarget.ScalableTargetActionProperty = cdkBuilder.build()
}
