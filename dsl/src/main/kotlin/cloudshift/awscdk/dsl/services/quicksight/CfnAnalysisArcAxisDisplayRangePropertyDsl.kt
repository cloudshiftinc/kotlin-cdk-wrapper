@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number

/**
 * The arc axis range of a `GaugeChartVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ArcAxisDisplayRangeProperty arcAxisDisplayRangeProperty = ArcAxisDisplayRangeProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-arcaxisdisplayrange.html)
 */
@CdkDslMarker
public class CfnAnalysisArcAxisDisplayRangePropertyDsl {
    private val cdkBuilder: CfnAnalysis.ArcAxisDisplayRangeProperty.Builder =
        CfnAnalysis.ArcAxisDisplayRangeProperty.builder()

    /**
     * @param max The maximum value of the arc axis range.
     */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /**
     * @param min The minimum value of the arc axis range.
     */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAnalysis.ArcAxisDisplayRangeProperty = cdkBuilder.build()
}
