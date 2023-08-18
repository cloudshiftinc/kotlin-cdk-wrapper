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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The formatting configuration for the icon.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingIconProperty conditionalFormattingIconProperty =
 * ConditionalFormattingIconProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-conditionalformattingicon.html)
 */
@CdkDslMarker
public class CfnAnalysisConditionalFormattingIconPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ConditionalFormattingIconProperty.Builder =
        CfnAnalysis.ConditionalFormattingIconProperty.builder()

    /** @param customCondition Determines the custom condition for an icon set. */
    public fun customCondition(customCondition: IResolvable) {
        cdkBuilder.customCondition(customCondition)
    }

    /** @param customCondition Determines the custom condition for an icon set. */
    public fun customCondition(
        customCondition: CfnAnalysis.ConditionalFormattingCustomIconConditionProperty
    ) {
        cdkBuilder.customCondition(customCondition)
    }

    /** @param iconSet Formatting configuration for icon set. */
    public fun iconSet(iconSet: IResolvable) {
        cdkBuilder.iconSet(iconSet)
    }

    /** @param iconSet Formatting configuration for icon set. */
    public fun iconSet(iconSet: CfnAnalysis.ConditionalFormattingIconSetProperty) {
        cdkBuilder.iconSet(iconSet)
    }

    public fun build(): CfnAnalysis.ConditionalFormattingIconProperty = cdkBuilder.build()
}
