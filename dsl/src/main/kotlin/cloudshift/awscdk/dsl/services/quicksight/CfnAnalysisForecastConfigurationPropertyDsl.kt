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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The forecast configuration that is used in a line chart's display properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ForecastConfigurationProperty forecastConfigurationProperty =
 * ForecastConfigurationProperty.builder()
 * .forecastProperties(TimeBasedForecastPropertiesProperty.builder()
 * .lowerBoundary(123)
 * .periodsBackward(123)
 * .periodsForward(123)
 * .predictionInterval(123)
 * .seasonality(123)
 * .upperBoundary(123)
 * .build())
 * .scenario(ForecastScenarioProperty.builder()
 * .whatIfPointScenario(WhatIfPointScenarioProperty.builder()
 * .date("date")
 * .value(123)
 * .build())
 * .whatIfRangeScenario(WhatIfRangeScenarioProperty.builder()
 * .endDate("endDate")
 * .startDate("startDate")
 * .value(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-forecastconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisForecastConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ForecastConfigurationProperty.Builder =
        CfnAnalysis.ForecastConfigurationProperty.builder()

    /** @param forecastProperties The forecast properties setup of a forecast in the line chart. */
    public fun forecastProperties(forecastProperties: IResolvable) {
        cdkBuilder.forecastProperties(forecastProperties)
    }

    /** @param forecastProperties The forecast properties setup of a forecast in the line chart. */
    public fun forecastProperties(
        forecastProperties: CfnAnalysis.TimeBasedForecastPropertiesProperty
    ) {
        cdkBuilder.forecastProperties(forecastProperties)
    }

    /** @param scenario The forecast scenario of a forecast in the line chart. */
    public fun scenario(scenario: IResolvable) {
        cdkBuilder.scenario(scenario)
    }

    /** @param scenario The forecast scenario of a forecast in the line chart. */
    public fun scenario(scenario: CfnAnalysis.ForecastScenarioProperty) {
        cdkBuilder.scenario(scenario)
    }

    public fun build(): CfnAnalysis.ForecastConfigurationProperty = cdkBuilder.build()
}
