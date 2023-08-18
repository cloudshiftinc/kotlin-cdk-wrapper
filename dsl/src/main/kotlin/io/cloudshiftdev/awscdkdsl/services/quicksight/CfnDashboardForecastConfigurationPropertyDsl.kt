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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-forecastconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardForecastConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ForecastConfigurationProperty.Builder =
        CfnDashboard.ForecastConfigurationProperty.builder()

    /** @param forecastProperties The forecast properties setup of a forecast in the line chart. */
    public fun forecastProperties(forecastProperties: IResolvable) {
        cdkBuilder.forecastProperties(forecastProperties)
    }

    /** @param forecastProperties The forecast properties setup of a forecast in the line chart. */
    public fun forecastProperties(
        forecastProperties: CfnDashboard.TimeBasedForecastPropertiesProperty
    ) {
        cdkBuilder.forecastProperties(forecastProperties)
    }

    /** @param scenario The forecast scenario of a forecast in the line chart. */
    public fun scenario(scenario: IResolvable) {
        cdkBuilder.scenario(scenario)
    }

    /** @param scenario The forecast scenario of a forecast in the line chart. */
    public fun scenario(scenario: CfnDashboard.ForecastScenarioProperty) {
        cdkBuilder.scenario(scenario)
    }

    public fun build(): CfnDashboard.ForecastConfigurationProperty = cdkBuilder.build()
}
