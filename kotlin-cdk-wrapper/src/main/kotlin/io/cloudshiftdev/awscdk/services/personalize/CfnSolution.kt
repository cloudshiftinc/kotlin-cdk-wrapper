@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

public open class CfnSolution internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.personalize.CfnSolution,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrSolutionArn(): String = unwrap(this).getAttrSolutionArn()

  public open fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

  public open fun datasetGroupArn(`value`: String) {
    unwrap(this).setDatasetGroupArn(`value`)
  }

  public open fun eventType(): String? = unwrap(this).getEventType()

  public open fun eventType(`value`: String) {
    unwrap(this).setEventType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun performAutoMl(): Any? = unwrap(this).getPerformAutoMl()

  public open fun performAutoMl(`value`: Boolean) {
    unwrap(this).setPerformAutoMl(`value`)
  }

  public open fun performAutoMl(`value`: IResolvable) {
    unwrap(this).setPerformAutoMl(`value`.let(IResolvable::unwrap))
  }

  public open fun performHpo(): Any? = unwrap(this).getPerformHpo()

  public open fun performHpo(`value`: Boolean) {
    unwrap(this).setPerformHpo(`value`)
  }

  public open fun performHpo(`value`: IResolvable) {
    unwrap(this).setPerformHpo(`value`.let(IResolvable::unwrap))
  }

  public open fun recipeArn(): String? = unwrap(this).getRecipeArn()

  public open fun recipeArn(`value`: String) {
    unwrap(this).setRecipeArn(`value`)
  }

  public open fun solutionConfig(): Any? = unwrap(this).getSolutionConfig()

  public open fun solutionConfig(`value`: IResolvable) {
    unwrap(this).setSolutionConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun solutionConfig(`value`: SolutionConfigProperty) {
    unwrap(this).setSolutionConfig(`value`.let(SolutionConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d57c7658805e0f58c1f59cf48d9eb7c264e42ef36b247d0d380c77fd6b9c0d9c")
  public open fun solutionConfig(`value`: SolutionConfigProperty.Builder.() -> Unit): Unit =
      solutionConfig(SolutionConfigProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun datasetGroupArn(datasetGroupArn: String)

    public fun eventType(eventType: String)

    public fun name(name: String)

    public fun performAutoMl(performAutoMl: Boolean)

    public fun performAutoMl(performAutoMl: IResolvable)

    public fun performHpo(performHpo: Boolean)

    public fun performHpo(performHpo: IResolvable)

    public fun recipeArn(recipeArn: String)

    public fun solutionConfig(solutionConfig: IResolvable)

    public fun solutionConfig(solutionConfig: SolutionConfigProperty)

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

    override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun performAutoMl(performAutoMl: Boolean) {
      cdkBuilder.performAutoMl(performAutoMl)
    }

    override fun performAutoMl(performAutoMl: IResolvable) {
      cdkBuilder.performAutoMl(performAutoMl.let(IResolvable::unwrap))
    }

    override fun performHpo(performHpo: Boolean) {
      cdkBuilder.performHpo(performHpo)
    }

    override fun performHpo(performHpo: IResolvable) {
      cdkBuilder.performHpo(performHpo.let(IResolvable::unwrap))
    }

    override fun recipeArn(recipeArn: String) {
      cdkBuilder.recipeArn(recipeArn)
    }

    override fun solutionConfig(solutionConfig: IResolvable) {
      cdkBuilder.solutionConfig(solutionConfig.let(IResolvable::unwrap))
    }

    override fun solutionConfig(solutionConfig: SolutionConfigProperty) {
      cdkBuilder.solutionConfig(solutionConfig.let(SolutionConfigProperty::unwrap))
    }

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

  public interface AutoMLConfigProperty {
    public fun metricName(): String? = unwrap(this).getMetricName()

    public fun recipeList(): List<String> = unwrap(this).getRecipeList() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun metricName(metricName: String)

      public fun recipeList(recipeList: List<String>)

      public fun recipeList(vararg recipeList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty.builder()

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun recipeList(recipeList: List<String>) {
        cdkBuilder.recipeList(recipeList)
      }

      override fun recipeList(vararg recipeList: String): Unit = recipeList(recipeList.toList())

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty,
    ) : CdkObject(cdkObject), AutoMLConfigProperty {
      override fun metricName(): String? = unwrap(this).getMetricName()

      override fun recipeList(): List<String> = unwrap(this).getRecipeList() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoMLConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty):
          AutoMLConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoMLConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty
    }
  }

  public interface AlgorithmHyperParameterRangesProperty {
    public fun categoricalHyperParameterRanges(): Any? =
        unwrap(this).getCategoricalHyperParameterRanges()

    public fun continuousHyperParameterRanges(): Any? =
        unwrap(this).getContinuousHyperParameterRanges()

    public fun integerHyperParameterRanges(): Any? = unwrap(this).getIntegerHyperParameterRanges()

    @CdkDslMarker
    public interface Builder {
      public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: IResolvable)

      public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: List<Any>)

      public fun categoricalHyperParameterRanges(vararg categoricalHyperParameterRanges: Any)

      public fun continuousHyperParameterRanges(continuousHyperParameterRanges: IResolvable)

      public fun continuousHyperParameterRanges(continuousHyperParameterRanges: List<Any>)

      public fun continuousHyperParameterRanges(vararg continuousHyperParameterRanges: Any)

      public fun integerHyperParameterRanges(integerHyperParameterRanges: IResolvable)

      public fun integerHyperParameterRanges(integerHyperParameterRanges: List<Any>)

      public fun integerHyperParameterRanges(vararg integerHyperParameterRanges: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty.builder()

      override fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: IResolvable) {
        cdkBuilder.categoricalHyperParameterRanges(categoricalHyperParameterRanges.let(IResolvable::unwrap))
      }

      override fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: List<Any>) {
        cdkBuilder.categoricalHyperParameterRanges(categoricalHyperParameterRanges)
      }

      override fun categoricalHyperParameterRanges(vararg categoricalHyperParameterRanges: Any):
          Unit = categoricalHyperParameterRanges(categoricalHyperParameterRanges.toList())

      override fun continuousHyperParameterRanges(continuousHyperParameterRanges: IResolvable) {
        cdkBuilder.continuousHyperParameterRanges(continuousHyperParameterRanges.let(IResolvable::unwrap))
      }

      override fun continuousHyperParameterRanges(continuousHyperParameterRanges: List<Any>) {
        cdkBuilder.continuousHyperParameterRanges(continuousHyperParameterRanges)
      }

      override fun continuousHyperParameterRanges(vararg continuousHyperParameterRanges: Any): Unit
          = continuousHyperParameterRanges(continuousHyperParameterRanges.toList())

      override fun integerHyperParameterRanges(integerHyperParameterRanges: IResolvable) {
        cdkBuilder.integerHyperParameterRanges(integerHyperParameterRanges.let(IResolvable::unwrap))
      }

      override fun integerHyperParameterRanges(integerHyperParameterRanges: List<Any>) {
        cdkBuilder.integerHyperParameterRanges(integerHyperParameterRanges)
      }

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
      override fun categoricalHyperParameterRanges(): Any? =
          unwrap(this).getCategoricalHyperParameterRanges()

      override fun continuousHyperParameterRanges(): Any? =
          unwrap(this).getContinuousHyperParameterRanges()

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
          AlgorithmHyperParameterRangesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlgorithmHyperParameterRangesProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty
    }
  }

  public interface IntegerHyperParameterRangeProperty {
    public fun maxValue(): Number? = unwrap(this).getMaxValue()

    public fun minValue(): Number? = unwrap(this).getMinValue()

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun maxValue(maxValue: Number)

      public fun minValue(minValue: Number)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty.builder()

      override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

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
      override fun maxValue(): Number? = unwrap(this).getMaxValue()

      override fun minValue(): Number? = unwrap(this).getMinValue()

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
          IntegerHyperParameterRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegerHyperParameterRangeProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty
    }
  }

  public interface CategoricalHyperParameterRangeProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty,
    ) : CdkObject(cdkObject), CategoricalHyperParameterRangeProperty {
      override fun name(): String? = unwrap(this).getName()

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
          CategoricalHyperParameterRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CategoricalHyperParameterRangeProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty
    }
  }

  public interface SolutionConfigProperty {
    public fun algorithmHyperParameters(): Any? = unwrap(this).getAlgorithmHyperParameters()

    public fun autoMlConfig(): Any? = unwrap(this).getAutoMlConfig()

    public fun eventValueThreshold(): String? = unwrap(this).getEventValueThreshold()

    public fun featureTransformationParameters(): Any? =
        unwrap(this).getFeatureTransformationParameters()

    public fun hpoConfig(): Any? = unwrap(this).getHpoConfig()

    @CdkDslMarker
    public interface Builder {
      public fun algorithmHyperParameters(algorithmHyperParameters: IResolvable)

      public fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>)

      public fun autoMlConfig(autoMlConfig: Any)

      public fun eventValueThreshold(eventValueThreshold: String)

      public fun featureTransformationParameters(featureTransformationParameters: IResolvable)

      public
          fun featureTransformationParameters(featureTransformationParameters: Map<String, String>)

      public fun hpoConfig(hpoConfig: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty.builder()

      override fun algorithmHyperParameters(algorithmHyperParameters: IResolvable) {
        cdkBuilder.algorithmHyperParameters(algorithmHyperParameters.let(IResolvable::unwrap))
      }

      override fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>) {
        cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
      }

      override fun autoMlConfig(autoMlConfig: Any) {
        cdkBuilder.autoMlConfig(autoMlConfig)
      }

      override fun eventValueThreshold(eventValueThreshold: String) {
        cdkBuilder.eventValueThreshold(eventValueThreshold)
      }

      override fun featureTransformationParameters(featureTransformationParameters: IResolvable) {
        cdkBuilder.featureTransformationParameters(featureTransformationParameters.let(IResolvable::unwrap))
      }

      override
          fun featureTransformationParameters(featureTransformationParameters: Map<String, String>) {
        cdkBuilder.featureTransformationParameters(featureTransformationParameters)
      }

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
      override fun algorithmHyperParameters(): Any? = unwrap(this).getAlgorithmHyperParameters()

      override fun autoMlConfig(): Any? = unwrap(this).getAutoMlConfig()

      override fun eventValueThreshold(): String? = unwrap(this).getEventValueThreshold()

      override fun featureTransformationParameters(): Any? =
          unwrap(this).getFeatureTransformationParameters()

      override fun hpoConfig(): Any? = unwrap(this).getHpoConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SolutionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty):
          SolutionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SolutionConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty
    }
  }

  public interface ContinuousHyperParameterRangeProperty {
    public fun maxValue(): Number? = unwrap(this).getMaxValue()

    public fun minValue(): Number? = unwrap(this).getMinValue()

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun maxValue(maxValue: Number)

      public fun minValue(minValue: Number)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty.builder()

      override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

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
      override fun maxValue(): Number? = unwrap(this).getMaxValue()

      override fun minValue(): Number? = unwrap(this).getMinValue()

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
          ContinuousHyperParameterRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContinuousHyperParameterRangeProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty
    }
  }

  public interface HpoConfigProperty {
    public fun algorithmHyperParameterRanges(): Any? =
        unwrap(this).getAlgorithmHyperParameterRanges()

    public fun hpoObjective(): Any? = unwrap(this).getHpoObjective()

    public fun hpoResourceConfig(): Any? = unwrap(this).getHpoResourceConfig()

    @CdkDslMarker
    public interface Builder {
      public fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable)

      public
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba6b39ce5c6428a45fc0e7768be6e15f3f66a07c3edd48e52536e09dfb134cd")
      public
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty.Builder.() -> Unit)

      public fun hpoObjective(hpoObjective: IResolvable)

      public fun hpoObjective(hpoObjective: HpoObjectiveProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("787141eee34b1e07a990b8a6af4e0438f787e3e9e9a2a9a9963431be4271a304")
      public fun hpoObjective(hpoObjective: HpoObjectiveProperty.Builder.() -> Unit)

      public fun hpoResourceConfig(hpoResourceConfig: IResolvable)

      public fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("719d572433c4acc643332477ff4311f9eb9f3f786f82f062b12674995d257593")
      public fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty.builder()

      override fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable) {
        cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges.let(IResolvable::unwrap))
      }

      override
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty) {
        cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges.let(AlgorithmHyperParameterRangesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba6b39ce5c6428a45fc0e7768be6e15f3f66a07c3edd48e52536e09dfb134cd")
      override
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty.Builder.() -> Unit):
          Unit =
          algorithmHyperParameterRanges(AlgorithmHyperParameterRangesProperty(algorithmHyperParameterRanges))

      override fun hpoObjective(hpoObjective: IResolvable) {
        cdkBuilder.hpoObjective(hpoObjective.let(IResolvable::unwrap))
      }

      override fun hpoObjective(hpoObjective: HpoObjectiveProperty) {
        cdkBuilder.hpoObjective(hpoObjective.let(HpoObjectiveProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("787141eee34b1e07a990b8a6af4e0438f787e3e9e9a2a9a9963431be4271a304")
      override fun hpoObjective(hpoObjective: HpoObjectiveProperty.Builder.() -> Unit): Unit =
          hpoObjective(HpoObjectiveProperty(hpoObjective))

      override fun hpoResourceConfig(hpoResourceConfig: IResolvable) {
        cdkBuilder.hpoResourceConfig(hpoResourceConfig.let(IResolvable::unwrap))
      }

      override fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty) {
        cdkBuilder.hpoResourceConfig(hpoResourceConfig.let(HpoResourceConfigProperty::unwrap))
      }

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
      override fun algorithmHyperParameterRanges(): Any? =
          unwrap(this).getAlgorithmHyperParameterRanges()

      override fun hpoObjective(): Any? = unwrap(this).getHpoObjective()

      override fun hpoResourceConfig(): Any? = unwrap(this).getHpoResourceConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HpoConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty):
          HpoConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty
    }
  }

  public interface HpoResourceConfigProperty {
    public fun maxNumberOfTrainingJobs(): String? = unwrap(this).getMaxNumberOfTrainingJobs()

    public fun maxParallelTrainingJobs(): String? = unwrap(this).getMaxParallelTrainingJobs()

    @CdkDslMarker
    public interface Builder {
      public fun maxNumberOfTrainingJobs(maxNumberOfTrainingJobs: String)

      public fun maxParallelTrainingJobs(maxParallelTrainingJobs: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty.builder()

      override fun maxNumberOfTrainingJobs(maxNumberOfTrainingJobs: String) {
        cdkBuilder.maxNumberOfTrainingJobs(maxNumberOfTrainingJobs)
      }

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
      override fun maxNumberOfTrainingJobs(): String? = unwrap(this).getMaxNumberOfTrainingJobs()

      override fun maxParallelTrainingJobs(): String? = unwrap(this).getMaxParallelTrainingJobs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HpoResourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty):
          HpoResourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoResourceConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty
    }
  }

  public interface HpoObjectiveProperty {
    public fun metricName(): String? = unwrap(this).getMetricName()

    public fun metricRegex(): String? = unwrap(this).getMetricRegex()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun metricName(metricName: String)

      public fun metricRegex(metricRegex: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty.builder()

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun metricRegex(metricRegex: String) {
        cdkBuilder.metricRegex(metricRegex)
      }

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
      override fun metricName(): String? = unwrap(this).getMetricName()

      override fun metricRegex(): String? = unwrap(this).getMetricRegex()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HpoObjectiveProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty):
          HpoObjectiveProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoObjectiveProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty
    }
  }
}
