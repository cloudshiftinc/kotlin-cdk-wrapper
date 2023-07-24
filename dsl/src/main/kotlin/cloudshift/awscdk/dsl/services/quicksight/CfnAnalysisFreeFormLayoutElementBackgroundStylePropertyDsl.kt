@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The background style configuration of a free-form layout element.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FreeFormLayoutElementBackgroundStyleProperty freeFormLayoutElementBackgroundStyleProperty =
 * FreeFormLayoutElementBackgroundStyleProperty.builder()
 * .color("color")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-freeformlayoutelementbackgroundstyle.html)
 */
@CdkDslMarker
public class CfnAnalysisFreeFormLayoutElementBackgroundStylePropertyDsl {
    private val cdkBuilder: CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty.Builder =
        CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty.builder()

    /**
     * @param color The background color of a free-form layout element.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * @param visibility The background visibility of a free-form layout element.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty = cdkBuilder.build()
}
