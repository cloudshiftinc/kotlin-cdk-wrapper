@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The configuration of the `Select all` options in a list control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ListControlSelectAllOptionsProperty listControlSelectAllOptionsProperty =
 * ListControlSelectAllOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-listcontrolselectalloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisListControlSelectAllOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ListControlSelectAllOptionsProperty.Builder =
        CfnAnalysis.ListControlSelectAllOptionsProperty.builder()

    /**
     * @param visibility The visibility configuration of the `Select all` options in a list control.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.ListControlSelectAllOptionsProperty = cdkBuilder.build()
}
