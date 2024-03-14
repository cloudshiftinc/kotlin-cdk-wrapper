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

public open class CfnIPAMResourceDiscoveryAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrIpamArn(): String = unwrap(this).getAttrIpamArn()

  public open fun attrIpamRegion(): String = unwrap(this).getAttrIpamRegion()

  public open fun attrIpamResourceDiscoveryAssociationArn(): String =
      unwrap(this).getAttrIpamResourceDiscoveryAssociationArn()

  public open fun attrIpamResourceDiscoveryAssociationId(): String =
      unwrap(this).getAttrIpamResourceDiscoveryAssociationId()

  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrResourceDiscoveryStatus(): String =
      unwrap(this).getAttrResourceDiscoveryStatus()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipamId(): String = unwrap(this).getIpamId()

  public open fun ipamId(`value`: String) {
    unwrap(this).setIpamId(`value`)
  }

  public open fun ipamResourceDiscoveryId(): String = unwrap(this).getIpamResourceDiscoveryId()

  public open fun ipamResourceDiscoveryId(`value`: String) {
    unwrap(this).setIpamResourceDiscoveryId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun ipamId(ipamId: String)

    public fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation.Builder.create(scope,
        id)

    override fun ipamId(ipamId: String) {
      cdkBuilder.ipamId(ipamId)
    }

    override fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String) {
      cdkBuilder.ipamResourceDiscoveryId(ipamResourceDiscoveryId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMResourceDiscoveryAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMResourceDiscoveryAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation):
        CfnIPAMResourceDiscoveryAssociation = CfnIPAMResourceDiscoveryAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMResourceDiscoveryAssociation):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation = wrapped.cdkObject
  }
}
