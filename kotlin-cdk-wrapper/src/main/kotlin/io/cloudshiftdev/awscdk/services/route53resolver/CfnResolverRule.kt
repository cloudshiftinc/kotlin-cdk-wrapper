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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries pass
 * through, one domain name that you want to forward to your network, and the IP addresses of the DNS
 * resolvers in your network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnResolverRule cfnResolverRule = CfnResolverRule.Builder.create(this, "MyCfnResolverRule")
 * .domainName("domainName")
 * .ruleType("ruleType")
 * // the properties below are optional
 * .name("name")
 * .resolverEndpointId("resolverEndpointId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetIps(List.of(TargetAddressProperty.builder()
 * .ip("ip")
 * .ipv6("ipv6")
 * .port("port")
 * .protocol("protocol")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html)
 */
public open class CfnResolverRule(
  cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResolverRuleProps,
  ) :
      this(software.amazon.awscdk.services.route53resolver.CfnResolverRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResolverRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResolverRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResolverRuleProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the resolver rule, such as
   * `arn:aws:route53resolver:us-east-1:123456789012:resolver-rule/resolver-rule-a1bzhi` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * DNS queries for this domain name are forwarded to the IP addresses that are specified in
   * TargetIps.
   *
   * If a query matches multiple resolver rules (example.com and www.example.com), the query is
   * routed using the resolver rule that contains the most specific domain name (www.example.com).
   */
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  /**
   * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53
   * console.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The ID of the outbound endpoint that the rule is associated with, such as
   * `rslvr-out-fdc049932dexample` .
   */
  public open fun attrResolverEndpointId(): String = unwrap(this).getAttrResolverEndpointId()

  /**
   * When the value of `RuleType` is `FORWARD` , the ID that Resolver assigned to the resolver rule
   * when you created it, such as `rslvr-rr-5328a0899aexample` .
   *
   * This value isn't applicable when `RuleType` is `SYSTEM` .
   */
  public open fun attrResolverRuleId(): String = unwrap(this).getAttrResolverRuleId()

  /**
   * When the value of `RuleType` is `FORWARD` , the IP addresses that the outbound endpoint
   * forwards DNS queries to, typically the IP addresses for DNS resolvers on your network.
   *
   * This value isn't applicable when `RuleType` is `SYSTEM` .
   */
  public open fun attrTargetIps(): IResolvable =
      unwrap(this).getAttrTargetIps().let(IResolvable::wrap)

  /**
   * DNS queries for this domain name are forwarded to the IP addresses that are specified in
   * `TargetIps` .
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * DNS queries for this domain name are forwarded to the IP addresses that are specified in
   * `TargetIps` .
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name for the Resolver rule, which you specified when you created the Resolver rule.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name for the Resolver rule, which you specified when you created the Resolver rule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ID of the endpoint that the rule is associated with.
   */
  public open fun resolverEndpointId(): String? = unwrap(this).getResolverEndpointId()

  /**
   * The ID of the endpoint that the rule is associated with.
   */
  public open fun resolverEndpointId(`value`: String) {
    unwrap(this).setResolverEndpointId(`value`)
  }

  /**
   * When you want to forward DNS queries for specified domain name to resolvers on your network,
   * specify `FORWARD` .
   */
  public open fun ruleType(): String = unwrap(this).getRuleType()

  /**
   * When you want to forward DNS queries for specified domain name to resolvers on your network,
   * specify `FORWARD` .
   */
  public open fun ruleType(`value`: String) {
    unwrap(this).setRuleType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags help organize and categorize your Resolver rules.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags help organize and categorize your Resolver rules.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags help organize and categorize your Resolver rules.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
   * queries to.
   */
  public open fun targetIps(): Any? = unwrap(this).getTargetIps()

  /**
   * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
   * queries to.
   */
  public open fun targetIps(`value`: IResolvable) {
    unwrap(this).setTargetIps(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
   * queries to.
   */
  public open fun targetIps(`value`: List<Any>) {
    unwrap(this).setTargetIps(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
   * queries to.
   */
  public open fun targetIps(vararg `value`: Any): Unit = targetIps(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53resolver.CfnResolverRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in
     * `TargetIps` .
     *
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is
     * routed using the Resolver rule that contains the most specific domain name (www.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-domainname)
     * @param domainName DNS queries for this domain name are forwarded to the IP addresses that are
     * specified in `TargetIps` . 
     */
    public fun domainName(domainName: String)

    /**
     * The name for the Resolver rule, which you specified when you created the Resolver rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-name)
     * @param name The name for the Resolver rule, which you specified when you created the Resolver
     * rule. 
     */
    public fun name(name: String)

    /**
     * The ID of the endpoint that the rule is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-resolverendpointid)
     * @param resolverEndpointId The ID of the endpoint that the rule is associated with. 
     */
    public fun resolverEndpointId(resolverEndpointId: String)

    /**
     * When you want to forward DNS queries for specified domain name to resolvers on your network,
     * specify `FORWARD` .
     *
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you
     * want Resolver to process queries for a subdomain of that domain, specify `SYSTEM` .
     *
     * For example, to forward DNS queries for example.com to resolvers on your network, you create
     * a rule and specify `FORWARD` for `RuleType` . To then have Resolver process queries for
     * apex.example.com, you create a rule and specify `SYSTEM` for `RuleType` .
     *
     * Currently, only Resolver can create rules that have a value of `RECURSIVE` for `RuleType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-ruletype)
     * @param ruleType When you want to forward DNS queries for specified domain name to resolvers
     * on your network, specify `FORWARD` . 
     */
    public fun ruleType(ruleType: String)

    /**
     * Tags help organize and categorize your Resolver rules.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-tags)
     * @param tags Tags help organize and categorize your Resolver rules. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags help organize and categorize your Resolver rules.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-tags)
     * @param tags Tags help organize and categorize your Resolver rules. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to. 
     */
    public fun targetIps(targetIps: IResolvable)

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to. 
     */
    public fun targetIps(targetIps: List<Any>)

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to. 
     */
    public fun targetIps(vararg targetIps: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53resolver.CfnResolverRule.Builder
        = software.amazon.awscdk.services.route53resolver.CfnResolverRule.Builder.create(scope, id)

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in
     * `TargetIps` .
     *
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is
     * routed using the Resolver rule that contains the most specific domain name (www.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-domainname)
     * @param domainName DNS queries for this domain name are forwarded to the IP addresses that are
     * specified in `TargetIps` . 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The name for the Resolver rule, which you specified when you created the Resolver rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-name)
     * @param name The name for the Resolver rule, which you specified when you created the Resolver
     * rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ID of the endpoint that the rule is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-resolverendpointid)
     * @param resolverEndpointId The ID of the endpoint that the rule is associated with. 
     */
    override fun resolverEndpointId(resolverEndpointId: String) {
      cdkBuilder.resolverEndpointId(resolverEndpointId)
    }

    /**
     * When you want to forward DNS queries for specified domain name to resolvers on your network,
     * specify `FORWARD` .
     *
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you
     * want Resolver to process queries for a subdomain of that domain, specify `SYSTEM` .
     *
     * For example, to forward DNS queries for example.com to resolvers on your network, you create
     * a rule and specify `FORWARD` for `RuleType` . To then have Resolver process queries for
     * apex.example.com, you create a rule and specify `SYSTEM` for `RuleType` .
     *
     * Currently, only Resolver can create rules that have a value of `RECURSIVE` for `RuleType` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-ruletype)
     * @param ruleType When you want to forward DNS queries for specified domain name to resolvers
     * on your network, specify `FORWARD` . 
     */
    override fun ruleType(ruleType: String) {
      cdkBuilder.ruleType(ruleType)
    }

    /**
     * Tags help organize and categorize your Resolver rules.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-tags)
     * @param tags Tags help organize and categorize your Resolver rules. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags help organize and categorize your Resolver rules.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-tags)
     * @param tags Tags help organize and categorize your Resolver rules. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to. 
     */
    override fun targetIps(targetIps: IResolvable) {
      cdkBuilder.targetIps(targetIps.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to. 
     */
    override fun targetIps(targetIps: List<Any>) {
      cdkBuilder.targetIps(targetIps.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to. 
     */
    override fun targetIps(vararg targetIps: Any): Unit = targetIps(targetIps.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53resolver.CfnResolverRule.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.route53resolver.CfnResolverRule = wrapped.cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverRule
  }

  /**
   * In a
   * [CreateResolverRule](https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html)
   * request, an array of the IPs that you want to forward DNS queries to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.route53resolver.*;
   * TargetAddressProperty targetAddressProperty = TargetAddressProperty.builder()
   * .ip("ip")
   * .ipv6("ipv6")
   * .port("port")
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html)
   */
  public interface TargetAddressProperty {
    /**
     * One IPv4 address that you want to forward DNS queries to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html#cfn-route53resolver-resolverrule-targetaddress-ip)
     */
    public fun ip(): String? = unwrap(this).getIp()

    /**
     * One IPv6 address that you want to forward DNS queries to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html#cfn-route53resolver-resolverrule-targetaddress-ipv6)
     */
    public fun ipv6(): String? = unwrap(this).getIpv6()

    /**
     * The port at `Ip` that you want to forward DNS queries to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html#cfn-route53resolver-resolverrule-targetaddress-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints only.
     *
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html#cfn-route53resolver-resolverrule-targetaddress-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * A builder for [TargetAddressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ip One IPv4 address that you want to forward DNS queries to.
       */
      public fun ip(ip: String)

      /**
       * @param ipv6 One IPv6 address that you want to forward DNS queries to.
       */
      public fun ipv6(ipv6: String)

      /**
       * @param port The port at `Ip` that you want to forward DNS queries to.
       */
      public fun port(port: String)

      /**
       * @param protocol The protocols for the Resolver endpoints. DoH-FIPS is applicable for
       * inbound endpoints only.
       * For an inbound endpoint you can apply the protocols as follows:
       *
       * * Do53 and DoH in combination.
       * * Do53 and DoH-FIPS in combination.
       * * Do53 alone.
       * * DoH alone.
       * * DoH-FIPS alone.
       * * None, which is treated as Do53.
       *
       * For an outbound endpoint you can apply the protocols as follows:
       *
       * * Do53 and DoH in combination.
       * * Do53 alone.
       * * DoH alone.
       * * None, which is treated as Do53.
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.Builder
          =
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty.builder()

      /**
       * @param ip One IPv4 address that you want to forward DNS queries to.
       */
      override fun ip(ip: String) {
        cdkBuilder.ip(ip)
      }

      /**
       * @param ipv6 One IPv6 address that you want to forward DNS queries to.
       */
      override fun ipv6(ipv6: String) {
        cdkBuilder.ipv6(ipv6)
      }

      /**
       * @param port The port at `Ip` that you want to forward DNS queries to.
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The protocols for the Resolver endpoints. DoH-FIPS is applicable for
       * inbound endpoints only.
       * For an inbound endpoint you can apply the protocols as follows:
       *
       * * Do53 and DoH in combination.
       * * Do53 and DoH-FIPS in combination.
       * * Do53 alone.
       * * DoH alone.
       * * DoH-FIPS alone.
       * * None, which is treated as Do53.
       *
       * For an outbound endpoint you can apply the protocols as follows:
       *
       * * Do53 and DoH in combination.
       * * Do53 alone.
       * * DoH alone.
       * * None, which is treated as Do53.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty,
    ) : CdkObject(cdkObject), TargetAddressProperty {
      /**
       * One IPv4 address that you want to forward DNS queries to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html#cfn-route53resolver-resolverrule-targetaddress-ip)
       */
      override fun ip(): String? = unwrap(this).getIp()

      /**
       * One IPv6 address that you want to forward DNS queries to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html#cfn-route53resolver-resolverrule-targetaddress-ipv6)
       */
      override fun ipv6(): String? = unwrap(this).getIpv6()

      /**
       * The port at `Ip` that you want to forward DNS queries to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html#cfn-route53resolver-resolverrule-targetaddress-port)
       */
      override fun port(): String? = unwrap(this).getPort()

      /**
       * The protocols for the Resolver endpoints. DoH-FIPS is applicable for inbound endpoints
       * only.
       *
       * For an inbound endpoint you can apply the protocols as follows:
       *
       * * Do53 and DoH in combination.
       * * Do53 and DoH-FIPS in combination.
       * * Do53 alone.
       * * DoH alone.
       * * DoH-FIPS alone.
       * * None, which is treated as Do53.
       *
       * For an outbound endpoint you can apply the protocols as follows:
       *
       * * Do53 and DoH in combination.
       * * Do53 alone.
       * * DoH alone.
       * * None, which is treated as Do53.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverrule-targetaddress.html#cfn-route53resolver-resolverrule-targetaddress-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetAddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty):
          TargetAddressProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetAddressProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetAddressProperty):
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53resolver.CfnResolverRule.TargetAddressProperty
    }
  }
}
