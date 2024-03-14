package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnMonitoringSchedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun attrMonitoringScheduleArn(): String = unwrap(this).getAttrMonitoringScheduleArn()

  public open fun endpointName(): String? = unwrap(this).getEndpointName()

  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  public open fun failureReason(): String? = unwrap(this).getFailureReason()

  public open fun failureReason(`value`: String) {
    unwrap(this).setFailureReason(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lastMonitoringExecutionSummary(): Any? =
      unwrap(this).getLastMonitoringExecutionSummary()

  public open fun lastMonitoringExecutionSummary(`value`: IResolvable) {
    unwrap(this).setLastMonitoringExecutionSummary(`value`.let(IResolvable::unwrap))
  }

  public open fun lastMonitoringExecutionSummary(`value`: MonitoringExecutionSummaryProperty) {
    unwrap(this).setLastMonitoringExecutionSummary(`value`.let(MonitoringExecutionSummaryProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f331edee71995e70c48184c99522a8118f0a39125d86992b268d5bf14ea3af5")
  public open
      fun lastMonitoringExecutionSummary(`value`: MonitoringExecutionSummaryProperty.Builder.() -> Unit):
      Unit = lastMonitoringExecutionSummary(MonitoringExecutionSummaryProperty(`value`))

  public open fun monitoringScheduleConfig(): Any = unwrap(this).getMonitoringScheduleConfig()

  public open fun monitoringScheduleConfig(`value`: IResolvable) {
    unwrap(this).setMonitoringScheduleConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun monitoringScheduleConfig(`value`: MonitoringScheduleConfigProperty) {
    unwrap(this).setMonitoringScheduleConfig(`value`.let(MonitoringScheduleConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec6011c5b8c3b1c446213e74e2dd81419db0edb9721cbeababeacd49b0c50deb")
  public open
      fun monitoringScheduleConfig(`value`: MonitoringScheduleConfigProperty.Builder.() -> Unit):
      Unit = monitoringScheduleConfig(MonitoringScheduleConfigProperty(`value`))

  public open fun monitoringScheduleName(): String = unwrap(this).getMonitoringScheduleName()

  public open fun monitoringScheduleName(`value`: String) {
    unwrap(this).setMonitoringScheduleName(`value`)
  }

  public open fun monitoringScheduleStatus(): String? = unwrap(this).getMonitoringScheduleStatus()

  public open fun monitoringScheduleStatus(`value`: String) {
    unwrap(this).setMonitoringScheduleStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun endpointName(endpointName: String)

    public fun failureReason(failureReason: String)

    public fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable)

    public
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: MonitoringExecutionSummaryProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf990fcb08c70c985710d65a5930fd050b864215a4d6dc4fc7a97395e34f7cca")
    public
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: MonitoringExecutionSummaryProperty.Builder.() -> Unit)

    public fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable)

    public fun monitoringScheduleConfig(monitoringScheduleConfig: MonitoringScheduleConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1ab6f70010fef6f64cbb242a1c0947658ee2bf09f5fc6940a6b15c5fcd0ea1")
    public
        fun monitoringScheduleConfig(monitoringScheduleConfig: MonitoringScheduleConfigProperty.Builder.() -> Unit)

    public fun monitoringScheduleName(monitoringScheduleName: String)

    public fun monitoringScheduleStatus(monitoringScheduleStatus: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.Builder
        = software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.Builder.create(scope, id)

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun failureReason(failureReason: String) {
      cdkBuilder.failureReason(failureReason)
    }

    override fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: IResolvable) {
      cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.let(IResolvable::unwrap))
    }

    override
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: MonitoringExecutionSummaryProperty) {
      cdkBuilder.lastMonitoringExecutionSummary(lastMonitoringExecutionSummary.let(MonitoringExecutionSummaryProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf990fcb08c70c985710d65a5930fd050b864215a4d6dc4fc7a97395e34f7cca")
    override
        fun lastMonitoringExecutionSummary(lastMonitoringExecutionSummary: MonitoringExecutionSummaryProperty.Builder.() -> Unit):
        Unit =
        lastMonitoringExecutionSummary(MonitoringExecutionSummaryProperty(lastMonitoringExecutionSummary))

    override fun monitoringScheduleConfig(monitoringScheduleConfig: IResolvable) {
      cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig.let(IResolvable::unwrap))
    }

    override
        fun monitoringScheduleConfig(monitoringScheduleConfig: MonitoringScheduleConfigProperty) {
      cdkBuilder.monitoringScheduleConfig(monitoringScheduleConfig.let(MonitoringScheduleConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1ab6f70010fef6f64cbb242a1c0947658ee2bf09f5fc6940a6b15c5fcd0ea1")
    override
        fun monitoringScheduleConfig(monitoringScheduleConfig: MonitoringScheduleConfigProperty.Builder.() -> Unit):
        Unit = monitoringScheduleConfig(MonitoringScheduleConfigProperty(monitoringScheduleConfig))

    override fun monitoringScheduleName(monitoringScheduleName: String) {
      cdkBuilder.monitoringScheduleName(monitoringScheduleName)
    }

    override fun monitoringScheduleStatus(monitoringScheduleStatus: String) {
      cdkBuilder.monitoringScheduleStatus(monitoringScheduleStatus)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMonitoringSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMonitoringSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule):
        CfnMonitoringSchedule = CfnMonitoringSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnMonitoringSchedule):
        software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule = wrapped.cdkObject
  }

  public interface StoppingConditionProperty {
    public fun maxRuntimeInSeconds(): Number

    public interface Builder {
      public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty.builder()

      override fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
        cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty,
    ) : StoppingConditionProperty {
      override fun maxRuntimeInSeconds(): Number = unwrap(this).getMaxRuntimeInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StoppingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty):
          StoppingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoppingConditionProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BatchTransformInputProperty {
    public fun dataCapturedDestinationS3Uri(): String

    public fun datasetFormat(): Any

    public fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

    public fun localPath(): String

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    public interface Builder {
      public fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String)

      public fun datasetFormat(datasetFormat: IResolvable)

      public fun datasetFormat(datasetFormat: DatasetFormatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e1de90d889696aab90fdc83d5b3ac4a95499185210d1ae296f177b70867162e")
      public fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit)

      public fun excludeFeaturesAttribute(excludeFeaturesAttribute: String)

      public fun localPath(localPath: String)

      public fun s3DataDistributionType(s3DataDistributionType: String)

      public fun s3InputMode(s3InputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty.builder()

      override fun dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri: String) {
        cdkBuilder.dataCapturedDestinationS3Uri(dataCapturedDestinationS3Uri)
      }

      override fun datasetFormat(datasetFormat: IResolvable) {
        cdkBuilder.datasetFormat(datasetFormat.let(IResolvable::unwrap))
      }

      override fun datasetFormat(datasetFormat: DatasetFormatProperty) {
        cdkBuilder.datasetFormat(datasetFormat.let(DatasetFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e1de90d889696aab90fdc83d5b3ac4a95499185210d1ae296f177b70867162e")
      override fun datasetFormat(datasetFormat: DatasetFormatProperty.Builder.() -> Unit): Unit =
          datasetFormat(DatasetFormatProperty(datasetFormat))

      override fun excludeFeaturesAttribute(excludeFeaturesAttribute: String) {
        cdkBuilder.excludeFeaturesAttribute(excludeFeaturesAttribute)
      }

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty,
    ) : BatchTransformInputProperty {
      override fun dataCapturedDestinationS3Uri(): String =
          unwrap(this).getDataCapturedDestinationS3Uri()

      override fun datasetFormat(): Any = unwrap(this).getDatasetFormat()

      override fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BatchTransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty):
          BatchTransformInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchTransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BatchTransformInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface JsonProperty {
    public fun line(): Any? = unwrap(this).getLine()

    public interface Builder {
      public fun line(line: Boolean)

      public fun line(line: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty.builder()

      override fun line(line: Boolean) {
        cdkBuilder.line(line)
      }

      override fun line(line: IResolvable) {
        cdkBuilder.line(line.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty,
    ) : JsonProperty {
      override fun line(): Any? = unwrap(this).getLine()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty):
          JsonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.JsonProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EndpointInputProperty {
    public fun endpointName(): String

    public fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

    public fun localPath(): String

    public fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

    public fun s3InputMode(): String? = unwrap(this).getS3InputMode()

    public interface Builder {
      public fun endpointName(endpointName: String)

      public fun excludeFeaturesAttribute(excludeFeaturesAttribute: String)

      public fun localPath(localPath: String)

      public fun s3DataDistributionType(s3DataDistributionType: String)

      public fun s3InputMode(s3InputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty.builder()

      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      override fun excludeFeaturesAttribute(excludeFeaturesAttribute: String) {
        cdkBuilder.excludeFeaturesAttribute(excludeFeaturesAttribute)
      }

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
      }

      override fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty,
    ) : EndpointInputProperty {
      override fun endpointName(): String = unwrap(this).getEndpointName()

      override fun excludeFeaturesAttribute(): String? = unwrap(this).getExcludeFeaturesAttribute()

      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun s3DataDistributionType(): String? = unwrap(this).getS3DataDistributionType()

      override fun s3InputMode(): String? = unwrap(this).getS3InputMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty):
          EndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.EndpointInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringAppSpecificationProperty {
    public fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
        emptyList()

    public fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
        emptyList()

    public fun imageUri(): String

    public fun postAnalyticsProcessorSourceUri(): String? =
        unwrap(this).getPostAnalyticsProcessorSourceUri()

    public fun recordPreprocessorSourceUri(): String? =
        unwrap(this).getRecordPreprocessorSourceUri()

    public interface Builder {
      public fun containerArguments(containerArguments: List<String>)

      public fun containerEntrypoint(containerEntrypoint: List<String>)

      public fun imageUri(imageUri: String)

      public fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String)

      public fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty.builder()

      override fun containerArguments(containerArguments: List<String>) {
        cdkBuilder.containerArguments(containerArguments)
      }

      override fun containerEntrypoint(containerEntrypoint: List<String>) {
        cdkBuilder.containerEntrypoint(containerEntrypoint)
      }

      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      override fun postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri: String) {
        cdkBuilder.postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri)
      }

      override fun recordPreprocessorSourceUri(recordPreprocessorSourceUri: String) {
        cdkBuilder.recordPreprocessorSourceUri(recordPreprocessorSourceUri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty,
    ) : MonitoringAppSpecificationProperty {
      override fun containerArguments(): List<String> = unwrap(this).getContainerArguments() ?:
          emptyList()

      override fun containerEntrypoint(): List<String> = unwrap(this).getContainerEntrypoint() ?:
          emptyList()

      override fun imageUri(): String = unwrap(this).getImageUri()

      override fun postAnalyticsProcessorSourceUri(): String? =
          unwrap(this).getPostAnalyticsProcessorSourceUri()

      override fun recordPreprocessorSourceUri(): String? =
          unwrap(this).getRecordPreprocessorSourceUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MonitoringAppSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty):
          MonitoringAppSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringAppSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringOutputConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun monitoringOutputs(): Any

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun monitoringOutputs(monitoringOutputs: IResolvable)

      public fun monitoringOutputs(monitoringOutputs: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun monitoringOutputs(monitoringOutputs: IResolvable) {
        cdkBuilder.monitoringOutputs(monitoringOutputs.let(IResolvable::unwrap))
      }

      override fun monitoringOutputs(monitoringOutputs: List<Any>) {
        cdkBuilder.monitoringOutputs(monitoringOutputs)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty,
    ) : MonitoringOutputConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun monitoringOutputs(): Any = unwrap(this).getMonitoringOutputs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty):
          MonitoringOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringInputProperty {
    public fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

    public fun endpointInput(): Any? = unwrap(this).getEndpointInput()

    public interface Builder {
      public fun batchTransformInput(batchTransformInput: IResolvable)

      public fun batchTransformInput(batchTransformInput: BatchTransformInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db41791840963983b97700ef7ac73e98d09b85c6db56bd096e155140e7f40940")
      public
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit)

      public fun endpointInput(endpointInput: IResolvable)

      public fun endpointInput(endpointInput: EndpointInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c253a1262d85ceceb38075f6ddcf0a394d94ac975e8b3c6196b29e44dccf0b73")
      public fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty.builder()

      override fun batchTransformInput(batchTransformInput: IResolvable) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(IResolvable::unwrap))
      }

      override fun batchTransformInput(batchTransformInput: BatchTransformInputProperty) {
        cdkBuilder.batchTransformInput(batchTransformInput.let(BatchTransformInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db41791840963983b97700ef7ac73e98d09b85c6db56bd096e155140e7f40940")
      override
          fun batchTransformInput(batchTransformInput: BatchTransformInputProperty.Builder.() -> Unit):
          Unit = batchTransformInput(BatchTransformInputProperty(batchTransformInput))

      override fun endpointInput(endpointInput: IResolvable) {
        cdkBuilder.endpointInput(endpointInput.let(IResolvable::unwrap))
      }

      override fun endpointInput(endpointInput: EndpointInputProperty) {
        cdkBuilder.endpointInput(endpointInput.let(EndpointInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c253a1262d85ceceb38075f6ddcf0a394d94ac975e8b3c6196b29e44dccf0b73")
      override fun endpointInput(endpointInput: EndpointInputProperty.Builder.() -> Unit): Unit =
          endpointInput(EndpointInputProperty(endpointInput))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty,
    ) : MonitoringInputProperty {
      override fun batchTransformInput(): Any? = unwrap(this).getBatchTransformInput()

      override fun endpointInput(): Any? = unwrap(this).getEndpointInput()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty):
          MonitoringInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnets(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun subnets(subnets: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.VpcConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringExecutionSummaryProperty {
    public fun creationTime(): String

    public fun endpointName(): String? = unwrap(this).getEndpointName()

    public fun failureReason(): String? = unwrap(this).getFailureReason()

    public fun lastModifiedTime(): String

    public fun monitoringExecutionStatus(): String

    public fun monitoringScheduleName(): String

    public fun processingJobArn(): String? = unwrap(this).getProcessingJobArn()

    public fun scheduledTime(): String

    public interface Builder {
      public fun creationTime(creationTime: String)

      public fun endpointName(endpointName: String)

      public fun failureReason(failureReason: String)

      public fun lastModifiedTime(lastModifiedTime: String)

      public fun monitoringExecutionStatus(monitoringExecutionStatus: String)

      public fun monitoringScheduleName(monitoringScheduleName: String)

      public fun processingJobArn(processingJobArn: String)

      public fun scheduledTime(scheduledTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty.builder()

      override fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
      }

      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      override fun failureReason(failureReason: String) {
        cdkBuilder.failureReason(failureReason)
      }

      override fun lastModifiedTime(lastModifiedTime: String) {
        cdkBuilder.lastModifiedTime(lastModifiedTime)
      }

      override fun monitoringExecutionStatus(monitoringExecutionStatus: String) {
        cdkBuilder.monitoringExecutionStatus(monitoringExecutionStatus)
      }

      override fun monitoringScheduleName(monitoringScheduleName: String) {
        cdkBuilder.monitoringScheduleName(monitoringScheduleName)
      }

      override fun processingJobArn(processingJobArn: String) {
        cdkBuilder.processingJobArn(processingJobArn)
      }

      override fun scheduledTime(scheduledTime: String) {
        cdkBuilder.scheduledTime(scheduledTime)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty,
    ) : MonitoringExecutionSummaryProperty {
      override fun creationTime(): String = unwrap(this).getCreationTime()

      override fun endpointName(): String? = unwrap(this).getEndpointName()

      override fun failureReason(): String? = unwrap(this).getFailureReason()

      override fun lastModifiedTime(): String = unwrap(this).getLastModifiedTime()

      override fun monitoringExecutionStatus(): String = unwrap(this).getMonitoringExecutionStatus()

      override fun monitoringScheduleName(): String = unwrap(this).getMonitoringScheduleName()

      override fun processingJobArn(): String? = unwrap(this).getProcessingJobArn()

      override fun scheduledTime(): String = unwrap(this).getScheduledTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MonitoringExecutionSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty):
          MonitoringExecutionSummaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringExecutionSummaryProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringExecutionSummaryProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringOutputProperty {
    public fun s3Output(): Any

    public interface Builder {
      public fun s3Output(s3Output: IResolvable)

      public fun s3Output(s3Output: S3OutputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48d428be201223df59ac91d45718e8b034447a634441c6ba2054abda24cf6a6a")
      public fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty.builder()

      override fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output.let(IResolvable::unwrap))
      }

      override fun s3Output(s3Output: S3OutputProperty) {
        cdkBuilder.s3Output(s3Output.let(S3OutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48d428be201223df59ac91d45718e8b034447a634441c6ba2054abda24cf6a6a")
      override fun s3Output(s3Output: S3OutputProperty.Builder.() -> Unit): Unit =
          s3Output(S3OutputProperty(s3Output))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty,
    ) : MonitoringOutputProperty {
      override fun s3Output(): Any = unwrap(this).getS3Output()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty):
          MonitoringOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConstraintsResourceProperty {
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    public interface Builder {
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty.builder()

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty,
    ) : ConstraintsResourceProperty {
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConstraintsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty):
          ConstraintsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConstraintsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CsvProperty {
    public fun `header`(): Any? = unwrap(this).getHeader()

    public interface Builder {
      public fun `header`(`header`: Boolean)

      public fun `header`(`header`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty.builder()

      override fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
      }

      override fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty,
    ) : CsvProperty {
      override fun `header`(): Any? = unwrap(this).getHeader()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty):
          CsvProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.CsvProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MonitoringJobDefinitionProperty {
    public fun baselineConfig(): Any? = unwrap(this).getBaselineConfig()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun monitoringAppSpecification(): Any

    public fun monitoringInputs(): Any

    public fun monitoringOutputConfig(): Any

    public fun monitoringResources(): Any

    public fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

    public fun roleArn(): String

    public fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()

    public interface Builder {
      public fun baselineConfig(baselineConfig: IResolvable)

      public fun baselineConfig(baselineConfig: BaselineConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b25d852cd5d3c2a37f56c5a52e7ca9a2a71206ade16624d6cc4a9b0beff29c31")
      public fun baselineConfig(baselineConfig: BaselineConfigProperty.Builder.() -> Unit)

      public fun environment(environment: IResolvable)

      public fun environment(environment: Map<String, String>)

      public fun monitoringAppSpecification(monitoringAppSpecification: IResolvable)

      public
          fun monitoringAppSpecification(monitoringAppSpecification: MonitoringAppSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1936482f308087d02f3cface6907e34a93dd1d32475dfba96e4eb0a6effe545")
      public
          fun monitoringAppSpecification(monitoringAppSpecification: MonitoringAppSpecificationProperty.Builder.() -> Unit)

      public fun monitoringInputs(monitoringInputs: IResolvable)

      public fun monitoringInputs(monitoringInputs: List<Any>)

      public fun monitoringOutputConfig(monitoringOutputConfig: IResolvable)

      public fun monitoringOutputConfig(monitoringOutputConfig: MonitoringOutputConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5cfd4507a90781185c4942290f164ac1a2cb7d1f81c715151b4bfa5df11f00c")
      public
          fun monitoringOutputConfig(monitoringOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit)

      public fun monitoringResources(monitoringResources: IResolvable)

      public fun monitoringResources(monitoringResources: MonitoringResourcesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8022d69c22dc6522ee8bdf8ab2a559c644a65bc1751c6bef76f1b088999f08ea")
      public
          fun monitoringResources(monitoringResources: MonitoringResourcesProperty.Builder.() -> Unit)

      public fun networkConfig(networkConfig: IResolvable)

      public fun networkConfig(networkConfig: NetworkConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1e58e1787bc2974f9606bd97a8f34e0a4a7e268cc75127d72db1c607ff1e5c")
      public fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)

      public fun stoppingCondition(stoppingCondition: IResolvable)

      public fun stoppingCondition(stoppingCondition: StoppingConditionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb17ece77e3617d634427f12d51a676b359b03f74b1d2134d41d8f7f1c00f89d")
      public fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty.builder()

      override fun baselineConfig(baselineConfig: IResolvable) {
        cdkBuilder.baselineConfig(baselineConfig.let(IResolvable::unwrap))
      }

      override fun baselineConfig(baselineConfig: BaselineConfigProperty) {
        cdkBuilder.baselineConfig(baselineConfig.let(BaselineConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b25d852cd5d3c2a37f56c5a52e7ca9a2a71206ade16624d6cc4a9b0beff29c31")
      override fun baselineConfig(baselineConfig: BaselineConfigProperty.Builder.() -> Unit): Unit =
          baselineConfig(BaselineConfigProperty(baselineConfig))

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      override fun monitoringAppSpecification(monitoringAppSpecification: IResolvable) {
        cdkBuilder.monitoringAppSpecification(monitoringAppSpecification.let(IResolvable::unwrap))
      }

      override
          fun monitoringAppSpecification(monitoringAppSpecification: MonitoringAppSpecificationProperty) {
        cdkBuilder.monitoringAppSpecification(monitoringAppSpecification.let(MonitoringAppSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1936482f308087d02f3cface6907e34a93dd1d32475dfba96e4eb0a6effe545")
      override
          fun monitoringAppSpecification(monitoringAppSpecification: MonitoringAppSpecificationProperty.Builder.() -> Unit):
          Unit =
          monitoringAppSpecification(MonitoringAppSpecificationProperty(monitoringAppSpecification))

      override fun monitoringInputs(monitoringInputs: IResolvable) {
        cdkBuilder.monitoringInputs(monitoringInputs.let(IResolvable::unwrap))
      }

      override fun monitoringInputs(monitoringInputs: List<Any>) {
        cdkBuilder.monitoringInputs(monitoringInputs)
      }

      override fun monitoringOutputConfig(monitoringOutputConfig: IResolvable) {
        cdkBuilder.monitoringOutputConfig(monitoringOutputConfig.let(IResolvable::unwrap))
      }

      override fun monitoringOutputConfig(monitoringOutputConfig: MonitoringOutputConfigProperty) {
        cdkBuilder.monitoringOutputConfig(monitoringOutputConfig.let(MonitoringOutputConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5cfd4507a90781185c4942290f164ac1a2cb7d1f81c715151b4bfa5df11f00c")
      override
          fun monitoringOutputConfig(monitoringOutputConfig: MonitoringOutputConfigProperty.Builder.() -> Unit):
          Unit = monitoringOutputConfig(MonitoringOutputConfigProperty(monitoringOutputConfig))

      override fun monitoringResources(monitoringResources: IResolvable) {
        cdkBuilder.monitoringResources(monitoringResources.let(IResolvable::unwrap))
      }

      override fun monitoringResources(monitoringResources: MonitoringResourcesProperty) {
        cdkBuilder.monitoringResources(monitoringResources.let(MonitoringResourcesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8022d69c22dc6522ee8bdf8ab2a559c644a65bc1751c6bef76f1b088999f08ea")
      override
          fun monitoringResources(monitoringResources: MonitoringResourcesProperty.Builder.() -> Unit):
          Unit = monitoringResources(MonitoringResourcesProperty(monitoringResources))

      override fun networkConfig(networkConfig: IResolvable) {
        cdkBuilder.networkConfig(networkConfig.let(IResolvable::unwrap))
      }

      override fun networkConfig(networkConfig: NetworkConfigProperty) {
        cdkBuilder.networkConfig(networkConfig.let(NetworkConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1e58e1787bc2974f9606bd97a8f34e0a4a7e268cc75127d72db1c607ff1e5c")
      override fun networkConfig(networkConfig: NetworkConfigProperty.Builder.() -> Unit): Unit =
          networkConfig(NetworkConfigProperty(networkConfig))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun stoppingCondition(stoppingCondition: IResolvable) {
        cdkBuilder.stoppingCondition(stoppingCondition.let(IResolvable::unwrap))
      }

      override fun stoppingCondition(stoppingCondition: StoppingConditionProperty) {
        cdkBuilder.stoppingCondition(stoppingCondition.let(StoppingConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb17ece77e3617d634427f12d51a676b359b03f74b1d2134d41d8f7f1c00f89d")
      override
          fun stoppingCondition(stoppingCondition: StoppingConditionProperty.Builder.() -> Unit):
          Unit = stoppingCondition(StoppingConditionProperty(stoppingCondition))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty,
    ) : MonitoringJobDefinitionProperty {
      override fun baselineConfig(): Any? = unwrap(this).getBaselineConfig()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun monitoringAppSpecification(): Any = unwrap(this).getMonitoringAppSpecification()

      override fun monitoringInputs(): Any = unwrap(this).getMonitoringInputs()

      override fun monitoringOutputConfig(): Any = unwrap(this).getMonitoringOutputConfig()

      override fun monitoringResources(): Any = unwrap(this).getMonitoringResources()

      override fun networkConfig(): Any? = unwrap(this).getNetworkConfig()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun stoppingCondition(): Any? = unwrap(this).getStoppingCondition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringJobDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty):
          MonitoringJobDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringJobDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringResourcesProperty {
    public fun clusterConfig(): Any

    public interface Builder {
      public fun clusterConfig(clusterConfig: IResolvable)

      public fun clusterConfig(clusterConfig: ClusterConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d2b692d1210ed45b37baed02724a97982292097ce28b4a791ca0767901a580d")
      public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty.builder()

      override fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig.let(IResolvable::unwrap))
      }

      override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d2b692d1210ed45b37baed02724a97982292097ce28b4a791ca0767901a580d")
      override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
          clusterConfig(ClusterConfigProperty(clusterConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty,
    ) : MonitoringResourcesProperty {
      override fun clusterConfig(): Any = unwrap(this).getClusterConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty):
          MonitoringResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatasetFormatProperty {
    public fun csv(): Any? = unwrap(this).getCsv()

    public fun json(): Any? = unwrap(this).getJson()

    public fun parquet(): Any? = unwrap(this).getParquet()

    public interface Builder {
      public fun csv(csv: IResolvable)

      public fun csv(csv: CsvProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("584118a065f1e778d9fc5d7875fbad8a47859971d25053a99db55e7f4427151f")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)

      public fun json(json: IResolvable)

      public fun json(json: JsonProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27cbe0d83c6f9d282dc965ffde94c2e6a7426393149c5c419f22f80d47c0cbda")
      public fun json(json: JsonProperty.Builder.() -> Unit)

      public fun parquet(parquet: Boolean)

      public fun parquet(parquet: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty.builder()

      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("584118a065f1e778d9fc5d7875fbad8a47859971d25053a99db55e7f4427151f")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      override fun json(json: JsonProperty) {
        cdkBuilder.json(json.let(JsonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27cbe0d83c6f9d282dc965ffde94c2e6a7426393149c5c419f22f80d47c0cbda")
      override fun json(json: JsonProperty.Builder.() -> Unit): Unit = json(JsonProperty(json))

      override fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
      }

      override fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty,
    ) : DatasetFormatProperty {
      override fun csv(): Any? = unwrap(this).getCsv()

      override fun json(): Any? = unwrap(this).getJson()

      override fun parquet(): Any? = unwrap(this).getParquet()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty):
          DatasetFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetFormatProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.DatasetFormatProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClusterConfigProperty {
    public fun instanceCount(): Number

    public fun instanceType(): String

    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    public fun volumeSizeInGb(): Number

    public interface Builder {
      public fun instanceCount(instanceCount: Number)

      public fun instanceType(instanceType: String)

      public fun volumeKmsKeyId(volumeKmsKeyId: String)

      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty.builder()

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty,
    ) : ClusterConfigProperty {
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty):
          ClusterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ClusterConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatisticsResourceProperty {
    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    public interface Builder {
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty.builder()

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty,
    ) : StatisticsResourceProperty {
      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty):
          StatisticsResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatisticsResourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScheduleConfigProperty {
    public fun dataAnalysisEndTime(): String? = unwrap(this).getDataAnalysisEndTime()

    public fun dataAnalysisStartTime(): String? = unwrap(this).getDataAnalysisStartTime()

    public fun scheduleExpression(): String

    public interface Builder {
      public fun dataAnalysisEndTime(dataAnalysisEndTime: String)

      public fun dataAnalysisStartTime(dataAnalysisStartTime: String)

      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty.builder()

      override fun dataAnalysisEndTime(dataAnalysisEndTime: String) {
        cdkBuilder.dataAnalysisEndTime(dataAnalysisEndTime)
      }

      override fun dataAnalysisStartTime(dataAnalysisStartTime: String) {
        cdkBuilder.dataAnalysisStartTime(dataAnalysisStartTime)
      }

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty,
    ) : ScheduleConfigProperty {
      override fun dataAnalysisEndTime(): String? = unwrap(this).getDataAnalysisEndTime()

      override fun dataAnalysisStartTime(): String? = unwrap(this).getDataAnalysisStartTime()

      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty):
          ScheduleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ScheduleConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3OutputProperty {
    public fun localPath(): String

    public fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

    public fun s3Uri(): String

    public interface Builder {
      public fun localPath(localPath: String)

      public fun s3UploadMode(s3UploadMode: String)

      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty.builder()

      override fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
      }

      override fun s3UploadMode(s3UploadMode: String) {
        cdkBuilder.s3UploadMode(s3UploadMode)
      }

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty,
    ) : S3OutputProperty {
      override fun localPath(): String = unwrap(this).getLocalPath()

      override fun s3UploadMode(): String? = unwrap(this).getS3UploadMode()

      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty):
          S3OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.S3OutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BaselineConfigProperty {
    public fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

    public fun statisticsResource(): Any? = unwrap(this).getStatisticsResource()

    public interface Builder {
      public fun constraintsResource(constraintsResource: IResolvable)

      public fun constraintsResource(constraintsResource: ConstraintsResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a9519e03630673bb7da9627f7020656378dfcca99f79101f445540f36e8101")
      public
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit)

      public fun statisticsResource(statisticsResource: IResolvable)

      public fun statisticsResource(statisticsResource: StatisticsResourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92d3382c0ab7be9dec1b304b69e9f65d03676c7c3db097baeb527474f5116586")
      public
          fun statisticsResource(statisticsResource: StatisticsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty.builder()

      override fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource.let(IResolvable::unwrap))
      }

      override fun constraintsResource(constraintsResource: ConstraintsResourceProperty) {
        cdkBuilder.constraintsResource(constraintsResource.let(ConstraintsResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60a9519e03630673bb7da9627f7020656378dfcca99f79101f445540f36e8101")
      override
          fun constraintsResource(constraintsResource: ConstraintsResourceProperty.Builder.() -> Unit):
          Unit = constraintsResource(ConstraintsResourceProperty(constraintsResource))

      override fun statisticsResource(statisticsResource: IResolvable) {
        cdkBuilder.statisticsResource(statisticsResource.let(IResolvable::unwrap))
      }

      override fun statisticsResource(statisticsResource: StatisticsResourceProperty) {
        cdkBuilder.statisticsResource(statisticsResource.let(StatisticsResourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92d3382c0ab7be9dec1b304b69e9f65d03676c7c3db097baeb527474f5116586")
      override
          fun statisticsResource(statisticsResource: StatisticsResourceProperty.Builder.() -> Unit):
          Unit = statisticsResource(StatisticsResourceProperty(statisticsResource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty,
    ) : BaselineConfigProperty {
      override fun constraintsResource(): Any? = unwrap(this).getConstraintsResource()

      override fun statisticsResource(): Any? = unwrap(this).getStatisticsResource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BaselineConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty):
          BaselineConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringScheduleConfigProperty {
    public fun monitoringJobDefinition(): Any? = unwrap(this).getMonitoringJobDefinition()

    public fun monitoringJobDefinitionName(): String? =
        unwrap(this).getMonitoringJobDefinitionName()

    public fun monitoringType(): String? = unwrap(this).getMonitoringType()

    public fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()

    public interface Builder {
      public fun monitoringJobDefinition(monitoringJobDefinition: IResolvable)

      public fun monitoringJobDefinition(monitoringJobDefinition: MonitoringJobDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fda202f7b69d1cb776bb4b7cf269807da2d45327687f5e6ed6c4d3ac077147e")
      public
          fun monitoringJobDefinition(monitoringJobDefinition: MonitoringJobDefinitionProperty.Builder.() -> Unit)

      public fun monitoringJobDefinitionName(monitoringJobDefinitionName: String)

      public fun monitoringType(monitoringType: String)

      public fun scheduleConfig(scheduleConfig: IResolvable)

      public fun scheduleConfig(scheduleConfig: ScheduleConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4171e772520d95691b15ef908333ba913df631dbe57a741ae90235c7af47092")
      public fun scheduleConfig(scheduleConfig: ScheduleConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty.builder()

      override fun monitoringJobDefinition(monitoringJobDefinition: IResolvable) {
        cdkBuilder.monitoringJobDefinition(monitoringJobDefinition.let(IResolvable::unwrap))
      }

      override
          fun monitoringJobDefinition(monitoringJobDefinition: MonitoringJobDefinitionProperty) {
        cdkBuilder.monitoringJobDefinition(monitoringJobDefinition.let(MonitoringJobDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fda202f7b69d1cb776bb4b7cf269807da2d45327687f5e6ed6c4d3ac077147e")
      override
          fun monitoringJobDefinition(monitoringJobDefinition: MonitoringJobDefinitionProperty.Builder.() -> Unit):
          Unit = monitoringJobDefinition(MonitoringJobDefinitionProperty(monitoringJobDefinition))

      override fun monitoringJobDefinitionName(monitoringJobDefinitionName: String) {
        cdkBuilder.monitoringJobDefinitionName(monitoringJobDefinitionName)
      }

      override fun monitoringType(monitoringType: String) {
        cdkBuilder.monitoringType(monitoringType)
      }

      override fun scheduleConfig(scheduleConfig: IResolvable) {
        cdkBuilder.scheduleConfig(scheduleConfig.let(IResolvable::unwrap))
      }

      override fun scheduleConfig(scheduleConfig: ScheduleConfigProperty) {
        cdkBuilder.scheduleConfig(scheduleConfig.let(ScheduleConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4171e772520d95691b15ef908333ba913df631dbe57a741ae90235c7af47092")
      override fun scheduleConfig(scheduleConfig: ScheduleConfigProperty.Builder.() -> Unit): Unit =
          scheduleConfig(ScheduleConfigProperty(scheduleConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty,
    ) : MonitoringScheduleConfigProperty {
      override fun monitoringJobDefinition(): Any? = unwrap(this).getMonitoringJobDefinition()

      override fun monitoringJobDefinitionName(): String? =
          unwrap(this).getMonitoringJobDefinitionName()

      override fun monitoringType(): String? = unwrap(this).getMonitoringType()

      override fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringScheduleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty):
          MonitoringScheduleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringScheduleConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringScheduleConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkConfigProperty {
    public fun enableInterContainerTrafficEncryption(): Any? =
        unwrap(this).getEnableInterContainerTrafficEncryption()

    public fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

    public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

    public interface Builder {
      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean)

      public
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable)

      public fun enableNetworkIsolation(enableNetworkIsolation: Boolean)

      public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable)

      public fun vpcConfig(vpcConfig: IResolvable)

      public fun vpcConfig(vpcConfig: VpcConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2e7276d2564e95ade14267cdcbe03b97ea04d75d2704e5547106562dd53be4f")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty.builder()

      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
      }

      override
          fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
        cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption.let(IResolvable::unwrap))
      }

      override fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
      }

      override fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation.let(IResolvable::unwrap))
      }

      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2e7276d2564e95ade14267cdcbe03b97ea04d75d2704e5547106562dd53be4f")
      override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty,
    ) : NetworkConfigProperty {
      override fun enableInterContainerTrafficEncryption(): Any? =
          unwrap(this).getEnableInterContainerTrafficEncryption()

      override fun enableNetworkIsolation(): Any? = unwrap(this).getEnableNetworkIsolation()

      override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty):
          NetworkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
