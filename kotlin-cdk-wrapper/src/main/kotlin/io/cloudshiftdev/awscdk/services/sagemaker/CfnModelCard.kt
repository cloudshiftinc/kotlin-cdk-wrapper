@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModelCard internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d29255f48c0c5fb005232e5da8985feb5de9ff1b655b0b84daa5d9204a969c8f")
  public open fun securityConfig(`value`: SecurityConfigProperty.Builder.() -> Unit): Unit =
      securityConfig(SecurityConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun content(content: IResolvable)

    public fun content(content: ContentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f28d93af6185b70189cc5f6c1c1b17d4b562031e807aa8e9296643238552ac3")
    public fun content(content: ContentProperty.Builder.() -> Unit)

    public fun createdBy(createdBy: IResolvable)

    public fun createdBy(createdBy: UserContextProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05f2ba948b7e805200d1f67f9086b3d86f4d21e361529b0483a2db9512d5a416")
    public fun createdBy(createdBy: UserContextProperty.Builder.() -> Unit)

    public fun lastModifiedBy(lastModifiedBy: IResolvable)

    public fun lastModifiedBy(lastModifiedBy: UserContextProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a415fc6cc2f2fda5a7793f0717507f1ae990f7d0fc3b6f3590382378821106")
    public fun lastModifiedBy(lastModifiedBy: UserContextProperty.Builder.() -> Unit)

    public fun modelCardName(modelCardName: String)

    public fun modelCardStatus(modelCardStatus: String)

    public fun securityConfig(securityConfig: IResolvable)

    public fun securityConfig(securityConfig: SecurityConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c274ebaa095a50a6c8fccf28d41c264635f6df0b7672cf1ef6dd218461c746d1")
    public fun securityConfig(securityConfig: SecurityConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelCard.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelCard.Builder.create(scope, id)

    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    override fun content(content: ContentProperty) {
      cdkBuilder.content(content.let(ContentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f28d93af6185b70189cc5f6c1c1b17d4b562031e807aa8e9296643238552ac3")
    override fun content(content: ContentProperty.Builder.() -> Unit): Unit =
        content(ContentProperty(content))

    override fun createdBy(createdBy: IResolvable) {
      cdkBuilder.createdBy(createdBy.let(IResolvable::unwrap))
    }

    override fun createdBy(createdBy: UserContextProperty) {
      cdkBuilder.createdBy(createdBy.let(UserContextProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05f2ba948b7e805200d1f67f9086b3d86f4d21e361529b0483a2db9512d5a416")
    override fun createdBy(createdBy: UserContextProperty.Builder.() -> Unit): Unit =
        createdBy(UserContextProperty(createdBy))

    override fun lastModifiedBy(lastModifiedBy: IResolvable) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(IResolvable::unwrap))
    }

    override fun lastModifiedBy(lastModifiedBy: UserContextProperty) {
      cdkBuilder.lastModifiedBy(lastModifiedBy.let(UserContextProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a415fc6cc2f2fda5a7793f0717507f1ae990f7d0fc3b6f3590382378821106")
    override fun lastModifiedBy(lastModifiedBy: UserContextProperty.Builder.() -> Unit): Unit =
        lastModifiedBy(UserContextProperty(lastModifiedBy))

    override fun modelCardName(modelCardName: String) {
      cdkBuilder.modelCardName(modelCardName)
    }

    override fun modelCardStatus(modelCardStatus: String) {
      cdkBuilder.modelCardStatus(modelCardStatus)
    }

    override fun securityConfig(securityConfig: IResolvable) {
      cdkBuilder.securityConfig(securityConfig.let(IResolvable::unwrap))
    }

    override fun securityConfig(securityConfig: SecurityConfigProperty) {
      cdkBuilder.securityConfig(securityConfig.let(SecurityConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c274ebaa095a50a6c8fccf28d41c264635f6df0b7672cf1ef6dd218461c746d1")
    override fun securityConfig(securityConfig: SecurityConfigProperty.Builder.() -> Unit): Unit =
        securityConfig(SecurityConfigProperty(securityConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnModelCard.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun metricData(metricData: IResolvable)

      public fun metricData(metricData: List<Any>)

      public fun metricData(vararg metricData: Any)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty.builder()

      override fun metricData(metricData: IResolvable) {
        cdkBuilder.metricData(metricData.let(IResolvable::unwrap))
      }

      override fun metricData(metricData: List<Any>) {
        cdkBuilder.metricData(metricData)
      }

      override fun metricData(vararg metricData: Any): Unit = metricData(metricData.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty,
    ) : CdkObject(cdkObject), MetricGroupProperty {
      override fun metricData(): Any = unwrap(this).getMetricData()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty):
          MetricGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricGroupProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricGroupProperty
    }
  }

  public interface TrainingMetricProperty {
    public fun name(): String

    public fun notes(): String? = unwrap(this).getNotes()

    public fun `value`(): Number

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun notes(notes: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty,
    ) : CdkObject(cdkObject), TrainingMetricProperty {
      override fun name(): String = unwrap(this).getName()

      override fun notes(): String? = unwrap(this).getNotes()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty):
          TrainingMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingMetricProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingMetricProperty
    }
  }

  public interface MetricDataItemsProperty {
    public fun name(): String

    public fun notes(): String? = unwrap(this).getNotes()

    public fun type(): String

    public fun `value`(): Any

    public fun xAxisName(): List<String> = unwrap(this).getXAxisName() ?: emptyList()

    public fun yAxisName(): List<String> = unwrap(this).getYAxisName() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun notes(notes: String)

      public fun type(type: String)

      public fun `value`(`value`: Any)

      public fun xAxisName(xAxisName: List<String>)

      public fun xAxisName(vararg xAxisName: String)

      public fun yAxisName(yAxisName: List<String>)

      public fun yAxisName(vararg yAxisName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
      }

      override fun xAxisName(xAxisName: List<String>) {
        cdkBuilder.xAxisName(xAxisName)
      }

      override fun xAxisName(vararg xAxisName: String): Unit = xAxisName(xAxisName.toList())

      override fun yAxisName(yAxisName: List<String>) {
        cdkBuilder.yAxisName(yAxisName)
      }

      override fun yAxisName(vararg yAxisName: String): Unit = yAxisName(yAxisName.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty,
    ) : CdkObject(cdkObject), MetricDataItemsProperty {
      override fun name(): String = unwrap(this).getName()

      override fun notes(): String? = unwrap(this).getNotes()

      override fun type(): String = unwrap(this).getType()

      override fun `value`(): Any = unwrap(this).getValue()

      override fun xAxisName(): List<String> = unwrap(this).getXAxisName() ?: emptyList()

      override fun yAxisName(): List<String> = unwrap(this).getYAxisName() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty):
          MetricDataItemsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataItemsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.MetricDataItemsProperty
    }
  }

  public interface ObjectiveFunctionProperty {
    public fun function(): Any? = unwrap(this).getFunction()

    public fun notes(): String? = unwrap(this).getNotes()

    @CdkDslMarker
    public interface Builder {
      public fun function(function: IResolvable)

      public fun function(function: FunctionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ce5a3ec45d5e266f660bce55fe5e43488c3862ffcdc53937a48a8a3e4e4e58d")
      public fun function(function: FunctionProperty.Builder.() -> Unit)

      public fun notes(notes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty.builder()

      override fun function(function: IResolvable) {
        cdkBuilder.function(function.let(IResolvable::unwrap))
      }

      override fun function(function: FunctionProperty) {
        cdkBuilder.function(function.let(FunctionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ce5a3ec45d5e266f660bce55fe5e43488c3862ffcdc53937a48a8a3e4e4e58d")
      override fun function(function: FunctionProperty.Builder.() -> Unit): Unit =
          function(FunctionProperty(function))

      override fun notes(notes: String) {
        cdkBuilder.notes(notes)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty,
    ) : CdkObject(cdkObject), ObjectiveFunctionProperty {
      override fun function(): Any? = unwrap(this).getFunction()

      override fun notes(): String? = unwrap(this).getNotes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectiveFunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty):
          ObjectiveFunctionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectiveFunctionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ObjectiveFunctionProperty
    }
  }

  public interface EvaluationDetailProperty {
    public fun datasets(): List<String> = unwrap(this).getDatasets() ?: emptyList()

    public fun evaluationJobArn(): String? = unwrap(this).getEvaluationJobArn()

    public fun evaluationObservation(): String? = unwrap(this).getEvaluationObservation()

    public fun metadata(): Any? = unwrap(this).getMetadata()

    public fun metricGroups(): Any? = unwrap(this).getMetricGroups()

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun datasets(datasets: List<String>)

      public fun datasets(vararg datasets: String)

      public fun evaluationJobArn(evaluationJobArn: String)

      public fun evaluationObservation(evaluationObservation: String)

      public fun metadata(metadata: IResolvable)

      public fun metadata(metadata: Map<String, String>)

      public fun metricGroups(metricGroups: IResolvable)

      public fun metricGroups(metricGroups: List<Any>)

      public fun metricGroups(vararg metricGroups: Any)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty.builder()

      override fun datasets(datasets: List<String>) {
        cdkBuilder.datasets(datasets)
      }

      override fun datasets(vararg datasets: String): Unit = datasets(datasets.toList())

      override fun evaluationJobArn(evaluationJobArn: String) {
        cdkBuilder.evaluationJobArn(evaluationJobArn)
      }

      override fun evaluationObservation(evaluationObservation: String) {
        cdkBuilder.evaluationObservation(evaluationObservation)
      }

      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      override fun metadata(metadata: Map<String, String>) {
        cdkBuilder.metadata(metadata)
      }

      override fun metricGroups(metricGroups: IResolvable) {
        cdkBuilder.metricGroups(metricGroups.let(IResolvable::unwrap))
      }

      override fun metricGroups(metricGroups: List<Any>) {
        cdkBuilder.metricGroups(metricGroups)
      }

      override fun metricGroups(vararg metricGroups: Any): Unit =
          metricGroups(metricGroups.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty,
    ) : CdkObject(cdkObject), EvaluationDetailProperty {
      override fun datasets(): List<String> = unwrap(this).getDatasets() ?: emptyList()

      override fun evaluationJobArn(): String? = unwrap(this).getEvaluationJobArn()

      override fun evaluationObservation(): String? = unwrap(this).getEvaluationObservation()

      override fun metadata(): Any? = unwrap(this).getMetadata()

      override fun metricGroups(): Any? = unwrap(this).getMetricGroups()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty):
          EvaluationDetailProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationDetailProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.EvaluationDetailProperty
    }
  }

  public interface SourceAlgorithmProperty {
    public fun algorithmName(): String

    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    @CdkDslMarker
    public interface Builder {
      public fun algorithmName(algorithmName: String)

      public fun modelDataUrl(modelDataUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty.builder()

      override fun algorithmName(algorithmName: String) {
        cdkBuilder.algorithmName(algorithmName)
      }

      override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty,
    ) : CdkObject(cdkObject), SourceAlgorithmProperty {
      override fun algorithmName(): String = unwrap(this).getAlgorithmName()

      override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceAlgorithmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty):
          SourceAlgorithmProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAlgorithmProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SourceAlgorithmProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun hyperParameters(hyperParameters: IResolvable)

      public fun hyperParameters(hyperParameters: List<Any>)

      public fun hyperParameters(vararg hyperParameters: Any)

      public fun trainingArn(trainingArn: String)

      public fun trainingDatasets(trainingDatasets: List<String>)

      public fun trainingDatasets(vararg trainingDatasets: String)

      public fun trainingEnvironment(trainingEnvironment: IResolvable)

      public fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c17f90744d1767db88202028eb3e9048a087d33456aeee772f5cfbc1c25bc4eb")
      public
          fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty.Builder.() -> Unit)

      public fun trainingMetrics(trainingMetrics: IResolvable)

      public fun trainingMetrics(trainingMetrics: List<Any>)

      public fun trainingMetrics(vararg trainingMetrics: Any)

      public fun userProvidedHyperParameters(userProvidedHyperParameters: IResolvable)

      public fun userProvidedHyperParameters(userProvidedHyperParameters: List<Any>)

      public fun userProvidedHyperParameters(vararg userProvidedHyperParameters: Any)

      public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: IResolvable)

      public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: List<Any>)

      public fun userProvidedTrainingMetrics(vararg userProvidedTrainingMetrics: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty.builder()

      override fun hyperParameters(hyperParameters: IResolvable) {
        cdkBuilder.hyperParameters(hyperParameters.let(IResolvable::unwrap))
      }

      override fun hyperParameters(hyperParameters: List<Any>) {
        cdkBuilder.hyperParameters(hyperParameters)
      }

      override fun hyperParameters(vararg hyperParameters: Any): Unit =
          hyperParameters(hyperParameters.toList())

      override fun trainingArn(trainingArn: String) {
        cdkBuilder.trainingArn(trainingArn)
      }

      override fun trainingDatasets(trainingDatasets: List<String>) {
        cdkBuilder.trainingDatasets(trainingDatasets)
      }

      override fun trainingDatasets(vararg trainingDatasets: String): Unit =
          trainingDatasets(trainingDatasets.toList())

      override fun trainingEnvironment(trainingEnvironment: IResolvable) {
        cdkBuilder.trainingEnvironment(trainingEnvironment.let(IResolvable::unwrap))
      }

      override fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty) {
        cdkBuilder.trainingEnvironment(trainingEnvironment.let(TrainingEnvironmentProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c17f90744d1767db88202028eb3e9048a087d33456aeee772f5cfbc1c25bc4eb")
      override
          fun trainingEnvironment(trainingEnvironment: TrainingEnvironmentProperty.Builder.() -> Unit):
          Unit = trainingEnvironment(TrainingEnvironmentProperty(trainingEnvironment))

      override fun trainingMetrics(trainingMetrics: IResolvable) {
        cdkBuilder.trainingMetrics(trainingMetrics.let(IResolvable::unwrap))
      }

      override fun trainingMetrics(trainingMetrics: List<Any>) {
        cdkBuilder.trainingMetrics(trainingMetrics)
      }

      override fun trainingMetrics(vararg trainingMetrics: Any): Unit =
          trainingMetrics(trainingMetrics.toList())

      override fun userProvidedHyperParameters(userProvidedHyperParameters: IResolvable) {
        cdkBuilder.userProvidedHyperParameters(userProvidedHyperParameters.let(IResolvable::unwrap))
      }

      override fun userProvidedHyperParameters(userProvidedHyperParameters: List<Any>) {
        cdkBuilder.userProvidedHyperParameters(userProvidedHyperParameters)
      }

      override fun userProvidedHyperParameters(vararg userProvidedHyperParameters: Any): Unit =
          userProvidedHyperParameters(userProvidedHyperParameters.toList())

      override fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: IResolvable) {
        cdkBuilder.userProvidedTrainingMetrics(userProvidedTrainingMetrics.let(IResolvable::unwrap))
      }

      override fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: List<Any>) {
        cdkBuilder.userProvidedTrainingMetrics(userProvidedTrainingMetrics)
      }

      override fun userProvidedTrainingMetrics(vararg userProvidedTrainingMetrics: Any): Unit =
          userProvidedTrainingMetrics(userProvidedTrainingMetrics.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty,
    ) : CdkObject(cdkObject), TrainingJobDetailsProperty {
      override fun hyperParameters(): Any? = unwrap(this).getHyperParameters()

      override fun trainingArn(): String? = unwrap(this).getTrainingArn()

      override fun trainingDatasets(): List<String> = unwrap(this).getTrainingDatasets() ?:
          emptyList()

      override fun trainingEnvironment(): Any? = unwrap(this).getTrainingEnvironment()

      override fun trainingMetrics(): Any? = unwrap(this).getTrainingMetrics()

      override fun userProvidedHyperParameters(): Any? =
          unwrap(this).getUserProvidedHyperParameters()

      override fun userProvidedTrainingMetrics(): Any? =
          unwrap(this).getUserProvidedTrainingMetrics()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingJobDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty):
          TrainingJobDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingJobDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingJobDetailsProperty
    }
  }

  public interface BusinessDetailsProperty {
    public fun businessProblem(): String? = unwrap(this).getBusinessProblem()

    public fun businessStakeholders(): String? = unwrap(this).getBusinessStakeholders()

    public fun lineOfBusiness(): String? = unwrap(this).getLineOfBusiness()

    @CdkDslMarker
    public interface Builder {
      public fun businessProblem(businessProblem: String)

      public fun businessStakeholders(businessStakeholders: String)

      public fun lineOfBusiness(lineOfBusiness: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty.builder()

      override fun businessProblem(businessProblem: String) {
        cdkBuilder.businessProblem(businessProblem)
      }

      override fun businessStakeholders(businessStakeholders: String) {
        cdkBuilder.businessStakeholders(businessStakeholders)
      }

      override fun lineOfBusiness(lineOfBusiness: String) {
        cdkBuilder.lineOfBusiness(lineOfBusiness)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty,
    ) : CdkObject(cdkObject), BusinessDetailsProperty {
      override fun businessProblem(): String? = unwrap(this).getBusinessProblem()

      override fun businessStakeholders(): String? = unwrap(this).getBusinessStakeholders()

      override fun lineOfBusiness(): String? = unwrap(this).getLineOfBusiness()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BusinessDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty):
          BusinessDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BusinessDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.BusinessDetailsProperty
    }
  }

  public interface IntendedUsesProperty {
    public fun explanationsForRiskRating(): String? = unwrap(this).getExplanationsForRiskRating()

    public fun factorsAffectingModelEfficiency(): String? =
        unwrap(this).getFactorsAffectingModelEfficiency()

    public fun intendedUses(): String? = unwrap(this).getIntendedUses()

    public fun purposeOfModel(): String? = unwrap(this).getPurposeOfModel()

    public fun riskRating(): String? = unwrap(this).getRiskRating()

    @CdkDslMarker
    public interface Builder {
      public fun explanationsForRiskRating(explanationsForRiskRating: String)

      public fun factorsAffectingModelEfficiency(factorsAffectingModelEfficiency: String)

      public fun intendedUses(intendedUses: String)

      public fun purposeOfModel(purposeOfModel: String)

      public fun riskRating(riskRating: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty.builder()

      override fun explanationsForRiskRating(explanationsForRiskRating: String) {
        cdkBuilder.explanationsForRiskRating(explanationsForRiskRating)
      }

      override fun factorsAffectingModelEfficiency(factorsAffectingModelEfficiency: String) {
        cdkBuilder.factorsAffectingModelEfficiency(factorsAffectingModelEfficiency)
      }

      override fun intendedUses(intendedUses: String) {
        cdkBuilder.intendedUses(intendedUses)
      }

      override fun purposeOfModel(purposeOfModel: String) {
        cdkBuilder.purposeOfModel(purposeOfModel)
      }

      override fun riskRating(riskRating: String) {
        cdkBuilder.riskRating(riskRating)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty,
    ) : CdkObject(cdkObject), IntendedUsesProperty {
      override fun explanationsForRiskRating(): String? =
          unwrap(this).getExplanationsForRiskRating()

      override fun factorsAffectingModelEfficiency(): String? =
          unwrap(this).getFactorsAffectingModelEfficiency()

      override fun intendedUses(): String? = unwrap(this).getIntendedUses()

      override fun purposeOfModel(): String? = unwrap(this).getPurposeOfModel()

      override fun riskRating(): String? = unwrap(this).getRiskRating()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntendedUsesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty):
          IntendedUsesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntendedUsesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.IntendedUsesProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun algorithmType(algorithmType: String)

      public fun inferenceEnvironment(inferenceEnvironment: IResolvable)

      public fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9290c85bedd92594ccae6eefb62c1947d8b82dac5a90a3cdc38b3dfed69cc11f")
      public
          fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty.Builder.() -> Unit)

      public fun modelArtifact(modelArtifact: List<String>)

      public fun modelArtifact(vararg modelArtifact: String)

      public fun modelCreator(modelCreator: String)

      public fun modelDescription(modelDescription: String)

      public fun modelId(modelId: String)

      public fun modelName(modelName: String)

      public fun modelOwner(modelOwner: String)

      public fun modelVersion(modelVersion: Number)

      public fun problemType(problemType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty.builder()

      override fun algorithmType(algorithmType: String) {
        cdkBuilder.algorithmType(algorithmType)
      }

      override fun inferenceEnvironment(inferenceEnvironment: IResolvable) {
        cdkBuilder.inferenceEnvironment(inferenceEnvironment.let(IResolvable::unwrap))
      }

      override fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty) {
        cdkBuilder.inferenceEnvironment(inferenceEnvironment.let(InferenceEnvironmentProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9290c85bedd92594ccae6eefb62c1947d8b82dac5a90a3cdc38b3dfed69cc11f")
      override
          fun inferenceEnvironment(inferenceEnvironment: InferenceEnvironmentProperty.Builder.() -> Unit):
          Unit = inferenceEnvironment(InferenceEnvironmentProperty(inferenceEnvironment))

      override fun modelArtifact(modelArtifact: List<String>) {
        cdkBuilder.modelArtifact(modelArtifact)
      }

      override fun modelArtifact(vararg modelArtifact: String): Unit =
          modelArtifact(modelArtifact.toList())

      override fun modelCreator(modelCreator: String) {
        cdkBuilder.modelCreator(modelCreator)
      }

      override fun modelDescription(modelDescription: String) {
        cdkBuilder.modelDescription(modelDescription)
      }

      override fun modelId(modelId: String) {
        cdkBuilder.modelId(modelId)
      }

      override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      override fun modelOwner(modelOwner: String) {
        cdkBuilder.modelOwner(modelOwner)
      }

      override fun modelVersion(modelVersion: Number) {
        cdkBuilder.modelVersion(modelVersion)
      }

      override fun problemType(problemType: String) {
        cdkBuilder.problemType(problemType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty,
    ) : CdkObject(cdkObject), ModelOverviewProperty {
      override fun algorithmType(): String? = unwrap(this).getAlgorithmType()

      override fun inferenceEnvironment(): Any? = unwrap(this).getInferenceEnvironment()

      override fun modelArtifact(): List<String> = unwrap(this).getModelArtifact() ?: emptyList()

      override fun modelCreator(): String? = unwrap(this).getModelCreator()

      override fun modelDescription(): String? = unwrap(this).getModelDescription()

      override fun modelId(): String? = unwrap(this).getModelId()

      override fun modelName(): String? = unwrap(this).getModelName()

      override fun modelOwner(): String? = unwrap(this).getModelOwner()

      override fun modelVersion(): Number? = unwrap(this).getModelVersion()

      override fun problemType(): String? = unwrap(this).getProblemType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelOverviewProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty):
          ModelOverviewProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelOverviewProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelOverviewProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun approvalDescription(approvalDescription: String)

      public fun createdBy(createdBy: IResolvable)

      public fun createdBy(createdBy: ModelPackageCreatorProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("688b0e1d14b76671de6e97c373d6efaa2154d0d50c2a297358cf11e88e777327")
      public fun createdBy(createdBy: ModelPackageCreatorProperty.Builder.() -> Unit)

      public fun domain(domain: String)

      public fun inferenceSpecification(inferenceSpecification: IResolvable)

      public fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("766b96c35e394b8b538b32f39f247897d38afb112919d78de6ce7eadc40c0884")
      public
          fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit)

      public fun modelApprovalStatus(modelApprovalStatus: String)

      public fun modelPackageArn(modelPackageArn: String)

      public fun modelPackageDescription(modelPackageDescription: String)

      public fun modelPackageGroupName(modelPackageGroupName: String)

      public fun modelPackageName(modelPackageName: String)

      public fun modelPackageStatus(modelPackageStatus: String)

      public fun modelPackageVersion(modelPackageVersion: Number)

      public fun sourceAlgorithms(sourceAlgorithms: IResolvable)

      public fun sourceAlgorithms(sourceAlgorithms: List<Any>)

      public fun sourceAlgorithms(vararg sourceAlgorithms: Any)

      public fun task(task: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty.builder()

      override fun approvalDescription(approvalDescription: String) {
        cdkBuilder.approvalDescription(approvalDescription)
      }

      override fun createdBy(createdBy: IResolvable) {
        cdkBuilder.createdBy(createdBy.let(IResolvable::unwrap))
      }

      override fun createdBy(createdBy: ModelPackageCreatorProperty) {
        cdkBuilder.createdBy(createdBy.let(ModelPackageCreatorProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("688b0e1d14b76671de6e97c373d6efaa2154d0d50c2a297358cf11e88e777327")
      override fun createdBy(createdBy: ModelPackageCreatorProperty.Builder.() -> Unit): Unit =
          createdBy(ModelPackageCreatorProperty(createdBy))

      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      override fun inferenceSpecification(inferenceSpecification: IResolvable) {
        cdkBuilder.inferenceSpecification(inferenceSpecification.let(IResolvable::unwrap))
      }

      override fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty) {
        cdkBuilder.inferenceSpecification(inferenceSpecification.let(InferenceSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("766b96c35e394b8b538b32f39f247897d38afb112919d78de6ce7eadc40c0884")
      override
          fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit):
          Unit = inferenceSpecification(InferenceSpecificationProperty(inferenceSpecification))

      override fun modelApprovalStatus(modelApprovalStatus: String) {
        cdkBuilder.modelApprovalStatus(modelApprovalStatus)
      }

      override fun modelPackageArn(modelPackageArn: String) {
        cdkBuilder.modelPackageArn(modelPackageArn)
      }

      override fun modelPackageDescription(modelPackageDescription: String) {
        cdkBuilder.modelPackageDescription(modelPackageDescription)
      }

      override fun modelPackageGroupName(modelPackageGroupName: String) {
        cdkBuilder.modelPackageGroupName(modelPackageGroupName)
      }

      override fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
      }

      override fun modelPackageStatus(modelPackageStatus: String) {
        cdkBuilder.modelPackageStatus(modelPackageStatus)
      }

      override fun modelPackageVersion(modelPackageVersion: Number) {
        cdkBuilder.modelPackageVersion(modelPackageVersion)
      }

      override fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms.let(IResolvable::unwrap))
      }

      override fun sourceAlgorithms(sourceAlgorithms: List<Any>) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms)
      }

      override fun sourceAlgorithms(vararg sourceAlgorithms: Any): Unit =
          sourceAlgorithms(sourceAlgorithms.toList())

      override fun task(task: String) {
        cdkBuilder.task(task)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty,
    ) : CdkObject(cdkObject), ModelPackageDetailsProperty {
      override fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

      override fun createdBy(): Any? = unwrap(this).getCreatedBy()

      override fun domain(): String? = unwrap(this).getDomain()

      override fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

      override fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

      override fun modelPackageArn(): String? = unwrap(this).getModelPackageArn()

      override fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

      override fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

      override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

      override fun modelPackageStatus(): String? = unwrap(this).getModelPackageStatus()

      override fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

      override fun sourceAlgorithms(): Any? = unwrap(this).getSourceAlgorithms()

      override fun task(): String? = unwrap(this).getTask()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelPackageDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty):
          ModelPackageDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageDetailsProperty
    }
  }

  public interface ContainerProperty {
    public fun image(): String

    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    public fun nearestModelName(): String? = unwrap(this).getNearestModelName()

    @CdkDslMarker
    public interface Builder {
      public fun image(image: String)

      public fun modelDataUrl(modelDataUrl: String)

      public fun nearestModelName(nearestModelName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty.builder()

      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      override fun nearestModelName(nearestModelName: String) {
        cdkBuilder.nearestModelName(nearestModelName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty,
    ) : CdkObject(cdkObject), ContainerProperty {
      override fun image(): String = unwrap(this).getImage()

      override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

      override fun nearestModelName(): String? = unwrap(this).getNearestModelName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty):
          ContainerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContainerProperty
    }
  }

  public interface SecurityConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty,
    ) : CdkObject(cdkObject), SecurityConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty):
          SecurityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.SecurityConfigProperty
    }
  }

  public interface TrainingDetailsProperty {
    public fun objectiveFunction(): Any? = unwrap(this).getObjectiveFunction()

    public fun trainingJobDetails(): Any? = unwrap(this).getTrainingJobDetails()

    public fun trainingObservations(): String? = unwrap(this).getTrainingObservations()

    @CdkDslMarker
    public interface Builder {
      public fun objectiveFunction(objectiveFunction: IResolvable)

      public fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff398faacbe686bdb9bd489624c89cf86836e4e43a6192af04c2d0ada43ccb0")
      public fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty.Builder.() -> Unit)

      public fun trainingJobDetails(trainingJobDetails: IResolvable)

      public fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397ff1447cdbecbc9a54d43caf6bc378d064127c311299383afd31d0212a5cbe")
      public
          fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty.Builder.() -> Unit)

      public fun trainingObservations(trainingObservations: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty.builder()

      override fun objectiveFunction(objectiveFunction: IResolvable) {
        cdkBuilder.objectiveFunction(objectiveFunction.let(IResolvable::unwrap))
      }

      override fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty) {
        cdkBuilder.objectiveFunction(objectiveFunction.let(ObjectiveFunctionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ff398faacbe686bdb9bd489624c89cf86836e4e43a6192af04c2d0ada43ccb0")
      override
          fun objectiveFunction(objectiveFunction: ObjectiveFunctionProperty.Builder.() -> Unit):
          Unit = objectiveFunction(ObjectiveFunctionProperty(objectiveFunction))

      override fun trainingJobDetails(trainingJobDetails: IResolvable) {
        cdkBuilder.trainingJobDetails(trainingJobDetails.let(IResolvable::unwrap))
      }

      override fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty) {
        cdkBuilder.trainingJobDetails(trainingJobDetails.let(TrainingJobDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("397ff1447cdbecbc9a54d43caf6bc378d064127c311299383afd31d0212a5cbe")
      override
          fun trainingJobDetails(trainingJobDetails: TrainingJobDetailsProperty.Builder.() -> Unit):
          Unit = trainingJobDetails(TrainingJobDetailsProperty(trainingJobDetails))

      override fun trainingObservations(trainingObservations: String) {
        cdkBuilder.trainingObservations(trainingObservations)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty,
    ) : CdkObject(cdkObject), TrainingDetailsProperty {
      override fun objectiveFunction(): Any? = unwrap(this).getObjectiveFunction()

      override fun trainingJobDetails(): Any? = unwrap(this).getTrainingJobDetails()

      override fun trainingObservations(): String? = unwrap(this).getTrainingObservations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty):
          TrainingDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingDetailsProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun additionalInformation(additionalInformation: IResolvable)

      public fun additionalInformation(additionalInformation: AdditionalInformationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9da26ad18c832edc81e508345e855b2a7047624f7601d753f67e31e4ed849a7")
      public
          fun additionalInformation(additionalInformation: AdditionalInformationProperty.Builder.() -> Unit)

      public fun businessDetails(businessDetails: IResolvable)

      public fun businessDetails(businessDetails: BusinessDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e284e3086325df9a0df3e932dfeafb29ff224ba991c0ac097163551b91ed5e5e")
      public fun businessDetails(businessDetails: BusinessDetailsProperty.Builder.() -> Unit)

      public fun evaluationDetails(evaluationDetails: IResolvable)

      public fun evaluationDetails(evaluationDetails: List<Any>)

      public fun evaluationDetails(vararg evaluationDetails: Any)

      public fun intendedUses(intendedUses: IResolvable)

      public fun intendedUses(intendedUses: IntendedUsesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bce6dff06486b481662c009fb93dcc10896aa53ef484ac6e06d2ad9b52cc3d5")
      public fun intendedUses(intendedUses: IntendedUsesProperty.Builder.() -> Unit)

      public fun modelOverview(modelOverview: IResolvable)

      public fun modelOverview(modelOverview: ModelOverviewProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d19f8a1c503753eafc93cbcec0f43f2972812bb3ed1fbaa1bd5231d2bbe19dc")
      public fun modelOverview(modelOverview: ModelOverviewProperty.Builder.() -> Unit)

      public fun modelPackageDetails(modelPackageDetails: IResolvable)

      public fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a62c3944517d40757e0fd6c7f75ee3f38b6d10d5796a19715d445827a229309d")
      public
          fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty.Builder.() -> Unit)

      public fun trainingDetails(trainingDetails: IResolvable)

      public fun trainingDetails(trainingDetails: TrainingDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43025e03b37eb5242f73face588aac78788711c6736b287967905c350e85877c")
      public fun trainingDetails(trainingDetails: TrainingDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty.builder()

      override fun additionalInformation(additionalInformation: IResolvable) {
        cdkBuilder.additionalInformation(additionalInformation.let(IResolvable::unwrap))
      }

      override fun additionalInformation(additionalInformation: AdditionalInformationProperty) {
        cdkBuilder.additionalInformation(additionalInformation.let(AdditionalInformationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9da26ad18c832edc81e508345e855b2a7047624f7601d753f67e31e4ed849a7")
      override
          fun additionalInformation(additionalInformation: AdditionalInformationProperty.Builder.() -> Unit):
          Unit = additionalInformation(AdditionalInformationProperty(additionalInformation))

      override fun businessDetails(businessDetails: IResolvable) {
        cdkBuilder.businessDetails(businessDetails.let(IResolvable::unwrap))
      }

      override fun businessDetails(businessDetails: BusinessDetailsProperty) {
        cdkBuilder.businessDetails(businessDetails.let(BusinessDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e284e3086325df9a0df3e932dfeafb29ff224ba991c0ac097163551b91ed5e5e")
      override fun businessDetails(businessDetails: BusinessDetailsProperty.Builder.() -> Unit):
          Unit = businessDetails(BusinessDetailsProperty(businessDetails))

      override fun evaluationDetails(evaluationDetails: IResolvable) {
        cdkBuilder.evaluationDetails(evaluationDetails.let(IResolvable::unwrap))
      }

      override fun evaluationDetails(evaluationDetails: List<Any>) {
        cdkBuilder.evaluationDetails(evaluationDetails)
      }

      override fun evaluationDetails(vararg evaluationDetails: Any): Unit =
          evaluationDetails(evaluationDetails.toList())

      override fun intendedUses(intendedUses: IResolvable) {
        cdkBuilder.intendedUses(intendedUses.let(IResolvable::unwrap))
      }

      override fun intendedUses(intendedUses: IntendedUsesProperty) {
        cdkBuilder.intendedUses(intendedUses.let(IntendedUsesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8bce6dff06486b481662c009fb93dcc10896aa53ef484ac6e06d2ad9b52cc3d5")
      override fun intendedUses(intendedUses: IntendedUsesProperty.Builder.() -> Unit): Unit =
          intendedUses(IntendedUsesProperty(intendedUses))

      override fun modelOverview(modelOverview: IResolvable) {
        cdkBuilder.modelOverview(modelOverview.let(IResolvable::unwrap))
      }

      override fun modelOverview(modelOverview: ModelOverviewProperty) {
        cdkBuilder.modelOverview(modelOverview.let(ModelOverviewProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d19f8a1c503753eafc93cbcec0f43f2972812bb3ed1fbaa1bd5231d2bbe19dc")
      override fun modelOverview(modelOverview: ModelOverviewProperty.Builder.() -> Unit): Unit =
          modelOverview(ModelOverviewProperty(modelOverview))

      override fun modelPackageDetails(modelPackageDetails: IResolvable) {
        cdkBuilder.modelPackageDetails(modelPackageDetails.let(IResolvable::unwrap))
      }

      override fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty) {
        cdkBuilder.modelPackageDetails(modelPackageDetails.let(ModelPackageDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a62c3944517d40757e0fd6c7f75ee3f38b6d10d5796a19715d445827a229309d")
      override
          fun modelPackageDetails(modelPackageDetails: ModelPackageDetailsProperty.Builder.() -> Unit):
          Unit = modelPackageDetails(ModelPackageDetailsProperty(modelPackageDetails))

      override fun trainingDetails(trainingDetails: IResolvable) {
        cdkBuilder.trainingDetails(trainingDetails.let(IResolvable::unwrap))
      }

      override fun trainingDetails(trainingDetails: TrainingDetailsProperty) {
        cdkBuilder.trainingDetails(trainingDetails.let(TrainingDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43025e03b37eb5242f73face588aac78788711c6736b287967905c350e85877c")
      override fun trainingDetails(trainingDetails: TrainingDetailsProperty.Builder.() -> Unit):
          Unit = trainingDetails(TrainingDetailsProperty(trainingDetails))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty,
    ) : CdkObject(cdkObject), ContentProperty {
      override fun additionalInformation(): Any? = unwrap(this).getAdditionalInformation()

      override fun businessDetails(): Any? = unwrap(this).getBusinessDetails()

      override fun evaluationDetails(): Any? = unwrap(this).getEvaluationDetails()

      override fun intendedUses(): Any? = unwrap(this).getIntendedUses()

      override fun modelOverview(): Any? = unwrap(this).getModelOverview()

      override fun modelPackageDetails(): Any? = unwrap(this).getModelPackageDetails()

      override fun trainingDetails(): Any? = unwrap(this).getTrainingDetails()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty):
          ContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ContentProperty
    }
  }

  public interface FunctionProperty {
    public fun condition(): String? = unwrap(this).getCondition()

    public fun facet(): String? = unwrap(this).getFacet()

    public fun function(): String? = unwrap(this).getFunction()

    @CdkDslMarker
    public interface Builder {
      public fun condition(condition: String)

      public fun facet(facet: String)

      public fun function(function: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty.builder()

      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      override fun facet(facet: String) {
        cdkBuilder.facet(facet)
      }

      override fun function(function: String) {
        cdkBuilder.function(function)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty,
    ) : CdkObject(cdkObject), FunctionProperty {
      override fun condition(): String? = unwrap(this).getCondition()

      override fun facet(): String? = unwrap(this).getFacet()

      override fun function(): String? = unwrap(this).getFunction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty):
          FunctionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.FunctionProperty
    }
  }

  public interface ModelPackageCreatorProperty {
    public fun userProfileName(): String? = unwrap(this).getUserProfileName()

    @CdkDslMarker
    public interface Builder {
      public fun userProfileName(userProfileName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty.builder()

      override fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty,
    ) : CdkObject(cdkObject), ModelPackageCreatorProperty {
      override fun userProfileName(): String? = unwrap(this).getUserProfileName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelPackageCreatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty):
          ModelPackageCreatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageCreatorProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.ModelPackageCreatorProperty
    }
  }

  public interface TrainingEnvironmentProperty {
    public fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun containerImage(containerImage: List<String>)

      public fun containerImage(vararg containerImage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty.builder()

      override fun containerImage(containerImage: List<String>) {
        cdkBuilder.containerImage(containerImage)
      }

      override fun containerImage(vararg containerImage: String): Unit =
          containerImage(containerImage.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty,
    ) : CdkObject(cdkObject), TrainingEnvironmentProperty {
      override fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty):
          TrainingEnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingEnvironmentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingEnvironmentProperty
    }
  }

  public interface AdditionalInformationProperty {
    public fun caveatsAndRecommendations(): String? = unwrap(this).getCaveatsAndRecommendations()

    public fun customDetails(): Any? = unwrap(this).getCustomDetails()

    public fun ethicalConsiderations(): String? = unwrap(this).getEthicalConsiderations()

    @CdkDslMarker
    public interface Builder {
      public fun caveatsAndRecommendations(caveatsAndRecommendations: String)

      public fun customDetails(customDetails: IResolvable)

      public fun customDetails(customDetails: Map<String, String>)

      public fun ethicalConsiderations(ethicalConsiderations: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty.builder()

      override fun caveatsAndRecommendations(caveatsAndRecommendations: String) {
        cdkBuilder.caveatsAndRecommendations(caveatsAndRecommendations)
      }

      override fun customDetails(customDetails: IResolvable) {
        cdkBuilder.customDetails(customDetails.let(IResolvable::unwrap))
      }

      override fun customDetails(customDetails: Map<String, String>) {
        cdkBuilder.customDetails(customDetails)
      }

      override fun ethicalConsiderations(ethicalConsiderations: String) {
        cdkBuilder.ethicalConsiderations(ethicalConsiderations)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty,
    ) : CdkObject(cdkObject), AdditionalInformationProperty {
      override fun caveatsAndRecommendations(): String? =
          unwrap(this).getCaveatsAndRecommendations()

      override fun customDetails(): Any? = unwrap(this).getCustomDetails()

      override fun ethicalConsiderations(): String? = unwrap(this).getEthicalConsiderations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdditionalInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty):
          AdditionalInformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalInformationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.AdditionalInformationProperty
    }
  }

  public interface UserContextProperty {
    public fun domainId(): String? = unwrap(this).getDomainId()

    public fun userProfileArn(): String? = unwrap(this).getUserProfileArn()

    public fun userProfileName(): String? = unwrap(this).getUserProfileName()

    @CdkDslMarker
    public interface Builder {
      public fun domainId(domainId: String)

      public fun userProfileArn(userProfileArn: String)

      public fun userProfileName(userProfileName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty.builder()

      override fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
      }

      override fun userProfileArn(userProfileArn: String) {
        cdkBuilder.userProfileArn(userProfileArn)
      }

      override fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty,
    ) : CdkObject(cdkObject), UserContextProperty {
      override fun domainId(): String? = unwrap(this).getDomainId()

      override fun userProfileArn(): String? = unwrap(this).getUserProfileArn()

      override fun userProfileName(): String? = unwrap(this).getUserProfileName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserContextProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty):
          UserContextProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserContextProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.UserContextProperty
    }
  }

  public interface TrainingHyperParameterProperty {
    public fun name(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty,
    ) : CdkObject(cdkObject), TrainingHyperParameterProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrainingHyperParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty):
          TrainingHyperParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrainingHyperParameterProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.TrainingHyperParameterProperty
    }
  }

  public interface InferenceSpecificationProperty {
    public fun containers(): Any

    @CdkDslMarker
    public interface Builder {
      public fun containers(containers: IResolvable)

      public fun containers(containers: List<Any>)

      public fun containers(vararg containers: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty.builder()

      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      override fun containers(vararg containers: Any): Unit = containers(containers.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty,
    ) : CdkObject(cdkObject), InferenceSpecificationProperty {
      override fun containers(): Any = unwrap(this).getContainers()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty):
          InferenceSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceSpecificationProperty
    }
  }

  public interface InferenceEnvironmentProperty {
    public fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun containerImage(containerImage: List<String>)

      public fun containerImage(vararg containerImage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty.builder()

      override fun containerImage(containerImage: List<String>) {
        cdkBuilder.containerImage(containerImage)
      }

      override fun containerImage(vararg containerImage: String): Unit =
          containerImage(containerImage.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty,
    ) : CdkObject(cdkObject), InferenceEnvironmentProperty {
      override fun containerImage(): List<String> = unwrap(this).getContainerImage() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty):
          InferenceEnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceEnvironmentProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnModelCard.InferenceEnvironmentProperty
    }
  }
}
