@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnResolverRuleProps {
  public fun domainName(): String

  public fun name(): String? = unwrap(this).getName()

  public fun resolverEndpointId(): String? = unwrap(this).getResolverEndpointId()

  public fun ruleType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetIps(): Any? = unwrap(this).getTargetIps()

  @CdkDslMarker
  public interface Builder {
    public fun domainName(domainName: String)

    public fun name(name: String)

    public fun resolverEndpointId(resolverEndpointId: String)

    public fun ruleType(ruleType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetIps(targetIps: IResolvable)

    public fun targetIps(targetIps: List<Any>)

    public fun targetIps(vararg targetIps: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.builder()

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resolverEndpointId(resolverEndpointId: String) {
      cdkBuilder.resolverEndpointId(resolverEndpointId)
    }

    override fun ruleType(ruleType: String) {
      cdkBuilder.ruleType(ruleType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetIps(targetIps: IResolvable) {
      cdkBuilder.targetIps(targetIps.let(IResolvable::unwrap))
    }

    override fun targetIps(targetIps: List<Any>) {
      cdkBuilder.targetIps(targetIps)
    }

    override fun targetIps(vararg targetIps: Any): Unit = targetIps(targetIps.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps,
  ) : CdkObject(cdkObject), CfnResolverRuleProps {
    override fun domainName(): String = unwrap(this).getDomainName()

    override fun name(): String? = unwrap(this).getName()

    override fun resolverEndpointId(): String? = unwrap(this).getResolverEndpointId()

    override fun ruleType(): String = unwrap(this).getRuleType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetIps(): Any? = unwrap(this).getTargetIps()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps):
        CfnResolverRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverRuleProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps
  }
}
