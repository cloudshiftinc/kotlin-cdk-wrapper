package io.cloudshiftdev.awscdk.services.iotfleetwise

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCampaign internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun action(): String = unwrap(this).getAction()

  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun collectionScheme(): Any = unwrap(this).getCollectionScheme()

  public open fun collectionScheme(`value`: IResolvable) {
    unwrap(this).setCollectionScheme(`value`.let(IResolvable::unwrap))
  }

  public open fun collectionScheme(`value`: CollectionSchemeProperty) {
    unwrap(this).setCollectionScheme(`value`.let(CollectionSchemeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe7179166329cb94f995f1cfded061bed66608388e53c06cfa9ec3f60eef345b")
  public open fun collectionScheme(`value`: CollectionSchemeProperty.Builder.() -> Unit): Unit =
      collectionScheme(CollectionSchemeProperty(`value`))

  public open fun compression(): String? = unwrap(this).getCompression()

  public open fun compression(`value`: String) {
    unwrap(this).setCompression(`value`)
  }

  public open fun dataDestinationConfigs(): Any? = unwrap(this).getDataDestinationConfigs()

  public open fun dataDestinationConfigs(`value`: IResolvable) {
    unwrap(this).setDataDestinationConfigs(`value`.let(IResolvable::unwrap))
  }

  public open fun dataDestinationConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setDataDestinationConfigs(__idx_ac66f0)
  }

  public open fun dataDestinationConfigs(vararg __idx_ac66f0: Any): Unit =
      dataDestinationConfigs(__idx_ac66f0.toList())

  public open fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
      emptyList()

  public open fun dataExtraDimensions(`value`: List<String>) {
    unwrap(this).setDataExtraDimensions(`value`)
  }

  public open fun dataExtraDimensions(vararg `value`: String): Unit =
      dataExtraDimensions(`value`.toList())

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun diagnosticsMode(): String? = unwrap(this).getDiagnosticsMode()

  public open fun diagnosticsMode(`value`: String) {
    unwrap(this).setDiagnosticsMode(`value`)
  }

  public open fun expiryTime(): String? = unwrap(this).getExpiryTime()

  public open fun expiryTime(`value`: String) {
    unwrap(this).setExpiryTime(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun postTriggerCollectionDuration(): Number? =
      unwrap(this).getPostTriggerCollectionDuration()

  public open fun postTriggerCollectionDuration(`value`: Number) {
    unwrap(this).setPostTriggerCollectionDuration(`value`)
  }

  public open fun priority(): Number? = unwrap(this).getPriority()

  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  public open fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

  public open fun signalCatalogArn(`value`: String) {
    unwrap(this).setSignalCatalogArn(`value`)
  }

  public open fun signalsToCollect(): Any? = unwrap(this).getSignalsToCollect()

  public open fun signalsToCollect(`value`: IResolvable) {
    unwrap(this).setSignalsToCollect(`value`.let(IResolvable::unwrap))
  }

  public open fun signalsToCollect(__idx_ac66f0: List<Any>) {
    unwrap(this).setSignalsToCollect(__idx_ac66f0)
  }

  public open fun signalsToCollect(vararg __idx_ac66f0: Any): Unit =
      signalsToCollect(__idx_ac66f0.toList())

  public open fun spoolingMode(): String? = unwrap(this).getSpoolingMode()

  public open fun spoolingMode(`value`: String) {
    unwrap(this).setSpoolingMode(`value`)
  }

  public open fun startTime(): String? = unwrap(this).getStartTime()

  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun targetArn(): String = unwrap(this).getTargetArn()

  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  public interface Builder {
    public fun action(action: String)

    public fun collectionScheme(collectionScheme: IResolvable)

    public fun collectionScheme(collectionScheme: CollectionSchemeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23e874d3a7fb59a1ad9dd2e35c421f8957a6099da01feca6c7bd8d5039ddd67d")
    public fun collectionScheme(collectionScheme: CollectionSchemeProperty.Builder.() -> Unit)

    public fun compression(compression: String)

    public fun dataDestinationConfigs(dataDestinationConfigs: IResolvable)

    public fun dataDestinationConfigs(dataDestinationConfigs: List<Any>)

    public fun dataDestinationConfigs(vararg dataDestinationConfigs: Any)

    public fun dataExtraDimensions(dataExtraDimensions: List<String>)

    public fun dataExtraDimensions(vararg dataExtraDimensions: String)

    public fun description(description: String)

    public fun diagnosticsMode(diagnosticsMode: String)

    public fun expiryTime(expiryTime: String)

    public fun name(name: String)

    public fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number)

    public fun priority(priority: Number)

    public fun signalCatalogArn(signalCatalogArn: String)

    public fun signalsToCollect(signalsToCollect: IResolvable)

    public fun signalsToCollect(signalsToCollect: List<Any>)

    public fun signalsToCollect(vararg signalsToCollect: Any)

    public fun spoolingMode(spoolingMode: String)

    public fun startTime(startTime: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnCampaign.Builder.create(scope, id)

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun collectionScheme(collectionScheme: IResolvable) {
      cdkBuilder.collectionScheme(collectionScheme.let(IResolvable::unwrap))
    }

    override fun collectionScheme(collectionScheme: CollectionSchemeProperty) {
      cdkBuilder.collectionScheme(collectionScheme.let(CollectionSchemeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23e874d3a7fb59a1ad9dd2e35c421f8957a6099da01feca6c7bd8d5039ddd67d")
    override fun collectionScheme(collectionScheme: CollectionSchemeProperty.Builder.() -> Unit):
        Unit = collectionScheme(CollectionSchemeProperty(collectionScheme))

    override fun compression(compression: String) {
      cdkBuilder.compression(compression)
    }

    override fun dataDestinationConfigs(dataDestinationConfigs: IResolvable) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs.let(IResolvable::unwrap))
    }

    override fun dataDestinationConfigs(dataDestinationConfigs: List<Any>) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs)
    }

    override fun dataDestinationConfigs(vararg dataDestinationConfigs: Any): Unit =
        dataDestinationConfigs(dataDestinationConfigs.toList())

    override fun dataExtraDimensions(dataExtraDimensions: List<String>) {
      cdkBuilder.dataExtraDimensions(dataExtraDimensions)
    }

    override fun dataExtraDimensions(vararg dataExtraDimensions: String): Unit =
        dataExtraDimensions(dataExtraDimensions.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun diagnosticsMode(diagnosticsMode: String) {
      cdkBuilder.diagnosticsMode(diagnosticsMode)
    }

    override fun expiryTime(expiryTime: String) {
      cdkBuilder.expiryTime(expiryTime)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number) {
      cdkBuilder.postTriggerCollectionDuration(postTriggerCollectionDuration)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    override fun signalsToCollect(signalsToCollect: IResolvable) {
      cdkBuilder.signalsToCollect(signalsToCollect.let(IResolvable::unwrap))
    }

    override fun signalsToCollect(signalsToCollect: List<Any>) {
      cdkBuilder.signalsToCollect(signalsToCollect)
    }

    override fun signalsToCollect(vararg signalsToCollect: Any): Unit =
        signalsToCollect(signalsToCollect.toList())

    override fun spoolingMode(spoolingMode: String) {
      cdkBuilder.spoolingMode(spoolingMode)
    }

    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnCampaign =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCampaign {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCampaign(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign):
        CfnCampaign = CfnCampaign(cdkObject)

    internal fun unwrap(wrapped: CfnCampaign):
        software.amazon.awscdk.services.iotfleetwise.CfnCampaign = wrapped.cdkObject
  }

  public interface TimeBasedCollectionSchemeProperty {
    public fun periodMs(): Number

    public interface Builder {
      public fun periodMs(periodMs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty.builder()

      override fun periodMs(periodMs: Number) {
        cdkBuilder.periodMs(periodMs)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty,
    ) : TimeBasedCollectionSchemeProperty {
      override fun periodMs(): Number = unwrap(this).getPeriodMs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TimeBasedCollectionSchemeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty):
          TimeBasedCollectionSchemeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedCollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimeBasedCollectionSchemeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CollectionSchemeProperty {
    public fun conditionBasedCollectionScheme(): Any? =
        unwrap(this).getConditionBasedCollectionScheme()

    public fun timeBasedCollectionScheme(): Any? = unwrap(this).getTimeBasedCollectionScheme()

    public interface Builder {
      public fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: IResolvable)

      public
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1df1e2b1bf841c9ce4e9b5e01afaaea56630c36b5a28789a4f8544aa030e0e3")
      public
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty.Builder.() -> Unit)

      public fun timeBasedCollectionScheme(timeBasedCollectionScheme: IResolvable)

      public
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb6d5f9760f304755b0590d89a23765cc637c5c42cd4e2e9220310753a03f05a")
      public
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty.builder()

      override fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: IResolvable) {
        cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme.let(IResolvable::unwrap))
      }

      override
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty) {
        cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme.let(ConditionBasedCollectionSchemeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1df1e2b1bf841c9ce4e9b5e01afaaea56630c36b5a28789a4f8544aa030e0e3")
      override
          fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: ConditionBasedCollectionSchemeProperty.Builder.() -> Unit):
          Unit =
          conditionBasedCollectionScheme(ConditionBasedCollectionSchemeProperty(conditionBasedCollectionScheme))

      override fun timeBasedCollectionScheme(timeBasedCollectionScheme: IResolvable) {
        cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme.let(IResolvable::unwrap))
      }

      override
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty) {
        cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme.let(TimeBasedCollectionSchemeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb6d5f9760f304755b0590d89a23765cc637c5c42cd4e2e9220310753a03f05a")
      override
          fun timeBasedCollectionScheme(timeBasedCollectionScheme: TimeBasedCollectionSchemeProperty.Builder.() -> Unit):
          Unit =
          timeBasedCollectionScheme(TimeBasedCollectionSchemeProperty(timeBasedCollectionScheme))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty,
    ) : CollectionSchemeProperty {
      override fun conditionBasedCollectionScheme(): Any? =
          unwrap(this).getConditionBasedCollectionScheme()

      override fun timeBasedCollectionScheme(): Any? = unwrap(this).getTimeBasedCollectionScheme()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CollectionSchemeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty):
          CollectionSchemeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.CollectionSchemeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SignalInformationProperty {
    public fun maxSampleCount(): Number? = unwrap(this).getMaxSampleCount()

    public fun minimumSamplingIntervalMs(): Number? = unwrap(this).getMinimumSamplingIntervalMs()

    public fun name(): String

    public interface Builder {
      public fun maxSampleCount(maxSampleCount: Number)

      public fun minimumSamplingIntervalMs(minimumSamplingIntervalMs: Number)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty.builder()

      override fun maxSampleCount(maxSampleCount: Number) {
        cdkBuilder.maxSampleCount(maxSampleCount)
      }

      override fun minimumSamplingIntervalMs(minimumSamplingIntervalMs: Number) {
        cdkBuilder.minimumSamplingIntervalMs(minimumSamplingIntervalMs)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty,
    ) : SignalInformationProperty {
      override fun maxSampleCount(): Number? = unwrap(this).getMaxSampleCount()

      override fun minimumSamplingIntervalMs(): Number? =
          unwrap(this).getMinimumSamplingIntervalMs()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SignalInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty):
          SignalInformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignalInformationProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.SignalInformationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimestreamConfigProperty {
    public fun executionRoleArn(): String

    public fun timestreamTableArn(): String

    public interface Builder {
      public fun executionRoleArn(executionRoleArn: String)

      public fun timestreamTableArn(timestreamTableArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty.builder()

      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      override fun timestreamTableArn(timestreamTableArn: String) {
        cdkBuilder.timestreamTableArn(timestreamTableArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty,
    ) : TimestreamConfigProperty {
      override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

      override fun timestreamTableArn(): String = unwrap(this).getTimestreamTableArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty):
          TimestreamConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.TimestreamConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataDestinationConfigProperty {
    public fun s3Config(): Any? = unwrap(this).getS3Config()

    public fun timestreamConfig(): Any? = unwrap(this).getTimestreamConfig()

    public interface Builder {
      public fun s3Config(s3Config: IResolvable)

      public fun s3Config(s3Config: S3ConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0827b0454fc9c29afa4ccc11da06ed4a232455f4ac9194e6f07ac3800cd503")
      public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)

      public fun timestreamConfig(timestreamConfig: IResolvable)

      public fun timestreamConfig(timestreamConfig: TimestreamConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e05a80e07ddd9ec9c84f411b8d0482847c9fa86797ac250f5483a620132e716")
      public fun timestreamConfig(timestreamConfig: TimestreamConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty.builder()

      override fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
      }

      override fun s3Config(s3Config: S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config.let(S3ConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0827b0454fc9c29afa4ccc11da06ed4a232455f4ac9194e6f07ac3800cd503")
      override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
          s3Config(S3ConfigProperty(s3Config))

      override fun timestreamConfig(timestreamConfig: IResolvable) {
        cdkBuilder.timestreamConfig(timestreamConfig.let(IResolvable::unwrap))
      }

      override fun timestreamConfig(timestreamConfig: TimestreamConfigProperty) {
        cdkBuilder.timestreamConfig(timestreamConfig.let(TimestreamConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e05a80e07ddd9ec9c84f411b8d0482847c9fa86797ac250f5483a620132e716")
      override fun timestreamConfig(timestreamConfig: TimestreamConfigProperty.Builder.() -> Unit):
          Unit = timestreamConfig(TimestreamConfigProperty(timestreamConfig))

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty,
    ) : DataDestinationConfigProperty {
      override fun s3Config(): Any? = unwrap(this).getS3Config()

      override fun timestreamConfig(): Any? = unwrap(this).getTimestreamConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataDestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty):
          DataDestinationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataDestinationConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.DataDestinationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConditionBasedCollectionSchemeProperty {
    public fun conditionLanguageVersion(): Number? = unwrap(this).getConditionLanguageVersion()

    public fun expression(): String

    public fun minimumTriggerIntervalMs(): Number? = unwrap(this).getMinimumTriggerIntervalMs()

    public fun triggerMode(): String? = unwrap(this).getTriggerMode()

    public interface Builder {
      public fun conditionLanguageVersion(conditionLanguageVersion: Number)

      public fun expression(expression: String)

      public fun minimumTriggerIntervalMs(minimumTriggerIntervalMs: Number)

      public fun triggerMode(triggerMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty.builder()

      override fun conditionLanguageVersion(conditionLanguageVersion: Number) {
        cdkBuilder.conditionLanguageVersion(conditionLanguageVersion)
      }

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun minimumTriggerIntervalMs(minimumTriggerIntervalMs: Number) {
        cdkBuilder.minimumTriggerIntervalMs(minimumTriggerIntervalMs)
      }

      override fun triggerMode(triggerMode: String) {
        cdkBuilder.triggerMode(triggerMode)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty,
    ) : ConditionBasedCollectionSchemeProperty {
      override fun conditionLanguageVersion(): Number? = unwrap(this).getConditionLanguageVersion()

      override fun expression(): String = unwrap(this).getExpression()

      override fun minimumTriggerIntervalMs(): Number? = unwrap(this).getMinimumTriggerIntervalMs()

      override fun triggerMode(): String? = unwrap(this).getTriggerMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConditionBasedCollectionSchemeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty):
          ConditionBasedCollectionSchemeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionBasedCollectionSchemeProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.ConditionBasedCollectionSchemeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ConfigProperty {
    public fun bucketArn(): String

    public fun dataFormat(): String? = unwrap(this).getDataFormat()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun storageCompressionFormat(): String? = unwrap(this).getStorageCompressionFormat()

    public interface Builder {
      public fun bucketArn(bucketArn: String)

      public fun dataFormat(dataFormat: String)

      public fun prefix(prefix: String)

      public fun storageCompressionFormat(storageCompressionFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty.Builder =
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty.builder()

      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      override fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun storageCompressionFormat(storageCompressionFormat: String) {
        cdkBuilder.storageCompressionFormat(storageCompressionFormat)
      }

      public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty,
    ) : S3ConfigProperty {
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      override fun dataFormat(): String? = unwrap(this).getDataFormat()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun storageCompressionFormat(): String? = unwrap(this).getStorageCompressionFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty):
          S3ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnCampaign.S3ConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
