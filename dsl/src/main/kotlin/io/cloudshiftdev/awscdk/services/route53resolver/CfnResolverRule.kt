package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrResolverEndpointId(): String = unwrap(this).getAttrResolverEndpointId()

  public open fun attrResolverRuleId(): String = unwrap(this).getAttrResolverRuleId()

  public open fun attrTargetIps(): IResolvable =
      unwrap(this).getAttrTargetIps().let(IResolvable::wrap)

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun resolverEndpointId(): String? = unwrap(this).getResolverEndpointId()

  public open fun resolverEndpointId(`value`: String) {
    unwrap(this).setResolverEndpointId(`value`)
  }

  public open fun ruleType(): String = unwrap(this).getRuleType()

  public open fun ruleType(`value`: String) {
    unwrap(this).setRuleType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun targetIps(): Any? = unwrap(this).getTargetIps()

  public open fun targetIps(`value`: IResolvable) {
    unwrap(this).setTargetIps(`value`.let(IResolvable::unwrap))
  }

  public open fun targetIps(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargetIps(__idx_ac66f0)
  }

  public interface Builder {
    public fun domainName(domainName: String) {
    }

    public fun name(name: String) {
    }

    public fun resolverEndpointId(resolverEndpointId: String) {
    }

    public fun ruleType(ruleType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun targetIps(targetIps: IResolvable) {
    }

    public fun targetIps(targetIps: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53resolver.CfnResolverRule.Builder
        = software.amazon.awscdk.services.route53resolver.CfnResolverRule.Builder.create(scope, id)

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun resolverEndpointId(resolverEndpointId: String) {
      cdkBuilder.resolverEndpointId(resolverEndpointId)
    }

    public override fun ruleType(ruleType: String) {
      cdkBuilder.ruleType(ruleType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun targetIps(targetIps: IResolvable) {
      cdkBuilder.targetIps(targetIps.let(IResolvable::unwrap))
    }

    public override fun targetIps(targetIps: List<Any>) {
      cdkBuilder.targetIps(targetIps)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRule):
        CfnResolverRule = CfnResolverRule(cdkObject)

    internal fun unwrap(wrapped: CfnResolverRule):
        software.amazon.awscdk.services.route53resolver.CfnResolverRule = wrapped.cdkObject
  }

  public interface TargetAddressProperty {
    public fun ip(): String? = unwrap(this).getIp()

    public fun ipv6(): String? = unwrap(this).getIpv6()

    public fun port(): String? = unwrap(this).getPort()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public interface Builder {
      public fun ip(ip: String) {
      }

      public fun ipv6(ipv6: String) {
      }

      public fun port(port: String) {
      }

      public fun protocol(protocol: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder
          =
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.builder()

      public override fun ip(ip: String) {
        cdkBuilder.ip(ip)
      }

      public override fun ipv6(ipv6: String) {
        cdkBuilder.ipv6(ipv6)
      }

      public override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty,
    ) : TargetAddressProperty {
      public override fun ip(): String? = unwrap(this).getIp()

      public override fun ipv6(): String? = unwrap(this).getIpv6()

      public override fun port(): String? = unwrap(this).getPort()

      public override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetAddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty):
          TargetAddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetAddressProperty):
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
