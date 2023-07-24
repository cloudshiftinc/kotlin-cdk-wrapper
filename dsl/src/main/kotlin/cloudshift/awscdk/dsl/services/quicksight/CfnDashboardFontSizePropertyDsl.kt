@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * The option that determines the text display size.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FontSizeProperty fontSizeProperty = FontSizeProperty.builder()
 * .relative("relative")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-fontsize.html)
 */
@CdkDslMarker
public class CfnDashboardFontSizePropertyDsl {
    private val cdkBuilder: CfnDashboard.FontSizeProperty.Builder =
        CfnDashboard.FontSizeProperty.builder()

    /**
     * @param relative The lexical name for the text size, proportional to its surrounding context.
     */
    public fun relative(relative: String) {
        cdkBuilder.relative(relative)
    }

    public fun build(): CfnDashboard.FontSizeProperty = cdkBuilder.build()
}
