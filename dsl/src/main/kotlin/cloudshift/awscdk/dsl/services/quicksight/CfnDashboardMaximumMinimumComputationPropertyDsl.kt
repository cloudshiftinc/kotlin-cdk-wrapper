@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardMaximumMinimumComputationPropertyDsl {
  private val cdkBuilder: CfnDashboard.MaximumMinimumComputationProperty.Builder =
      CfnDashboard.MaximumMinimumComputationProperty.builder()

  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  public fun time(time: CfnDashboard.DimensionFieldProperty) {
    cdkBuilder.time(time)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnDashboard.MeasureFieldProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.MaximumMinimumComputationProperty = cdkBuilder.build()
}
