package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSolution internal constructor(
  private val cdkObject: software.amazon.awscdk.services.personalize.CfnSolution,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d57c7658805e0f58c1f59cf48d9eb7c264e42ef36b247d0d380c77fd6b9c0d9c")
  public open fun solutionConfig(`value`: SolutionConfigProperty.Builder.() -> Unit): Unit =
      solutionConfig(SolutionConfigProperty(`value`))

  public interface Builder {
    public fun datasetGroupArn(datasetGroupArn: String) {
    }

    public fun eventType(eventType: String) {
    }

    public fun name(name: String) {
    }

    public fun performAutoMl(performAutoMl: Boolean) {
    }

    public fun performAutoMl(performAutoMl: IResolvable) {
    }

    public fun performHpo(performHpo: Boolean) {
    }

    public fun performHpo(performHpo: IResolvable) {
    }

    public fun recipeArn(recipeArn: String) {
    }

    public fun solutionConfig(solutionConfig: IResolvable) {
    }

    public fun solutionConfig(solutionConfig: SolutionConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04e716762c5f1499d722aa4737ff3e3ffbe364313b06bf22cd934b0194d6cfd5")
    public fun solutionConfig(solutionConfig: SolutionConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnSolution.Builder =
        software.amazon.awscdk.services.personalize.CfnSolution.Builder.create(scope, id)

    public override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    public override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun performAutoMl(performAutoMl: Boolean) {
      cdkBuilder.performAutoMl(performAutoMl)
    }

    public override fun performAutoMl(performAutoMl: IResolvable) {
      cdkBuilder.performAutoMl(performAutoMl.let(IResolvable::unwrap))
    }

    public override fun performHpo(performHpo: Boolean) {
      cdkBuilder.performHpo(performHpo)
    }

    public override fun performHpo(performHpo: IResolvable) {
      cdkBuilder.performHpo(performHpo.let(IResolvable::unwrap))
    }

    public override fun recipeArn(recipeArn: String) {
      cdkBuilder.recipeArn(recipeArn)
    }

    public override fun solutionConfig(solutionConfig: IResolvable) {
      cdkBuilder.solutionConfig(solutionConfig.let(IResolvable::unwrap))
    }

    public override fun solutionConfig(solutionConfig: SolutionConfigProperty) {
      cdkBuilder.solutionConfig(solutionConfig.let(SolutionConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04e716762c5f1499d722aa4737ff3e3ffbe364313b06bf22cd934b0194d6cfd5")
    public override fun solutionConfig(solutionConfig: SolutionConfigProperty.Builder.() -> Unit):
        Unit = solutionConfig(SolutionConfigProperty(solutionConfig))

    public fun build(): software.amazon.awscdk.services.personalize.CfnSolution = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun metricName(metricName: String) {
      }

      public fun recipeList(recipeList: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty.builder()

      public override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      public override fun recipeList(recipeList: List<String>) {
        cdkBuilder.recipeList(recipeList)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty,
    ) : AutoMLConfigProperty {
      public override fun metricName(): String? = unwrap(this).getMetricName()

      public override fun recipeList(): List<String> = unwrap(this).getRecipeList() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoMLConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty):
          AutoMLConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoMLConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.AutoMLConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AlgorithmHyperParameterRangesProperty {
    public fun categoricalHyperParameterRanges(): Any? =
        unwrap(this).getCategoricalHyperParameterRanges()

    public fun continuousHyperParameterRanges(): Any? =
        unwrap(this).getContinuousHyperParameterRanges()

    public fun integerHyperParameterRanges(): Any? = unwrap(this).getIntegerHyperParameterRanges()

    public interface Builder {
      public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: IResolvable) {
      }

      public fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: List<Any>) {
      }

      public fun continuousHyperParameterRanges(continuousHyperParameterRanges: IResolvable) {
      }

      public fun continuousHyperParameterRanges(continuousHyperParameterRanges: List<Any>) {
      }

      public fun integerHyperParameterRanges(integerHyperParameterRanges: IResolvable) {
      }

      public fun integerHyperParameterRanges(integerHyperParameterRanges: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty.builder()

      public override
          fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: IResolvable) {
        cdkBuilder.categoricalHyperParameterRanges(categoricalHyperParameterRanges.let(IResolvable::unwrap))
      }

      public override
          fun categoricalHyperParameterRanges(categoricalHyperParameterRanges: List<Any>) {
        cdkBuilder.categoricalHyperParameterRanges(categoricalHyperParameterRanges)
      }

      public override
          fun continuousHyperParameterRanges(continuousHyperParameterRanges: IResolvable) {
        cdkBuilder.continuousHyperParameterRanges(continuousHyperParameterRanges.let(IResolvable::unwrap))
      }

      public override
          fun continuousHyperParameterRanges(continuousHyperParameterRanges: List<Any>) {
        cdkBuilder.continuousHyperParameterRanges(continuousHyperParameterRanges)
      }

      public override fun integerHyperParameterRanges(integerHyperParameterRanges: IResolvable) {
        cdkBuilder.integerHyperParameterRanges(integerHyperParameterRanges.let(IResolvable::unwrap))
      }

      public override fun integerHyperParameterRanges(integerHyperParameterRanges: List<Any>) {
        cdkBuilder.integerHyperParameterRanges(integerHyperParameterRanges)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.AlgorithmHyperParameterRangesProperty,
    ) : AlgorithmHyperParameterRangesProperty {
      public override fun categoricalHyperParameterRanges(): Any? =
          unwrap(this).getCategoricalHyperParameterRanges()

      public override fun continuousHyperParameterRanges(): Any? =
          unwrap(this).getContinuousHyperParameterRanges()

      public override fun integerHyperParameterRanges(): Any? =
          unwrap(this).getIntegerHyperParameterRanges()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IntegerHyperParameterRangeProperty {
    public fun maxValue(): Number? = unwrap(this).getMaxValue()

    public fun minValue(): Number? = unwrap(this).getMinValue()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun maxValue(maxValue: Number) {
      }

      public fun minValue(minValue: Number) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty.builder()

      public override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      public override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.IntegerHyperParameterRangeProperty,
    ) : IntegerHyperParameterRangeProperty {
      public override fun maxValue(): Number? = unwrap(this).getMaxValue()

      public override fun minValue(): Number? = unwrap(this).getMinValue()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CategoricalHyperParameterRangeProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun values(values: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.CategoricalHyperParameterRangeProperty,
    ) : CategoricalHyperParameterRangeProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SolutionConfigProperty {
    public fun algorithmHyperParameters(): Any? = unwrap(this).getAlgorithmHyperParameters()

    public fun autoMlConfig(): Any? = unwrap(this).getAutoMlConfig()

    public fun eventValueThreshold(): String? = unwrap(this).getEventValueThreshold()

    public fun featureTransformationParameters(): Any? =
        unwrap(this).getFeatureTransformationParameters()

    public fun hpoConfig(): Any? = unwrap(this).getHpoConfig()

    public interface Builder {
      public fun algorithmHyperParameters(algorithmHyperParameters: IResolvable) {
      }

      public fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>) {
      }

      public fun autoMlConfig(autoMlConfig: Any) {
      }

      public fun eventValueThreshold(eventValueThreshold: String) {
      }

      public fun featureTransformationParameters(featureTransformationParameters: IResolvable) {
      }

      public
          fun featureTransformationParameters(featureTransformationParameters: Map<String, String>) {
      }

      public fun hpoConfig(hpoConfig: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty.builder()

      public override fun algorithmHyperParameters(algorithmHyperParameters: IResolvable) {
        cdkBuilder.algorithmHyperParameters(algorithmHyperParameters.let(IResolvable::unwrap))
      }

      public override fun algorithmHyperParameters(algorithmHyperParameters: Map<String, String>) {
        cdkBuilder.algorithmHyperParameters(algorithmHyperParameters)
      }

      public override fun autoMlConfig(autoMlConfig: Any) {
        cdkBuilder.autoMlConfig(autoMlConfig)
      }

      public override fun eventValueThreshold(eventValueThreshold: String) {
        cdkBuilder.eventValueThreshold(eventValueThreshold)
      }

      public override
          fun featureTransformationParameters(featureTransformationParameters: IResolvable) {
        cdkBuilder.featureTransformationParameters(featureTransformationParameters.let(IResolvable::unwrap))
      }

      public override
          fun featureTransformationParameters(featureTransformationParameters: Map<String, String>) {
        cdkBuilder.featureTransformationParameters(featureTransformationParameters)
      }

      public override fun hpoConfig(hpoConfig: Any) {
        cdkBuilder.hpoConfig(hpoConfig)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty,
    ) : SolutionConfigProperty {
      public override fun algorithmHyperParameters(): Any? =
          unwrap(this).getAlgorithmHyperParameters()

      public override fun autoMlConfig(): Any? = unwrap(this).getAutoMlConfig()

      public override fun eventValueThreshold(): String? = unwrap(this).getEventValueThreshold()

      public override fun featureTransformationParameters(): Any? =
          unwrap(this).getFeatureTransformationParameters()

      public override fun hpoConfig(): Any? = unwrap(this).getHpoConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SolutionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty):
          SolutionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SolutionConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.SolutionConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ContinuousHyperParameterRangeProperty {
    public fun maxValue(): Number? = unwrap(this).getMaxValue()

    public fun minValue(): Number? = unwrap(this).getMinValue()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun maxValue(maxValue: Number) {
      }

      public fun minValue(minValue: Number) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty.builder()

      public override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      public override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.ContinuousHyperParameterRangeProperty,
    ) : ContinuousHyperParameterRangeProperty {
      public override fun maxValue(): Number? = unwrap(this).getMaxValue()

      public override fun minValue(): Number? = unwrap(this).getMinValue()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HpoConfigProperty {
    public fun algorithmHyperParameterRanges(): Any? =
        unwrap(this).getAlgorithmHyperParameterRanges()

    public fun hpoObjective(): Any? = unwrap(this).getHpoObjective()

    public fun hpoResourceConfig(): Any? = unwrap(this).getHpoResourceConfig()

    public interface Builder {
      public fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable) {
      }

      public
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba6b39ce5c6428a45fc0e7768be6e15f3f66a07c3edd48e52536e09dfb134cd")
      public
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty.Builder.() -> Unit) {
      }

      public fun hpoObjective(hpoObjective: IResolvable) {
      }

      public fun hpoObjective(hpoObjective: HpoObjectiveProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("787141eee34b1e07a990b8a6af4e0438f787e3e9e9a2a9a9963431be4271a304")
      public fun hpoObjective(hpoObjective: HpoObjectiveProperty.Builder.() -> Unit) {
      }

      public fun hpoResourceConfig(hpoResourceConfig: IResolvable) {
      }

      public fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("719d572433c4acc643332477ff4311f9eb9f3f786f82f062b12674995d257593")
      public
          fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty.builder()

      public override
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: IResolvable) {
        cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges.let(IResolvable::unwrap))
      }

      public override
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty) {
        cdkBuilder.algorithmHyperParameterRanges(algorithmHyperParameterRanges.let(AlgorithmHyperParameterRangesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba6b39ce5c6428a45fc0e7768be6e15f3f66a07c3edd48e52536e09dfb134cd")
      public override
          fun algorithmHyperParameterRanges(algorithmHyperParameterRanges: AlgorithmHyperParameterRangesProperty.Builder.() -> Unit):
          Unit =
          algorithmHyperParameterRanges(AlgorithmHyperParameterRangesProperty(algorithmHyperParameterRanges))

      public override fun hpoObjective(hpoObjective: IResolvable) {
        cdkBuilder.hpoObjective(hpoObjective.let(IResolvable::unwrap))
      }

      public override fun hpoObjective(hpoObjective: HpoObjectiveProperty) {
        cdkBuilder.hpoObjective(hpoObjective.let(HpoObjectiveProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("787141eee34b1e07a990b8a6af4e0438f787e3e9e9a2a9a9963431be4271a304")
      public override fun hpoObjective(hpoObjective: HpoObjectiveProperty.Builder.() -> Unit): Unit
          = hpoObjective(HpoObjectiveProperty(hpoObjective))

      public override fun hpoResourceConfig(hpoResourceConfig: IResolvable) {
        cdkBuilder.hpoResourceConfig(hpoResourceConfig.let(IResolvable::unwrap))
      }

      public override fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty) {
        cdkBuilder.hpoResourceConfig(hpoResourceConfig.let(HpoResourceConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("719d572433c4acc643332477ff4311f9eb9f3f786f82f062b12674995d257593")
      public override
          fun hpoResourceConfig(hpoResourceConfig: HpoResourceConfigProperty.Builder.() -> Unit):
          Unit = hpoResourceConfig(HpoResourceConfigProperty(hpoResourceConfig))

      public fun build(): software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty,
    ) : HpoConfigProperty {
      public override fun algorithmHyperParameterRanges(): Any? =
          unwrap(this).getAlgorithmHyperParameterRanges()

      public override fun hpoObjective(): Any? = unwrap(this).getHpoObjective()

      public override fun hpoResourceConfig(): Any? = unwrap(this).getHpoResourceConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HpoConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty):
          HpoConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HpoResourceConfigProperty {
    public fun maxNumberOfTrainingJobs(): String? = unwrap(this).getMaxNumberOfTrainingJobs()

    public fun maxParallelTrainingJobs(): String? = unwrap(this).getMaxParallelTrainingJobs()

    public interface Builder {
      public fun maxNumberOfTrainingJobs(maxNumberOfTrainingJobs: String) {
      }

      public fun maxParallelTrainingJobs(maxParallelTrainingJobs: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty.builder()

      public override fun maxNumberOfTrainingJobs(maxNumberOfTrainingJobs: String) {
        cdkBuilder.maxNumberOfTrainingJobs(maxNumberOfTrainingJobs)
      }

      public override fun maxParallelTrainingJobs(maxParallelTrainingJobs: String) {
        cdkBuilder.maxParallelTrainingJobs(maxParallelTrainingJobs)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty,
    ) : HpoResourceConfigProperty {
      public override fun maxNumberOfTrainingJobs(): String? =
          unwrap(this).getMaxNumberOfTrainingJobs()

      public override fun maxParallelTrainingJobs(): String? =
          unwrap(this).getMaxParallelTrainingJobs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HpoResourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty):
          HpoResourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoResourceConfigProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoResourceConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HpoObjectiveProperty {
    public fun metricName(): String? = unwrap(this).getMetricName()

    public fun metricRegex(): String? = unwrap(this).getMetricRegex()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun metricName(metricName: String) {
      }

      public fun metricRegex(metricRegex: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty.builder()

      public override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      public override fun metricRegex(metricRegex: String) {
        cdkBuilder.metricRegex(metricRegex)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty,
    ) : HpoObjectiveProperty {
      public override fun metricName(): String? = unwrap(this).getMetricName()

      public override fun metricRegex(): String? = unwrap(this).getMetricRegex()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HpoObjectiveProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty):
          HpoObjectiveProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HpoObjectiveProperty):
          software.amazon.awscdk.services.personalize.CfnSolution.HpoObjectiveProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
