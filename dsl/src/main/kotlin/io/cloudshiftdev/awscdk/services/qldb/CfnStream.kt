package io.cloudshiftdev.awscdk.services.qldb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStream internal constructor(
  private val cdkObject: software.amazon.awscdk.services.qldb.CfnStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun exclusiveEndTime(): String? = unwrap(this).getExclusiveEndTime()

  public open fun exclusiveEndTime(`value`: String) {
    unwrap(this).setExclusiveEndTime(`value`)
  }

  public open fun inclusiveStartTime(): String = unwrap(this).getInclusiveStartTime()

  public open fun inclusiveStartTime(`value`: String) {
    unwrap(this).setInclusiveStartTime(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kinesisConfiguration(): Any = unwrap(this).getKinesisConfiguration()

  public open fun kinesisConfiguration(`value`: IResolvable) {
    unwrap(this).setKinesisConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun kinesisConfiguration(`value`: KinesisConfigurationProperty) {
    unwrap(this).setKinesisConfiguration(`value`.let(KinesisConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08861cbd6bc608e967eb9c1f5fc67639c441789b62f572ddf864bec2691e5c0c")
  public open fun kinesisConfiguration(`value`: KinesisConfigurationProperty.Builder.() -> Unit):
      Unit = kinesisConfiguration(KinesisConfigurationProperty(`value`))

  public open fun ledgerName(): String = unwrap(this).getLedgerName()

  public open fun ledgerName(`value`: String) {
    unwrap(this).setLedgerName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun streamName(): String = unwrap(this).getStreamName()

  public open fun streamName(`value`: String) {
    unwrap(this).setStreamName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun exclusiveEndTime(exclusiveEndTime: String)

    public fun inclusiveStartTime(inclusiveStartTime: String)

    public fun kinesisConfiguration(kinesisConfiguration: IResolvable)

    public fun kinesisConfiguration(kinesisConfiguration: KinesisConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6eb11e9ed469570ba3bc97103edbb5bf655976e20a4082a43e3f442faa9ecb7")
    public
        fun kinesisConfiguration(kinesisConfiguration: KinesisConfigurationProperty.Builder.() -> Unit)

    public fun ledgerName(ledgerName: String)

    public fun roleArn(roleArn: String)

    public fun streamName(streamName: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qldb.CfnStream.Builder =
        software.amazon.awscdk.services.qldb.CfnStream.Builder.create(scope, id)

    override fun exclusiveEndTime(exclusiveEndTime: String) {
      cdkBuilder.exclusiveEndTime(exclusiveEndTime)
    }

    override fun inclusiveStartTime(inclusiveStartTime: String) {
      cdkBuilder.inclusiveStartTime(inclusiveStartTime)
    }

    override fun kinesisConfiguration(kinesisConfiguration: IResolvable) {
      cdkBuilder.kinesisConfiguration(kinesisConfiguration.let(IResolvable::unwrap))
    }

    override fun kinesisConfiguration(kinesisConfiguration: KinesisConfigurationProperty) {
      cdkBuilder.kinesisConfiguration(kinesisConfiguration.let(KinesisConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b6eb11e9ed469570ba3bc97103edbb5bf655976e20a4082a43e3f442faa9ecb7")
    override
        fun kinesisConfiguration(kinesisConfiguration: KinesisConfigurationProperty.Builder.() -> Unit):
        Unit = kinesisConfiguration(KinesisConfigurationProperty(kinesisConfiguration))

    override fun ledgerName(ledgerName: String) {
      cdkBuilder.ledgerName(ledgerName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun streamName(streamName: String) {
      cdkBuilder.streamName(streamName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.qldb.CfnStream = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnStream): CfnStream =
        CfnStream(cdkObject)

    internal fun unwrap(wrapped: CfnStream): software.amazon.awscdk.services.qldb.CfnStream =
        wrapped.cdkObject
  }

  public interface KinesisConfigurationProperty {
    public fun aggregationEnabled(): Any? = unwrap(this).getAggregationEnabled()

    public fun streamArn(): String? = unwrap(this).getStreamArn()

    public interface Builder {
      public fun aggregationEnabled(aggregationEnabled: Boolean)

      public fun aggregationEnabled(aggregationEnabled: IResolvable)

      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty.Builder =
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty.builder()

      override fun aggregationEnabled(aggregationEnabled: Boolean) {
        cdkBuilder.aggregationEnabled(aggregationEnabled)
      }

      override fun aggregationEnabled(aggregationEnabled: IResolvable) {
        cdkBuilder.aggregationEnabled(aggregationEnabled.let(IResolvable::unwrap))
      }

      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty,
    ) : KinesisConfigurationProperty {
      override fun aggregationEnabled(): Any? = unwrap(this).getAggregationEnabled()

      override fun streamArn(): String? = unwrap(this).getStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty):
          KinesisConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisConfigurationProperty):
          software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
