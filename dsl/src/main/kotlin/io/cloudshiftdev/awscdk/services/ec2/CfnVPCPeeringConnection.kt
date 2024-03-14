package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCPeeringConnection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun peerOwnerId(): String? = unwrap(this).getPeerOwnerId()

  public open fun peerOwnerId(`value`: String) {
    unwrap(this).setPeerOwnerId(`value`)
  }

  public open fun peerRegion(): String? = unwrap(this).getPeerRegion()

  public open fun peerRegion(`value`: String) {
    unwrap(this).setPeerRegion(`value`)
  }

  public open fun peerRoleArn(): String? = unwrap(this).getPeerRoleArn()

  public open fun peerRoleArn(`value`: String) {
    unwrap(this).setPeerRoleArn(`value`)
  }

  public open fun peerVpcId(): String = unwrap(this).getPeerVpcId()

  public open fun peerVpcId(`value`: String) {
    unwrap(this).setPeerVpcId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun peerOwnerId(peerOwnerId: String)

    public fun peerRegion(peerRegion: String)

    public fun peerRoleArn(peerRoleArn: String)

    public fun peerVpcId(peerVpcId: String)

    public fun tags(tags: List<CfnTag>)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection.Builder.create(scope, id)

    override fun peerOwnerId(peerOwnerId: String) {
      cdkBuilder.peerOwnerId(peerOwnerId)
    }

    override fun peerRegion(peerRegion: String) {
      cdkBuilder.peerRegion(peerRegion)
    }

    override fun peerRoleArn(peerRoleArn: String) {
      cdkBuilder.peerRoleArn(peerRoleArn)
    }

    override fun peerVpcId(peerVpcId: String) {
      cdkBuilder.peerVpcId(peerVpcId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCPeeringConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCPeeringConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection):
        CfnVPCPeeringConnection = CfnVPCPeeringConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVPCPeeringConnection):
        software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection = wrapped.cdkObject
  }
}
