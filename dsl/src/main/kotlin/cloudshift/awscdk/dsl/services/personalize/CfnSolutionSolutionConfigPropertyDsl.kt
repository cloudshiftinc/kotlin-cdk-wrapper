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

  public fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>) {
    cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
  }

  public fun algorithmHyperParameters(algorithmHyperParameters: IResolvable) {
    cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
  }

  public fun autoMlConfig(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.autoMlConfig(builder.map)
  }

  public fun autoMlConfig(autoMlConfig: Any) {
    cdkBuilder.autoMlConfig(autoMlConfig)
  }

  public fun eventValueThreshold(eventValueThreshold: String) {
    cdkBuilder.eventValueThreshold(eventValueThreshold)
  }

  public fun featureTransformationParameters(featureTransformationParameters: Map<String, String>) {
    cdkBuilder.featureTransformationParameters(featureTransformationParameters)
  }

  public fun featureTransformationParameters(featureTransformationParameters: IResolvable) {
    cdkBuilder.featureTransformationParameters(featureTransformationParameters)
  }

  public fun hpoConfig(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.hpoConfig(builder.map)
  }

  public fun hpoConfig(hpoConfig: Any) {
    cdkBuilder.hpoConfig(hpoConfig)
  }

  public fun build(): CfnSolution.SolutionConfigProperty = cdkBuilder.build()
}
