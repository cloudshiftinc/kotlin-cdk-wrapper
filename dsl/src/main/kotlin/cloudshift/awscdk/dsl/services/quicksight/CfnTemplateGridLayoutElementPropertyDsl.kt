@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGridLayoutElementPropertyDsl {
  private val cdkBuilder: CfnTemplate.GridLayoutElementProperty.Builder =
      CfnTemplate.GridLayoutElementProperty.builder()

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

  public fun build(): CfnTemplate.GridLayoutElementProperty = cdkBuilder.build()
}
