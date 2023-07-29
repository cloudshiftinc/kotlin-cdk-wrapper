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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The percent range in the visible range.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PercentVisibleRangeProperty percentVisibleRangeProperty = PercentVisibleRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-percentvisiblerange.html)
 */
@CdkDslMarker
public class CfnAnalysisPercentVisibleRangePropertyDsl {
    private val cdkBuilder: CfnAnalysis.PercentVisibleRangeProperty.Builder =
        CfnAnalysis.PercentVisibleRangeProperty.builder()

    /** @param from The lower bound of the range. */
    public fun from(from: Number) {
        cdkBuilder.from(from)
    }

    /** @param to The top bound of the range. */
    public fun to(to: Number) {
        cdkBuilder.to(to)
    }

    public fun build(): CfnAnalysis.PercentVisibleRangeProperty = cdkBuilder.build()
}
