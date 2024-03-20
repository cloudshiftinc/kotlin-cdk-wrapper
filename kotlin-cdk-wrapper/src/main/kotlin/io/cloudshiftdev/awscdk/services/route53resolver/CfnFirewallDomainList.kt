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

/**
 * High-level information about a list of firewall domains for use in a
 * [AWS::Route53Resolver::FirewallRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-rule.html)
 * . This is returned by
 * [GetFirewallDomainList](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_GetFirewallDomainList.html)
 * .
 *
 * To retrieve the domains that are defined for this domain list, call
 * [ListFirewallDomains](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_ListFirewallDomains.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnFirewallDomainList cfnFirewallDomainList = CfnFirewallDomainList.Builder.create(this,
 * "MyCfnFirewallDomainList")
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
public open class CfnFirewallDomainList internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFirewallDomainListProps,
  ) :
      this(software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnFirewallDomainListProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFirewallDomainListProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFirewallDomainListProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the firewall domain list.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the domain list was created, in Unix time format and Coordinated
   * Universal Time (UTC).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * A unique string defined by you to identify the request.
   *
   * This allows you to retry failed requests without the risk of running the operation twice. This
   * can be any unique string, for example, a timestamp.
   */
  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  /**
   * The number of domain names that are specified in the domain list.
   */
  public open fun attrDomainCount(): Number = unwrap(this).getAttrDomainCount()

  /**
   * The ID of the domain list.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The owner of the list, used only for lists that are not managed by you.
   *
   * For example, the managed domain list `AWSManagedDomainsMalwareDomainList` has the managed owner
   * name `Route 53 Resolver DNS Firewall` .
   */
  public open fun attrManagedOwnerName(): String = unwrap(this).getAttrManagedOwnerName()

  /**
   * The date and time that the domain list was last modified, in Unix time format and Coordinated
   * Universal Time (UTC).
   */
  public open fun attrModificationTime(): String = unwrap(this).getAttrModificationTime()

  /**
   * The status of the domain list.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Additional information about the status of the list, if available.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3)
   * that contains the list of domains to import.
   */
  public open fun domainFileUrl(): String? = unwrap(this).getDomainFileUrl()

  /**
   * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3)
   * that contains the list of domains to import.
   */
  public open fun domainFileUrl(`value`: String) {
    unwrap(this).setDomainFileUrl(`value`)
  }

  /**
   * A list of the domain lists that you have defined.
   */
  public open fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

  /**
   * A list of the domain lists that you have defined.
   */
  public open fun domains(`value`: List<String>) {
    unwrap(this).setDomains(`value`)
  }

  /**
   * A list of the domain lists that you have defined.
   */
  public open fun domains(vararg `value`: String): Unit = domains(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the domain list.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the domain list.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of the tag keys and values that you want to associate with the domain list.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of the tag keys and values that you want to associate with the domain list.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of the tag keys and values that you want to associate with the domain list.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53resolver.CfnFirewallDomainList].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon
     * S3) that contains the list of domains to import.
     *
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file
     * must be a text file and must contain a single domain per line.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domainfileurl)
     * @param domainFileUrl The fully qualified URL or URI of the file stored in Amazon Simple
     * Storage Service (Amazon S3) that contains the list of domains to import. 
     */
    public fun domainFileUrl(domainFileUrl: String)

    /**
     * A list of the domain lists that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domains)
     * @param domains A list of the domain lists that you have defined. 
     */
    public fun domains(domains: List<String>)

    /**
     * A list of the domain lists that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domains)
     * @param domains A list of the domain lists that you have defined. 
     */
    public fun domains(vararg domains: String)

    /**
     * The name of the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-name)
     * @param name The name of the domain list. 
     */
    public fun name(name: String)

    /**
     * A list of the tag keys and values that you want to associate with the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-tags)
     * @param tags A list of the tag keys and values that you want to associate with the domain
     * list. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of the tag keys and values that you want to associate with the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-tags)
     * @param tags A list of the tag keys and values that you want to associate with the domain
     * list. 
     */
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

    /**
     * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon
     * S3) that contains the list of domains to import.
     *
     * The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file
     * must be a text file and must contain a single domain per line.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domainfileurl)
     * @param domainFileUrl The fully qualified URL or URI of the file stored in Amazon Simple
     * Storage Service (Amazon S3) that contains the list of domains to import. 
     */
    override fun domainFileUrl(domainFileUrl: String) {
      cdkBuilder.domainFileUrl(domainFileUrl)
    }

    /**
     * A list of the domain lists that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domains)
     * @param domains A list of the domain lists that you have defined. 
     */
    override fun domains(domains: List<String>) {
      cdkBuilder.domains(domains)
    }

    /**
     * A list of the domain lists that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-domains)
     * @param domains A list of the domain lists that you have defined. 
     */
    override fun domains(vararg domains: String): Unit = domains(domains.toList())

    /**
     * The name of the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-name)
     * @param name The name of the domain list. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of the tag keys and values that you want to associate with the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-tags)
     * @param tags A list of the tag keys and values that you want to associate with the domain
     * list. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of the tag keys and values that you want to associate with the domain list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewalldomainlist.html#cfn-route53resolver-firewalldomainlist-tags)
     * @param tags A list of the tag keys and values that you want to associate with the domain
     * list. 
     */
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
