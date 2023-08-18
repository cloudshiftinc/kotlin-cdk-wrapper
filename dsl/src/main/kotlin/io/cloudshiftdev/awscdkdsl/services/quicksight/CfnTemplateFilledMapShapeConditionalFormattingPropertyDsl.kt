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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-filledmapshapeconditionalformatting.html)
 */
@CdkDslMarker
public class CfnTemplateFilledMapShapeConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilledMapShapeConditionalFormattingProperty.Builder =
        CfnTemplate.FilledMapShapeConditionalFormattingProperty.builder()

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
    public fun format(format: CfnTemplate.ShapeConditionalFormatProperty) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnTemplate.FilledMapShapeConditionalFormattingProperty = cdkBuilder.build()
}
