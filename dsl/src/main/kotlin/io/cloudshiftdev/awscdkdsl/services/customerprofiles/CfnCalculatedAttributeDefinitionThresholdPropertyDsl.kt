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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition

/**
 * The threshold for the calculated attribute.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ThresholdProperty thresholdProperty = ThresholdProperty.builder()
 * .operator("operator")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-threshold.html)
 */
@CdkDslMarker
public class CfnCalculatedAttributeDefinitionThresholdPropertyDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinition.ThresholdProperty.Builder =
        CfnCalculatedAttributeDefinition.ThresholdProperty.builder()

    /** @param operator The operator of the threshold. */
    public fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
    }

    /** @param value The value of the threshold. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCalculatedAttributeDefinition.ThresholdProperty = cdkBuilder.build()
}
