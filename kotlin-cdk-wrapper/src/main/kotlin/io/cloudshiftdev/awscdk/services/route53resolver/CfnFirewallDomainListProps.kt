@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFirewallDomainListProps {
  public fun domainFileUrl(): String? = unwrap(this).getDomainFileUrl()

  public fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun domainFileUrl(domainFileUrl: String)

    public fun domains(domains: List<String>)

    public fun domains(vararg domains: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps.builder()

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

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps,
  ) : CdkObject(cdkObject), CfnFirewallDomainListProps {
    override fun domainFileUrl(): String? = unwrap(this).getDomainFileUrl()

    override fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFirewallDomainListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps):
        CfnFirewallDomainListProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallDomainListProps):
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps
  }
}
