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
import software.amazon.awscdk.services.quicksight.CfnDashboard

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-assetoptions.html)
 */
@CdkDslMarker
public class CfnDashboardAssetOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.AssetOptionsProperty.Builder =
        CfnDashboard.AssetOptionsProperty.builder()

    /** @param timezone Determines the timezone for the analysis. */
    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    /** @param weekStart Determines the week start day for an analysis. */
    public fun weekStart(weekStart: String) {
        cdkBuilder.weekStart(weekStart)
    }

    public fun build(): CfnDashboard.AssetOptionsProperty = cdkBuilder.build()
}
