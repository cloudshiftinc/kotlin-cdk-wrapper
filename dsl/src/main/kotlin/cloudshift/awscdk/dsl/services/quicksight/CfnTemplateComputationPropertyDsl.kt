@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateComputationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ComputationProperty.Builder =
      CfnTemplate.ComputationProperty.builder()

  /**
   * @param forecast The forecast computation configuration.
   */
  public fun forecast(forecast: IResolvable) {
    cdkBuilder.forecast(forecast)
  }

  /**
   * @param forecast The forecast computation configuration.
   */
  public fun forecast(forecast: CfnTemplate.ForecastComputationProperty) {
    cdkBuilder.forecast(forecast)
  }

  /**
   * @param growthRate The growth rate computation configuration.
   */
  public fun growthRate(growthRate: IResolvable) {
    cdkBuilder.growthRate(growthRate)
  }

  /**
   * @param growthRate The growth rate computation configuration.
   */
  public fun growthRate(growthRate: CfnTemplate.GrowthRateComputationProperty) {
    cdkBuilder.growthRate(growthRate)
  }

  /**
   * @param maximumMinimum The maximum and minimum computation configuration.
   */
  public fun maximumMinimum(maximumMinimum: IResolvable) {
    cdkBuilder.maximumMinimum(maximumMinimum)
  }

  /**
   * @param maximumMinimum The maximum and minimum computation configuration.
   */
  public fun maximumMinimum(maximumMinimum: CfnTemplate.MaximumMinimumComputationProperty) {
    cdkBuilder.maximumMinimum(maximumMinimum)
  }

  /**
   * @param metricComparison The metric comparison computation configuration.
   */
  public fun metricComparison(metricComparison: IResolvable) {
    cdkBuilder.metricComparison(metricComparison)
  }

  /**
   * @param metricComparison The metric comparison computation configuration.
   */
  public fun metricComparison(metricComparison: CfnTemplate.MetricComparisonComputationProperty) {
    cdkBuilder.metricComparison(metricComparison)
  }

  /**
   * @param periodOverPeriod The period over period computation configuration.
   */
  public fun periodOverPeriod(periodOverPeriod: IResolvable) {
    cdkBuilder.periodOverPeriod(periodOverPeriod)
  }

  /**
   * @param periodOverPeriod The period over period computation configuration.
   */
  public fun periodOverPeriod(periodOverPeriod: CfnTemplate.PeriodOverPeriodComputationProperty) {
    cdkBuilder.periodOverPeriod(periodOverPeriod)
  }

  /**
   * @param periodToDate The period to `DataSetIdentifier` computation configuration.
   */
  public fun periodToDate(periodToDate: IResolvable) {
    cdkBuilder.periodToDate(periodToDate)
  }

  /**
   * @param periodToDate The period to `DataSetIdentifier` computation configuration.
   */
  public fun periodToDate(periodToDate: CfnTemplate.PeriodToDateComputationProperty) {
    cdkBuilder.periodToDate(periodToDate)
  }

  /**
   * @param topBottomMovers The top movers and bottom movers computation configuration.
   */
  public fun topBottomMovers(topBottomMovers: IResolvable) {
    cdkBuilder.topBottomMovers(topBottomMovers)
  }

  /**
   * @param topBottomMovers The top movers and bottom movers computation configuration.
   */
  public fun topBottomMovers(topBottomMovers: CfnTemplate.TopBottomMoversComputationProperty) {
    cdkBuilder.topBottomMovers(topBottomMovers)
  }

  /**
   * @param topBottomRanked The top ranked and bottom ranked computation configuration.
   */
  public fun topBottomRanked(topBottomRanked: IResolvable) {
    cdkBuilder.topBottomRanked(topBottomRanked)
  }

  /**
   * @param topBottomRanked The top ranked and bottom ranked computation configuration.
   */
  public fun topBottomRanked(topBottomRanked: CfnTemplate.TopBottomRankedComputationProperty) {
    cdkBuilder.topBottomRanked(topBottomRanked)
  }

  /**
   * @param totalAggregation The total aggregation computation configuration.
   */
  public fun totalAggregation(totalAggregation: IResolvable) {
    cdkBuilder.totalAggregation(totalAggregation)
  }

  /**
   * @param totalAggregation The total aggregation computation configuration.
   */
  public fun totalAggregation(totalAggregation: CfnTemplate.TotalAggregationComputationProperty) {
    cdkBuilder.totalAggregation(totalAggregation)
  }

  /**
   * @param uniqueValues The unique values computation configuration.
   */
  public fun uniqueValues(uniqueValues: IResolvable) {
    cdkBuilder.uniqueValues(uniqueValues)
  }

  /**
   * @param uniqueValues The unique values computation configuration.
   */
  public fun uniqueValues(uniqueValues: CfnTemplate.UniqueValuesComputationProperty) {
    cdkBuilder.uniqueValues(uniqueValues)
  }

  public fun build(): CfnTemplate.ComputationProperty = cdkBuilder.build()
}
