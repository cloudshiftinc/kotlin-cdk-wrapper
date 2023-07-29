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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The conditional formatting that determines the shape of the filled map.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilledMapShapeConditionalFormattingProperty filledMapShapeConditionalFormattingProperty =
 * FilledMapShapeConditionalFormattingProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-filledmapshapeconditionalformatting.html)
 */
@CdkDslMarker
public class CfnDashboardFilledMapShapeConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilledMapShapeConditionalFormattingProperty.Builder =
        CfnDashboard.FilledMapShapeConditionalFormattingProperty.builder()

    /** @param fieldId The field ID of the filled map shape. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /**
     * @param format The conditional formatting that determines the background color of a filled
     *   map's shape.
     */
    public fun format(format: IResolvable) {
        cdkBuilder.format(format)
    }

    /**
     * @param format The conditional formatting that determines the background color of a filled
     *   map's shape.
     */
    public fun format(format: CfnDashboard.ShapeConditionalFormatProperty) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnDashboard.FilledMapShapeConditionalFormattingProperty =
        cdkBuilder.build()
}
