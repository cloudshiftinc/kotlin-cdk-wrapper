@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number

/**
 * The arc axis configuration of a `GaugeChartVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ArcAxisConfigurationProperty arcAxisConfigurationProperty =
 * ArcAxisConfigurationProperty.builder()
 * .range(ArcAxisDisplayRangeProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .reserveRange(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-arcaxisconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisArcAxisConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ArcAxisConfigurationProperty.Builder =
        CfnAnalysis.ArcAxisConfigurationProperty.builder()

    /**
     * @param range The arc axis range of a `GaugeChartVisual` .
     */
    public fun range(range: IResolvable) {
        cdkBuilder.range(range)
    }

    /**
     * @param range The arc axis range of a `GaugeChartVisual` .
     */
    public fun range(range: CfnAnalysis.ArcAxisDisplayRangeProperty) {
        cdkBuilder.range(range)
    }

    /**
     * @param reserveRange The reserved range of the arc axis.
     */
    public fun reserveRange(reserveRange: Number) {
        cdkBuilder.reserveRange(reserveRange)
    }

    public fun build(): CfnAnalysis.ArcAxisConfigurationProperty = cdkBuilder.build()
}
