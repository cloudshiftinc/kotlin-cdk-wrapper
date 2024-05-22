@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnResolverRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnResolverRuleProps cfnResolverRuleProps = CfnResolverRuleProps.builder()
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
public interface CfnResolverRuleProps {
  /**
   * DNS queries for this domain name are forwarded to the IP addresses that are specified in
   * `TargetIps` .
   *
   * If a query matches multiple Resolver rules (example.com and www.example.com), the query is
   * routed using the Resolver rule that contains the most specific domain name (www.example.com).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-domainname)
   */
  public fun domainName(): String

  /**
   * The name for the Resolver rule, which you specified when you created the Resolver rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The ID of the endpoint that the rule is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-resolverendpointid)
   */
  public fun resolverEndpointId(): String? = unwrap(this).getResolverEndpointId()

  /**
   * When you want to forward DNS queries for specified domain name to resolvers on your network,
   * specify `FORWARD` .
   *
   * When you have a forwarding rule to forward DNS queries for a domain to your network and you
   * want Resolver to process queries for a subdomain of that domain, specify `SYSTEM` .
   *
   * For example, to forward DNS queries for example.com to resolvers on your network, you create a
   * rule and specify `FORWARD` for `RuleType` . To then have Resolver process queries for
   * apex.example.com, you create a rule and specify `SYSTEM` for `RuleType` .
   *
   * Currently, only Resolver can create rules that have a value of `RECURSIVE` for `RuleType` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-ruletype)
   */
  public fun ruleType(): String

  /**
   * Tags help organize and categorize your Resolver rules.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
   * queries to.
   *
   * Typically, these are the IP addresses of DNS resolvers on your network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
   */
  public fun targetIps(): Any? = unwrap(this).getTargetIps()

  /**
   * A builder for [CfnResolverRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName DNS queries for this domain name are forwarded to the IP addresses that are
     * specified in `TargetIps` . 
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is
     * routed using the Resolver rule that contains the most specific domain name (www.example.com).
     */
    public fun domainName(domainName: String)

    /**
     * @param name The name for the Resolver rule, which you specified when you created the Resolver
     * rule.
     */
    public fun name(name: String)

    /**
     * @param resolverEndpointId The ID of the endpoint that the rule is associated with.
     */
    public fun resolverEndpointId(resolverEndpointId: String)

    /**
     * @param ruleType When you want to forward DNS queries for specified domain name to resolvers
     * on your network, specify `FORWARD` . 
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you
     * want Resolver to process queries for a subdomain of that domain, specify `SYSTEM` .
     *
     * For example, to forward DNS queries for example.com to resolvers on your network, you create
     * a rule and specify `FORWARD` for `RuleType` . To then have Resolver process queries for
     * apex.example.com, you create a rule and specify `SYSTEM` for `RuleType` .
     *
     * Currently, only Resolver can create rules that have a value of `RECURSIVE` for `RuleType` .
     */
    public fun ruleType(ruleType: String)

    /**
     * @param tags Tags help organize and categorize your Resolver rules.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags help organize and categorize your Resolver rules.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to.
     * Typically, these are the IP addresses of DNS resolvers on your network.
     */
    public fun targetIps(targetIps: IResolvable)

    /**
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to.
     * Typically, these are the IP addresses of DNS resolvers on your network.
     */
    public fun targetIps(targetIps: List<Any>)

    /**
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to.
     * Typically, these are the IP addresses of DNS resolvers on your network.
     */
    public fun targetIps(vararg targetIps: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.builder()

    /**
     * @param domainName DNS queries for this domain name are forwarded to the IP addresses that are
     * specified in `TargetIps` . 
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is
     * routed using the Resolver rule that contains the most specific domain name (www.example.com).
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param name The name for the Resolver rule, which you specified when you created the Resolver
     * rule.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resolverEndpointId The ID of the endpoint that the rule is associated with.
     */
    override fun resolverEndpointId(resolverEndpointId: String) {
      cdkBuilder.resolverEndpointId(resolverEndpointId)
    }

    /**
     * @param ruleType When you want to forward DNS queries for specified domain name to resolvers
     * on your network, specify `FORWARD` . 
     * When you have a forwarding rule to forward DNS queries for a domain to your network and you
     * want Resolver to process queries for a subdomain of that domain, specify `SYSTEM` .
     *
     * For example, to forward DNS queries for example.com to resolvers on your network, you create
     * a rule and specify `FORWARD` for `RuleType` . To then have Resolver process queries for
     * apex.example.com, you create a rule and specify `SYSTEM` for `RuleType` .
     *
     * Currently, only Resolver can create rules that have a value of `RECURSIVE` for `RuleType` .
     */
    override fun ruleType(ruleType: String) {
      cdkBuilder.ruleType(ruleType)
    }

    /**
     * @param tags Tags help organize and categorize your Resolver rules.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags help organize and categorize your Resolver rules.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to.
     * Typically, these are the IP addresses of DNS resolvers on your network.
     */
    override fun targetIps(targetIps: IResolvable) {
      cdkBuilder.targetIps(targetIps.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to.
     * Typically, these are the IP addresses of DNS resolvers on your network.
     */
    override fun targetIps(targetIps: List<Any>) {
      cdkBuilder.targetIps(targetIps.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param targetIps An array that contains the IP addresses and ports that an outbound endpoint
     * forwards DNS queries to.
     * Typically, these are the IP addresses of DNS resolvers on your network.
     */
    override fun targetIps(vararg targetIps: Any): Unit = targetIps(targetIps.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps,
  ) : CdkObject(cdkObject), CfnResolverRuleProps {
    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in
     * `TargetIps` .
     *
     * If a query matches multiple Resolver rules (example.com and www.example.com), the query is
     * routed using the Resolver rule that contains the most specific domain name (www.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The name for the Resolver rule, which you specified when you created the Resolver rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The ID of the endpoint that the rule is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-resolverendpointid)
     */
    override fun resolverEndpointId(): String? = unwrap(this).getResolverEndpointId()

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
     */
    override fun ruleType(): String = unwrap(this).getRuleType()

    /**
     * Tags help organize and categorize your Resolver rules.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS
     * queries to.
     *
     * Typically, these are the IP addresses of DNS resolvers on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverrule.html#cfn-route53resolver-resolverrule-targetips)
     */
    override fun targetIps(): Any? = unwrap(this).getTargetIps()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps):
        CfnResolverRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResolverRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverRuleProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps
  }
}
