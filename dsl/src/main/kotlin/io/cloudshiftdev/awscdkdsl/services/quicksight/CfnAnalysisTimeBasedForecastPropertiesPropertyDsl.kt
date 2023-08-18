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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The forecast properties setup of a forecast in the line chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TimeBasedForecastPropertiesProperty timeBasedForecastPropertiesProperty =
 * TimeBasedForecastPropertiesProperty.builder()
 * .lowerBoundary(123)
 * .periodsBackward(123)
 * .periodsForward(123)
 * .predictionInterval(123)
 * .seasonality(123)
 * .upperBoundary(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-timebasedforecastproperties.html)
 */
@CdkDslMarker
public class CfnAnalysisTimeBasedForecastPropertiesPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TimeBasedForecastPropertiesProperty.Builder =
        CfnAnalysis.TimeBasedForecastPropertiesProperty.builder()

    /** @param lowerBoundary The lower boundary setup of a forecast computation. */
    public fun lowerBoundary(lowerBoundary: Number) {
        cdkBuilder.lowerBoundary(lowerBoundary)
    }

    /** @param periodsBackward The periods backward setup of a forecast computation. */
    public fun periodsBackward(periodsBackward: Number) {
        cdkBuilder.periodsBackward(periodsBackward)
    }

    /** @param periodsForward The periods forward setup of a forecast computation. */
    public fun periodsForward(periodsForward: Number) {
        cdkBuilder.periodsForward(periodsForward)
    }

    /** @param predictionInterval The prediction interval setup of a forecast computation. */
    public fun predictionInterval(predictionInterval: Number) {
        cdkBuilder.predictionInterval(predictionInterval)
    }

    /**
     * @param seasonality The seasonality setup of a forecast computation. Choose one of the
     *   following options:.
     * * `NULL` : The input is set to `NULL` .
     * * `NON_NULL` : The input is set to a custom value.
     */
    public fun seasonality(seasonality: Number) {
        cdkBuilder.seasonality(seasonality)
    }

    /** @param upperBoundary The upper boundary setup of a forecast computation. */
    public fun upperBoundary(upperBoundary: Number) {
        cdkBuilder.upperBoundary(upperBoundary)
    }

    public fun build(): CfnAnalysis.TimeBasedForecastPropertiesProperty = cdkBuilder.build()
}
