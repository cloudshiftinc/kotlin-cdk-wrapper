@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFirewallRuleGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup,
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

  public open fun firewallRules(vararg __idx_ac66f0: Any): Unit =
      firewallRules(__idx_ac66f0.toList())

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
    public fun firewallRules(firewallRules: IResolvable)

    public fun firewallRules(firewallRules: List<Any>)

    public fun firewallRules(vararg firewallRules: Any)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.Builder.create(scope,
        id)

    override fun firewallRules(firewallRules: IResolvable) {
      cdkBuilder.firewallRules(firewallRules.let(IResolvable::unwrap))
    }

    override fun firewallRules(firewallRules: List<Any>) {
      cdkBuilder.firewallRules(firewallRules)
    }

    override fun firewallRules(vararg firewallRules: Any): Unit =
        firewallRules(firewallRules.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun action(action: String)

      public fun blockOverrideDnsType(blockOverrideDnsType: String)

      public fun blockOverrideDomain(blockOverrideDomain: String)

      public fun blockOverrideTtl(blockOverrideTtl: Number)

      public fun blockResponse(blockResponse: String)

      public fun firewallDomainListId(firewallDomainListId: String)

      public fun priority(priority: Number)

      public fun qtype(qtype: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty.Builder
          =
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun blockOverrideDnsType(blockOverrideDnsType: String) {
        cdkBuilder.blockOverrideDnsType(blockOverrideDnsType)
      }

      override fun blockOverrideDomain(blockOverrideDomain: String) {
        cdkBuilder.blockOverrideDomain(blockOverrideDomain)
      }

      override fun blockOverrideTtl(blockOverrideTtl: Number) {
        cdkBuilder.blockOverrideTtl(blockOverrideTtl)
      }

      override fun blockResponse(blockResponse: String) {
        cdkBuilder.blockResponse(blockResponse)
      }

      override fun firewallDomainListId(firewallDomainListId: String) {
        cdkBuilder.firewallDomainListId(firewallDomainListId)
      }

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun qtype(qtype: String) {
        cdkBuilder.qtype(qtype)
      }

      public fun build():
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty,
    ) : CdkObject(cdkObject), FirewallRuleProperty {
      override fun action(): String = unwrap(this).getAction()

      override fun blockOverrideDnsType(): String? = unwrap(this).getBlockOverrideDnsType()

      override fun blockOverrideDomain(): String? = unwrap(this).getBlockOverrideDomain()

      override fun blockOverrideTtl(): Number? = unwrap(this).getBlockOverrideTtl()

      override fun blockResponse(): String? = unwrap(this).getBlockResponse()

      override fun firewallDomainListId(): String = unwrap(this).getFirewallDomainListId()

      override fun priority(): Number = unwrap(this).getPriority()

      override fun qtype(): String? = unwrap(this).getQtype()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirewallRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty):
          FirewallRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirewallRuleProperty):
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty
    }
  }
}
