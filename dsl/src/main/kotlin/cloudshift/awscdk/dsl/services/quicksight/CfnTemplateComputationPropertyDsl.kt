@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateComputationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ComputationProperty.Builder =
      CfnTemplate.ComputationProperty.builder()

  public fun forecast(forecast: IResolvable) {
    cdkBuilder.forecast(forecast)
  }

  public fun forecast(forecast: CfnTemplate.ForecastComputationProperty) {
    cdkBuilder.forecast(forecast)
  }

  public fun growthRate(growthRate: IResolvable) {
    cdkBuilder.growthRate(growthRate)
  }

  public fun growthRate(growthRate: CfnTemplate.GrowthRateComputationProperty) {
    cdkBuilder.growthRate(growthRate)
  }

  public fun maximumMinimum(maximumMinimum: IResolvable) {
    cdkBuilder.maximumMinimum(maximumMinimum)
  }

  public fun maximumMinimum(maximumMinimum: CfnTemplate.MaximumMinimumComputationProperty) {
    cdkBuilder.maximumMinimum(maximumMinimum)
  }

  public fun metricComparison(metricComparison: IResolvable) {
    cdkBuilder.metricComparison(metricComparison)
  }

  public fun metricComparison(metricComparison: CfnTemplate.MetricComparisonComputationProperty) {
    cdkBuilder.metricComparison(metricComparison)
  }

  public fun periodOverPeriod(periodOverPeriod: IResolvable) {
    cdkBuilder.periodOverPeriod(periodOverPeriod)
  }

  public fun periodOverPeriod(periodOverPeriod: CfnTemplate.PeriodOverPeriodComputationProperty) {
    cdkBuilder.periodOverPeriod(periodOverPeriod)
  }

  public fun periodToDate(periodToDate: IResolvable) {
    cdkBuilder.periodToDate(periodToDate)
  }

  public fun periodToDate(periodToDate: CfnTemplate.PeriodToDateComputationProperty) {
    cdkBuilder.periodToDate(periodToDate)
  }

  public fun topBottomMovers(topBottomMovers: IResolvable) {
    cdkBuilder.topBottomMovers(topBottomMovers)
  }

  public fun topBottomMovers(topBottomMovers: CfnTemplate.TopBottomMoversComputationProperty) {
    cdkBuilder.topBottomMovers(topBottomMovers)
  }

  public fun topBottomRanked(topBottomRanked: IResolvable) {
    cdkBuilder.topBottomRanked(topBottomRanked)
  }

  public fun topBottomRanked(topBottomRanked: CfnTemplate.TopBottomRankedComputationProperty) {
    cdkBuilder.topBottomRanked(topBottomRanked)
  }

  public fun totalAggregation(totalAggregation: IResolvable) {
    cdkBuilder.totalAggregation(totalAggregation)
  }

  public fun totalAggregation(totalAggregation: CfnTemplate.TotalAggregationComputationProperty) {
    cdkBuilder.totalAggregation(totalAggregation)
  }

  public fun uniqueValues(uniqueValues: IResolvable) {
    cdkBuilder.uniqueValues(uniqueValues)
  }

  public fun uniqueValues(uniqueValues: CfnTemplate.UniqueValuesComputationProperty) {
    cdkBuilder.uniqueValues(uniqueValues)
  }

  public fun build(): CfnTemplate.ComputationProperty = cdkBuilder.build()
}
