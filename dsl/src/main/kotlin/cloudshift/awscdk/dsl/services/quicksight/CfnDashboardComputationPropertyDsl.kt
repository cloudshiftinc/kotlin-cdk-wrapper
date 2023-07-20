@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardComputationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ComputationProperty.Builder =
        CfnDashboard.ComputationProperty.builder()

    public fun forecast(forecast: IResolvable) {
        cdkBuilder.forecast(forecast)
    }

    public fun forecast(forecast: CfnDashboard.ForecastComputationProperty) {
        cdkBuilder.forecast(forecast)
    }

    public fun growthRate(growthRate: IResolvable) {
        cdkBuilder.growthRate(growthRate)
    }

    public fun growthRate(growthRate: CfnDashboard.GrowthRateComputationProperty) {
        cdkBuilder.growthRate(growthRate)
    }

    public fun maximumMinimum(maximumMinimum: IResolvable) {
        cdkBuilder.maximumMinimum(maximumMinimum)
    }

    public fun maximumMinimum(maximumMinimum: CfnDashboard.MaximumMinimumComputationProperty) {
        cdkBuilder.maximumMinimum(maximumMinimum)
    }

    public fun metricComparison(metricComparison: IResolvable) {
        cdkBuilder.metricComparison(metricComparison)
    }

    public fun metricComparison(metricComparison: CfnDashboard.MetricComparisonComputationProperty) {
        cdkBuilder.metricComparison(metricComparison)
    }

    public fun periodOverPeriod(periodOverPeriod: IResolvable) {
        cdkBuilder.periodOverPeriod(periodOverPeriod)
    }

    public fun periodOverPeriod(periodOverPeriod: CfnDashboard.PeriodOverPeriodComputationProperty) {
        cdkBuilder.periodOverPeriod(periodOverPeriod)
    }

    public fun periodToDate(periodToDate: IResolvable) {
        cdkBuilder.periodToDate(periodToDate)
    }

    public fun periodToDate(periodToDate: CfnDashboard.PeriodToDateComputationProperty) {
        cdkBuilder.periodToDate(periodToDate)
    }

    public fun topBottomMovers(topBottomMovers: IResolvable) {
        cdkBuilder.topBottomMovers(topBottomMovers)
    }

    public fun topBottomMovers(topBottomMovers: CfnDashboard.TopBottomMoversComputationProperty) {
        cdkBuilder.topBottomMovers(topBottomMovers)
    }

    public fun topBottomRanked(topBottomRanked: IResolvable) {
        cdkBuilder.topBottomRanked(topBottomRanked)
    }

    public fun topBottomRanked(topBottomRanked: CfnDashboard.TopBottomRankedComputationProperty) {
        cdkBuilder.topBottomRanked(topBottomRanked)
    }

    public fun totalAggregation(totalAggregation: IResolvable) {
        cdkBuilder.totalAggregation(totalAggregation)
    }

    public fun totalAggregation(totalAggregation: CfnDashboard.TotalAggregationComputationProperty) {
        cdkBuilder.totalAggregation(totalAggregation)
    }

    public fun uniqueValues(uniqueValues: IResolvable) {
        cdkBuilder.uniqueValues(uniqueValues)
    }

    public fun uniqueValues(uniqueValues: CfnDashboard.UniqueValuesComputationProperty) {
        cdkBuilder.uniqueValues(uniqueValues)
    }

    public fun build(): CfnDashboard.ComputationProperty = cdkBuilder.build()
}
