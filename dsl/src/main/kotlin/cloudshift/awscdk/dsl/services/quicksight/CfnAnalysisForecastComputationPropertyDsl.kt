@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The forecast computation configuration.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-forecastcomputation.html)
 */
@CdkDslMarker
public class CfnAnalysisForecastComputationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ForecastComputationProperty.Builder =
      CfnAnalysis.ForecastComputationProperty.builder()

  /**
   * @param computationId The ID for a computation. 
   */
  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  /**
   * @param customSeasonalityValue The custom seasonality value setup of a forecast computation.
   */
  public fun customSeasonalityValue(customSeasonalityValue: Number) {
    cdkBuilder.customSeasonalityValue(customSeasonalityValue)
  }

  /**
   * @param lowerBoundary The lower boundary setup of a forecast computation.
   */
  public fun lowerBoundary(lowerBoundary: Number) {
    cdkBuilder.lowerBoundary(lowerBoundary)
  }

  /**
   * @param name The name of a computation.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
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
   * * `AUTOMATIC`
   * * `CUSTOM` : Checks the custom seasonality value.
   */
  public fun seasonality(seasonality: String) {
    cdkBuilder.seasonality(seasonality)
  }

  /**
   * @param time The time field that is used in a computation. 
   */
  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  /**
   * @param time The time field that is used in a computation. 
   */
  public fun time(time: CfnAnalysis.DimensionFieldProperty) {
    cdkBuilder.time(time)
  }

  /**
   * @param upperBoundary The upper boundary setup of a forecast computation.
   */
  public fun upperBoundary(upperBoundary: Number) {
    cdkBuilder.upperBoundary(upperBoundary)
  }

  /**
   * @param value The value field that is used in a computation.
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The value field that is used in a computation.
   */
  public fun `value`(`value`: CfnAnalysis.MeasureFieldProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.ForecastComputationProperty = cdkBuilder.build()
}
