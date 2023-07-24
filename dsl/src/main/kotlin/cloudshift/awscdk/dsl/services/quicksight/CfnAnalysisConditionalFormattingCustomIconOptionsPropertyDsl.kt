@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * Custom icon options for an icon set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingCustomIconOptionsProperty conditionalFormattingCustomIconOptionsProperty =
 * ConditionalFormattingCustomIconOptionsProperty.builder()
 * .icon("icon")
 * .unicodeIcon("unicodeIcon")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-conditionalformattingcustomiconoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisConditionalFormattingCustomIconOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty.Builder =
        CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty.builder()

    /**
     * @param icon Determines the type of icon.
     */
    public fun icon(icon: String) {
        cdkBuilder.icon(icon)
    }

    /**
     * @param unicodeIcon Determines the Unicode icon type.
     */
    public fun unicodeIcon(unicodeIcon: String) {
        cdkBuilder.unicodeIcon(unicodeIcon)
    }

    public fun build(): CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty = cdkBuilder.build()
}
