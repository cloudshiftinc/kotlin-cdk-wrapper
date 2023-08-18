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
 * The configuration for a custom label on a `ReferenceLine` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineCustomLabelConfigurationProperty referenceLineCustomLabelConfigurationProperty =
 * ReferenceLineCustomLabelConfigurationProperty.builder()
 * .customLabel("customLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-referencelinecustomlabelconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateReferenceLineCustomLabelConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ReferenceLineCustomLabelConfigurationProperty.Builder =
        CfnTemplate.ReferenceLineCustomLabelConfigurationProperty.builder()

    /** @param customLabel The string text of the custom label. */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun build(): CfnTemplate.ReferenceLineCustomLabelConfigurationProperty =
        cdkBuilder.build()
}
