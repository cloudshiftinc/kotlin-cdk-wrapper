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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the thousands separator configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ThousandSeparatorOptionsProperty thousandSeparatorOptionsProperty =
 * ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-thousandseparatoroptions.html)
 */
@CdkDslMarker
public class CfnDashboardThousandSeparatorOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.ThousandSeparatorOptionsProperty.Builder =
        CfnDashboard.ThousandSeparatorOptionsProperty.builder()

    /** @param symbol Determines the thousands separator symbol. */
    public fun symbol(symbol: String) {
        cdkBuilder.symbol(symbol)
    }

    /** @param visibility Determines the visibility of the thousands separator. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.ThousandSeparatorOptionsProperty = cdkBuilder.build()
}
