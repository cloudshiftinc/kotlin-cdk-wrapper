@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFirewallDomainList internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  public open fun attrDomainCount(): Number = unwrap(this).getAttrDomainCount()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrManagedOwnerName(): String = unwrap(this).getAttrManagedOwnerName()

  public open fun attrModificationTime(): String = unwrap(this).getAttrModificationTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public open fun domainFileUrl(): String? = unwrap(this).getDomainFileUrl()

  public open fun domainFileUrl(`value`: String) {
    unwrap(this).setDomainFileUrl(`value`)
  }

  public open fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

  public open fun domains(`value`: List<String>) {
    unwrap(this).setDomains(`value`)
  }

  public open fun domains(vararg `value`: String): Unit = domains(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun domainFileUrl(domainFileUrl: String)

    public fun domains(domains: List<String>)

    public fun domains(vararg domains: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList.Builder.create(scope,
        id)

    override fun domainFileUrl(domainFileUrl: String) {
      cdkBuilder.domainFileUrl(domainFileUrl)
    }

    override fun domains(domains: List<String>) {
      cdkBuilder.domains(domains)
    }

    override fun domains(vararg domains: String): Unit = domains(domains.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFirewallDomainList {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFirewallDomainList(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList):
        CfnFirewallDomainList = CfnFirewallDomainList(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallDomainList):
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList = wrapped.cdkObject
  }
}
