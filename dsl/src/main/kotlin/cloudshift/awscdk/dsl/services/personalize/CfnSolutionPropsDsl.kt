@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution
import software.amazon.awscdk.services.personalize.CfnSolutionProps

@CdkDslMarker
public class CfnSolutionPropsDsl {
  private val cdkBuilder: CfnSolutionProps.Builder = CfnSolutionProps.builder()

  /**
   * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group that provides the
   * training data. 
   */
  public fun datasetGroupArn(datasetGroupArn: String) {
    cdkBuilder.datasetGroupArn(datasetGroupArn)
  }

  /**
   * @param eventType The event type (for example, 'click' or 'like') that is used for training the
   * model.
   * If no `eventType` is provided, Amazon Personalize uses all interactions for training with equal
   * weight regardless of type.
   */
  public fun eventType(eventType: String) {
    cdkBuilder.eventType(eventType)
  }

  /**
   * @param name The name of the solution. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param performAutoMl We don't recommend enabling automated machine learning.
   * Instead, match your use case to the available Amazon Personalize recipes. For more information,
   * see [Determining your use
   * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
   *
   * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
   * the list specified in the solution configuration ( `recipeArn` must not be specified). When false
   * (the default), Amazon Personalize uses `recipeArn` for training.
   */
  public fun performAutoMl(performAutoMl: Boolean) {
    cdkBuilder.performAutoMl(performAutoMl)
  }

  /**
   * @param performAutoMl We don't recommend enabling automated machine learning.
   * Instead, match your use case to the available Amazon Personalize recipes. For more information,
   * see [Determining your use
   * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
   *
   * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
   * the list specified in the solution configuration ( `recipeArn` must not be specified). When false
   * (the default), Amazon Personalize uses `recipeArn` for training.
   */
  public fun performAutoMl(performAutoMl: IResolvable) {
    cdkBuilder.performAutoMl(performAutoMl)
  }

  /**
   * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
   * The default is `false` .
   */
  public fun performHpo(performHpo: Boolean) {
    cdkBuilder.performHpo(performHpo)
  }

  /**
   * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
   * The default is `false` .
   */
  public fun performHpo(performHpo: IResolvable) {
    cdkBuilder.performHpo(performHpo)
  }

  /**
   * @param recipeArn The ARN of the recipe used to create the solution.
   * This is required when `performAutoML` is false.
   */
  public fun recipeArn(recipeArn: String) {
    cdkBuilder.recipeArn(recipeArn)
  }

  /**
   * @param solutionConfig Describes the configuration properties for the solution.
   */
  public fun solutionConfig(solutionConfig: IResolvable) {
    cdkBuilder.solutionConfig(solutionConfig)
  }

  /**
   * @param solutionConfig Describes the configuration properties for the solution.
   */
  public fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty) {
    cdkBuilder.solutionConfig(solutionConfig)
  }

  public fun build(): CfnSolutionProps = cdkBuilder.build()
}
