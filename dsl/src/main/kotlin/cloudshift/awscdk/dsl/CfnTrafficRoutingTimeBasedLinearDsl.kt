@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear

@CdkDslMarker
public class CfnTrafficRoutingTimeBasedLinearDsl {
  private val cdkBuilder: CfnTrafficRoutingTimeBasedLinear.Builder =
      CfnTrafficRoutingTimeBasedLinear.builder()

  public fun bakeTimeMins(bakeTimeMins: Number) {
    cdkBuilder.bakeTimeMins(bakeTimeMins)
  }

  public fun stepPercentage(stepPercentage: Number) {
    cdkBuilder.stepPercentage(stepPercentage)
  }

  public fun build(): CfnTrafficRoutingTimeBasedLinear = cdkBuilder.build()
}
