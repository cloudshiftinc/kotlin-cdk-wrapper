@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFirewallDomainList`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnFirewallDomainListProps cfnFirewallDomainListProps = CfnFirewallDomainListProps.builder()
 * .domainFileUrl("domainFileUrl")
 * .domains(List.of("domains"))
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html)
 */
public interface CfnFirewallDomainListProps {
  /**
   * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3)
   * that contains the list of domains to import.
   *
   * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must
   * be a text file and must contain a single domain per line.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domainfileurl)
   */
  public fun domainFileUrl(): String? = unwrap(this).getDomainFileUrl()

  /**
   * A list of the domain lists that you have defined.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domains)
   */
  public fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

  /**
   * The name of the domain list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A list of the tag keys and values that you want to associate with the domain list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFirewallDomainListProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainFileUrl The fully qualified URL or URI of the file stored in Amazon Simple
     * Storage Service (Amazon S3) that contains the list of domains to import.
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file
     * must be a text file and must contain a single domain per line.
     */
    public fun domainFileUrl(domainFileUrl: String)

    /**
     * @param domains A list of the domain lists that you have defined.
     */
    public fun domains(domains: List<String>)

    /**
     * @param domains A list of the domain lists that you have defined.
     */
    public fun domains(vararg domains: String)

    /**
     * @param name The name of the domain list.
     */
    public fun name(name: String)

    /**
     * @param tags A list of the tag keys and values that you want to associate with the domain
     * list.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of the tag keys and values that you want to associate with the domain
     * list.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps.builder()

    /**
     * @param domainFileUrl The fully qualified URL or URI of the file stored in Amazon Simple
     * Storage Service (Amazon S3) that contains the list of domains to import.
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file
     * must be a text file and must contain a single domain per line.
     */
    override fun domainFileUrl(domainFileUrl: String) {
      cdkBuilder.domainFileUrl(domainFileUrl)
    }

    /**
     * @param domains A list of the domain lists that you have defined.
     */
    override fun domains(domains: List<String>) {
      cdkBuilder.domains(domains)
    }

    /**
     * @param domains A list of the domain lists that you have defined.
     */
    override fun domains(vararg domains: String): Unit = domains(domains.toList())

    /**
     * @param name The name of the domain list.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the domain
     * list.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the domain
     * list.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps,
  ) : CdkObject(cdkObject), CfnFirewallDomainListProps {
    /**
     * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon
     * S3) that contains the list of domains to import.
     *
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file
     * must be a text file and must contain a single domain per line.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domainfileurl)
     */
    override fun domainFileUrl(): String? = unwrap(this).getDomainFileUrl()

    /**
     * A list of the domain lists that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domains)
     */
    override fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

    /**
     * The name of the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A list of the tag keys and values that you want to associate with the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFirewallDomainListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps):
        CfnFirewallDomainListProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnFirewallDomainListProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallDomainListProps):
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps
  }
}
