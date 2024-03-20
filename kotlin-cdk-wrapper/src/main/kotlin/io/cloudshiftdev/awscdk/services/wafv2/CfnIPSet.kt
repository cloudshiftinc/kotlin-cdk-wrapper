@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
 *
 * For information, including how to migrate your AWS WAF resources from the prior release, see the
 * [AWS WAF developer guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
 *
 * Use an `IPSet` to identify web requests that originate from specific IP addresses or ranges of IP
 * addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can
 * configure AWS WAF to block them using an IP set that lists those IP addresses.
 *
 * You use an IP set by providing its Amazon Resource Name (ARN) to the rule statement
 * `IPSetReferenceStatement` , when you add a rule to a rule group or web ACL.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wafv2.*;
 * CfnIPSet cfnIPSet = CfnIPSet.Builder.create(this, "MyCfnIPSet")
 * .addresses(List.of("addresses"))
 * .ipAddressVersion("ipAddressVersion")
 * .scope("scope")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html)
 */
public open class CfnIPSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPSetProps,
  ) :
      this(software.amazon.awscdk.services.wafv2.CfnIPSet(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnIPSetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIPSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIPSetProps(props)
  )

  /**
   * Contains an array of strings that specifies zero or more IP addresses or blocks of IP addresses
   * that you want AWS WAF to inspect for in incoming requests.
   */
  public open fun addresses(): List<String> = unwrap(this).getAddresses()

  /**
   * Contains an array of strings that specifies zero or more IP addresses or blocks of IP addresses
   * that you want AWS WAF to inspect for in incoming requests.
   */
  public open fun addresses(`value`: List<String>) {
    unwrap(this).setAddresses(`value`)
  }

  /**
   * Contains an array of strings that specifies zero or more IP addresses or blocks of IP addresses
   * that you want AWS WAF to inspect for in incoming requests.
   */
  public open fun addresses(vararg `value`: String): Unit = addresses(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the IP set.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the IP set.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of the IP set that helps with identification.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the IP set that helps with identification.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The version of the IP addresses, either `IPV4` or `IPV6` .
   */
  public open fun ipAddressVersion(): String = unwrap(this).getIpAddressVersion()

  /**
   * The version of the IP addresses, either `IPV4` or `IPV6` .
   */
  public open fun ipAddressVersion(`value`: String) {
    unwrap(this).setIpAddressVersion(`value`)
  }

  /**
   * The name of the IP set.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the IP set.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies whether this is for an Amazon CloudFront distribution or for a regional application.
   */
  public open fun scope(): String = unwrap(this).getScope()

  /**
   * Specifies whether this is for an Amazon CloudFront distribution or for a regional application.
   */
  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wafv2.CfnIPSet].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param addresses Contains an array of strings that specifies zero or more IP addresses or
     * blocks of IP addresses that you want AWS WAF to inspect for in incoming requests. 
     */
    public fun addresses(addresses: List<String>)

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
     * @param addresses Contains an array of strings that specifies zero or more IP addresses or
     * blocks of IP addresses that you want AWS WAF to inspect for in incoming requests. 
     */
    public fun addresses(vararg addresses: String)

    /**
     * A description of the IP set that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-description)
     * @param description A description of the IP set that helps with identification. 
     */
    public fun description(description: String)

    /**
     * The version of the IP addresses, either `IPV4` or `IPV6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-ipaddressversion)
     * @param ipAddressVersion The version of the IP addresses, either `IPV4` or `IPV6` . 
     */
    public fun ipAddressVersion(ipAddressVersion: String)

    /**
     * The name of the IP set.
     *
     * You cannot change the name of an `IPSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-name)
     * @param name The name of the IP set. 
     */
    public fun name(name: String)

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
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     */
    public fun scope(scope: String)

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
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnIPSet.Builder =
        software.amazon.awscdk.services.wafv2.CfnIPSet.Builder.create(scope, id)

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
     * @param addresses Contains an array of strings that specifies zero or more IP addresses or
     * blocks of IP addresses that you want AWS WAF to inspect for in incoming requests. 
     */
    override fun addresses(addresses: List<String>) {
      cdkBuilder.addresses(addresses)
    }

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
     * @param addresses Contains an array of strings that specifies zero or more IP addresses or
     * blocks of IP addresses that you want AWS WAF to inspect for in incoming requests. 
     */
    override fun addresses(vararg addresses: String): Unit = addresses(addresses.toList())

    /**
     * A description of the IP set that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-description)
     * @param description A description of the IP set that helps with identification. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The version of the IP addresses, either `IPV4` or `IPV6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-ipaddressversion)
     * @param ipAddressVersion The version of the IP addresses, either `IPV4` or `IPV6` . 
     */
    override fun ipAddressVersion(ipAddressVersion: String) {
      cdkBuilder.ipAddressVersion(ipAddressVersion)
    }

    /**
     * The name of the IP set.
     *
     * You cannot change the name of an `IPSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html#cfn-wafv2-ipset-name)
     * @param name The name of the IP set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

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
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wafv2.CfnIPSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wafv2.CfnIPSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSet): CfnIPSet =
        CfnIPSet(cdkObject)

    internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.wafv2.CfnIPSet =
        wrapped.cdkObject
  }
}
