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
 * An array of analysis level configurations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AssetOptionsProperty assetOptionsProperty = AssetOptionsProperty.builder()
 * .timezone("timezone")
 * .weekStart("weekStart")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-assetoptions.html)
 */
@CdkDslMarker
public class CfnTemplateAssetOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.AssetOptionsProperty.Builder =
        CfnTemplate.AssetOptionsProperty.builder()

    /** @param timezone Determines the timezone for the analysis. */
    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    /** @param weekStart Determines the week start day for an analysis. */
    public fun weekStart(weekStart: String) {
        cdkBuilder.weekStart(weekStart)
    }

    public fun build(): CfnTemplate.AssetOptionsProperty = cdkBuilder.build()
}
