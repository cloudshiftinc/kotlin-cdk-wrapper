@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableCellConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableCellConditionalFormattingProperty.Builder =
      CfnAnalysis.PivotTableCellConditionalFormattingProperty.builder()

  private val _scopes: MutableList<Any> = mutableListOf()

  /**
   * @param fieldId The field ID of the cell for conditional formatting. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param scope The scope of the cell for conditional formatting.
   */
  public fun scope(scope: IResolvable) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param scope The scope of the cell for conditional formatting.
   */
  public fun scope(scope: CfnAnalysis.PivotTableConditionalFormattingScopeProperty) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param scopes A list of cell scopes for conditional formatting.
   */
  public fun scopes(vararg scopes: Any) {
    _scopes.addAll(listOf(*scopes))
  }

  /**
   * @param scopes A list of cell scopes for conditional formatting.
   */
  public fun scopes(scopes: Collection<Any>) {
    _scopes.addAll(scopes)
  }

  /**
   * @param scopes A list of cell scopes for conditional formatting.
   */
  public fun scopes(scopes: IResolvable) {
    cdkBuilder.scopes(scopes)
  }

  /**
   * @param textFormat The text format of the cell for conditional formatting.
   */
  public fun textFormat(textFormat: IResolvable) {
    cdkBuilder.textFormat(textFormat)
  }

  /**
   * @param textFormat The text format of the cell for conditional formatting.
   */
  public fun textFormat(textFormat: CfnAnalysis.TextConditionalFormatProperty) {
    cdkBuilder.textFormat(textFormat)
  }

  public fun build(): CfnAnalysis.PivotTableCellConditionalFormattingProperty {
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
