package io.cloudshiftdev.awscdk.services.vpclattice

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

public open class CfnServiceNetworkVpcAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrServiceNetworkArn(): String = unwrap(this).getAttrServiceNetworkArn()

  public open fun attrServiceNetworkId(): String = unwrap(this).getAttrServiceNetworkId()

  public open fun attrServiceNetworkName(): String = unwrap(this).getAttrServiceNetworkName()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

  public open fun serviceNetworkIdentifier(`value`: String) {
    unwrap(this).setServiceNetworkIdentifier(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()

  public open fun vpcIdentifier(`value`: String) {
    unwrap(this).setVpcIdentifier(`value`)
  }

  public interface Builder {
    public fun securityGroupIds(securityGroupIds: List<String>) {
    }

    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun vpcIdentifier(vpcIdentifier: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation.Builder.create(scope,
        id)

    public override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    public override fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
      cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun vpcIdentifier(vpcIdentifier: String) {
      cdkBuilder.vpcIdentifier(vpcIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceNetworkVpcAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceNetworkVpcAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation):
        CfnServiceNetworkVpcAssociation = CfnServiceNetworkVpcAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkVpcAssociation):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation =
        wrapped.cdkObject
  }
}
