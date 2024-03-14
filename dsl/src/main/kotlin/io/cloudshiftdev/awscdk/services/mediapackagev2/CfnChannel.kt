package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrIngestEndpoints(): IResolvable =
      unwrap(this).getAttrIngestEndpoints().let(IResolvable::wrap)

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

  public open fun channelGroupName(`value`: String) {
    unwrap(this).setChannelGroupName(`value`)
  }

  public open fun channelName(): String = unwrap(this).getChannelName()

  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun channelGroupName(channelGroupName: String) {
    }

    public fun channelName(channelName: String) {
    }

    public fun description(description: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackagev2.CfnChannel.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnChannel.Builder.create(scope, id)

    public override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    public override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel):
        CfnChannel = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel):
        software.amazon.awscdk.services.mediapackagev2.CfnChannel = wrapped.cdkObject
  }

  public interface IngestEndpointProperty {
    public fun id(): String? = unwrap(this).getId()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun id(id: String) {
      }

      public fun url(url: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty.Builder =
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty.builder()

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty,
    ) : IngestEndpointProperty {
      public override fun id(): String? = unwrap(this).getId()

      public override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IngestEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty):
          IngestEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngestEndpointProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnChannel.IngestEndpointProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
