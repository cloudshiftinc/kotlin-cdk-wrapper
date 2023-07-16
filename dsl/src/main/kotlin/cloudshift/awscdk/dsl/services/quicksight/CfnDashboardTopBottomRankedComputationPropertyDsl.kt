@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTopBottomRankedComputationPropertyDsl {
  private val cdkBuilder: CfnDashboard.TopBottomRankedComputationProperty.Builder =
      CfnDashboard.TopBottomRankedComputationProperty.builder()

  public fun category(category: IResolvable) {
    cdkBuilder.category(category)
  }

  public fun category(category: CfnDashboard.DimensionFieldProperty) {
    cdkBuilder.category(category)
  }

  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resultSize(resultSize: Number) {
    cdkBuilder.resultSize(resultSize)
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

  public fun build(): CfnDashboard.TopBottomRankedComputationProperty = cdkBuilder.build()
}
