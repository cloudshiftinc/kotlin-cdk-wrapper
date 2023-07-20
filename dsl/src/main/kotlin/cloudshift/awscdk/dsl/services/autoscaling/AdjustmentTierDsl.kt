@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.AdjustmentTier

@CdkDslMarker
public class AdjustmentTierDsl {
  private val cdkBuilder: AdjustmentTier.Builder = AdjustmentTier.builder()

  public fun adjustment(adjustment: Number) {
    cdkBuilder.adjustment(adjustment)
  }

  public fun lowerBound(lowerBound: Number) {
    cdkBuilder.lowerBound(lowerBound)
  }

  public fun upperBound(upperBound: Number) {
    cdkBuilder.upperBound(upperBound)
  }

  public fun build(): AdjustmentTier = cdkBuilder.build()
}
