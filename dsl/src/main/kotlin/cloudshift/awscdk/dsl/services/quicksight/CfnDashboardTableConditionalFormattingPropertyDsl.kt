@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The conditional formatting for a `PivotTableVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableConditionalFormattingProperty tableConditionalFormattingProperty =
 * TableConditionalFormattingProperty.builder()
 * .conditionalFormattingOptions(List.of(TableConditionalFormattingOptionProperty.builder()
 * .cell(TableCellConditionalFormattingProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
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
 * .build())
 * .row(TableRowConditionalFormattingProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-tableconditionalformatting.html)
 */
@CdkDslMarker
public class CfnDashboardTableConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableConditionalFormattingProperty.Builder =
      CfnDashboard.TableConditionalFormattingProperty.builder()

  private val _conditionalFormattingOptions: MutableList<Any> = mutableListOf()

  /**
   * @param conditionalFormattingOptions Conditional formatting options for a `PivotTableVisual` .
   */
  public fun conditionalFormattingOptions(vararg conditionalFormattingOptions: Any) {
    _conditionalFormattingOptions.addAll(listOf(*conditionalFormattingOptions))
  }

  /**
   * @param conditionalFormattingOptions Conditional formatting options for a `PivotTableVisual` .
   */
  public fun conditionalFormattingOptions(conditionalFormattingOptions: Collection<Any>) {
    _conditionalFormattingOptions.addAll(conditionalFormattingOptions)
  }

  /**
   * @param conditionalFormattingOptions Conditional formatting options for a `PivotTableVisual` .
   */
  public fun conditionalFormattingOptions(conditionalFormattingOptions: IResolvable) {
    cdkBuilder.conditionalFormattingOptions(conditionalFormattingOptions)
  }

  public fun build(): CfnDashboard.TableConditionalFormattingProperty {
    if(_conditionalFormattingOptions.isNotEmpty())
        cdkBuilder.conditionalFormattingOptions(_conditionalFormattingOptions)
    return cdkBuilder.build()
  }
}
