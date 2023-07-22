@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The cell conditional formatting option for a pivot table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableCellConditionalFormattingProperty pivotTableCellConditionalFormattingProperty =
 * PivotTableCellConditionalFormattingProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .scope(PivotTableConditionalFormattingScopeProperty.builder()
 * .role("role")
 * .build())
 * .scopes(List.of(PivotTableConditionalFormattingScopeProperty.builder()
 * .role("role")
 * .build()))
 * .textFormat(TextConditionalFormatProperty.builder()
 * .backgroundColor(ConditionalFormattingColorProperty.builder()
 * .gradient(ConditionalFormattingGradientColorProperty.builder()
 * .color(GradientColorProperty.builder()
 * .stops(List.of(GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build()))
 * .build())
 * .expression("expression")
 * .build())
 * .solid(ConditionalFormattingSolidColorProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .color("color")
 * .build())
 * .build())
 * .icon(ConditionalFormattingIconProperty.builder()
 * .customCondition(ConditionalFormattingCustomIconConditionProperty.builder()
 * .expression("expression")
 * .iconOptions(ConditionalFormattingCustomIconOptionsProperty.builder()
 * .icon("icon")
 * .unicodeIcon("unicodeIcon")
 * .build())
 * // the properties below are optional
 * .color("color")
 * .displayConfiguration(ConditionalFormattingIconDisplayConfigurationProperty.builder()
 * .iconDisplayOption("iconDisplayOption")
 * .build())
 * .build())
 * .iconSet(ConditionalFormattingIconSetProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .iconSetType("iconSetType")
 * .build())
 * .build())
 * .textColor(ConditionalFormattingColorProperty.builder()
 * .gradient(ConditionalFormattingGradientColorProperty.builder()
 * .color(GradientColorProperty.builder()
 * .stops(List.of(GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build()))
 * .build())
 * .expression("expression")
 * .build())
 * .solid(ConditionalFormattingSolidColorProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .color("color")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-pivottablecellconditionalformatting.html)
 */
@CdkDslMarker
public class CfnTemplatePivotTableCellConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableCellConditionalFormattingProperty.Builder =
      CfnTemplate.PivotTableCellConditionalFormattingProperty.builder()

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
  public fun scope(scope: CfnTemplate.PivotTableConditionalFormattingScopeProperty) {
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
  public fun textFormat(textFormat: CfnTemplate.TextConditionalFormatProperty) {
    cdkBuilder.textFormat(textFormat)
  }

  public fun build(): CfnTemplate.PivotTableCellConditionalFormattingProperty {
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
