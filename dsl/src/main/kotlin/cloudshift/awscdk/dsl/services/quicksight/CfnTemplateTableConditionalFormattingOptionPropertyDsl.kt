@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Conditional formatting options for a `PivotTableVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableConditionalFormattingOptionProperty tableConditionalFormattingOptionProperty =
 * TableConditionalFormattingOptionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tableconditionalformattingoption.html)
 */
@CdkDslMarker
public class CfnTemplateTableConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableConditionalFormattingOptionProperty.Builder =
        CfnTemplate.TableConditionalFormattingOptionProperty.builder()

    /**
     * @param cell The cell conditional formatting option for a table.
     */
    public fun cell(cell: IResolvable) {
        cdkBuilder.cell(cell)
    }

    /**
     * @param cell The cell conditional formatting option for a table.
     */
    public fun cell(cell: CfnTemplate.TableCellConditionalFormattingProperty) {
        cdkBuilder.cell(cell)
    }

    /**
     * @param row The row conditional formatting option for a table.
     */
    public fun row(row: IResolvable) {
        cdkBuilder.row(row)
    }

    /**
     * @param row The row conditional formatting option for a table.
     */
    public fun row(row: CfnTemplate.TableRowConditionalFormattingProperty) {
        cdkBuilder.row(row)
    }

    public fun build(): CfnTemplate.TableConditionalFormattingOptionProperty = cdkBuilder.build()
}
