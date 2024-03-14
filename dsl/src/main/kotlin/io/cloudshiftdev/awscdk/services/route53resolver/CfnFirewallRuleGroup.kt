package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFirewallRuleGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrModificationTime(): String = unwrap(this).getAttrModificationTime()

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrRuleCount(): Number = unwrap(this).getAttrRuleCount()

  public open fun attrShareStatus(): String = unwrap(this).getAttrShareStatus()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public open fun firewallRules(): Any? = unwrap(this).getFirewallRules()

  public open fun firewallRules(`value`: IResolvable) {
    unwrap(this).setFirewallRules(`value`.let(IResolvable::unwrap))
  }

  public open fun firewallRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setFirewallRules(__idx_ac66f0)
  }

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

  public interface Builder {
    public fun firewallRules(firewallRules: IResolvable) {
    }

    public fun firewallRules(firewallRules: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.Builder.create(scope,
        id)

    public override fun firewallRules(firewallRules: IResolvable) {
      cdkBuilder.firewallRules(firewallRules.let(IResolvable::unwrap))
    }

    public override fun firewallRules(firewallRules: List<Any>) {
      cdkBuilder.firewallRules(firewallRules)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFirewallRuleGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFirewallRuleGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup):
        CfnFirewallRuleGroup = CfnFirewallRuleGroup(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallRuleGroup):
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup = wrapped.cdkObject
  }

  public interface FirewallRuleProperty {
    public fun action(): String

    public fun blockOverrideDnsType(): String? = unwrap(this).getBlockOverrideDnsType()

    public fun blockOverrideDomain(): String? = unwrap(this).getBlockOverrideDomain()

    public fun blockOverrideTtl(): Number? = unwrap(this).getBlockOverrideTtl()

    public fun blockResponse(): String? = unwrap(this).getBlockResponse()

    public fun firewallDomainListId(): String

    public fun priority(): Number

    public fun qtype(): String? = unwrap(this).getQtype()

    public interface Builder {
      public fun action(action: String) {
      }

      public fun blockOverrideDnsType(blockOverrideDnsType: String) {
      }

      public fun blockOverrideDomain(blockOverrideDomain: String) {
      }

      public fun blockOverrideTtl(blockOverrideTtl: Number) {
      }

      public fun blockResponse(blockResponse: String) {
      }

      public fun firewallDomainListId(firewallDomainListId: String) {
      }

      public fun priority(priority: Number) {
      }

      public fun qtype(qtype: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty.Builder
          =
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty.builder()

      public override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public override fun blockOverrideDnsType(blockOverrideDnsType: String) {
        cdkBuilder.blockOverrideDnsType(blockOverrideDnsType)
      }

      public override fun blockOverrideDomain(blockOverrideDomain: String) {
        cdkBuilder.blockOverrideDomain(blockOverrideDomain)
      }

      public override fun blockOverrideTtl(blockOverrideTtl: Number) {
        cdkBuilder.blockOverrideTtl(blockOverrideTtl)
      }

      public override fun blockResponse(blockResponse: String) {
        cdkBuilder.blockResponse(blockResponse)
      }

      public override fun firewallDomainListId(firewallDomainListId: String) {
        cdkBuilder.firewallDomainListId(firewallDomainListId)
      }

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public override fun qtype(qtype: String) {
        cdkBuilder.qtype(qtype)
      }

      public fun build():
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty,
    ) : FirewallRuleProperty {
      public override fun action(): String = unwrap(this).getAction()

      public override fun blockOverrideDnsType(): String? = unwrap(this).getBlockOverrideDnsType()

      public override fun blockOverrideDomain(): String? = unwrap(this).getBlockOverrideDomain()

      public override fun blockOverrideTtl(): Number? = unwrap(this).getBlockOverrideTtl()

      public override fun blockResponse(): String? = unwrap(this).getBlockResponse()

      public override fun firewallDomainListId(): String = unwrap(this).getFirewallDomainListId()

      public override fun priority(): Number = unwrap(this).getPriority()

      public override fun qtype(): String? = unwrap(this).getQtype()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FirewallRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty):
          FirewallRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirewallRuleProperty):
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
