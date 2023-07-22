@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.wafv2.CfnIPSetProps

/**
 * Properties for defining a `CfnIPSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CfnIPSetProps cfnIPSetProps = CfnIPSetProps.builder()
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
@CdkDslMarker
public class CfnIPSetPropsDsl {
  private val cdkBuilder: CfnIPSetProps.Builder = CfnIPSetProps.builder()

  private val _addresses: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param addresses Contains an array of strings that specifies zero or more IP addresses or
   * blocks of IP addresses. 
   * All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. AWS WAF
   * supports all IPv4 and IPv6 CIDR ranges except for `/0` .
   *
   * Example address strings:
   *
   * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
   * 192.0.2.44, specify `192.0.2.44/32` .
   * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
   * from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
   * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
   * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
   * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
   * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
   * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
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
   */
  public fun addresses(vararg addresses: String) {
    _addresses.addAll(listOf(*addresses))
  }

  /**
   * @param addresses Contains an array of strings that specifies zero or more IP addresses or
   * blocks of IP addresses. 
   * All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. AWS WAF
   * supports all IPv4 and IPv6 CIDR ranges except for `/0` .
   *
   * Example address strings:
   *
   * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
   * 192.0.2.44, specify `192.0.2.44/32` .
   * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
   * from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
   * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
   * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
   * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
   * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
   * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
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
   */
  public fun addresses(addresses: Collection<String>) {
    _addresses.addAll(addresses)
  }

  /**
   * @param description A description of the IP set that helps with identification.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param ipAddressVersion The version of the IP addresses, either `IPV4` or `IPV6` . 
   */
  public fun ipAddressVersion(ipAddressVersion: String) {
    cdkBuilder.ipAddressVersion(ipAddressVersion)
  }

  /**
   * @param name The name of the IP set.
   * You cannot change the name of an `IPSet` after you create it.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a regional
   * application. 
   * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
   * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an AWS
   * Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
   *
   *
   * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
   * `us-east-1` .
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param tags Key:value pairs associated with an AWS resource.
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   *
   * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With AWS
   * CloudFormation , you can only add tags to AWS WAF resources during resource creation.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Key:value pairs associated with an AWS resource.
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   *
   * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With AWS
   * CloudFormation , you can only add tags to AWS WAF resources during resource creation.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnIPSetProps {
    if(_addresses.isNotEmpty()) cdkBuilder.addresses(_addresses)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
