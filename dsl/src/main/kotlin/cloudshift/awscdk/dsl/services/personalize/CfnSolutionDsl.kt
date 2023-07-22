@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnSolution
import software.constructs.Construct

@CdkDslMarker
public class CfnSolutionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSolution.Builder = CfnSolution.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-datasetgrouparn)
   * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group that provides the
   * training data. 
   */
  public fun datasetGroupArn(datasetGroupArn: String) {
    cdkBuilder.datasetGroupArn(datasetGroupArn)
  }

  /**
   * The event type (for example, 'click' or 'like') that is used for training the model.
   *
   * If no `eventType` is provided, Amazon Personalize uses all interactions for training with equal
   * weight regardless of type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-eventtype)
   * @param eventType The event type (for example, 'click' or 'like') that is used for training the
   * model. 
   */
  public fun eventType(eventType: String) {
    cdkBuilder.eventType(eventType)
  }

  /**
   * The name of the solution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-name)
   * @param name The name of the solution. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * We don't recommend enabling automated machine learning.
   *
   * Instead, match your use case to the available Amazon Personalize recipes. For more information,
   * see [Determining your use
   * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
   *
   * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
   * the list specified in the solution configuration ( `recipeArn` must not be specified). When false
   * (the default), Amazon Personalize uses `recipeArn` for training.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performautoml)
   * @param performAutoMl We don't recommend enabling automated machine learning. 
   */
  public fun performAutoMl(performAutoMl: Boolean) {
    cdkBuilder.performAutoMl(performAutoMl)
  }

  /**
   * We don't recommend enabling automated machine learning.
   *
   * Instead, match your use case to the available Amazon Personalize recipes. For more information,
   * see [Determining your use
   * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
   *
   * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
   * the list specified in the solution configuration ( `recipeArn` must not be specified). When false
   * (the default), Amazon Personalize uses `recipeArn` for training.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performautoml)
   * @param performAutoMl We don't recommend enabling automated machine learning. 
   */
  public fun performAutoMl(performAutoMl: IResolvable) {
    cdkBuilder.performAutoMl(performAutoMl)
  }

  /**
   * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
   *
   * The default is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performhpo)
   * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe. 
   */
  public fun performHpo(performHpo: Boolean) {
    cdkBuilder.performHpo(performHpo)
  }

  /**
   * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
   *
   * The default is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performhpo)
   * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe. 
   */
  public fun performHpo(performHpo: IResolvable) {
    cdkBuilder.performHpo(performHpo)
  }

  /**
   * The ARN of the recipe used to create the solution.
   *
   * This is required when `performAutoML` is false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-recipearn)
   * @param recipeArn The ARN of the recipe used to create the solution. 
   */
  public fun recipeArn(recipeArn: String) {
    cdkBuilder.recipeArn(recipeArn)
  }

  /**
   * Describes the configuration properties for the solution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
   * @param solutionConfig Describes the configuration properties for the solution. 
   */
  public fun solutionConfig(solutionConfig: IResolvable) {
    cdkBuilder.solutionConfig(solutionConfig)
  }

  /**
   * Describes the configuration properties for the solution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
   * @param solutionConfig Describes the configuration properties for the solution. 
   */
  public fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty) {
    cdkBuilder.solutionConfig(solutionConfig)
  }

  public fun build(): CfnSolution = cdkBuilder.build()
}
