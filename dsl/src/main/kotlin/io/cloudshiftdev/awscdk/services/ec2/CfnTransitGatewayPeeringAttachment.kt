package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayPeeringAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrStatus(): IResolvable = unwrap(this).getAttrStatus().let(IResolvable::wrap)

  public open fun attrStatusCode(): String = unwrap(this).getAttrStatusCode()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public open fun attrTransitGatewayAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayAttachmentId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun peerAccountId(): String = unwrap(this).getPeerAccountId()

  public open fun peerAccountId(`value`: String) {
    unwrap(this).setPeerAccountId(`value`)
  }

  public open fun peerRegion(): String = unwrap(this).getPeerRegion()

  public open fun peerRegion(`value`: String) {
    unwrap(this).setPeerRegion(`value`)
  }

  public open fun peerTransitGatewayId(): String = unwrap(this).getPeerTransitGatewayId()

  public open fun peerTransitGatewayId(`value`: String) {
    unwrap(this).setPeerTransitGatewayId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  public interface Builder {
    public fun peerAccountId(peerAccountId: String)

    public fun peerRegion(peerRegion: String)

    public fun peerTransitGatewayId(peerTransitGatewayId: String)

    public fun tags(tags: List<CfnTag>)

    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.Builder.create(scope,
        id)

    override fun peerAccountId(peerAccountId: String) {
      cdkBuilder.peerAccountId(peerAccountId)
    }

    override fun peerRegion(peerRegion: String) {
      cdkBuilder.peerRegion(peerRegion)
    }

    override fun peerTransitGatewayId(peerTransitGatewayId: String) {
      cdkBuilder.peerTransitGatewayId(peerTransitGatewayId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayPeeringAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayPeeringAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment):
        CfnTransitGatewayPeeringAttachment = CfnTransitGatewayPeeringAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayPeeringAttachment):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment = wrapped.cdkObject
  }

  public interface PeeringAttachmentStatusProperty {
    public fun code(): String? = unwrap(this).getCode()

    public fun message(): String? = unwrap(this).getMessage()

    public interface Builder {
      public fun code(code: String)

      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty.builder()

      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty,
    ) : PeeringAttachmentStatusProperty {
      override fun code(): String? = unwrap(this).getCode()

      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PeeringAttachmentStatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty):
          PeeringAttachmentStatusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PeeringAttachmentStatusProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
