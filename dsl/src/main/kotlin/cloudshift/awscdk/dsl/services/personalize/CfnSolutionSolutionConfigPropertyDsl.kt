@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution

@CdkDslMarker
public class CfnSolutionSolutionConfigPropertyDsl {
  private val cdkBuilder: CfnSolution.SolutionConfigProperty.Builder =
      CfnSolution.SolutionConfigProperty.builder()

  /**
   * @param algorithmHyperParameters Lists the hyperparameter names and ranges.
   */
  public fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>) {
    cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
  }

  /**
   * @param algorithmHyperParameters Lists the hyperparameter names and ranges.
   */
  public fun algorithmHyperParameters(algorithmHyperParameters: IResolvable) {
    cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
  }

  /**
   * @param autoMlConfig The
   * [AutoMLConfig](https://docs.aws.amazon.com/personalize/latest/dg/API_AutoMLConfig.html) object
   * containing a list of recipes to search when AutoML is performed.
   */
  public fun autoMlConfig(autoMlConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(autoMlConfig)
    cdkBuilder.autoMlConfig(builder.map)
  }

  /**
   * @param autoMlConfig The
   * [AutoMLConfig](https://docs.aws.amazon.com/personalize/latest/dg/API_AutoMLConfig.html) object
   * containing a list of recipes to search when AutoML is performed.
   */
  public fun autoMlConfig(autoMlConfig: Any) {
    cdkBuilder.autoMlConfig(autoMlConfig)
  }

  /**
   * @param eventValueThreshold Only events with a value greater than or equal to this threshold are
   * used for training a model.
   */
  public fun eventValueThreshold(eventValueThreshold: String) {
    cdkBuilder.eventValueThreshold(eventValueThreshold)
  }

  /**
   * @param featureTransformationParameters Lists the feature transformation parameters.
   */
  public fun featureTransformationParameters(featureTransformationParameters: Map<String, String>) {
    cdkBuilder.featureTransformationParameters(featureTransformationParameters)
  }

  /**
   * @param featureTransformationParameters Lists the feature transformation parameters.
   */
  public fun featureTransformationParameters(featureTransformationParameters: IResolvable) {
    cdkBuilder.featureTransformationParameters(featureTransformationParameters)
  }

  /**
   * @param hpoConfig Describes the properties for hyperparameter optimization (HPO).
   */
  public fun hpoConfig(hpoConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(hpoConfig)
    cdkBuilder.hpoConfig(builder.map)
  }

  /**
   * @param hpoConfig Describes the properties for hyperparameter optimization (HPO).
   */
  public fun hpoConfig(hpoConfig: Any) {
    cdkBuilder.hpoConfig(hpoConfig)
  }

  public fun build(): CfnSolution.SolutionConfigProperty = cdkBuilder.build()
}
