@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPeriodToDateComputationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PeriodToDateComputationProperty.Builder =
      CfnDashboard.PeriodToDateComputationProperty.builder()

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
   * @param periodTimeGranularity The time granularity setup of period to date computation. Choose
   * from the following options:.
   * * YEAR: Year to date.
   * * MONTH: Month to date.
   */
  public fun periodTimeGranularity(periodTimeGranularity: String) {
    cdkBuilder.periodTimeGranularity(periodTimeGranularity)
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
  public fun time(time: CfnDashboard.DimensionFieldProperty) {
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
  public fun `value`(`value`: CfnDashboard.MeasureFieldProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.PeriodToDateComputationProperty = cdkBuilder.build()
}
