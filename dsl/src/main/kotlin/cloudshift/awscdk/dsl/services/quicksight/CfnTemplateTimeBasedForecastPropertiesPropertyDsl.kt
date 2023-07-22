@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTimeBasedForecastPropertiesPropertyDsl {
  private val cdkBuilder: CfnTemplate.TimeBasedForecastPropertiesProperty.Builder =
      CfnTemplate.TimeBasedForecastPropertiesProperty.builder()

  /**
   * @param lowerBoundary The lower boundary setup of a forecast computation.
   */
  public fun lowerBoundary(lowerBoundary: Number) {
    cdkBuilder.lowerBoundary(lowerBoundary)
  }

  /**
   * @param periodsBackward The periods backward setup of a forecast computation.
   */
  public fun periodsBackward(periodsBackward: Number) {
    cdkBuilder.periodsBackward(periodsBackward)
  }

  /**
   * @param periodsForward The periods forward setup of a forecast computation.
   */
  public fun periodsForward(periodsForward: Number) {
    cdkBuilder.periodsForward(periodsForward)
  }

  /**
   * @param predictionInterval The prediction interval setup of a forecast computation.
   */
  public fun predictionInterval(predictionInterval: Number) {
    cdkBuilder.predictionInterval(predictionInterval)
  }

  /**
   * @param seasonality The seasonality setup of a forecast computation. Choose one of the following
   * options:.
   * * `NULL` : The input is set to `NULL` .
   * * `NON_NULL` : The input is set to a custom value.
   */
  public fun seasonality(seasonality: Number) {
    cdkBuilder.seasonality(seasonality)
  }

  /**
   * @param upperBoundary The upper boundary setup of a forecast computation.
   */
  public fun upperBoundary(upperBoundary: Number) {
    cdkBuilder.upperBoundary(upperBoundary)
  }

  public fun build(): CfnTemplate.TimeBasedForecastPropertiesProperty = cdkBuilder.build()
}
