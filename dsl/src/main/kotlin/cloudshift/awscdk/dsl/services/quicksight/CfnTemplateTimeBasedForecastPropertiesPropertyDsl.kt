@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTimeBasedForecastPropertiesPropertyDsl {
  private val cdkBuilder: CfnTemplate.TimeBasedForecastPropertiesProperty.Builder =
      CfnTemplate.TimeBasedForecastPropertiesProperty.builder()

  public fun lowerBoundary(lowerBoundary: Number) {
    cdkBuilder.lowerBoundary(lowerBoundary)
  }

  public fun periodsBackward(periodsBackward: Number) {
    cdkBuilder.periodsBackward(periodsBackward)
  }

  public fun periodsForward(periodsForward: Number) {
    cdkBuilder.periodsForward(periodsForward)
  }

  public fun predictionInterval(predictionInterval: Number) {
    cdkBuilder.predictionInterval(predictionInterval)
  }

  public fun seasonality(seasonality: Number) {
    cdkBuilder.seasonality(seasonality)
  }

  public fun upperBoundary(upperBoundary: Number) {
    cdkBuilder.upperBoundary(upperBoundary)
  }

  public fun build(): CfnTemplate.TimeBasedForecastPropertiesProperty = cdkBuilder.build()
}
