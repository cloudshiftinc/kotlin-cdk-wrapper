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
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the bin count of a histogram.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * BinCountOptionsProperty binCountOptionsProperty = BinCountOptionsProperty.builder()
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-bincountoptions.html)
 */
@CdkDslMarker
public class CfnDashboardBinCountOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.BinCountOptionsProperty.Builder =
        CfnDashboard.BinCountOptionsProperty.builder()

    /** @param value The options that determine the bin count value. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDashboard.BinCountOptionsProperty = cdkBuilder.build()
}
