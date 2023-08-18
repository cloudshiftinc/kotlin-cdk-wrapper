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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The style configuration of the reference line.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineStyleConfigurationProperty referenceLineStyleConfigurationProperty =
 * ReferenceLineStyleConfigurationProperty.builder()
 * .color("color")
 * .pattern("pattern")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-referencelinestyleconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateReferenceLineStyleConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ReferenceLineStyleConfigurationProperty.Builder =
        CfnTemplate.ReferenceLineStyleConfigurationProperty.builder()

    /** @param color The hex color of the reference line. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * @param pattern The pattern type of the line style. Choose one of the following options:.
     * * `SOLID`
     * * `DASHED`
     * * `DOTTED`
     */
    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    public fun build(): CfnTemplate.ReferenceLineStyleConfigurationProperty = cdkBuilder.build()
}
