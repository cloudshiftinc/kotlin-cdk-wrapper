@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.waf

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnIPSet
import software.constructs.Construct

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see
 * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
 * in the developer guide.
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
 *
 * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain
 * Routing (CIDR) notation. AWS WAF supports IPv4 address ranges: /8 and any range between /16
 * through /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128.
 *
 * To specify an individual IP address, you specify the four-part IP address followed by a `/32` ,
 * for example, 192.0.2.0/32. To block a range of IP addresses, you can specify /8 or any range
 * between /16 through /32 (for IPv4) or /24, /32, /48, /56, /64, or /128 (for IPv6). For more
 * information about CIDR notation, see the Wikipedia entry
 * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * CfnIPSet cfnIPSet = CfnIPSet.Builder.create(this, "MyCfnIPSet")
 * .name("name")
 * // the properties below are optional
 * .ipSetDescriptors(List.of(Map.of(
 * "type", "type",
 * "value", "value")))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html)
 */
@CdkDslMarker
public class CfnIPSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIPSet.Builder = CfnIPSet.Builder.create(scope, id)

    private val _ipSetDescriptors: MutableList<Any> = mutableListOf()

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field
     * in the CloudFront access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
     *
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     *   CIDR notation) that web requests originate from.
     */
    public fun ipSetDescriptors(vararg ipSetDescriptors: Any) {
        _ipSetDescriptors.addAll(listOf(*ipSetDescriptors))
    }

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field
     * in the CloudFront access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
     *
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     *   CIDR notation) that web requests originate from.
     */
    public fun ipSetDescriptors(ipSetDescriptors: Collection<Any>) {
        _ipSetDescriptors.addAll(ipSetDescriptors)
    }

    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * If the `WebACL` is associated with an Amazon CloudFront distribution and the viewer did not
     * use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field
     * in the CloudFront access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-ipsetdescriptors)
     *
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     *   CIDR notation) that web requests originate from.
     */
    public fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
        cdkBuilder.ipSetDescriptors(ipSetDescriptors)
    }

    /**
     * The name of the `IPSet` .
     *
     * You can't change the name of an `IPSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-ipset.html#cfn-waf-ipset-name)
     *
     * @param name The name of the `IPSet` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnIPSet {
        if (_ipSetDescriptors.isNotEmpty()) cdkBuilder.ipSetDescriptors(_ipSetDescriptors)
        return cdkBuilder.build()
    }
}
