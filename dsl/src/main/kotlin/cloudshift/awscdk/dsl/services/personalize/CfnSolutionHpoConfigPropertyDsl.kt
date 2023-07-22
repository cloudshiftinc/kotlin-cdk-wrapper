@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution

/**
 * Describes the properties for hyperparameter optimization (HPO).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * HpoConfigProperty hpoConfigProperty = HpoConfigProperty.builder()
 * .algorithmHyperParameterRanges(AlgorithmHyperParameterRangesProperty.builder()
 * .categoricalHyperParameterRanges(List.of(CategoricalHyperParameterRangeProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build()))
 * .continuousHyperParameterRanges(List.of(ContinuousHyperParameterRangeProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * .name("name")
 * .build()))
 * .integerHyperParameterRanges(List.of(IntegerHyperParameterRangeProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * .name("name")
 * .build()))
 * .build())
 * .hpoObjective(HpoObjectiveProperty.builder()
 * .metricName("metricName")
 * .metricRegex("metricRegex")
 * .type("type")
 * .build())
 * .hpoResourceConfig(HpoResourceConfigProperty.builder()
 * .maxNumberOfTrainingJobs("maxNumberOfTrainingJobs")
 * .maxParallelTrainingJobs("maxParallelTrainingJobs")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoconfig.html)
 */
@CdkDslMarker
public class CfnSolutionHpoConfigPropertyDsl {
  private val cdkBuilder: CfnSolution.HpoConfigProperty.Builder =
      CfnSolution.HpoConfigProperty.builder()

  /**
   * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
   */
  public fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable) {
    cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges)
  }

  /**
   * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
   */
  public
      fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: CfnSolution.AlgorithmHyperParameterRangesProperty) {
    cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges)
  }

  /**
   * @param hpoObjective The metric to optimize during HPO.
   */
  public fun hpoObjective(hpoObjective: IResolvable) {
    cdkBuilder.hpoObjective(hpoObjective)
  }

  /**
   * @param hpoObjective The metric to optimize during HPO.
   */
  public fun hpoObjective(hpoObjective: CfnSolution.HpoObjectiveProperty) {
    cdkBuilder.hpoObjective(hpoObjective)
  }

  /**
   * @param hpoResourceConfig Describes the resource configuration for hyperparameter optimization
   * (HPO).
   */
  public fun hpoResourceConfig(hpoResourceConfig: IResolvable) {
    cdkBuilder.hpoResourceConfig(hpoResourceConfig)
  }

  /**
   * @param hpoResourceConfig Describes the resource configuration for hyperparameter optimization
   * (HPO).
   */
  public fun hpoResourceConfig(hpoResourceConfig: CfnSolution.HpoResourceConfigProperty) {
    cdkBuilder.hpoResourceConfig(hpoResourceConfig)
  }

  public fun build(): CfnSolution.HpoConfigProperty = cdkBuilder.build()
}
