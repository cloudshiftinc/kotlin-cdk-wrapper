@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTableCellConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableCellConditionalFormattingProperty.Builder =
      CfnDashboard.PivotTableCellConditionalFormattingProperty.builder()

  private val _scopes: MutableList<Any> = mutableListOf()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun scope(scope: IResolvable) {
    cdkBuilder.scope(scope)
  }

  public fun scope(scope: CfnDashboard.PivotTableConditionalFormattingScopeProperty) {
    cdkBuilder.scope(scope)
  }

  public fun scopes(vararg scopes: Any) {
    _scopes.addAll(listOf(*scopes))
  }

  public fun scopes(scopes: Collection<Any>) {
    _scopes.addAll(scopes)
  }

  public fun scopes(scopes: IResolvable) {
    cdkBuilder.scopes(scopes)
  }

  public fun textFormat(textFormat: IResolvable) {
    cdkBuilder.textFormat(textFormat)
  }

  public fun textFormat(textFormat: CfnDashboard.TextConditionalFormatProperty) {
    cdkBuilder.textFormat(textFormat)
  }

  public fun build(): CfnDashboard.PivotTableCellConditionalFormattingProperty {
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
