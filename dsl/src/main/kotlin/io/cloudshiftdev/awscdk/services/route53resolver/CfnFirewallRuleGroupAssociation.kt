package io.cloudshiftdev.awscdk.services.route53resolver

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

public open class CfnFirewallRuleGroupAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrManagedOwnerName(): String = unwrap(this).getAttrManagedOwnerName()

  public open fun attrModificationTime(): String = unwrap(this).getAttrModificationTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public open fun firewallRuleGroupId(): String = unwrap(this).getFirewallRuleGroupId()

  public open fun firewallRuleGroupId(`value`: String) {
    unwrap(this).setFirewallRuleGroupId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mutationProtection(): String? = unwrap(this).getMutationProtection()

  public open fun mutationProtection(`value`: String) {
    unwrap(this).setMutationProtection(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun priority(): Number = unwrap(this).getPriority()

  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
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
    public fun firewallRuleGroupId(firewallRuleGroupId: String)

    public fun mutationProtection(mutationProtection: String)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun tags(tags: List<CfnTag>)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation.Builder.create(scope,
        id)

    override fun firewallRuleGroupId(firewallRuleGroupId: String) {
      cdkBuilder.firewallRuleGroupId(firewallRuleGroupId)
    }

    override fun mutationProtection(mutationProtection: String) {
      cdkBuilder.mutationProtection(mutationProtection)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFirewallRuleGroupAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFirewallRuleGroupAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation):
        CfnFirewallRuleGroupAssociation = CfnFirewallRuleGroupAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallRuleGroupAssociation):
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation =
        wrapped.cdkObject
  }
}
