@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGrowthRateComputationPropertyDsl {
  private val cdkBuilder: CfnTemplate.GrowthRateComputationProperty.Builder =
      CfnTemplate.GrowthRateComputationProperty.builder()

  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun periodSize(periodSize: Number) {
    cdkBuilder.periodSize(periodSize)
  }

  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  public fun time(time: CfnTemplate.DimensionFieldProperty) {
    cdkBuilder.time(time)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnTemplate.MeasureFieldProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.GrowthRateComputationProperty = cdkBuilder.build()
}
