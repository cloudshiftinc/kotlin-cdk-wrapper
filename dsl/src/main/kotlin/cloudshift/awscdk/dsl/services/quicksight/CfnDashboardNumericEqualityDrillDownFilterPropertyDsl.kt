@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNumericEqualityDrillDownFilterPropertyDsl {
  private val cdkBuilder: CfnDashboard.NumericEqualityDrillDownFilterProperty.Builder =
      CfnDashboard.NumericEqualityDrillDownFilterProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.NumericEqualityDrillDownFilterProperty = cdkBuilder.build()
}
