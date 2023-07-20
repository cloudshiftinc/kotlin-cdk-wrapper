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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisComputationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ComputationProperty.Builder =
        CfnAnalysis.ComputationProperty.builder()

    public fun forecast(forecast: IResolvable) {
        cdkBuilder.forecast(forecast)
    }

    public fun forecast(forecast: CfnAnalysis.ForecastComputationProperty) {
        cdkBuilder.forecast(forecast)
    }

    public fun growthRate(growthRate: IResolvable) {
        cdkBuilder.growthRate(growthRate)
    }

    public fun growthRate(growthRate: CfnAnalysis.GrowthRateComputationProperty) {
        cdkBuilder.growthRate(growthRate)
    }

    public fun maximumMinimum(maximumMinimum: IResolvable) {
        cdkBuilder.maximumMinimum(maximumMinimum)
    }

    public fun maximumMinimum(maximumMinimum: CfnAnalysis.MaximumMinimumComputationProperty) {
        cdkBuilder.maximumMinimum(maximumMinimum)
    }

    public fun metricComparison(metricComparison: IResolvable) {
        cdkBuilder.metricComparison(metricComparison)
    }

    public fun metricComparison(metricComparison: CfnAnalysis.MetricComparisonComputationProperty) {
        cdkBuilder.metricComparison(metricComparison)
    }

    public fun periodOverPeriod(periodOverPeriod: IResolvable) {
        cdkBuilder.periodOverPeriod(periodOverPeriod)
    }

    public fun periodOverPeriod(periodOverPeriod: CfnAnalysis.PeriodOverPeriodComputationProperty) {
        cdkBuilder.periodOverPeriod(periodOverPeriod)
    }

    public fun periodToDate(periodToDate: IResolvable) {
        cdkBuilder.periodToDate(periodToDate)
    }

    public fun periodToDate(periodToDate: CfnAnalysis.PeriodToDateComputationProperty) {
        cdkBuilder.periodToDate(periodToDate)
    }

    public fun topBottomMovers(topBottomMovers: IResolvable) {
        cdkBuilder.topBottomMovers(topBottomMovers)
    }

    public fun topBottomMovers(topBottomMovers: CfnAnalysis.TopBottomMoversComputationProperty) {
        cdkBuilder.topBottomMovers(topBottomMovers)
    }

    public fun topBottomRanked(topBottomRanked: IResolvable) {
        cdkBuilder.topBottomRanked(topBottomRanked)
    }

    public fun topBottomRanked(topBottomRanked: CfnAnalysis.TopBottomRankedComputationProperty) {
        cdkBuilder.topBottomRanked(topBottomRanked)
    }

    public fun totalAggregation(totalAggregation: IResolvable) {
        cdkBuilder.totalAggregation(totalAggregation)
    }

    public fun totalAggregation(totalAggregation: CfnAnalysis.TotalAggregationComputationProperty) {
        cdkBuilder.totalAggregation(totalAggregation)
    }

    public fun uniqueValues(uniqueValues: IResolvable) {
        cdkBuilder.uniqueValues(uniqueValues)
    }

    public fun uniqueValues(uniqueValues: CfnAnalysis.UniqueValuesComputationProperty) {
        cdkBuilder.uniqueValues(uniqueValues)
    }

    public fun build(): CfnAnalysis.ComputationProperty = cdkBuilder.build()
}
