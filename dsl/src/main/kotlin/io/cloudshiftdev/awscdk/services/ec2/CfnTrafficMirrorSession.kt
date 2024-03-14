package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrafficMirrorSession internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public open fun packetLength(): Number? = unwrap(this).getPacketLength()

  public open fun packetLength(`value`: Number) {
    unwrap(this).setPacketLength(`value`)
  }

  public open fun sessionNumber(): Number = unwrap(this).getSessionNumber()

  public open fun sessionNumber(`value`: Number) {
    unwrap(this).setSessionNumber(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun trafficMirrorFilterId(): String = unwrap(this).getTrafficMirrorFilterId()

  public open fun trafficMirrorFilterId(`value`: String) {
    unwrap(this).setTrafficMirrorFilterId(`value`)
  }

  public open fun trafficMirrorTargetId(): String = unwrap(this).getTrafficMirrorTargetId()

  public open fun trafficMirrorTargetId(`value`: String) {
    unwrap(this).setTrafficMirrorTargetId(`value`)
  }

  public open fun virtualNetworkId(): Number? = unwrap(this).getVirtualNetworkId()

  public open fun virtualNetworkId(`value`: Number) {
    unwrap(this).setVirtualNetworkId(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun packetLength(packetLength: Number)

    public fun sessionNumber(sessionNumber: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trafficMirrorFilterId(trafficMirrorFilterId: String)

    public fun trafficMirrorTargetId(trafficMirrorTargetId: String)

    public fun virtualNetworkId(virtualNetworkId: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession.Builder =
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun packetLength(packetLength: Number) {
      cdkBuilder.packetLength(packetLength)
    }

    override fun sessionNumber(sessionNumber: Number) {
      cdkBuilder.sessionNumber(sessionNumber)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
      cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    override fun trafficMirrorTargetId(trafficMirrorTargetId: String) {
      cdkBuilder.trafficMirrorTargetId(trafficMirrorTargetId)
    }

    override fun virtualNetworkId(virtualNetworkId: Number) {
      cdkBuilder.virtualNetworkId(virtualNetworkId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrafficMirrorSession {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrafficMirrorSession(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession):
        CfnTrafficMirrorSession = CfnTrafficMirrorSession(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorSession):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession = wrapped.cdkObject
  }
}
