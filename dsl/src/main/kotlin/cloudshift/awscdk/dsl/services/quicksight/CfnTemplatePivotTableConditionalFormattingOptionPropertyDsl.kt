@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Conditional formatting options for a `PivotTableVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableConditionalFormattingOptionProperty pivotTableConditionalFormattingOptionProperty =
 * PivotTableConditionalFormattingOptionProperty.builder()
 * .cell(PivotTableCellConditionalFormattingProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-pivottableconditionalformattingoption.html)
 */
@CdkDslMarker
public class CfnTemplatePivotTableConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableConditionalFormattingOptionProperty.Builder =
        CfnTemplate.PivotTableConditionalFormattingOptionProperty.builder()

    /** @param cell The cell conditional formatting option for a pivot table. */
    public fun cell(cell: IResolvable) {
        cdkBuilder.cell(cell)
    }

    /** @param cell The cell conditional formatting option for a pivot table. */
    public fun cell(cell: CfnTemplate.PivotTableCellConditionalFormattingProperty) {
        cdkBuilder.cell(cell)
    }

    public fun build(): CfnTemplate.PivotTableConditionalFormattingOptionProperty =
        cdkBuilder.build()
}
