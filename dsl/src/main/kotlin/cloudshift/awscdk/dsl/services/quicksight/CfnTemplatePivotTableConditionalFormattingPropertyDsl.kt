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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The conditional formatting for a `PivotTableVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableConditionalFormattingProperty pivotTableConditionalFormattingProperty =
 * PivotTableConditionalFormattingProperty.builder()
 * .conditionalFormattingOptions(List.of(PivotTableConditionalFormattingOptionProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-pivottableconditionalformatting.html)
 */
@CdkDslMarker
public class CfnTemplatePivotTableConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableConditionalFormattingProperty.Builder =
        CfnTemplate.PivotTableConditionalFormattingProperty.builder()

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

    public fun build(): CfnTemplate.PivotTableConditionalFormattingProperty {
        if (_conditionalFormattingOptions.isNotEmpty())
            cdkBuilder.conditionalFormattingOptions(_conditionalFormattingOptions)
        return cdkBuilder.build()
    }
}
