@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An object that provides information about a solution.
 *
 * A solution includes the custom recipe, customized parameters, and trained models (Solution
 * Versions) that Amazon Personalize uses to generate recommendations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.personalize.*;
 * Object autoMlConfig;
 * Object hpoConfig;
 * CfnSolution cfnSolution = CfnSolution.Builder.create(this, "MyCfnSolution")
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
public open class CfnSolution internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.personalize.CfnSolution,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSolutionProps,
  ) :
      this(software.amazon.awscdk.services.personalize.CfnSolution(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSolutionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSolutionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSolutionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the solution.
   */
  public open fun attrSolutionArn(): String = unwrap(this).getAttrSolutionArn()

  /**
   * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
   */
  public open fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

  /**
   * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
   */
  public open fun datasetGroupArn(`value`: String) {
    unwrap(this).setDatasetGroupArn(`value`)
  }

  /**
   * The event type (for example, 'click' or 'like') that is used for training the model.
   */
  public open fun eventType(): String? = unwrap(this).getEventType()

  /**
   * The event type (for example, 'click' or 'like') that is used for training the model.
   */
  public open fun eventType(`value`: String) {
    unwrap(this).setEventType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the solution.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the solution.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * We don't recommend enabling automated machine learning.
   */
  public open fun performAutoMl(): Any? = unwrap(this).getPerformAutoMl()

  /**
   * We don't recommend enabling automated machine learning.
   */
  public open fun performAutoMl(`value`: Boolean) {
    unwrap(this).setPerformAutoMl(`value`)
  }

  /**
   * We don't recommend enabling automated machine learning.
   */
  public open fun performAutoMl(`value`: IResolvable) {
    unwrap(this).setPerformAutoMl(`value`.let(IResolvable::unwrap))
  }

  /**
   * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
   */
  public open fun performHpo(): Any? = unwrap(this).getPerformHpo()

  /**
   * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
   */
  public open fun performHpo(`value`: Boolean) {
    unwrap(this).setPerformHpo(`value`)
  }

  /**
   * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
   */
  public open fun performHpo(`value`: IResolvable) {
    unwrap(this).setPerformHpo(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ARN of the recipe used to create the solution.
   */
  public open fun recipeArn(): String? = unwrap(this).getRecipeArn()

  /**
   * The ARN of the recipe used to create the solution.
   */
  public open fun recipeArn(`value`: String) {
    unwrap(this).setRecipeArn(`value`)
  }

  /**
   * Describes the configuration properties for the solution.
   */
  public open fun solutionConfig(): Any? = unwrap(this).getSolutionConfig()

  /**
   * Describes the configuration properties for the solution.
   */
  public open fun solutionConfig(`value`: IResolvable) {
    unwrap(this).setSolutionConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the configuration properties for the solution.
   */
  public open fun solutionConfig(`value`: SolutionConfigProperty) {
    unwrap(this).setSolutionConfig(`value`.let(SolutionConfigProperty::unwrap))
  }

  /**
   * Describes the configuration properties for the solution.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d57c7658805e0f58c1f59cf48d9eb7c264e42ef36b247d0d380c77fd6b9c0d9c")
  public open fun solutionConfig(`value`: SolutionConfigProperty.Builder.() -> Unit): Unit =
      solutionConfig(SolutionConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.personalize.CfnSolution].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-datasetgrouparn)
     * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group that provides the
     * training data. 
     */
    public fun datasetGroupArn(datasetGroupArn: String)

    /**
     * The event type (for example, 'click' or 'like') that is used for training the model.
     *
     * If no `eventType` is provided, Amazon Personalize uses all interactions for training with
     * equal weight regardless of type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-eventtype)
     * @param eventType The event type (for example, 'click' or 'like') that is used for training
     * the model. 
     */
    public fun eventType(eventType: String)

    /**
     * The name of the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-name)
     * @param name The name of the solution. 
     */
    public fun name(name: String)

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
     * @param performAutoMl We don't recommend enabling automated machine learning. 
     */
    public fun performAutoMl(performAutoMl: Boolean)

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
     * @param performAutoMl We don't recommend enabling automated machine learning. 
     */
    public fun performAutoMl(performAutoMl: IResolvable)

    /**
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performhpo)
     * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe. 
     */
    public fun performHpo(performHpo: Boolean)

    /**
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performhpo)
     * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe. 
     */
    public fun performHpo(performHpo: IResolvable)

    /**
     * The ARN of the recipe used to create the solution.
     *
     * This is required when `performAutoML` is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-recipearn)
     * @param recipeArn The ARN of the recipe used to create the solution. 
     */
    public fun recipeArn(recipeArn: String)

    /**
     * Describes the configuration properties for the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
     * @param solutionConfig Describes the configuration properties for the solution. 
     */
    public fun solutionConfig(solutionConfig: IResolvable)

    /**
     * Describes the configuration properties for the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
     * @param solutionConfig Describes the configuration properties for the solution. 
     */
    public fun solutionConfig(solutionConfig: SolutionConfigProperty)

    /**
     * Describes the configuration properties for the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
     * @param solutionConfig Describes the configuration properties for the solution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04e716762c5f1499d722aa4737ff3e3ffbe364313b06bf22cd934b0194d6cfd5")
    public fun solutionConfig(solutionConfig: SolutionConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnSolution.Builder =
        software.amazon.awscdk.services.personalize.CfnSolution.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-datasetgrouparn)
     * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group that provides the
     * training data. 
     */
    override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    /**
     * The event type (for example, 'click' or 'like') that is used for training the model.
     *
     * If no `eventType` is provided, Amazon Personalize uses all interactions for training with
     * equal weight regardless of type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-eventtype)
     * @param eventType The event type (for example, 'click' or 'like') that is used for training
     * the model. 
     */
    override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    /**
     * The name of the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-name)
     * @param name The name of the solution. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param performAutoMl We don't recommend enabling automated machine learning. 
     */
    override fun performAutoMl(performAutoMl: Boolean) {
      cdkBuilder.performAutoMl(performAutoMl)
    }

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
     * @param performAutoMl We don't recommend enabling automated machine learning. 
     */
    override fun performAutoMl(performAutoMl: IResolvable) {
      cdkBuilder.performAutoMl(performAutoMl.let(IResolvable::unwrap))
    }

    /**
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-performhpo)
     * @param performHpo Whether to perform hyperparameter optimization (HPO) on the chosen recipe. 
     */
    override fun performHpo(performHpo: Boolean) {
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
    override fun performHpo(performHpo: IResolvable) {
      cdkBuilder.performHpo(performHpo.let(IResolvable::unwrap))
    }

    /**
     * The ARN of the recipe used to create the solution.
     *
     * This is required when `performAutoML` is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-recipearn)
     * @param recipeArn The ARN of the recipe used to create the solution. 
     */
    override fun recipeArn(recipeArn: String) {
      cdkBuilder.recipeArn(recipeArn)
    }

    /**
     * Describes the configuration properties for the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
     * @param solutionConfig Describes the configuration properties for the solution. 
     */
    override fun solutionConfig(solutionConfig: IResolvable) {
      cdkBuilder.solutionConfig(solutionConfig.let(IResolvable::unwrap))
    }

    /**
     * Describes the configuration properties for the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
     * @param solutionConfig Describes the configuration properties for the solution. 
     */
    override fun solutionConfig(solutionConfig: SolutionConfigProperty) {
      cdkBuilder.solutionConfig(solutionConfig.let(SolutionConfigProperty::unwrap))
    }

    /**
     * Describes the configuration properties for the solution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-solution.html#cfn-personalize-solution-solutionconfig)
     * @param solutionConfig Describes the configuration properties for the solution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04e716762c5f1499d722aa4737ff3e3ffbe364313b06bf22cd934b0194d6cfd5")
    override fun solutionConfig(solutionConfig: SolutionConfigProperty.Builder.() -> Unit): Unit =
        solutionConfig(SolutionConfigProperty(solutionConfig))

    public fun build(): software.amazon.awscdk.services.personalize.CfnSolution = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.personalize.CfnSolution.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSolution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSolution(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution):
        CfnSolution = CfnSolution(cdkObject)

    internal fun unwrap(wrapped: CfnSolution):
        software.amazon.awscdk.services.personalize.CfnSolution = wrapped.cdkObject
  }

  /**
   * When the solution performs AutoML ( `performAutoML` is true in
   * [CreateSolution](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html) ),
   * Amazon Personalize determines which recipe, from the specified list, optimizes the given metric.
   * Amazon Personalize then uses that recipe for the solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
   * AutoMLConfigProperty autoMLConfigProperty = AutoMLConfigProperty.builder()
   * .metricName("metricName")
   * .recipeList(List.of("recipeList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-automlconfig.html)
   */
  public interface AutoMLConfigProperty {
    /**
     * The metric to optimize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-automlconfig.html#cfn-personalize-solution-automlconfig-metricname)
     */
    public fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * The list of candidate recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-automlconfig.html#cfn-personalize-solution-automlconfig-recipelist)
     */
    public fun recipeList(): List<String> = unwrap(this).getRecipeList() ?: emptyList()

    /**
     * A builder for [AutoMLConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricName The metric to optimize.
       */
      public fun metricName(metricName: String)

      /**
       * @param recipeList The list of candidate recipes.
       */
      public fun recipeList(recipeList: List<String>)

      /**
       * @param recipeList The list of candidate recipes.
       */
      public fun recipeList(vararg recipeList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty.builder()

      /**
       * @param metricName The metric to optimize.
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param recipeList The list of candidate recipes.
       */
      override fun recipeList(recipeList: List<String>) {
        cdkBuilder.recipeList(recipeList)
      }

      /**
       * @param recipeList The list of candidate recipes.
       */
      override fun recipeList(vararg recipeList: String): Unit = recipeList(recipeList.toList())

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty,
    ) : CdkObject(cdkObject), AutoMLConfigProperty {
      /**
       * The metric to optimize.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-automlconfig.html#cfn-personalize-solution-automlconfig-metricname)
       */
      override fun metricName(): String? = unwrap(this).getMetricName()

      /**
       * The list of candidate recipes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-automlconfig.html#cfn-personalize-solution-automlconfig-recipelist)
       */
      override fun recipeList(): List<String> = unwrap(this).getRecipeList() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoMLConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty):
          AutoMLConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? AutoMLConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoMLConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty
    }
  }

  /**
   * Specifies the hyperparameters and their ranges.
   *
   * Hyperparameters can be categorical, continuous, or integer-valued.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
   * AlgorithmHyperParameterRangesProperty algorithmHyperParameterRangesProperty =
   * AlgorithmHyperParameterRangesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html)
   */
  public interface AlgorithmHyperParameterRangesProperty {
    /**
     * Provides the name and range of a categorical hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html#cfn-personalize-solution-algorithmhyperparameterranges-categoricalhyperparameterranges)
     */
    public fun categoricalHyperParameterRanges(): Any? =
        unwrap(this).getCategoricalHyperParameterRanges()

    /**
     * Provides the name and range of a continuous hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html#cfn-personalize-solution-algorithmhyperparameterranges-continuoushyperparameterranges)
     */
    public fun continuousHyperParameterRanges(): Any? =
        unwrap(this).getContinuousHyperParameterRanges()

    /**
     * Provides the name and range of an integer-valued hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html#cfn-personalize-solution-algorithmhyperparameterranges-integerhyperparameterranges)
     */
    public fun integerHyperParameterRanges(): Any? = unwrap(this).getIntegerHyperParameterRanges()

    /**
     * A builder for [AlgorithmHyperParameterRangesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param categoricalHyperParameterRanges Provides the name and range of a categorical
       * hyperparameter.
       */
      public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: IResolvable)

      /**
       * @param categoricalHyperParameterRanges Provides the name and range of a categorical
       * hyperparameter.
       */
      public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: List<Any>)

      /**
       * @param categoricalHyperParameterRanges Provides the name and range of a categorical
       * hyperparameter.
       */
      public fun categoricalHyperParameterRanges(vararg categoricalHyperParameterRanges: Any)

      /**
       * @param continuousHyperParameterRanges Provides the name and range of a continuous
       * hyperparameter.
       */
      public fun continuousHyperParameterRanges(continuousHyperParameterRanges: IResolvable)

      /**
       * @param continuousHyperParameterRanges Provides the name and range of a continuous
       * hyperparameter.
       */
      public fun continuousHyperParameterRanges(continuousHyperParameterRanges: List<Any>)

      /**
       * @param continuousHyperParameterRanges Provides the name and range of a continuous
       * hyperparameter.
       */
      public fun continuousHyperParameterRanges(vararg continuousHyperParameterRanges: Any)

      /**
       * @param integerHyperParameterRanges Provides the name and range of an integer-valued
       * hyperparameter.
       */
      public fun integerHyperParameterRanges(integerHyperParameterRanges: IResolvable)

      /**
       * @param integerHyperParameterRanges Provides the name and range of an integer-valued
       * hyperparameter.
       */
      public fun integerHyperParameterRanges(integerHyperParameterRanges: List<Any>)

      /**
       * @param integerHyperParameterRanges Provides the name and range of an integer-valued
       * hyperparameter.
       */
      public fun integerHyperParameterRanges(vararg integerHyperParameterRanges: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty.builder()

      /**
       * @param categoricalHyperParameterRanges Provides the name and range of a categorical
       * hyperparameter.
       */
      override fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: IResolvable) {
        cdkBuilder.categoricalHyperParameterRanges(categoricalHyperParameterRanges.let(IResolvable::unwrap))
      }

      /**
       * @param categoricalHyperParameterRanges Provides the name and range of a categorical
       * hyperparameter.
       */
      override fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: List<Any>) {
        cdkBuilder.categoricalHyperParameterRanges(categoricalHyperParameterRanges)
      }

      /**
       * @param categoricalHyperParameterRanges Provides the name and range of a categorical
       * hyperparameter.
       */
      override fun categoricalHyperParameterRanges(vararg categoricalHyperParameterRanges: Any):
          Unit = categoricalHyperParameterRanges(categoricalHyperParameterRanges.toList())

      /**
       * @param continuousHyperParameterRanges Provides the name and range of a continuous
       * hyperparameter.
       */
      override fun continuousHyperParameterRanges(continuousHyperParameterRanges: IResolvable) {
        cdkBuilder.continuousHyperParameterRanges(continuousHyperParameterRanges.let(IResolvable::unwrap))
      }

      /**
       * @param continuousHyperParameterRanges Provides the name and range of a continuous
       * hyperparameter.
       */
      override fun continuousHyperParameterRanges(continuousHyperParameterRanges: List<Any>) {
        cdkBuilder.continuousHyperParameterRanges(continuousHyperParameterRanges)
      }

      /**
       * @param continuousHyperParameterRanges Provides the name and range of a continuous
       * hyperparameter.
       */
      override fun continuousHyperParameterRanges(vararg continuousHyperParameterRanges: Any): Unit
          = continuousHyperParameterRanges(continuousHyperParameterRanges.toList())

      /**
       * @param integerHyperParameterRanges Provides the name and range of an integer-valued
       * hyperparameter.
       */
      override fun integerHyperParameterRanges(integerHyperParameterRanges: IResolvable) {
        cdkBuilder.integerHyperParameterRanges(integerHyperParameterRanges.let(IResolvable::unwrap))
      }

      /**
       * @param integerHyperParameterRanges Provides the name and range of an integer-valued
       * hyperparameter.
       */
      override fun integerHyperParameterRanges(integerHyperParameterRanges: List<Any>) {
        cdkBuilder.integerHyperParameterRanges(integerHyperParameterRanges)
      }

      /**
       * @param integerHyperParameterRanges Provides the name and range of an integer-valued
       * hyperparameter.
       */
      override fun integerHyperParameterRanges(vararg integerHyperParameterRanges: Any): Unit =
          integerHyperParameterRanges(integerHyperParameterRanges.toList())

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty,
    ) : CdkObject(cdkObject), AlgorithmHyperParameterRangesProperty {
      /**
       * Provides the name and range of a categorical hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html#cfn-personalize-solution-algorithmhyperparameterranges-categoricalhyperparameterranges)
       */
      override fun categoricalHyperParameterRanges(): Any? =
          unwrap(this).getCategoricalHyperParameterRanges()

      /**
       * Provides the name and range of a continuous hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html#cfn-personalize-solution-algorithmhyperparameterranges-continuoushyperparameterranges)
       */
      override fun continuousHyperParameterRanges(): Any? =
          unwrap(this).getContinuousHyperParameterRanges()

      /**
       * Provides the name and range of an integer-valued hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-algorithmhyperparameterranges.html#cfn-personalize-solution-algorithmhyperparameterranges-integerhyperparameterranges)
       */
      override fun integerHyperParameterRanges(): Any? =
          unwrap(this).getIntegerHyperParameterRanges()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AlgorithmHyperParameterRangesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty):
          AlgorithmHyperParameterRangesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AlgorithmHyperParameterRangesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlgorithmHyperParameterRangesProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty
    }
  }

  /**
   * Provides the name and range of an integer-valued hyperparameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
   * IntegerHyperParameterRangeProperty integerHyperParameterRangeProperty =
   * IntegerHyperParameterRangeProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html)
   */
  public interface IntegerHyperParameterRangeProperty {
    /**
     * The maximum allowable value for the hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html#cfn-personalize-solution-integerhyperparameterrange-maxvalue)
     */
    public fun maxValue(): Number? = unwrap(this).getMaxValue()

    /**
     * The minimum allowable value for the hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html#cfn-personalize-solution-integerhyperparameterrange-minvalue)
     */
    public fun minValue(): Number? = unwrap(this).getMinValue()

    /**
     * The name of the hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html#cfn-personalize-solution-integerhyperparameterrange-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [IntegerHyperParameterRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxValue The maximum allowable value for the hyperparameter.
       */
      public fun maxValue(maxValue: Number)

      /**
       * @param minValue The minimum allowable value for the hyperparameter.
       */
      public fun minValue(minValue: Number)

      /**
       * @param name The name of the hyperparameter.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty.builder()

      /**
       * @param maxValue The maximum allowable value for the hyperparameter.
       */
      override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      /**
       * @param minValue The minimum allowable value for the hyperparameter.
       */
      override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      /**
       * @param name The name of the hyperparameter.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty,
    ) : CdkObject(cdkObject), IntegerHyperParameterRangeProperty {
      /**
       * The maximum allowable value for the hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html#cfn-personalize-solution-integerhyperparameterrange-maxvalue)
       */
      override fun maxValue(): Number? = unwrap(this).getMaxValue()

      /**
       * The minimum allowable value for the hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html#cfn-personalize-solution-integerhyperparameterrange-minvalue)
       */
      override fun minValue(): Number? = unwrap(this).getMinValue()

      /**
       * The name of the hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-integerhyperparameterrange.html#cfn-personalize-solution-integerhyperparameterrange-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IntegerHyperParameterRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty):
          IntegerHyperParameterRangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IntegerHyperParameterRangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegerHyperParameterRangeProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty
    }
  }

  /**
   * Provides the name and range of a categorical hyperparameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
   * CategoricalHyperParameterRangeProperty categoricalHyperParameterRangeProperty =
   * CategoricalHyperParameterRangeProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-categoricalhyperparameterrange.html)
   */
  public interface CategoricalHyperParameterRangeProperty {
    /**
     * The name of the hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-categoricalhyperparameterrange.html#cfn-personalize-solution-categoricalhyperparameterrange-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A list of the categories for the hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-categoricalhyperparameterrange.html#cfn-personalize-solution-categoricalhyperparameterrange-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [CategoricalHyperParameterRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the hyperparameter.
       */
      public fun name(name: String)

      /**
       * @param values A list of the categories for the hyperparameter.
       */
      public fun values(values: List<String>)

      /**
       * @param values A list of the categories for the hyperparameter.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty.builder()

      /**
       * @param name The name of the hyperparameter.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param values A list of the categories for the hyperparameter.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values A list of the categories for the hyperparameter.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty,
    ) : CdkObject(cdkObject), CategoricalHyperParameterRangeProperty {
      /**
       * The name of the hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-categoricalhyperparameterrange.html#cfn-personalize-solution-categoricalhyperparameterrange-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A list of the categories for the hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-categoricalhyperparameterrange.html#cfn-personalize-solution-categoricalhyperparameterrange-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CategoricalHyperParameterRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty):
          CategoricalHyperParameterRangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CategoricalHyperParameterRangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CategoricalHyperParameterRangeProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty
    }
  }

  /**
   * Describes the configuration properties for the solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
   * Object autoMlConfig;
   * Object hpoConfig;
   * SolutionConfigProperty solutionConfigProperty = SolutionConfigProperty.builder()
   * .algorithmHyperParameters(Map.of(
   * "algorithmHyperParametersKey", "algorithmHyperParameters"))
   * .autoMlConfig(autoMlConfig)
   * .eventValueThreshold("eventValueThreshold")
   * .featureTransformationParameters(Map.of(
   * "featureTransformationParametersKey", "featureTransformationParameters"))
   * .hpoConfig(hpoConfig)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html)
   */
  public interface SolutionConfigProperty {
    /**
     * Lists the algorithm hyperparameters and their values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-algorithmhyperparameters)
     */
    public fun algorithmHyperParameters(): Any? = unwrap(this).getAlgorithmHyperParameters()

    /**
     * The [AutoMLConfig](https://docs.aws.amazon.com/personalize/latest/dg/API_AutoMLConfig.html)
     * object containing a list of recipes to search when AutoML is performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-automlconfig)
     */
    public fun autoMlConfig(): Any? = unwrap(this).getAutoMlConfig()

    /**
     * Only events with a value greater than or equal to this threshold are used for training a
     * model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-eventvaluethreshold)
     */
    public fun eventValueThreshold(): String? = unwrap(this).getEventValueThreshold()

    /**
     * Lists the feature transformation parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-featuretransformationparameters)
     */
    public fun featureTransformationParameters(): Any? =
        unwrap(this).getFeatureTransformationParameters()

    /**
     * Describes the properties for hyperparameter optimization (HPO).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-hpoconfig)
     */
    public fun hpoConfig(): Any? = unwrap(this).getHpoConfig()

    /**
     * A builder for [SolutionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithmHyperParameters Lists the algorithm hyperparameters and their values.
       */
      public fun algorithmHyperParameters(algorithmHyperParameters: IResolvable)

      /**
       * @param algorithmHyperParameters Lists the algorithm hyperparameters and their values.
       */
      public fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>)

      /**
       * @param autoMlConfig The
       * [AutoMLConfig](https://docs.aws.amazon.com/personalize/latest/dg/API_AutoMLConfig.html) object
       * containing a list of recipes to search when AutoML is performed.
       */
      public fun autoMlConfig(autoMlConfig: Any)

      /**
       * @param eventValueThreshold Only events with a value greater than or equal to this threshold
       * are used for training a model.
       */
      public fun eventValueThreshold(eventValueThreshold: String)

      /**
       * @param featureTransformationParameters Lists the feature transformation parameters.
       */
      public fun featureTransformationParameters(featureTransformationParameters: IResolvable)

      /**
       * @param featureTransformationParameters Lists the feature transformation parameters.
       */
      public
          fun featureTransformationParameters(featureTransformationParameters: Map<String, String>)

      /**
       * @param hpoConfig Describes the properties for hyperparameter optimization (HPO).
       */
      public fun hpoConfig(hpoConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty.builder()

      /**
       * @param algorithmHyperParameters Lists the algorithm hyperparameters and their values.
       */
      override fun algorithmHyperParameters(algorithmHyperParameters: IResolvable) {
        cdkBuilder.algorithmHyperParameters(algorithmHyperParameters.let(IResolvable::unwrap))
      }

      /**
       * @param algorithmHyperParameters Lists the algorithm hyperparameters and their values.
       */
      override fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>) {
        cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
      }

      /**
       * @param autoMlConfig The
       * [AutoMLConfig](https://docs.aws.amazon.com/personalize/latest/dg/API_AutoMLConfig.html) object
       * containing a list of recipes to search when AutoML is performed.
       */
      override fun autoMlConfig(autoMlConfig: Any) {
        cdkBuilder.autoMlConfig(autoMlConfig)
      }

      /**
       * @param eventValueThreshold Only events with a value greater than or equal to this threshold
       * are used for training a model.
       */
      override fun eventValueThreshold(eventValueThreshold: String) {
        cdkBuilder.eventValueThreshold(eventValueThreshold)
      }

      /**
       * @param featureTransformationParameters Lists the feature transformation parameters.
       */
      override fun featureTransformationParameters(featureTransformationParameters: IResolvable) {
        cdkBuilder.featureTransformationParameters(featureTransformationParameters.let(IResolvable::unwrap))
      }

      /**
       * @param featureTransformationParameters Lists the feature transformation parameters.
       */
      override
          fun featureTransformationParameters(featureTransformationParameters: Map<String, String>) {
        cdkBuilder.featureTransformationParameters(featureTransformationParameters)
      }

      /**
       * @param hpoConfig Describes the properties for hyperparameter optimization (HPO).
       */
      override fun hpoConfig(hpoConfig: Any) {
        cdkBuilder.hpoConfig(hpoConfig)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty,
    ) : CdkObject(cdkObject), SolutionConfigProperty {
      /**
       * Lists the algorithm hyperparameters and their values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-algorithmhyperparameters)
       */
      override fun algorithmHyperParameters(): Any? = unwrap(this).getAlgorithmHyperParameters()

      /**
       * The [AutoMLConfig](https://docs.aws.amazon.com/personalize/latest/dg/API_AutoMLConfig.html)
       * object containing a list of recipes to search when AutoML is performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-automlconfig)
       */
      override fun autoMlConfig(): Any? = unwrap(this).getAutoMlConfig()

      /**
       * Only events with a value greater than or equal to this threshold are used for training a
       * model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-eventvaluethreshold)
       */
      override fun eventValueThreshold(): String? = unwrap(this).getEventValueThreshold()

      /**
       * Lists the feature transformation parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-featuretransformationparameters)
       */
      override fun featureTransformationParameters(): Any? =
          unwrap(this).getFeatureTransformationParameters()

      /**
       * Describes the properties for hyperparameter optimization (HPO).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-solutionconfig.html#cfn-personalize-solution-solutionconfig-hpoconfig)
       */
      override fun hpoConfig(): Any? = unwrap(this).getHpoConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SolutionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty):
          SolutionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SolutionConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SolutionConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty
    }
  }

  /**
   * Provides the name and range of a continuous hyperparameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
   * ContinuousHyperParameterRangeProperty continuousHyperParameterRangeProperty =
   * ContinuousHyperParameterRangeProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-continuoushyperparameterrange.html)
   */
  public interface ContinuousHyperParameterRangeProperty {
    /**
     * The maximum allowable value for the hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-continuoushyperparameterrange.html#cfn-personalize-solution-continuoushyperparameterrange-maxvalue)
     */
    public fun maxValue(): Number? = unwrap(this).getMaxValue()

    /**
     * The minimum allowable value for the hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-continuoushyperparameterrange.html#cfn-personalize-solution-continuoushyperparameterrange-minvalue)
     */
    public fun minValue(): Number? = unwrap(this).getMinValue()

    /**
     * The name of the hyperparameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-continuoushyperparameterrange.html#cfn-personalize-solution-continuoushyperparameterrange-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [ContinuousHyperParameterRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxValue The maximum allowable value for the hyperparameter.
       */
      public fun maxValue(maxValue: Number)

      /**
       * @param minValue The minimum allowable value for the hyperparameter.
       */
      public fun minValue(minValue: Number)

      /**
       * @param name The name of the hyperparameter.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty.builder()

      /**
       * @param maxValue The maximum allowable value for the hyperparameter.
       */
      override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      /**
       * @param minValue The minimum allowable value for the hyperparameter.
       */
      override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      /**
       * @param name The name of the hyperparameter.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty,
    ) : CdkObject(cdkObject), ContinuousHyperParameterRangeProperty {
      /**
       * The maximum allowable value for the hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-continuoushyperparameterrange.html#cfn-personalize-solution-continuoushyperparameterrange-maxvalue)
       */
      override fun maxValue(): Number? = unwrap(this).getMaxValue()

      /**
       * The minimum allowable value for the hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-continuoushyperparameterrange.html#cfn-personalize-solution-continuoushyperparameterrange-minvalue)
       */
      override fun minValue(): Number? = unwrap(this).getMinValue()

      /**
       * The name of the hyperparameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-continuoushyperparameterrange.html#cfn-personalize-solution-continuoushyperparameterrange-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContinuousHyperParameterRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty):
          ContinuousHyperParameterRangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContinuousHyperParameterRangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContinuousHyperParameterRangeProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty
    }
  }

  /**
   * Describes the properties for hyperparameter optimization (HPO).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
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
  public interface HpoConfigProperty {
    /**
     * The hyperparameters and their allowable ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoconfig.html#cfn-personalize-solution-hpoconfig-algorithmhyperparameterranges)
     */
    public fun algorithmHyperParameterRanges(): Any? =
        unwrap(this).getAlgorithmHyperParameterRanges()

    /**
     * The metric to optimize during HPO.
     *
     *
     * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoconfig.html#cfn-personalize-solution-hpoconfig-hpoobjective)
     */
    public fun hpoObjective(): Any? = unwrap(this).getHpoObjective()

    /**
     * Describes the resource configuration for HPO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoconfig.html#cfn-personalize-solution-hpoconfig-hporesourceconfig)
     */
    public fun hpoResourceConfig(): Any? = unwrap(this).getHpoResourceConfig()

    /**
     * A builder for [HpoConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
       */
      public fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable)

      /**
       * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
       */
      public
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty)

      /**
       * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba6b39ce5c6428a45fc0e7768be6e15f3f66a07c3edd48e52536e09dfb134cd")
      public
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty.Builder.() -> Unit)

      /**
       * @param hpoObjective The metric to optimize during HPO.
       *
       * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
       */
      public fun hpoObjective(hpoObjective: IResolvable)

      /**
       * @param hpoObjective The metric to optimize during HPO.
       *
       * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
       */
      public fun hpoObjective(hpoObjective: HpoObjectiveProperty)

      /**
       * @param hpoObjective The metric to optimize during HPO.
       *
       * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("787141eee34b1e07a990b8a6af4e0438f787e3e9e9a2a9a9963431be4271a304")
      public fun hpoObjective(hpoObjective: HpoObjectiveProperty.Builder.() -> Unit)

      /**
       * @param hpoResourceConfig Describes the resource configuration for HPO.
       */
      public fun hpoResourceConfig(hpoResourceConfig: IResolvable)

      /**
       * @param hpoResourceConfig Describes the resource configuration for HPO.
       */
      public fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty)

      /**
       * @param hpoResourceConfig Describes the resource configuration for HPO.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("719d572433c4acc643332477ff4311f9eb9f3f786f82f062b12674995d257593")
      public fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty.builder()

      /**
       * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
       */
      override fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable) {
        cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges.let(IResolvable::unwrap))
      }

      /**
       * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
       */
      override
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty) {
        cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges.let(AlgorithmHyperParameterRangesProperty::unwrap))
      }

      /**
       * @param algorithmHyperParameterRanges The hyperparameters and their allowable ranges.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba6b39ce5c6428a45fc0e7768be6e15f3f66a07c3edd48e52536e09dfb134cd")
      override
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty.Builder.() -> Unit):
          Unit =
          algorithmHyperParameterRanges(AlgorithmHyperParameterRangesProperty(algorithmHyperParameterRanges))

      /**
       * @param hpoObjective The metric to optimize during HPO.
       *
       * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
       */
      override fun hpoObjective(hpoObjective: IResolvable) {
        cdkBuilder.hpoObjective(hpoObjective.let(IResolvable::unwrap))
      }

      /**
       * @param hpoObjective The metric to optimize during HPO.
       *
       * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
       */
      override fun hpoObjective(hpoObjective: HpoObjectiveProperty) {
        cdkBuilder.hpoObjective(hpoObjective.let(HpoObjectiveProperty::unwrap))
      }

      /**
       * @param hpoObjective The metric to optimize during HPO.
       *
       * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("787141eee34b1e07a990b8a6af4e0438f787e3e9e9a2a9a9963431be4271a304")
      override fun hpoObjective(hpoObjective: HpoObjectiveProperty.Builder.() -> Unit): Unit =
          hpoObjective(HpoObjectiveProperty(hpoObjective))

      /**
       * @param hpoResourceConfig Describes the resource configuration for HPO.
       */
      override fun hpoResourceConfig(hpoResourceConfig: IResolvable) {
        cdkBuilder.hpoResourceConfig(hpoResourceConfig.let(IResolvable::unwrap))
      }

      /**
       * @param hpoResourceConfig Describes the resource configuration for HPO.
       */
      override fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty) {
        cdkBuilder.hpoResourceConfig(hpoResourceConfig.let(HpoResourceConfigProperty::unwrap))
      }

      /**
       * @param hpoResourceConfig Describes the resource configuration for HPO.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("719d572433c4acc643332477ff4311f9eb9f3f786f82f062b12674995d257593")
      override
          fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty.Builder.() -> Unit):
          Unit = hpoResourceConfig(HpoResourceConfigProperty(hpoResourceConfig))

      public fun build(): software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty,
    ) : CdkObject(cdkObject), HpoConfigProperty {
      /**
       * The hyperparameters and their allowable ranges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoconfig.html#cfn-personalize-solution-hpoconfig-algorithmhyperparameterranges)
       */
      override fun algorithmHyperParameterRanges(): Any? =
          unwrap(this).getAlgorithmHyperParameterRanges()

      /**
       * The metric to optimize during HPO.
       *
       *
       * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoconfig.html#cfn-personalize-solution-hpoconfig-hpoobjective)
       */
      override fun hpoObjective(): Any? = unwrap(this).getHpoObjective()

      /**
       * Describes the resource configuration for HPO.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoconfig.html#cfn-personalize-solution-hpoconfig-hporesourceconfig)
       */
      override fun hpoResourceConfig(): Any? = unwrap(this).getHpoResourceConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HpoConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty):
          HpoConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? HpoConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty
    }
  }

  /**
   * Describes the resource configuration for hyperparameter optimization (HPO).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
   * HpoResourceConfigProperty hpoResourceConfigProperty = HpoResourceConfigProperty.builder()
   * .maxNumberOfTrainingJobs("maxNumberOfTrainingJobs")
   * .maxParallelTrainingJobs("maxParallelTrainingJobs")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hporesourceconfig.html)
   */
  public interface HpoResourceConfigProperty {
    /**
     * The maximum number of training jobs when you create a solution version.
     *
     * The maximum value for `maxNumberOfTrainingJobs` is `40` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hporesourceconfig.html#cfn-personalize-solution-hporesourceconfig-maxnumberoftrainingjobs)
     */
    public fun maxNumberOfTrainingJobs(): String? = unwrap(this).getMaxNumberOfTrainingJobs()

    /**
     * The maximum number of parallel training jobs when you create a solution version.
     *
     * The maximum value for `maxParallelTrainingJobs` is `10` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hporesourceconfig.html#cfn-personalize-solution-hporesourceconfig-maxparalleltrainingjobs)
     */
    public fun maxParallelTrainingJobs(): String? = unwrap(this).getMaxParallelTrainingJobs()

    /**
     * A builder for [HpoResourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxNumberOfTrainingJobs The maximum number of training jobs when you create a
       * solution version.
       * The maximum value for `maxNumberOfTrainingJobs` is `40` .
       */
      public fun maxNumberOfTrainingJobs(maxNumberOfTrainingJobs: String)

      /**
       * @param maxParallelTrainingJobs The maximum number of parallel training jobs when you create
       * a solution version.
       * The maximum value for `maxParallelTrainingJobs` is `10` .
       */
      public fun maxParallelTrainingJobs(maxParallelTrainingJobs: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty.builder()

      /**
       * @param maxNumberOfTrainingJobs The maximum number of training jobs when you create a
       * solution version.
       * The maximum value for `maxNumberOfTrainingJobs` is `40` .
       */
      override fun maxNumberOfTrainingJobs(maxNumberOfTrainingJobs: String) {
        cdkBuilder.maxNumberOfTrainingJobs(maxNumberOfTrainingJobs)
      }

      /**
       * @param maxParallelTrainingJobs The maximum number of parallel training jobs when you create
       * a solution version.
       * The maximum value for `maxParallelTrainingJobs` is `10` .
       */
      override fun maxParallelTrainingJobs(maxParallelTrainingJobs: String) {
        cdkBuilder.maxParallelTrainingJobs(maxParallelTrainingJobs)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty,
    ) : CdkObject(cdkObject), HpoResourceConfigProperty {
      /**
       * The maximum number of training jobs when you create a solution version.
       *
       * The maximum value for `maxNumberOfTrainingJobs` is `40` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hporesourceconfig.html#cfn-personalize-solution-hporesourceconfig-maxnumberoftrainingjobs)
       */
      override fun maxNumberOfTrainingJobs(): String? = unwrap(this).getMaxNumberOfTrainingJobs()

      /**
       * The maximum number of parallel training jobs when you create a solution version.
       *
       * The maximum value for `maxParallelTrainingJobs` is `10` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hporesourceconfig.html#cfn-personalize-solution-hporesourceconfig-maxparalleltrainingjobs)
       */
      override fun maxParallelTrainingJobs(): String? = unwrap(this).getMaxParallelTrainingJobs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HpoResourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty):
          HpoResourceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HpoResourceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoResourceConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty
    }
  }

  /**
   * The metric to optimize during hyperparameter optimization (HPO).
   *
   *
   * Amazon Personalize doesn't support configuring the `hpoObjective` at this time.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.personalize.*;
   * HpoObjectiveProperty hpoObjectiveProperty = HpoObjectiveProperty.builder()
   * .metricName("metricName")
   * .metricRegex("metricRegex")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html)
   */
  public interface HpoObjectiveProperty {
    /**
     * The name of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html#cfn-personalize-solution-hpoobjective-metricname)
     */
    public fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * A regular expression for finding the metric in the training job logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html#cfn-personalize-solution-hpoobjective-metricregex)
     */
    public fun metricRegex(): String? = unwrap(this).getMetricRegex()

    /**
     * The type of the metric.
     *
     * Valid values are `Maximize` and `Minimize` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html#cfn-personalize-solution-hpoobjective-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [HpoObjectiveProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricName The name of the metric.
       */
      public fun metricName(metricName: String)

      /**
       * @param metricRegex A regular expression for finding the metric in the training job logs.
       */
      public fun metricRegex(metricRegex: String)

      /**
       * @param type The type of the metric.
       * Valid values are `Maximize` and `Minimize` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty.builder()

      /**
       * @param metricName The name of the metric.
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param metricRegex A regular expression for finding the metric in the training job logs.
       */
      override fun metricRegex(metricRegex: String) {
        cdkBuilder.metricRegex(metricRegex)
      }

      /**
       * @param type The type of the metric.
       * Valid values are `Maximize` and `Minimize` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty,
    ) : CdkObject(cdkObject), HpoObjectiveProperty {
      /**
       * The name of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html#cfn-personalize-solution-hpoobjective-metricname)
       */
      override fun metricName(): String? = unwrap(this).getMetricName()

      /**
       * A regular expression for finding the metric in the training job logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html#cfn-personalize-solution-hpoobjective-metricregex)
       */
      override fun metricRegex(): String? = unwrap(this).getMetricRegex()

      /**
       * The type of the metric.
       *
       * Valid values are `Maximize` and `Minimize` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-personalize-solution-hpoobjective.html#cfn-personalize-solution-hpoobjective-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HpoObjectiveProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty):
          HpoObjectiveProperty = CdkObjectWrappers.wrap(cdkObject) as? HpoObjectiveProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoObjectiveProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty
    }
  }
}
