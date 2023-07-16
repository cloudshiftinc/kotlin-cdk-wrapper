@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisForecastComputationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ForecastComputationProperty.Builder =
      CfnAnalysis.ForecastComputationProperty.builder()

  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  public fun customSeasonalityValue(customSeasonalityValue: Number) {
    cdkBuilder.customSeasonalityValue(customSeasonalityValue)
  }

  public fun lowerBoundary(lowerBoundary: Number) {
    cdkBuilder.lowerBoundary(lowerBoundary)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
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

  public fun seasonality(seasonality: String) {
    cdkBuilder.seasonality(seasonality)
  }

  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  public fun time(time: CfnAnalysis.DimensionFieldProperty) {
    cdkBuilder.time(time)
  }

  public fun upperBoundary(upperBoundary: Number) {
    cdkBuilder.upperBoundary(upperBoundary)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnAnalysis.MeasureFieldProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.ForecastComputationProperty = cdkBuilder.build()
}
