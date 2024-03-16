@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSolution`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.personalize.*;
 * Object autoMlConfig;
 * Object hpoConfig;
 * CfnSolutionProps cfnSolutionProps = CfnSolutionProps.builder()
 * .datasetGroupArn("datasetGroupArn")
 * .name("name")
 * // the properties below are optional
 * .eventType("eventType")
 * .performAutoMl(false)
 * .performHpo(false)
 * .recipeArn("recipeArn")
 * .solutionConfig(SolutionConfigProperty.builder()
 * .algorithmHyperParameters(Map.of(
 * "algorithmHyperParametersKey", "algorithmHyperParameters"))
 * .autoMlConfig(autoMlConfig)
 * .eventValueThreshold("eventValueThreshold")
 * .featureTransformationParameters(Map.of(
 * "featureTransformationParametersKey", "featureTransformationParameters"))
 * .hpoConfig(hpoConfig)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html)
 */
public interface CfnSolutionProps {
  /**
   * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-datasetgrouparn)
   */
  public fun datasetGroupArn(): String

  /**
   * The event type (for example, 'click' or 'like') that is used for training the model.
   *
   * If no `eventType` is provided, Amazon Personalize uses all interactions for training with equal
   * weight regardless of type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-eventtype)
   */
  public fun eventType(): String? = unwrap(this).getEventType()

  /**
   * The name of the solution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-name)
   */
  public fun name(): String

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
   */
  public fun performAutoMl(): Any? = unwrap(this).getPerformAutoMl()

  /**
   * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
   *
   * The default is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performhpo)
   */
  public fun performHpo(): Any? = unwrap(this).getPerformHpo()

  /**
   * The ARN of the recipe used to create the solution.
   *
   * This is required when `performAutoML` is false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-recipearn)
   */
  public fun recipeArn(): String? = unwrap(this).getRecipeArn()

  /**
   * Describes the configuration properties for the solution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
   */
  public fun solutionConfig(): Any? = unwrap(this).getSolutionConfig()

  /**
   * A builder for [CfnSolutionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group that provides the
     * training data. 
     */
    public fun datasetGroupArn(datasetGroupArn: String)

    /**
     * @param eventType The event type (for example, 'click' or 'like') that is used for training
     * the model.
     * If no `eventType` is provided, Amazon Personalize uses all interactions for training with
     * equal weight regardless of type.
     */
    public fun eventType(eventType: String)

    /**
     * @param name The name of the solution. 
     */
    public fun name(name: String)

    /**
     * @param performAutoMl We don't recommend enabling automated machine learning.
     * Instead, match your use case to the available Amazon Personalize recipes. For more
     * information, see [Determining your use
     * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
     *
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
     * the list specified in the solution configuration ( `recipeArn` must not be specified). When
     * false (the default), Amazon Personalize uses `recipeArn` for training.
     */
    public fun performAutoMl(performAutoMl: Boolean)

    /**
     * @param performAutoMl We don't recommend enabling automated machine learning.
     * Instead, match your use case to the available Amazon Personalize recipes. For more
     * information, see [Determining your use
     * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
     *
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
     * the list specified in the solution configuration ( `recipeArn` must not be specified). When
     * false (the default), Amazon Personalize uses `recipeArn` for training.
     */
    public fun performAutoMl(performAutoMl: IResolvable)

    /**
     * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
     * The default is `false` .
     */
    public fun performHpo(performHpo: Boolean)

    /**
     * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
     * The default is `false` .
     */
    public fun performHpo(performHpo: IResolvable)

    /**
     * @param recipeArn The ARN of the recipe used to create the solution.
     * This is required when `performAutoML` is false.
     */
    public fun recipeArn(recipeArn: String)

    /**
     * @param solutionConfig Describes the configuration properties for the solution.
     */
    public fun solutionConfig(solutionConfig: IResolvable)

    /**
     * @param solutionConfig Describes the configuration properties for the solution.
     */
    public fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty)

    /**
     * @param solutionConfig Describes the configuration properties for the solution.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f08e0cfe3927e144926376a24818d32e60b350ff8a7491d6b3c45e60c4cc1db")
    public fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnSolutionProps.Builder =
        software.amazon.awscdk.services.personalize.CfnSolutionProps.builder()

    /**
     * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group that provides the
     * training data. 
     */
    override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    /**
     * @param eventType The event type (for example, 'click' or 'like') that is used for training
     * the model.
     * If no `eventType` is provided, Amazon Personalize uses all interactions for training with
     * equal weight regardless of type.
     */
    override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    /**
     * @param name The name of the solution. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param performAutoMl We don't recommend enabling automated machine learning.
     * Instead, match your use case to the available Amazon Personalize recipes. For more
     * information, see [Determining your use
     * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
     *
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
     * the list specified in the solution configuration ( `recipeArn` must not be specified). When
     * false (the default), Amazon Personalize uses `recipeArn` for training.
     */
    override fun performAutoMl(performAutoMl: Boolean) {
      cdkBuilder.performAutoMl(performAutoMl)
    }

    /**
     * @param performAutoMl We don't recommend enabling automated machine learning.
     * Instead, match your use case to the available Amazon Personalize recipes. For more
     * information, see [Determining your use
     * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
     *
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
     * the list specified in the solution configuration ( `recipeArn` must not be specified). When
     * false (the default), Amazon Personalize uses `recipeArn` for training.
     */
    override fun performAutoMl(performAutoMl: IResolvable) {
      cdkBuilder.performAutoMl(performAutoMl.let(IResolvable::unwrap))
    }

    /**
     * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
     * The default is `false` .
     */
    override fun performHpo(performHpo: Boolean) {
      cdkBuilder.performHpo(performHpo)
    }

    /**
     * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
     * The default is `false` .
     */
    override fun performHpo(performHpo: IResolvable) {
      cdkBuilder.performHpo(performHpo.let(IResolvable::unwrap))
    }

    /**
     * @param recipeArn The ARN of the recipe used to create the solution.
     * This is required when `performAutoML` is false.
     */
    override fun recipeArn(recipeArn: String) {
      cdkBuilder.recipeArn(recipeArn)
    }

    /**
     * @param solutionConfig Describes the configuration properties for the solution.
     */
    override fun solutionConfig(solutionConfig: IResolvable) {
      cdkBuilder.solutionConfig(solutionConfig.let(IResolvable::unwrap))
    }

    /**
     * @param solutionConfig Describes the configuration properties for the solution.
     */
    override fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty) {
      cdkBuilder.solutionConfig(solutionConfig.let(CfnSolution.SolutionConfigProperty::unwrap))
    }

    /**
     * @param solutionConfig Describes the configuration properties for the solution.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f08e0cfe3927e144926376a24818d32e60b350ff8a7491d6b3c45e60c4cc1db")
    override
        fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty.Builder.() -> Unit):
        Unit = solutionConfig(CfnSolution.SolutionConfigProperty(solutionConfig))

    public fun build(): software.amazon.awscdk.services.personalize.CfnSolutionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.personalize.CfnSolutionProps,
  ) : CdkObject(cdkObject), CfnSolutionProps {
    /**
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-datasetgrouparn)
     */
    override fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

    /**
     * The event type (for example, 'click' or 'like') that is used for training the model.
     *
     * If no `eventType` is provided, Amazon Personalize uses all interactions for training with
     * equal weight regardless of type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-eventtype)
     */
    override fun eventType(): String? = unwrap(this).getEventType()

    /**
     * The name of the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * We don't recommend enabling automated machine learning.
     *
     * Instead, match your use case to the available Amazon Personalize recipes. For more
     * information, see [Determining your use
     * case.](https://docs.aws.amazon.com/personalize/latest/dg/determining-use-case.html)
     *
     * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from
     * the list specified in the solution configuration ( `recipeArn` must not be specified). When
     * false (the default), Amazon Personalize uses `recipeArn` for training.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performautoml)
     */
    override fun performAutoMl(): Any? = unwrap(this).getPerformAutoMl()

    /**
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performhpo)
     */
    override fun performHpo(): Any? = unwrap(this).getPerformHpo()

    /**
     * The ARN of the recipe used to create the solution.
     *
     * This is required when `performAutoML` is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-recipearn)
     */
    override fun recipeArn(): String? = unwrap(this).getRecipeArn()

    /**
     * Describes the configuration properties for the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
     */
    override fun solutionConfig(): Any? = unwrap(this).getSolutionConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSolutionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolutionProps):
        CfnSolutionProps = CdkObjectWrappers.wrap(cdkObject) as CfnSolutionProps

    internal fun unwrap(wrapped: CfnSolutionProps):
        software.amazon.awscdk.services.personalize.CfnSolutionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.personalize.CfnSolutionProps
  }
}
