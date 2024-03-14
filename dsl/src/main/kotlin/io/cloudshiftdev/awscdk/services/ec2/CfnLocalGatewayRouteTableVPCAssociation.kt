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

public open class CfnLocalGatewayRouteTableVPCAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLocalGatewayId(): String = unwrap(this).getAttrLocalGatewayId()

  public open fun attrLocalGatewayRouteTableVpcAssociationId(): String =
      unwrap(this).getAttrLocalGatewayRouteTableVpcAssociationId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

  public open fun localGatewayRouteTableId(`value`: String) {
    unwrap(this).setLocalGatewayRouteTableId(`value`)
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
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String)

    public fun tags(tags: List<CfnTag>)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation.Builder.create(scope,
        id)

    override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocalGatewayRouteTableVPCAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocalGatewayRouteTableVPCAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation):
        CfnLocalGatewayRouteTableVPCAssociation = CfnLocalGatewayRouteTableVPCAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTableVPCAssociation):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation =
        wrapped.cdkObject
  }
}
