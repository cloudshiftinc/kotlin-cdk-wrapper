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
 * The options that determine how a date axis is displayed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateAxisOptionsProperty dateAxisOptionsProperty = DateAxisOptionsProperty.builder()
 * .missingDateVisibility("missingDateVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-dateaxisoptions.html)
 */
@CdkDslMarker
public class CfnTemplateDateAxisOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.DateAxisOptionsProperty.Builder =
        CfnTemplate.DateAxisOptionsProperty.builder()

    /** @param missingDateVisibility Determines whether or not missing dates are displayed. */
    public fun missingDateVisibility(missingDateVisibility: String) {
        cdkBuilder.missingDateVisibility(missingDateVisibility)
    }

    public fun build(): CfnTemplate.DateAxisOptionsProperty = cdkBuilder.build()
}
