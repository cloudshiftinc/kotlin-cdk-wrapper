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

public open class CfnLocalGatewayRouteTable internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLocalGatewayRouteTableArn(): String =
      unwrap(this).getAttrLocalGatewayRouteTableArn()

  public open fun attrLocalGatewayRouteTableId(): String =
      unwrap(this).getAttrLocalGatewayRouteTableId()

  public open fun attrOutpostArn(): String = unwrap(this).getAttrOutpostArn()

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun localGatewayId(): String = unwrap(this).getLocalGatewayId()

  public open fun localGatewayId(`value`: String) {
    unwrap(this).setLocalGatewayId(`value`)
  }

  public open fun mode(): String? = unwrap(this).getMode()

  public open fun mode(`value`: String) {
    unwrap(this).setMode(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun localGatewayId(localGatewayId: String)

    public fun mode(mode: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable.Builder.create(scope, id)

    override fun localGatewayId(localGatewayId: String) {
      cdkBuilder.localGatewayId(localGatewayId)
    }

    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocalGatewayRouteTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocalGatewayRouteTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable):
        CfnLocalGatewayRouteTable = CfnLocalGatewayRouteTable(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTable):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTable = wrapped.cdkObject
  }
}
