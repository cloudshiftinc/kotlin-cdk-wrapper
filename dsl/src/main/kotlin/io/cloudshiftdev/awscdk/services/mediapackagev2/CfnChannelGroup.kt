package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannelGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrEgressDomain(): String = unwrap(this).getAttrEgressDomain()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

  public open fun channelGroupName(`value`: String) {
    unwrap(this).setChannelGroupName(`value`)
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
    public fun channelGroupName(channelGroupName: String)

    public fun description(description: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup.Builder.create(scope, id)

    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannelGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannelGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup):
        CfnChannelGroup = CfnChannelGroup(cdkObject)

    internal fun unwrap(wrapped: CfnChannelGroup):
        software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup = wrapped.cdkObject
  }
}
