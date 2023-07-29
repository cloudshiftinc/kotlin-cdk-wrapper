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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Conditional formatting options of a `FilledMapVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilledMapConditionalFormattingOptionProperty filledMapConditionalFormattingOptionProperty =
 * FilledMapConditionalFormattingOptionProperty.builder()
 * .shape(FilledMapShapeConditionalFormattingProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .format(ShapeConditionalFormatProperty.builder()
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
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-filledmapconditionalformattingoption.html)
 */
@CdkDslMarker
public class CfnDashboardFilledMapConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilledMapConditionalFormattingOptionProperty.Builder =
        CfnDashboard.FilledMapConditionalFormattingOptionProperty.builder()

    /** @param shape The conditional formatting that determines the shape of the filled map. */
    public fun shape(shape: IResolvable) {
        cdkBuilder.shape(shape)
    }

    /** @param shape The conditional formatting that determines the shape of the filled map. */
    public fun shape(shape: CfnDashboard.FilledMapShapeConditionalFormattingProperty) {
        cdkBuilder.shape(shape)
    }

    public fun build(): CfnDashboard.FilledMapConditionalFormattingOptionProperty =
        cdkBuilder.build()
}
