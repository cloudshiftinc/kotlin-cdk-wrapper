@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentIoTJobExponentialRolloutRatePropertyDsl {
  private val cdkBuilder: CfnDeployment.IoTJobExponentialRolloutRateProperty.Builder =
      CfnDeployment.IoTJobExponentialRolloutRateProperty.builder()

  public fun baseRatePerMinute(baseRatePerMinute: Number) {
    cdkBuilder.baseRatePerMinute(baseRatePerMinute)
  }

  public fun incrementFactor(incrementFactor: Number) {
    cdkBuilder.incrementFactor(incrementFactor)
  }

  public fun rateIncreaseCriteria(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.rateIncreaseCriteria(builder.map)
  }

  public fun rateIncreaseCriteria(rateIncreaseCriteria: Any) {
    cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria)
  }

  public fun build(): CfnDeployment.IoTJobExponentialRolloutRateProperty = cdkBuilder.build()
}
