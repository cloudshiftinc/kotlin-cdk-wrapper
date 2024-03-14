package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  /**
   * The ARN (Amazon Resource Name) of the rule group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the rule group was created, in Unix time format and Coordinated
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
   * The ID of the rule group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time that the rule group was last modified, in Unix time format and Coordinated
   * Universal Time (UTC).
   */
  public open fun attrModificationTime(): String = unwrap(this).getAttrModificationTime()

  /**
   * The AWS account ID for the account that created the rule group.
   *
   * When a rule group is shared with your account, this is the account that has shared the rule
   * group with you.
   */
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  /**
   * The number of rules in the rule group.
   */
  public open fun attrRuleCount(): Number = unwrap(this).getAttrRuleCount()

  /**
   * Whether the rule group is shared with other AWS accounts , or was shared with the current
   * account by another AWS account .
   *
   * Sharing is configured through AWS Resource Access Manager ( AWS RAM ).
   */
  public open fun attrShareStatus(): String = unwrap(this).getAttrShareStatus()

  /**
   * The status of the domain list.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Additional information about the status of the rule group, if available.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * A list of the rules that you have defined.
   */
  public open fun firewallRules(): Any? = unwrap(this).getFirewallRules()

  /**
   * A list of the rules that you have defined.
   */
  public open fun firewallRules(`value`: IResolvable) {
    unwrap(this).setFirewallRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the rules that you have defined.
   */
  public open fun firewallRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setFirewallRules(__idx_ac66f0)
  }

  /**
   * A list of the rules that you have defined.
   */
  public open fun firewallRules(vararg __idx_ac66f0: Any): Unit =
      firewallRules(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the rule group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the rule group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of the tag keys and values that you want to associate with the rule group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of the tag keys and values that you want to associate with the rule group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of the tag keys and values that you want to associate with the rule group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53resolver.CfnFirewallRuleGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     * @param firewallRules A list of the rules that you have defined. 
     */
    public fun firewallRules(firewallRules: IResolvable)

    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     * @param firewallRules A list of the rules that you have defined. 
     */
    public fun firewallRules(firewallRules: List<Any>)

    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     * @param firewallRules A list of the rules that you have defined. 
     */
    public fun firewallRules(vararg firewallRules: Any)

    /**
     * The name of the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-name)
     * @param name The name of the rule group. 
     */
    public fun name(name: String)

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-tags)
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     * 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-tags)
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     * 
     */
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

    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     * @param firewallRules A list of the rules that you have defined. 
     */
    override fun firewallRules(firewallRules: IResolvable) {
      cdkBuilder.firewallRules(firewallRules.let(IResolvable::unwrap))
    }

    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     * @param firewallRules A list of the rules that you have defined. 
     */
    override fun firewallRules(firewallRules: List<Any>) {
      cdkBuilder.firewallRules(firewallRules)
    }

    /**
     * A list of the rules that you have defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-firewallrules)
     * @param firewallRules A list of the rules that you have defined. 
     */
    override fun firewallRules(vararg firewallRules: Any): Unit =
        firewallRules(firewallRules.toList())

    /**
     * The name of the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-name)
     * @param name The name of the rule group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-tags)
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     * 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of the tag keys and values that you want to associate with the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-firewallrulegroup.html#cfn-route53resolver-firewallrulegroup-tags)
     * @param tags A list of the tag keys and values that you want to associate with the rule group.
     * 
     */
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
    /**
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in
     * the rule's domain list:  - `ALLOW` - Permit the request to go through.
     *
     * * `ALERT` - Permit the request to go through but send an alert to the logs.
     * * `BLOCK` - Disallow the request. If this is specified,then `BlockResponse` must also be
     * specified.
     *
     * if `BlockResponse` is `OVERRIDE` , then all of the following `OVERRIDE` attributes must be
     * specified:
     *
     * * `BlockOverrideDnsType`
     * * `BlockOverrideDomain`
     * * `BlockOverrideTtl`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-action)
     */
    public fun action(): String

    /**
     * The DNS record's type.
     *
     * This determines the format of the record value that you provided in `BlockOverrideDomain` .
     * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-blockoverridednstype)
     */
    public fun blockOverrideDnsType(): String? = unwrap(this).getBlockOverrideDnsType()

    /**
     * The custom DNS record to send back in response to the query.
     *
     * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-blockoverridedomain)
     */
    public fun blockOverrideDomain(): String? = unwrap(this).getBlockOverrideDomain()

    /**
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the
     * provided override record.
     *
     * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-blockoverridettl)
     */
    public fun blockOverrideTtl(): Number? = unwrap(this).getBlockOverrideTtl()

    /**
     * The way that you want DNS Firewall to block the request. Used for the rule action setting
     * `BLOCK` .
     *
     * * `NODATA` - Respond indicating that the query was successful, but no response is available
     * for it.
     * * `NXDOMAIN` - Respond indicating that the domain name that's in the query doesn't exist.
     * * `OVERRIDE` - Provide a custom override in the response. This option requires custom
     * handling details in the rule's `BlockOverride*` settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-blockresponse)
     */
    public fun blockResponse(): String? = unwrap(this).getBlockResponse()

    /**
     * The ID of the domain list that's used in the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-firewalldomainlistid)
     */
    public fun firewallDomainListId(): String

    /**
     * The priority of the rule in the rule group.
     *
     * This value must be unique within the rule group. DNS Firewall processes the rules in a rule
     * group by order of priority, starting from the lowest setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-priority)
     */
    public fun priority(): Number

    /**
     * The DNS query type you want the rule to evaluate. Allowed values are;
     *
     * * A: Returns an IPv4 address.
     * * AAAA: Returns an Ipv6 address.
     * * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     * * CNAME: Returns another domain name.
     * * DS: Record that identifies the DNSSEC signing key of a delegated zone.
     * * MX: Specifies mail servers.
     * * NAPTR: Regular-expression-based rewriting of domain names.
     * * NS: Authoritative name servers.
     * * PTR: Maps an IP address to a domain name.
     * * SOA: Start of authority record for the zone.
     * * SPF: Lists the servers authorized to send emails from a domain.
     * * SRV: Application specific values that identify servers.
     * * TXT: Verifies email senders and application-specific values.
     * * A query type you define by using the DNS type ID, for example 28 for AAAA. The values must
     * be defined as TYPE NUMBER , where the NUMBER can be 1-65334, for example, TYPE28. For more
     * information, see [List of DNS record
     * types](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_DNS_record_types) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-qtype)
     */
    public fun qtype(): String? = unwrap(this).getQtype()

    /**
     * A builder for [FirewallRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that DNS Firewall should take on a DNS query when it matches one
       * of the domains in the rule's domain list:  - `ALLOW` - Permit the request to go through. 
       * * `ALERT` - Permit the request to go through but send an alert to the logs.
       * * `BLOCK` - Disallow the request. If this is specified,then `BlockResponse` must also be
       * specified.
       *
       * if `BlockResponse` is `OVERRIDE` , then all of the following `OVERRIDE` attributes must be
       * specified:
       *
       * * `BlockOverrideDnsType`
       * * `BlockOverrideDomain`
       * * `BlockOverrideTtl`
       */
      public fun action(action: String)

      /**
       * @param blockOverrideDnsType The DNS record's type.
       * This determines the format of the record value that you provided in `BlockOverrideDomain` .
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       */
      public fun blockOverrideDnsType(blockOverrideDnsType: String)

      /**
       * @param blockOverrideDomain The custom DNS record to send back in response to the query.
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       */
      public fun blockOverrideDomain(blockOverrideDomain: String)

      /**
       * @param blockOverrideTtl The recommended amount of time, in seconds, for the DNS resolver or
       * web browser to cache the provided override record.
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       */
      public fun blockOverrideTtl(blockOverrideTtl: Number)

      /**
       * @param blockResponse The way that you want DNS Firewall to block the request. Used for the
       * rule action setting `BLOCK` .
       * * `NODATA` - Respond indicating that the query was successful, but no response is available
       * for it.
       * * `NXDOMAIN` - Respond indicating that the domain name that's in the query doesn't exist.
       * * `OVERRIDE` - Provide a custom override in the response. This option requires custom
       * handling details in the rule's `BlockOverride*` settings.
       */
      public fun blockResponse(blockResponse: String)

      /**
       * @param firewallDomainListId The ID of the domain list that's used in the rule. 
       */
      public fun firewallDomainListId(firewallDomainListId: String)

      /**
       * @param priority The priority of the rule in the rule group. 
       * This value must be unique within the rule group. DNS Firewall processes the rules in a rule
       * group by order of priority, starting from the lowest setting.
       */
      public fun priority(priority: Number)

      /**
       * @param qtype The DNS query type you want the rule to evaluate. Allowed values are;.
       * * A: Returns an IPv4 address.
       * * AAAA: Returns an Ipv6 address.
       * * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
       * * CNAME: Returns another domain name.
       * * DS: Record that identifies the DNSSEC signing key of a delegated zone.
       * * MX: Specifies mail servers.
       * * NAPTR: Regular-expression-based rewriting of domain names.
       * * NS: Authoritative name servers.
       * * PTR: Maps an IP address to a domain name.
       * * SOA: Start of authority record for the zone.
       * * SPF: Lists the servers authorized to send emails from a domain.
       * * SRV: Application specific values that identify servers.
       * * TXT: Verifies email senders and application-specific values.
       * * A query type you define by using the DNS type ID, for example 28 for AAAA. The values
       * must be defined as TYPE NUMBER , where the NUMBER can be 1-65334, for example, TYPE28. For
       * more information, see [List of DNS record
       * types](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_DNS_record_types) .
       */
      public fun qtype(qtype: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty.Builder
          =
          software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty.builder()

      /**
       * @param action The action that DNS Firewall should take on a DNS query when it matches one
       * of the domains in the rule's domain list:  - `ALLOW` - Permit the request to go through. 
       * * `ALERT` - Permit the request to go through but send an alert to the logs.
       * * `BLOCK` - Disallow the request. If this is specified,then `BlockResponse` must also be
       * specified.
       *
       * if `BlockResponse` is `OVERRIDE` , then all of the following `OVERRIDE` attributes must be
       * specified:
       *
       * * `BlockOverrideDnsType`
       * * `BlockOverrideDomain`
       * * `BlockOverrideTtl`
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param blockOverrideDnsType The DNS record's type.
       * This determines the format of the record value that you provided in `BlockOverrideDomain` .
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       */
      override fun blockOverrideDnsType(blockOverrideDnsType: String) {
        cdkBuilder.blockOverrideDnsType(blockOverrideDnsType)
      }

      /**
       * @param blockOverrideDomain The custom DNS record to send back in response to the query.
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       */
      override fun blockOverrideDomain(blockOverrideDomain: String) {
        cdkBuilder.blockOverrideDomain(blockOverrideDomain)
      }

      /**
       * @param blockOverrideTtl The recommended amount of time, in seconds, for the DNS resolver or
       * web browser to cache the provided override record.
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       */
      override fun blockOverrideTtl(blockOverrideTtl: Number) {
        cdkBuilder.blockOverrideTtl(blockOverrideTtl)
      }

      /**
       * @param blockResponse The way that you want DNS Firewall to block the request. Used for the
       * rule action setting `BLOCK` .
       * * `NODATA` - Respond indicating that the query was successful, but no response is available
       * for it.
       * * `NXDOMAIN` - Respond indicating that the domain name that's in the query doesn't exist.
       * * `OVERRIDE` - Provide a custom override in the response. This option requires custom
       * handling details in the rule's `BlockOverride*` settings.
       */
      override fun blockResponse(blockResponse: String) {
        cdkBuilder.blockResponse(blockResponse)
      }

      /**
       * @param firewallDomainListId The ID of the domain list that's used in the rule. 
       */
      override fun firewallDomainListId(firewallDomainListId: String) {
        cdkBuilder.firewallDomainListId(firewallDomainListId)
      }

      /**
       * @param priority The priority of the rule in the rule group. 
       * This value must be unique within the rule group. DNS Firewall processes the rules in a rule
       * group by order of priority, starting from the lowest setting.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param qtype The DNS query type you want the rule to evaluate. Allowed values are;.
       * * A: Returns an IPv4 address.
       * * AAAA: Returns an Ipv6 address.
       * * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
       * * CNAME: Returns another domain name.
       * * DS: Record that identifies the DNSSEC signing key of a delegated zone.
       * * MX: Specifies mail servers.
       * * NAPTR: Regular-expression-based rewriting of domain names.
       * * NS: Authoritative name servers.
       * * PTR: Maps an IP address to a domain name.
       * * SOA: Start of authority record for the zone.
       * * SPF: Lists the servers authorized to send emails from a domain.
       * * SRV: Application specific values that identify servers.
       * * TXT: Verifies email senders and application-specific values.
       * * A query type you define by using the DNS type ID, for example 28 for AAAA. The values
       * must be defined as TYPE NUMBER , where the NUMBER can be 1-65334, for example, TYPE28. For
       * more information, see [List of DNS record
       * types](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_DNS_record_types) .
       */
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
      /**
       * The action that DNS Firewall should take on a DNS query when it matches one of the domains
       * in the rule's domain list:  - `ALLOW` - Permit the request to go through.
       *
       * * `ALERT` - Permit the request to go through but send an alert to the logs.
       * * `BLOCK` - Disallow the request. If this is specified,then `BlockResponse` must also be
       * specified.
       *
       * if `BlockResponse` is `OVERRIDE` , then all of the following `OVERRIDE` attributes must be
       * specified:
       *
       * * `BlockOverrideDnsType`
       * * `BlockOverrideDomain`
       * * `BlockOverrideTtl`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The DNS record's type.
       *
       * This determines the format of the record value that you provided in `BlockOverrideDomain` .
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-blockoverridednstype)
       */
      override fun blockOverrideDnsType(): String? = unwrap(this).getBlockOverrideDnsType()

      /**
       * The custom DNS record to send back in response to the query.
       *
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-blockoverridedomain)
       */
      override fun blockOverrideDomain(): String? = unwrap(this).getBlockOverrideDomain()

      /**
       * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache
       * the provided override record.
       *
       * Used for the rule action `BLOCK` with a `BlockResponse` setting of `OVERRIDE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-blockoverridettl)
       */
      override fun blockOverrideTtl(): Number? = unwrap(this).getBlockOverrideTtl()

      /**
       * The way that you want DNS Firewall to block the request. Used for the rule action setting
       * `BLOCK` .
       *
       * * `NODATA` - Respond indicating that the query was successful, but no response is available
       * for it.
       * * `NXDOMAIN` - Respond indicating that the domain name that's in the query doesn't exist.
       * * `OVERRIDE` - Provide a custom override in the response. This option requires custom
       * handling details in the rule's `BlockOverride*` settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-blockresponse)
       */
      override fun blockResponse(): String? = unwrap(this).getBlockResponse()

      /**
       * The ID of the domain list that's used in the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-firewalldomainlistid)
       */
      override fun firewallDomainListId(): String = unwrap(this).getFirewallDomainListId()

      /**
       * The priority of the rule in the rule group.
       *
       * This value must be unique within the rule group. DNS Firewall processes the rules in a rule
       * group by order of priority, starting from the lowest setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * The DNS query type you want the rule to evaluate. Allowed values are;
       *
       * * A: Returns an IPv4 address.
       * * AAAA: Returns an Ipv6 address.
       * * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
       * * CNAME: Returns another domain name.
       * * DS: Record that identifies the DNSSEC signing key of a delegated zone.
       * * MX: Specifies mail servers.
       * * NAPTR: Regular-expression-based rewriting of domain names.
       * * NS: Authoritative name servers.
       * * PTR: Maps an IP address to a domain name.
       * * SOA: Start of authority record for the zone.
       * * SPF: Lists the servers authorized to send emails from a domain.
       * * SRV: Application specific values that identify servers.
       * * TXT: Verifies email senders and application-specific values.
       * * A query type you define by using the DNS type ID, for example 28 for AAAA. The values
       * must be defined as TYPE NUMBER , where the NUMBER can be 1-65334, for example, TYPE28. For
       * more information, see [List of DNS record
       * types](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/List_of_DNS_record_types) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-firewallrulegroup-firewallrule.html#cfn-route53resolver-firewallrulegroup-firewallrule-qtype)
       */
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
