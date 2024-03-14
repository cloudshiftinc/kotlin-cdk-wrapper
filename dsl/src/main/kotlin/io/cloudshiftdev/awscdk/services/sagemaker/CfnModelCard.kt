package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModelCard internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedByDomainId(): String = unwrap(this).getAttrCreatedByDomainId()

  public open fun attrCreatedByUserProfileArn(): String =
      unwrap(this).getAttrCreatedByUserProfileArn()

  public open fun attrCreatedByUserProfileName(): String =
      unwrap(this).getAttrCreatedByUserProfileName()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastModifiedByDomainId(): String =
      unwrap(this).getAttrLastModifiedByDomainId()

  public open fun attrLastModifiedByUserProfileArn(): String =
      unwrap(this).getAttrLastModifiedByUserProfileArn()

  public open fun attrLastModifiedByUserProfileName(): String =
      unwrap(this).getAttrLastModifiedByUserProfileName()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun attrModelCardArn(): String = unwrap(this).getAttrModelCardArn()

  public open fun attrModelCardProcessingStatus(): String =
      unwrap(this).getAttrModelCardProcessingStatus()

  public open fun attrModelCardVersion(): Number = unwrap(this).getAttrModelCardVersion()

  public open fun content(): Any = unwrap(this).getContent()

  public open fun content(`value`: IResolvable) {
    unwrap(this).setContent(`value`.let(IResolvable::unwrap))
  }

  public open fun content(`value`: ContentProperty) {
    unwrap(this).setContent(`value`.let(ContentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b7cfe80db0c7e7a04efe91161af81b85231ebf0bbfb3e6155cf2b2d2e008685e")
  public open fun content(`value`: ContentProperty.Builder.() -> Unit): Unit =
      content(ContentProperty(`value`))

  public open fun createdBy(): Any? = unwrap(this).getCreatedBy()

  public open fun createdBy(`value`: IResolvable) {
    unwrap(this).setCreatedBy(`value`.let(IResolvable::unwrap))
  }

  public open fun createdBy(`value`: UserContextProperty) {
    unwrap(this).setCreatedBy(`value`.let(UserContextProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c1aa41d66d613c16fec5b38a433337bf1cb248c012803dbebc20d7c427d81dc")
  public open fun createdBy(`value`: UserContextProperty.Builder.() -> Unit): Unit =
      createdBy(UserContextProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lastModifiedBy(): Any? = unwrap(this).getLastModifiedBy()

  public open fun lastModifiedBy(`value`: IResolvable) {
    unwrap(this).setLastModifiedBy(`value`.let(IResolvable::unwrap))
  }

  public open fun lastModifiedBy(`value`: UserContextProperty) {
    unwrap(this).setLastModifiedBy(`value`.let(UserContextProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6d0ffc1dfae359feb43bd4c2c2c42f74e20beb0769803fe68f5a40ffd55b1e6")
  public open fun lastModifiedBy(`value`: UserContextProperty.Builder.() -> Unit): Unit =
      lastModifiedBy(UserContextProperty(`value`))

  public open fun modelCardName(): String = unwrap(this).getModelCardName()

  public open fun modelCardName(`value`: String) {
    unwrap(this).setModelCardName(`value`)
  }

  public open fun modelCardStatus(): String = unwrap(this).getModelCardStatus()

  public open fun modelCardStatus(`value`: String) {
    unwrap(this).setModelCardStatus(`value`)
  }

  public open fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

  public open fun securityConfig(`value`: IResolvable) {
    unwrap(this).setSecurityConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun securityConfig(`value`: SecurityConfigProperty) {
    unwrap(this).setSecurityConfig(`value`.let(SecurityConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d29255f48c0c5fb005232e5da8985feb5de9ff1b655b0b84daa5d9204a969c8f")
  public open fun securityConfig(`value`: SecurityConfigProperty.Builder.() -> Unit): Unit =
      securityConfig(SecurityConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun content(content: IResolvable) {
    }

    public fun content(content: ContentProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f28d93af6185b70189cc5f6c1c1b17d4b562031e807aa8e9296643238552ac3")
    public fun content(content: ContentProperty.Builder.() -> Unit) {
    }

    public fun createdBy(createdBy: IResolvable) {
    }

    public fun createdBy(createdBy: UserContextProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05f2ba948b7e805200d1f67f9086b3d86f4d21e361529b0483a2db9512d5a416")
    public fun createdBy(createdBy: UserContextProperty.Builder.() -> Unit) {
    }

    public fun lastModifiedBy(lastModifiedBy: IResolvable) {
    }

    public fun lastModifiedBy(lastModifiedBy: UserContextProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a415fc6cc2f2fda5a7793f0717507f1ae990f7d0fc3b6f3590382378821106")
    public fun lastModifiedBy(lastModifiedBy: UserContextProperty.Builder.() -> Unit) {
    }

    public fun modelCardName(modelCardName: String) {
    }

    public fun modelCardStatus(modelCardStatus: String) {
    }

    public fun securityConfig(securityConfig: IResolvable) {
    }

    public fun securityConfig(securityConfig: SecurityConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c274ebaa095a50a6c8fccf28d41c264635f6df0b7672cf1ef6dd218461c746d1")
    public fun securityConfig(securityConfig: SecurityConfigProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelCard.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelCard.Builder.create(scope, id)

    public override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    public override fun content(content: ContentProperty) {
      cdkBuilder.content(content.let(ContentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f28d93af6185b70189cc5f6c1c1b17d4b562031e807aa8e9296643238552ac3")
    public override fun content(content: ContentProperty.Builder.() -> Unit): Unit =
        content(ContentProperty(content))

    public override fun createdBy(createdBy: IResolvable) {
      cdkBuilder.createdBy(createdBy.let(IResolvable::unwrap))
    }

    public override fun createdBy(createdBy: UserContextProperty) {
      cdkBuilder.createdBy(createdBy.let(UserContextProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05f2ba948b7e805200d1f67f9086b3d86f4d21e361529b0483a2db9512d5a416")
    public override fun createdBy(createdBy: UserContextProperty.Builder.() -> Unit): Unit =
        createdBy(UserContextProperty(createdBy))

    public override fun lastModifiedBy(lastModifiedBy: IResolvable) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(IResolvable::unwrap))
    }

    public override fun lastModifiedBy(lastModifiedBy: UserContextProperty) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(UserContextProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a415fc6cc2f2fda5a7793f0717507f1ae990f7d0fc3b6f3590382378821106")
    public override fun lastModifiedBy(lastModifiedBy: UserContextProperty.Builder.() -> Unit): Unit
        = lastModifiedBy(UserContextProperty(lastModifiedBy))

    public override fun modelCardName(modelCardName: String) {
      cdkBuilder.modelCardName(modelCardName)
    }

    public override fun modelCardStatus(modelCardStatus: String) {
      cdkBuilder.modelCardStatus(modelCardStatus)
    }

    public override fun securityConfig(securityConfig: IResolvable) {
      cdkBuilder.securityConfig(securityConfig.let(IResolvable::unwrap))
    }

    public override fun securityConfig(securityConfig: SecurityConfigProperty) {
      cdkBuilder.securityConfig(securityConfig.let(SecurityConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c274ebaa095a50a6c8fccf28d41c264635f6df0b7672cf1ef6dd218461c746d1")
    public override fun securityConfig(securityConfig: SecurityConfigProperty.Builder.() -> Unit):
        Unit = securityConfig(SecurityConfigProperty(securityConfig))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelCard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelCard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard):
        CfnModelCard = CfnModelCard(cdkObject)

    internal fun unwrap(wrapped: CfnModelCard):
        software.amazon.awscdk.services.sagemaker.CfnModelCard = wrapped.cdkObject
  }

  public interface MetricGroupProperty {
    public fun metricData(): Any

    public fun name(): String

    public interface Builder {
      public fun metricData(metricData: IResolvable) {
      }

      public fun metricData(metricData: List<Any>) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty.builder()

      public override fun metricData(metricData: IResolvable) {
        cdkBuilder.metricData(metricData.let(IResolvable::unwrap))
      }

      public override fun metricData(metricData: List<Any>) {
        cdkBuilder.metricData(metricData)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty,
    ) : MetricGroupProperty {
      public override fun metricData(): Any = unwrap(this).getMetricData()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty):
          MetricGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricGroupProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TrainingMetricProperty {
    public fun name(): String

    public fun notes(): String? = unwrap(this).getNotes()

    public fun `value`(): Number

    public interface Builder {
      public fun name(name: String) {
      }

      public fun notes(notes: String) {
      }

      public fun `value`(`value`: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      public override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty,
    ) : TrainingMetricProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun notes(): String? = unwrap(this).getNotes()

      public override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty):
          TrainingMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingMetricProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MetricDataItemsProperty {
    public fun name(): String

    public fun notes(): String? = unwrap(this).getNotes()

    public fun type(): String

    public fun `value`(): Any

    public fun xAxisName(): List<String> = unwrap(this).getXAxisName() ?: emptyList()

    public fun yAxisName(): List<String> = unwrap(this).getYAxisName() ?: emptyList()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun notes(notes: String) {
      }

      public fun type(type: String) {
      }

      public fun `value`(`value`: Any) {
      }

      public fun xAxisName(xAxisName: List<String>) {
      }

      public fun yAxisName(yAxisName: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
      }

      public override fun xAxisName(xAxisName: List<String>) {
        cdkBuilder.xAxisName(xAxisName)
      }

      public override fun yAxisName(yAxisName: List<String>) {
        cdkBuilder.yAxisName(yAxisName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty,
    ) : MetricDataItemsProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun notes(): String? = unwrap(this).getNotes()

      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): Any = unwrap(this).getValue()

      public override fun xAxisName(): List<String> = unwrap(this).getXAxisName() ?: emptyList()

      public override fun yAxisName(): List<String> = unwrap(this).getYAxisName() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty):
          MetricDataItemsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataItemsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ObjectiveFunctionProperty {
    public fun function(): Any? = unwrap(this).getFunction()

    public fun notes(): String? = unwrap(this).getNotes()

    public interface Builder {
      public fun function(function: IResolvable) {
      }

      public fun function(function: FunctionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ce5a3ec45d5e266f660bce55fe5e43488c3862ffcdc53937a48a8a3e4e4e58d")
      public fun function(function: FunctionProperty.Builder.() -> Unit) {
      }

      public fun notes(notes: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty.builder()

      public override fun function(function: IResolvable) {
        cdkBuilder.function(function.let(IResolvable::unwrap))
      }

      public override fun function(function: FunctionProperty) {
        cdkBuilder.function(function.let(FunctionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ce5a3ec45d5e266f660bce55fe5e43488c3862ffcdc53937a48a8a3e4e4e58d")
      public override fun function(function: FunctionProperty.Builder.() -> Unit): Unit =
          function(FunctionProperty(function))

      public override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty,
    ) : ObjectiveFunctionProperty {
      public override fun function(): Any? = unwrap(this).getFunction()

      public override fun notes(): String? = unwrap(this).getNotes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectiveFunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty):
          ObjectiveFunctionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectiveFunctionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EvaluationDetailProperty {
    public fun datasets(): List<String> = unwrap(this).getDatasets() ?: emptyList()

    public fun evaluationJobArn(): String? = unwrap(this).getEvaluationJobArn()

    public fun evaluationObservation(): String? = unwrap(this).getEvaluationObservation()

    public fun metadata(): Any? = unwrap(this).getMetadata()

    public fun metricGroups(): Any? = unwrap(this).getMetricGroups()

    public fun name(): String

    public interface Builder {
      public fun datasets(datasets: List<String>) {
      }

      public fun evaluationJobArn(evaluationJobArn: String) {
      }

      public fun evaluationObservation(evaluationObservation: String) {
      }

      public fun metadata(metadata: IResolvable) {
      }

      public fun metadata(metadata: Map<String, String>) {
      }

      public fun metricGroups(metricGroups: IResolvable) {
      }

      public fun metricGroups(metricGroups: List<Any>) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty.builder()

      public override fun datasets(datasets: List<String>) {
        cdkBuilder.datasets(datasets)
      }

      public override fun evaluationJobArn(evaluationJobArn: String) {
        cdkBuilder.evaluationJobArn(evaluationJobArn)
      }

      public override fun evaluationObservation(evaluationObservation: String) {
        cdkBuilder.evaluationObservation(evaluationObservation)
      }

      public override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      public override fun metadata(metadata: Map<String, String>) {
        cdkBuilder.metadata(metadata)
      }

      public override fun metricGroups(metricGroups: IResolvable) {
        cdkBuilder.metricGroups(metricGroups.let(IResolvable::unwrap))
      }

      public override fun metricGroups(metricGroups: List<Any>) {
        cdkBuilder.metricGroups(metricGroups)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty,
    ) : EvaluationDetailProperty {
      public override fun datasets(): List<String> = unwrap(this).getDatasets() ?: emptyList()

      public override fun evaluationJobArn(): String? = unwrap(this).getEvaluationJobArn()

      public override fun evaluationObservation(): String? = unwrap(this).getEvaluationObservation()

      public override fun metadata(): Any? = unwrap(this).getMetadata()

      public override fun metricGroups(): Any? = unwrap(this).getMetricGroups()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty):
          EvaluationDetailProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationDetailProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SourceAlgorithmProperty {
    public fun algorithmName(): String

    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    public interface Builder {
      public fun algorithmName(algorithmName: String) {
      }

      public fun modelDataUrl(modelDataUrl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty.builder()

      public override fun algorithmName(algorithmName: String) {
        cdkBuilder.algorithmName(algorithmName)
      }

      public override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty,
    ) : SourceAlgorithmProperty {
      public override fun algorithmName(): String = unwrap(this).getAlgorithmName()

      public override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceAlgorithmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty):
          SourceAlgorithmProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAlgorithmProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TrainingJobDetailsProperty {
    public fun hyperParameters(): Any? = unwrap(this).getHyperParameters()

    public fun trainingArn(): String? = unwrap(this).getTrainingArn()

    public fun trainingDatasets(): List<String> = unwrap(this).getTrainingDatasets() ?: emptyList()

    public fun trainingEnvironment(): Any? = unwrap(this).getTrainingEnvironment()

    public fun trainingMetrics(): Any? = unwrap(this).getTrainingMetrics()

    public fun userProvidedHyperParameters(): Any? = unwrap(this).getUserProvidedHyperParameters()

    public fun userProvidedTrainingMetrics(): Any? = unwrap(this).getUserProvidedTrainingMetrics()

    public interface Builder {
      public fun hyperParameters(hyperParameters: IResolvable) {
      }

      public fun hyperParameters(hyperParameters: List<Any>) {
      }

      public fun trainingArn(trainingArn: String) {
      }

      public fun trainingDatasets(trainingDatasets: List<String>) {
      }

      public fun trainingEnvironment(trainingEnvironment: IResolvable) {
      }

      public fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c17f90744d1767db88202028eb3e9048a087d33456aeee772f5cfbc1c25bc4eb")
      public
          fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty.Builder.() -> Unit) {
      }

      public fun trainingMetrics(trainingMetrics: IResolvable) {
      }

      public fun trainingMetrics(trainingMetrics: List<Any>) {
      }

      public fun userProvidedHyperParameters(userProvidedHyperParameters: IResolvable) {
      }

      public fun userProvidedHyperParameters(userProvidedHyperParameters: List<Any>) {
      }

      public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: IResolvable) {
      }

      public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty.builder()

      public override fun hyperParameters(hyperParameters: IResolvable) {
        cdkBuilder.hyperParameters(hyperParameters.let(IResolvable::unwrap))
      }

      public override fun hyperParameters(hyperParameters: List<Any>) {
        cdkBuilder.hyperParameters(hyperParameters)
      }

      public override fun trainingArn(trainingArn: String) {
        cdkBuilder.trainingArn(trainingArn)
      }

      public override fun trainingDatasets(trainingDatasets: List<String>) {
        cdkBuilder.trainingDatasets(trainingDatasets)
      }

      public override fun trainingEnvironment(trainingEnvironment: IResolvable) {
        cdkBuilder.trainingEnvironment(trainingEnvironment.let(IResolvable::unwrap))
      }

      public override fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty) {
        cdkBuilder.trainingEnvironment(trainingEnvironment.let(TrainingEnvironmentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c17f90744d1767db88202028eb3e9048a087d33456aeee772f5cfbc1c25bc4eb")
      public override
          fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty.Builder.() -> Unit):
          Unit = trainingEnvironment(TrainingEnvironmentProperty(trainingEnvironment))

      public override fun trainingMetrics(trainingMetrics: IResolvable) {
        cdkBuilder.trainingMetrics(trainingMetrics.let(IResolvable::unwrap))
      }

      public override fun trainingMetrics(trainingMetrics: List<Any>) {
        cdkBuilder.trainingMetrics(trainingMetrics)
      }

      public override fun userProvidedHyperParameters(userProvidedHyperParameters: IResolvable) {
        cdkBuilder.userProvidedHyperParameters(userProvidedHyperParameters.let(IResolvable::unwrap))
      }

      public override fun userProvidedHyperParameters(userProvidedHyperParameters: List<Any>) {
        cdkBuilder.userProvidedHyperParameters(userProvidedHyperParameters)
      }

      public override fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: IResolvable) {
        cdkBuilder.userProvidedTrainingMetrics(userProvidedTrainingMetrics.let(IResolvable::unwrap))
      }

      public override fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: List<Any>) {
        cdkBuilder.userProvidedTrainingMetrics(userProvidedTrainingMetrics)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty,
    ) : TrainingJobDetailsProperty {
      public override fun hyperParameters(): Any? = unwrap(this).getHyperParameters()

      public override fun trainingArn(): String? = unwrap(this).getTrainingArn()

      public override fun trainingDatasets(): List<String> = unwrap(this).getTrainingDatasets() ?:
          emptyList()

      public override fun trainingEnvironment(): Any? = unwrap(this).getTrainingEnvironment()

      public override fun trainingMetrics(): Any? = unwrap(this).getTrainingMetrics()

      public override fun userProvidedHyperParameters(): Any? =
          unwrap(this).getUserProvidedHyperParameters()

      public override fun userProvidedTrainingMetrics(): Any? =
          unwrap(this).getUserProvidedTrainingMetrics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingJobDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty):
          TrainingJobDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingJobDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BusinessDetailsProperty {
    public fun businessProblem(): String? = unwrap(this).getBusinessProblem()

    public fun businessStakeholders(): String? = unwrap(this).getBusinessStakeholders()

    public fun lineOfBusiness(): String? = unwrap(this).getLineOfBusiness()

    public interface Builder {
      public fun businessProblem(businessProblem: String) {
      }

      public fun businessStakeholders(businessStakeholders: String) {
      }

      public fun lineOfBusiness(lineOfBusiness: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty.builder()

      public override fun businessProblem(businessProblem: String) {
        cdkBuilder.businessProblem(businessProblem)
      }

      public override fun businessStakeholders(businessStakeholders: String) {
        cdkBuilder.businessStakeholders(businessStakeholders)
      }

      public override fun lineOfBusiness(lineOfBusiness: String) {
        cdkBuilder.lineOfBusiness(lineOfBusiness)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty,
    ) : BusinessDetailsProperty {
      public override fun businessProblem(): String? = unwrap(this).getBusinessProblem()

      public override fun businessStakeholders(): String? = unwrap(this).getBusinessStakeholders()

      public override fun lineOfBusiness(): String? = unwrap(this).getLineOfBusiness()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BusinessDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty):
          BusinessDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BusinessDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface IntendedUsesProperty {
    public fun explanationsForRiskRating(): String? = unwrap(this).getExplanationsForRiskRating()

    public fun factorsAffectingModelEfficiency(): String? =
        unwrap(this).getFactorsAffectingModelEfficiency()

    public fun intendedUses(): String? = unwrap(this).getIntendedUses()

    public fun purposeOfModel(): String? = unwrap(this).getPurposeOfModel()

    public fun riskRating(): String? = unwrap(this).getRiskRating()

    public interface Builder {
      public fun explanationsForRiskRating(explanationsForRiskRating: String) {
      }

      public fun factorsAffectingModelEfficiency(factorsAffectingModelEfficiency: String) {
      }

      public fun intendedUses(intendedUses: String) {
      }

      public fun purposeOfModel(purposeOfModel: String) {
      }

      public fun riskRating(riskRating: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty.builder()

      public override fun explanationsForRiskRating(explanationsForRiskRating: String) {
        cdkBuilder.explanationsForRiskRating(explanationsForRiskRating)
      }

      public override fun factorsAffectingModelEfficiency(factorsAffectingModelEfficiency: String) {
        cdkBuilder.factorsAffectingModelEfficiency(factorsAffectingModelEfficiency)
      }

      public override fun intendedUses(intendedUses: String) {
        cdkBuilder.intendedUses(intendedUses)
      }

      public override fun purposeOfModel(purposeOfModel: String) {
        cdkBuilder.purposeOfModel(purposeOfModel)
      }

      public override fun riskRating(riskRating: String) {
        cdkBuilder.riskRating(riskRating)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty,
    ) : IntendedUsesProperty {
      public override fun explanationsForRiskRating(): String? =
          unwrap(this).getExplanationsForRiskRating()

      public override fun factorsAffectingModelEfficiency(): String? =
          unwrap(this).getFactorsAffectingModelEfficiency()

      public override fun intendedUses(): String? = unwrap(this).getIntendedUses()

      public override fun purposeOfModel(): String? = unwrap(this).getPurposeOfModel()

      public override fun riskRating(): String? = unwrap(this).getRiskRating()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntendedUsesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty):
          IntendedUsesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntendedUsesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ModelOverviewProperty {
    public fun algorithmType(): String? = unwrap(this).getAlgorithmType()

    public fun inferenceEnvironment(): Any? = unwrap(this).getInferenceEnvironment()

    public fun modelArtifact(): List<String> = unwrap(this).getModelArtifact() ?: emptyList()

    public fun modelCreator(): String? = unwrap(this).getModelCreator()

    public fun modelDescription(): String? = unwrap(this).getModelDescription()

    public fun modelId(): String? = unwrap(this).getModelId()

    public fun modelName(): String? = unwrap(this).getModelName()

    public fun modelOwner(): String? = unwrap(this).getModelOwner()

    public fun modelVersion(): Number? = unwrap(this).getModelVersion()

    public fun problemType(): String? = unwrap(this).getProblemType()

    public interface Builder {
      public fun algorithmType(algorithmType: String) {
      }

      public fun inferenceEnvironment(inferenceEnvironment: IResolvable) {
      }

      public fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9290c85bedd92594ccae6eefb62c1947d8b82dac5a90a3cdc38b3dfed69cc11f")
      public
          fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty.Builder.() -> Unit) {
      }

      public fun modelArtifact(modelArtifact: List<String>) {
      }

      public fun modelCreator(modelCreator: String) {
      }

      public fun modelDescription(modelDescription: String) {
      }

      public fun modelId(modelId: String) {
      }

      public fun modelName(modelName: String) {
      }

      public fun modelOwner(modelOwner: String) {
      }

      public fun modelVersion(modelVersion: Number) {
      }

      public fun problemType(problemType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty.builder()

      public override fun algorithmType(algorithmType: String) {
        cdkBuilder.algorithmType(algorithmType)
      }

      public override fun inferenceEnvironment(inferenceEnvironment: IResolvable) {
        cdkBuilder.inferenceEnvironment(inferenceEnvironment.let(IResolvable::unwrap))
      }

      public override fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty) {
        cdkBuilder.inferenceEnvironment(inferenceEnvironment.let(InferenceEnvironmentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9290c85bedd92594ccae6eefb62c1947d8b82dac5a90a3cdc38b3dfed69cc11f")
      public override
          fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty.Builder.() -> Unit):
          Unit = inferenceEnvironment(InferenceEnvironmentProperty(inferenceEnvironment))

      public override fun modelArtifact(modelArtifact: List<String>) {
        cdkBuilder.modelArtifact(modelArtifact)
      }

      public override fun modelCreator(modelCreator: String) {
        cdkBuilder.modelCreator(modelCreator)
      }

      public override fun modelDescription(modelDescription: String) {
        cdkBuilder.modelDescription(modelDescription)
      }

      public override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      public override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      public override fun modelOwner(modelOwner: String) {
        cdkBuilder.modelOwner(modelOwner)
      }

      public override fun modelVersion(modelVersion: Number) {
        cdkBuilder.modelVersion(modelVersion)
      }

      public override fun problemType(problemType: String) {
        cdkBuilder.problemType(problemType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty,
    ) : ModelOverviewProperty {
      public override fun algorithmType(): String? = unwrap(this).getAlgorithmType()

      public override fun inferenceEnvironment(): Any? = unwrap(this).getInferenceEnvironment()

      public override fun modelArtifact(): List<String> = unwrap(this).getModelArtifact() ?:
          emptyList()

      public override fun modelCreator(): String? = unwrap(this).getModelCreator()

      public override fun modelDescription(): String? = unwrap(this).getModelDescription()

      public override fun modelId(): String? = unwrap(this).getModelId()

      public override fun modelName(): String? = unwrap(this).getModelName()

      public override fun modelOwner(): String? = unwrap(this).getModelOwner()

      public override fun modelVersion(): Number? = unwrap(this).getModelVersion()

      public override fun problemType(): String? = unwrap(this).getProblemType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelOverviewProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty):
          ModelOverviewProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelOverviewProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ModelPackageDetailsProperty {
    public fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

    public fun createdBy(): Any? = unwrap(this).getCreatedBy()

    public fun domain(): String? = unwrap(this).getDomain()

    public fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

    public fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

    public fun modelPackageArn(): String? = unwrap(this).getModelPackageArn()

    public fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

    public fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

    public fun modelPackageName(): String? = unwrap(this).getModelPackageName()

    public fun modelPackageStatus(): String? = unwrap(this).getModelPackageStatus()

    public fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

    public fun sourceAlgorithms(): Any? = unwrap(this).getSourceAlgorithms()

    public fun task(): String? = unwrap(this).getTask()

    public interface Builder {
      public fun approvalDescription(approvalDescription: String) {
      }

      public fun createdBy(createdBy: IResolvable) {
      }

      public fun createdBy(createdBy: ModelPackageCreatorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("688b0e1d14b76671de6e97c373d6efaa2154d0d50c2a297358cf11e88e777327")
      public fun createdBy(createdBy: ModelPackageCreatorProperty.Builder.() -> Unit) {
      }

      public fun domain(domain: String) {
      }

      public fun inferenceSpecification(inferenceSpecification: IResolvable) {
      }

      public fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("766b96c35e394b8b538b32f39f247897d38afb112919d78de6ce7eadc40c0884")
      public
          fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit) {
      }

      public fun modelApprovalStatus(modelApprovalStatus: String) {
      }

      public fun modelPackageArn(modelPackageArn: String) {
      }

      public fun modelPackageDescription(modelPackageDescription: String) {
      }

      public fun modelPackageGroupName(modelPackageGroupName: String) {
      }

      public fun modelPackageName(modelPackageName: String) {
      }

      public fun modelPackageStatus(modelPackageStatus: String) {
      }

      public fun modelPackageVersion(modelPackageVersion: Number) {
      }

      public fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
      }

      public fun sourceAlgorithms(sourceAlgorithms: List<Any>) {
      }

      public fun task(task: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty.builder()

      public override fun approvalDescription(approvalDescription: String) {
        cdkBuilder.approvalDescription(approvalDescription)
      }

      public override fun createdBy(createdBy: IResolvable) {
        cdkBuilder.createdBy(createdBy.let(IResolvable::unwrap))
      }

      public override fun createdBy(createdBy: ModelPackageCreatorProperty) {
        cdkBuilder.createdBy(createdBy.let(ModelPackageCreatorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("688b0e1d14b76671de6e97c373d6efaa2154d0d50c2a297358cf11e88e777327")
      public override fun createdBy(createdBy: ModelPackageCreatorProperty.Builder.() -> Unit): Unit
          = createdBy(ModelPackageCreatorProperty(createdBy))

      public override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      public override fun inferenceSpecification(inferenceSpecification: IResolvable) {
        cdkBuilder.inferenceSpecification(inferenceSpecification.let(IResolvable::unwrap))
      }

      public override
          fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty) {
        cdkBuilder.inferenceSpecification(inferenceSpecification.let(InferenceSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("766b96c35e394b8b538b32f39f247897d38afb112919d78de6ce7eadc40c0884")
      public override
          fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit):
          Unit = inferenceSpecification(InferenceSpecificationProperty(inferenceSpecification))

      public override fun modelApprovalStatus(modelApprovalStatus: String) {
        cdkBuilder.modelApprovalStatus(modelApprovalStatus)
      }

      public override fun modelPackageArn(modelPackageArn: String) {
        cdkBuilder.modelPackageArn(modelPackageArn)
      }

      public override fun modelPackageDescription(modelPackageDescription: String) {
        cdkBuilder.modelPackageDescription(modelPackageDescription)
      }

      public override fun modelPackageGroupName(modelPackageGroupName: String) {
        cdkBuilder.modelPackageGroupName(modelPackageGroupName)
      }

      public override fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
      }

      public override fun modelPackageStatus(modelPackageStatus: String) {
        cdkBuilder.modelPackageStatus(modelPackageStatus)
      }

      public override fun modelPackageVersion(modelPackageVersion: Number) {
        cdkBuilder.modelPackageVersion(modelPackageVersion)
      }

      public override fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms.let(IResolvable::unwrap))
      }

      public override fun sourceAlgorithms(sourceAlgorithms: List<Any>) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms)
      }

      public override fun task(task: String) {
        cdkBuilder.task(task)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty,
    ) : ModelPackageDetailsProperty {
      public override fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

      public override fun createdBy(): Any? = unwrap(this).getCreatedBy()

      public override fun domain(): String? = unwrap(this).getDomain()

      public override fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

      public override fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

      public override fun modelPackageArn(): String? = unwrap(this).getModelPackageArn()

      public override fun modelPackageDescription(): String? =
          unwrap(this).getModelPackageDescription()

      public override fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

      public override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

      public override fun modelPackageStatus(): String? = unwrap(this).getModelPackageStatus()

      public override fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

      public override fun sourceAlgorithms(): Any? = unwrap(this).getSourceAlgorithms()

      public override fun task(): String? = unwrap(this).getTask()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelPackageDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty):
          ModelPackageDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContainerProperty {
    public fun image(): String

    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    public fun nearestModelName(): String? = unwrap(this).getNearestModelName()

    public interface Builder {
      public fun image(image: String) {
      }

      public fun modelDataUrl(modelDataUrl: String) {
      }

      public fun nearestModelName(nearestModelName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty.builder()

      public override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      public override fun nearestModelName(nearestModelName: String) {
        cdkBuilder.nearestModelName(nearestModelName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty,
    ) : ContainerProperty {
      public override fun image(): String = unwrap(this).getImage()

      public override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

      public override fun nearestModelName(): String? = unwrap(this).getNearestModelName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty):
          ContainerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SecurityConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty.builder()

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty,
    ) : SecurityConfigProperty {
      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty):
          SecurityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TrainingDetailsProperty {
    public fun objectiveFunction(): Any? = unwrap(this).getObjectiveFunction()

    public fun trainingJobDetails(): Any? = unwrap(this).getTrainingJobDetails()

    public fun trainingObservations(): String? = unwrap(this).getTrainingObservations()

    public interface Builder {
      public fun objectiveFunction(objectiveFunction: IResolvable) {
      }

      public fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff398faacbe686bdb9bd489624c89cf86836e4e43a6192af04c2d0ada43ccb0")
      public
          fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty.Builder.() -> Unit) {
      }

      public fun trainingJobDetails(trainingJobDetails: IResolvable) {
      }

      public fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397ff1447cdbecbc9a54d43caf6bc378d064127c311299383afd31d0212a5cbe")
      public
          fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty.Builder.() -> Unit) {
      }

      public fun trainingObservations(trainingObservations: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty.builder()

      public override fun objectiveFunction(objectiveFunction: IResolvable) {
        cdkBuilder.objectiveFunction(objectiveFunction.let(IResolvable::unwrap))
      }

      public override fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty) {
        cdkBuilder.objectiveFunction(objectiveFunction.let(ObjectiveFunctionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff398faacbe686bdb9bd489624c89cf86836e4e43a6192af04c2d0ada43ccb0")
      public override
          fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty.Builder.() -> Unit):
          Unit = objectiveFunction(ObjectiveFunctionProperty(objectiveFunction))

      public override fun trainingJobDetails(trainingJobDetails: IResolvable) {
        cdkBuilder.trainingJobDetails(trainingJobDetails.let(IResolvable::unwrap))
      }

      public override fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty) {
        cdkBuilder.trainingJobDetails(trainingJobDetails.let(TrainingJobDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397ff1447cdbecbc9a54d43caf6bc378d064127c311299383afd31d0212a5cbe")
      public override
          fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty.Builder.() -> Unit):
          Unit = trainingJobDetails(TrainingJobDetailsProperty(trainingJobDetails))

      public override fun trainingObservations(trainingObservations: String) {
        cdkBuilder.trainingObservations(trainingObservations)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty,
    ) : TrainingDetailsProperty {
      public override fun objectiveFunction(): Any? = unwrap(this).getObjectiveFunction()

      public override fun trainingJobDetails(): Any? = unwrap(this).getTrainingJobDetails()

      public override fun trainingObservations(): String? = unwrap(this).getTrainingObservations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty):
          TrainingDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ContentProperty {
    public fun additionalInformation(): Any? = unwrap(this).getAdditionalInformation()

    public fun businessDetails(): Any? = unwrap(this).getBusinessDetails()

    public fun evaluationDetails(): Any? = unwrap(this).getEvaluationDetails()

    public fun intendedUses(): Any? = unwrap(this).getIntendedUses()

    public fun modelOverview(): Any? = unwrap(this).getModelOverview()

    public fun modelPackageDetails(): Any? = unwrap(this).getModelPackageDetails()

    public fun trainingDetails(): Any? = unwrap(this).getTrainingDetails()

    public interface Builder {
      public fun additionalInformation(additionalInformation: IResolvable) {
      }

      public fun additionalInformation(additionalInformation: AdditionalInformationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9da26ad18c832edc81e508345e855b2a7047624f7601d753f67e31e4ed849a7")
      public
          fun additionalInformation(additionalInformation: AdditionalInformationProperty.Builder.() -> Unit) {
      }

      public fun businessDetails(businessDetails: IResolvable) {
      }

      public fun businessDetails(businessDetails: BusinessDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e284e3086325df9a0df3e932dfeafb29ff224ba991c0ac097163551b91ed5e5e")
      public fun businessDetails(businessDetails: BusinessDetailsProperty.Builder.() -> Unit) {
      }

      public fun evaluationDetails(evaluationDetails: IResolvable) {
      }

      public fun evaluationDetails(evaluationDetails: List<Any>) {
      }

      public fun intendedUses(intendedUses: IResolvable) {
      }

      public fun intendedUses(intendedUses: IntendedUsesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bce6dff06486b481662c009fb93dcc10896aa53ef484ac6e06d2ad9b52cc3d5")
      public fun intendedUses(intendedUses: IntendedUsesProperty.Builder.() -> Unit) {
      }

      public fun modelOverview(modelOverview: IResolvable) {
      }

      public fun modelOverview(modelOverview: ModelOverviewProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d19f8a1c503753eafc93cbcec0f43f2972812bb3ed1fbaa1bd5231d2bbe19dc")
      public fun modelOverview(modelOverview: ModelOverviewProperty.Builder.() -> Unit) {
      }

      public fun modelPackageDetails(modelPackageDetails: IResolvable) {
      }

      public fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a62c3944517d40757e0fd6c7f75ee3f38b6d10d5796a19715d445827a229309d")
      public
          fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty.Builder.() -> Unit) {
      }

      public fun trainingDetails(trainingDetails: IResolvable) {
      }

      public fun trainingDetails(trainingDetails: TrainingDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43025e03b37eb5242f73face588aac78788711c6736b287967905c350e85877c")
      public fun trainingDetails(trainingDetails: TrainingDetailsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty.builder()

      public override fun additionalInformation(additionalInformation: IResolvable) {
        cdkBuilder.additionalInformation(additionalInformation.let(IResolvable::unwrap))
      }

      public override
          fun additionalInformation(additionalInformation: AdditionalInformationProperty) {
        cdkBuilder.additionalInformation(additionalInformation.let(AdditionalInformationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9da26ad18c832edc81e508345e855b2a7047624f7601d753f67e31e4ed849a7")
      public override
          fun additionalInformation(additionalInformation: AdditionalInformationProperty.Builder.() -> Unit):
          Unit = additionalInformation(AdditionalInformationProperty(additionalInformation))

      public override fun businessDetails(businessDetails: IResolvable) {
        cdkBuilder.businessDetails(businessDetails.let(IResolvable::unwrap))
      }

      public override fun businessDetails(businessDetails: BusinessDetailsProperty) {
        cdkBuilder.businessDetails(businessDetails.let(BusinessDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e284e3086325df9a0df3e932dfeafb29ff224ba991c0ac097163551b91ed5e5e")
      public override
          fun businessDetails(businessDetails: BusinessDetailsProperty.Builder.() -> Unit): Unit =
          businessDetails(BusinessDetailsProperty(businessDetails))

      public override fun evaluationDetails(evaluationDetails: IResolvable) {
        cdkBuilder.evaluationDetails(evaluationDetails.let(IResolvable::unwrap))
      }

      public override fun evaluationDetails(evaluationDetails: List<Any>) {
        cdkBuilder.evaluationDetails(evaluationDetails)
      }

      public override fun intendedUses(intendedUses: IResolvable) {
        cdkBuilder.intendedUses(intendedUses.let(IResolvable::unwrap))
      }

      public override fun intendedUses(intendedUses: IntendedUsesProperty) {
        cdkBuilder.intendedUses(intendedUses.let(IntendedUsesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bce6dff06486b481662c009fb93dcc10896aa53ef484ac6e06d2ad9b52cc3d5")
      public override fun intendedUses(intendedUses: IntendedUsesProperty.Builder.() -> Unit): Unit
          = intendedUses(IntendedUsesProperty(intendedUses))

      public override fun modelOverview(modelOverview: IResolvable) {
        cdkBuilder.modelOverview(modelOverview.let(IResolvable::unwrap))
      }

      public override fun modelOverview(modelOverview: ModelOverviewProperty) {
        cdkBuilder.modelOverview(modelOverview.let(ModelOverviewProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d19f8a1c503753eafc93cbcec0f43f2972812bb3ed1fbaa1bd5231d2bbe19dc")
      public override fun modelOverview(modelOverview: ModelOverviewProperty.Builder.() -> Unit):
          Unit = modelOverview(ModelOverviewProperty(modelOverview))

      public override fun modelPackageDetails(modelPackageDetails: IResolvable) {
        cdkBuilder.modelPackageDetails(modelPackageDetails.let(IResolvable::unwrap))
      }

      public override fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty) {
        cdkBuilder.modelPackageDetails(modelPackageDetails.let(ModelPackageDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a62c3944517d40757e0fd6c7f75ee3f38b6d10d5796a19715d445827a229309d")
      public override
          fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty.Builder.() -> Unit):
          Unit = modelPackageDetails(ModelPackageDetailsProperty(modelPackageDetails))

      public override fun trainingDetails(trainingDetails: IResolvable) {
        cdkBuilder.trainingDetails(trainingDetails.let(IResolvable::unwrap))
      }

      public override fun trainingDetails(trainingDetails: TrainingDetailsProperty) {
        cdkBuilder.trainingDetails(trainingDetails.let(TrainingDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43025e03b37eb5242f73face588aac78788711c6736b287967905c350e85877c")
      public override
          fun trainingDetails(trainingDetails: TrainingDetailsProperty.Builder.() -> Unit): Unit =
          trainingDetails(TrainingDetailsProperty(trainingDetails))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty,
    ) : ContentProperty {
      public override fun additionalInformation(): Any? = unwrap(this).getAdditionalInformation()

      public override fun businessDetails(): Any? = unwrap(this).getBusinessDetails()

      public override fun evaluationDetails(): Any? = unwrap(this).getEvaluationDetails()

      public override fun intendedUses(): Any? = unwrap(this).getIntendedUses()

      public override fun modelOverview(): Any? = unwrap(this).getModelOverview()

      public override fun modelPackageDetails(): Any? = unwrap(this).getModelPackageDetails()

      public override fun trainingDetails(): Any? = unwrap(this).getTrainingDetails()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty):
          ContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FunctionProperty {
    public fun condition(): String? = unwrap(this).getCondition()

    public fun facet(): String? = unwrap(this).getFacet()

    public fun function(): String? = unwrap(this).getFunction()

    public interface Builder {
      public fun condition(condition: String) {
      }

      public fun facet(facet: String) {
      }

      public fun function(function: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty.builder()

      public override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      public override fun facet(facet: String) {
        cdkBuilder.facet(facet)
      }

      public override fun function(function: String) {
        cdkBuilder.function(function)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty,
    ) : FunctionProperty {
      public override fun condition(): String? = unwrap(this).getCondition()

      public override fun facet(): String? = unwrap(this).getFacet()

      public override fun function(): String? = unwrap(this).getFunction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty):
          FunctionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ModelPackageCreatorProperty {
    public fun userProfileName(): String? = unwrap(this).getUserProfileName()

    public interface Builder {
      public fun userProfileName(userProfileName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty.builder()

      public override fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty,
    ) : ModelPackageCreatorProperty {
      public override fun userProfileName(): String? = unwrap(this).getUserProfileName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelPackageCreatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty):
          ModelPackageCreatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageCreatorProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrainingEnvironmentProperty {
    public fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()

    public interface Builder {
      public fun containerImage(containerImage: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty.builder()

      public override fun containerImage(containerImage: List<String>) {
        cdkBuilder.containerImage(containerImage)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty,
    ) : TrainingEnvironmentProperty {
      public override fun containerImage(): List<String> = unwrap(this).getContainerImage() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty):
          TrainingEnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingEnvironmentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AdditionalInformationProperty {
    public fun caveatsAndRecommendations(): String? = unwrap(this).getCaveatsAndRecommendations()

    public fun customDetails(): Any? = unwrap(this).getCustomDetails()

    public fun ethicalConsiderations(): String? = unwrap(this).getEthicalConsiderations()

    public interface Builder {
      public fun caveatsAndRecommendations(caveatsAndRecommendations: String) {
      }

      public fun customDetails(customDetails: IResolvable) {
      }

      public fun customDetails(customDetails: Map<String, String>) {
      }

      public fun ethicalConsiderations(ethicalConsiderations: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty.builder()

      public override fun caveatsAndRecommendations(caveatsAndRecommendations: String) {
        cdkBuilder.caveatsAndRecommendations(caveatsAndRecommendations)
      }

      public override fun customDetails(customDetails: IResolvable) {
        cdkBuilder.customDetails(customDetails.let(IResolvable::unwrap))
      }

      public override fun customDetails(customDetails: Map<String, String>) {
        cdkBuilder.customDetails(customDetails)
      }

      public override fun ethicalConsiderations(ethicalConsiderations: String) {
        cdkBuilder.ethicalConsiderations(ethicalConsiderations)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty,
    ) : AdditionalInformationProperty {
      public override fun caveatsAndRecommendations(): String? =
          unwrap(this).getCaveatsAndRecommendations()

      public override fun customDetails(): Any? = unwrap(this).getCustomDetails()

      public override fun ethicalConsiderations(): String? = unwrap(this).getEthicalConsiderations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AdditionalInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty):
          AdditionalInformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalInformationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UserContextProperty {
    public fun domainId(): String? = unwrap(this).getDomainId()

    public fun userProfileArn(): String? = unwrap(this).getUserProfileArn()

    public fun userProfileName(): String? = unwrap(this).getUserProfileName()

    public interface Builder {
      public fun domainId(domainId: String) {
      }

      public fun userProfileArn(userProfileArn: String) {
      }

      public fun userProfileName(userProfileName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty.builder()

      public override fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
      }

      public override fun userProfileArn(userProfileArn: String) {
        cdkBuilder.userProfileArn(userProfileArn)
      }

      public override fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty,
    ) : UserContextProperty {
      public override fun domainId(): String? = unwrap(this).getDomainId()

      public override fun userProfileArn(): String? = unwrap(this).getUserProfileArn()

      public override fun userProfileName(): String? = unwrap(this).getUserProfileName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty):
          UserContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserContextProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TrainingHyperParameterProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty,
    ) : TrainingHyperParameterProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingHyperParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty):
          TrainingHyperParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingHyperParameterProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InferenceSpecificationProperty {
    public fun containers(): Any

    public interface Builder {
      public fun containers(containers: IResolvable) {
      }

      public fun containers(containers: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty.builder()

      public override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      public override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty,
    ) : InferenceSpecificationProperty {
      public override fun containers(): Any = unwrap(this).getContainers()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty):
          InferenceSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InferenceEnvironmentProperty {
    public fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()

    public interface Builder {
      public fun containerImage(containerImage: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty.builder()

      public override fun containerImage(containerImage: List<String>) {
        cdkBuilder.containerImage(containerImage)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty,
    ) : InferenceEnvironmentProperty {
      public override fun containerImage(): List<String> = unwrap(this).getContainerImage() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty):
          InferenceEnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceEnvironmentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
