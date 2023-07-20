@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGridLayoutElementPropertyDsl {
  private val cdkBuilder: CfnDashboard.GridLayoutElementProperty.Builder =
      CfnDashboard.GridLayoutElementProperty.builder()

  public fun columnIndex(columnIndex: Number) {
    cdkBuilder.columnIndex(columnIndex)
  }

  public fun columnSpan(columnSpan: Number) {
    cdkBuilder.columnSpan(columnSpan)
  }

  public fun elementId(elementId: String) {
    cdkBuilder.elementId(elementId)
  }

  public fun elementType(elementType: String) {
    cdkBuilder.elementType(elementType)
  }

  public fun rowIndex(rowIndex: Number) {
    cdkBuilder.rowIndex(rowIndex)
  }

  public fun rowSpan(rowSpan: Number) {
    cdkBuilder.rowSpan(rowSpan)
  }

  public fun build(): CfnDashboard.GridLayoutElementProperty = cdkBuilder.build()
}
