@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number

/**
 * The options that determine the bin count of a histogram.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * BinCountOptionsProperty binCountOptionsProperty = BinCountOptionsProperty.builder()
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-bincountoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisBinCountOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.BinCountOptionsProperty.Builder =
        CfnAnalysis.BinCountOptionsProperty.builder()

    /**
     * @param value The options that determine the bin count value.
     */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAnalysis.BinCountOptionsProperty = cdkBuilder.build()
}
