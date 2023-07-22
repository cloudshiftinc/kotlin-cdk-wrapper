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

  /**
   * @param computationId The ID for a computation. 
   */
  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  /**
   * @param name The name of a computation.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param periodSize The period size setup of a growth rate computation.
   */
  public fun periodSize(periodSize: Number) {
    cdkBuilder.periodSize(periodSize)
  }

  /**
   * @param time The time field that is used in a computation. 
   */
  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  /**
   * @param time The time field that is used in a computation. 
   */
  public fun time(time: CfnTemplate.DimensionFieldProperty) {
    cdkBuilder.time(time)
  }

  /**
   * @param value The value field that is used in a computation.
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The value field that is used in a computation.
   */
  public fun `value`(`value`: CfnTemplate.MeasureFieldProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.GrowthRateComputationProperty = cdkBuilder.build()
}
