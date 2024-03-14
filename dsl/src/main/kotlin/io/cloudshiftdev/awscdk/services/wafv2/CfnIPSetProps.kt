package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPSetProps {
  /**
   * Contains an array of strings that specifies zero or more IP addresses or blocks of IP addresses
   * that you want AWS WAF to inspect for in incoming requests.
   *
   * All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. AWS WAF
   * supports all IPv4 and IPv6 CIDR ranges except for `/0` .
   *
   * Example address strings:
   *
   * * For requests that originated from the IP address 192.0.2.44, specify `192.0.2.44/32` .
   * * For requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
   * `192.0.2.0/24` .
   * * For requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111,
   * specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
   * * For requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
   * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify `1111:0000:0000:0000:0000:0000:0000:0000/64` .
   *
   * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
   * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * .
   *
   * Example JSON `Addresses` specifications:
   *
   * * Empty array: `"Addresses": []`
   * * Array with one address: `"Addresses": ["192.0.2.44/32"]`
   * * Array with three addresses: `"Addresses": ["192.0.2.44/32", "192.0.2.0/24", "192.0.0.0/16"]`
   * * INVALID specification: `"Addresses": [""]` INVALID
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-addresses)
   */
  public fun addresses(): List<String>

  /**
   * A description of the IP set that helps with identification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The version of the IP addresses, either `IPV4` or `IPV6` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-ipaddressversion)
   */
  public fun ipAddressVersion(): String

  /**
   * The name of the IP set.
   *
   * You cannot change the name of an `IPSet` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specifies whether this is for an Amazon CloudFront distribution or for a regional application.
   *
   * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
   * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an AWS
   * Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
   *
   *
   * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
   * `us-east-1` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-scope)
   */
  public fun scope(): String

  /**
   * Key:value pairs associated with an AWS resource.
   *
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   *
   * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With AWS
   * CloudFormation , you can only add tags to AWS WAF resources during resource creation.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIPSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addresses Contains an array of strings that specifies zero or more IP addresses or
     * blocks of IP addresses that you want AWS WAF to inspect for in incoming requests. 
     * All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. AWS WAF
     * supports all IPv4 and IPv6 CIDR ranges except for `/0` .
     *
     * Example address strings:
     *
     * * For requests that originated from the IP address 192.0.2.44, specify `192.0.2.44/32` .
     * * For requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * `192.0.2.0/24` .
     * * For requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111,
     * specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * For requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * Example JSON `Addresses` specifications:
     *
     * * Empty array: `"Addresses": []`
     * * Array with one address: `"Addresses": ["192.0.2.44/32"]`
     * * Array with three addresses: `"Addresses": ["192.0.2.44/32", "192.0.2.0/24",
     * "192.0.0.0/16"]`
     * * INVALID specification: `"Addresses": [""]` INVALID
     */
    public fun addresses(addresses: List<String>)

    /**
     * @param addresses Contains an array of strings that specifies zero or more IP addresses or
     * blocks of IP addresses that you want AWS WAF to inspect for in incoming requests. 
     * All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. AWS WAF
     * supports all IPv4 and IPv6 CIDR ranges except for `/0` .
     *
     * Example address strings:
     *
     * * For requests that originated from the IP address 192.0.2.44, specify `192.0.2.44/32` .
     * * For requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * `192.0.2.0/24` .
     * * For requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111,
     * specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * For requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * Example JSON `Addresses` specifications:
     *
     * * Empty array: `"Addresses": []`
     * * Array with one address: `"Addresses": ["192.0.2.44/32"]`
     * * Array with three addresses: `"Addresses": ["192.0.2.44/32", "192.0.2.0/24",
     * "192.0.0.0/16"]`
     * * INVALID specification: `"Addresses": [""]` INVALID
     */
    public fun addresses(vararg addresses: String)

    /**
     * @param description A description of the IP set that helps with identification.
     */
    public fun description(description: String)

    /**
     * @param ipAddressVersion The version of the IP addresses, either `IPV4` or `IPV6` . 
     */
    public fun ipAddressVersion(ipAddressVersion: String)

    /**
     * @param name The name of the IP set.
     * You cannot change the name of an `IPSet` after you create it.
     */
    public fun name(name: String)

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an
     * AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     */
    public fun scope(scope: String)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnIPSetProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnIPSetProps.builder()

    /**
     * @param addresses Contains an array of strings that specifies zero or more IP addresses or
     * blocks of IP addresses that you want AWS WAF to inspect for in incoming requests. 
     * All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. AWS WAF
     * supports all IPv4 and IPv6 CIDR ranges except for `/0` .
     *
     * Example address strings:
     *
     * * For requests that originated from the IP address 192.0.2.44, specify `192.0.2.44/32` .
     * * For requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * `192.0.2.0/24` .
     * * For requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111,
     * specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * For requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * Example JSON `Addresses` specifications:
     *
     * * Empty array: `"Addresses": []`
     * * Array with one address: `"Addresses": ["192.0.2.44/32"]`
     * * Array with three addresses: `"Addresses": ["192.0.2.44/32", "192.0.2.0/24",
     * "192.0.0.0/16"]`
     * * INVALID specification: `"Addresses": [""]` INVALID
     */
    override fun addresses(addresses: List<String>) {
      cdkBuilder.addresses(addresses)
    }

    /**
     * @param addresses Contains an array of strings that specifies zero or more IP addresses or
     * blocks of IP addresses that you want AWS WAF to inspect for in incoming requests. 
     * All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. AWS WAF
     * supports all IPv4 and IPv6 CIDR ranges except for `/0` .
     *
     * Example address strings:
     *
     * * For requests that originated from the IP address 192.0.2.44, specify `192.0.2.44/32` .
     * * For requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * `192.0.2.0/24` .
     * * For requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111,
     * specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * For requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * Example JSON `Addresses` specifications:
     *
     * * Empty array: `"Addresses": []`
     * * Array with one address: `"Addresses": ["192.0.2.44/32"]`
     * * Array with three addresses: `"Addresses": ["192.0.2.44/32", "192.0.2.0/24",
     * "192.0.0.0/16"]`
     * * INVALID specification: `"Addresses": [""]` INVALID
     */
    override fun addresses(vararg addresses: String): Unit = addresses(addresses.toList())

    /**
     * @param description A description of the IP set that helps with identification.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ipAddressVersion The version of the IP addresses, either `IPV4` or `IPV6` . 
     */
    override fun ipAddressVersion(ipAddressVersion: String) {
      cdkBuilder.ipAddressVersion(ipAddressVersion)
    }

    /**
     * @param name The name of the IP set.
     * You cannot change the name of an `IPSet` after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an
     * AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wafv2.CfnIPSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSetProps,
  ) : CdkObject(cdkObject), CfnIPSetProps {
    /**
     * Contains an array of strings that specifies zero or more IP addresses or blocks of IP
     * addresses that you want AWS WAF to inspect for in incoming requests.
     *
     * All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. AWS WAF
     * supports all IPv4 and IPv6 CIDR ranges except for `/0` .
     *
     * Example address strings:
     *
     * * For requests that originated from the IP address 192.0.2.44, specify `192.0.2.44/32` .
     * * For requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * `192.0.2.0/24` .
     * * For requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111,
     * specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * For requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * Example JSON `Addresses` specifications:
     *
     * * Empty array: `"Addresses": []`
     * * Array with one address: `"Addresses": ["192.0.2.44/32"]`
     * * Array with three addresses: `"Addresses": ["192.0.2.44/32", "192.0.2.0/24",
     * "192.0.0.0/16"]`
     * * INVALID specification: `"Addresses": [""]` INVALID
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-addresses)
     */
    override fun addresses(): List<String> = unwrap(this).getAddresses()

    /**
     * A description of the IP set that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The version of the IP addresses, either `IPV4` or `IPV6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-ipaddressversion)
     */
    override fun ipAddressVersion(): String = unwrap(this).getIpAddressVersion()

    /**
     * The name of the IP set.
     *
     * You cannot change the name of an `IPSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional
     * application.
     *
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an
     * AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-scope)
     */
    override fun scope(): String = unwrap(this).getScope()

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSetProps): CfnIPSetProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPSetProps): software.amazon.awscdk.services.wafv2.CfnIPSetProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.wafv2.CfnIPSetProps
  }
}
