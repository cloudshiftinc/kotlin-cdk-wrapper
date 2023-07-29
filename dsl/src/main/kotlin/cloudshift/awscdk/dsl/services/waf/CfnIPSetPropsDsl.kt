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

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnIPSetProps

/**
 * Properties for defining a `CfnIPSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * CfnIPSetProps cfnIPSetProps = CfnIPSetProps.builder()
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
public class CfnIPSetPropsDsl {
    private val cdkBuilder: CfnIPSetProps.Builder = CfnIPSetProps.builder()

    private val _ipSetDescriptors: MutableList<Any> = mutableListOf()

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     *   CIDR notation) that web requests originate from. If the `WebACL` is associated with an
     *   Amazon CloudFront distribution and the viewer did not use an HTTP proxy or a load balancer
     *   to send the request, this is the value of the c-ip field in the CloudFront access logs.
     */
    public fun ipSetDescriptors(vararg ipSetDescriptors: Any) {
        _ipSetDescriptors.addAll(listOf(*ipSetDescriptors))
    }

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     *   CIDR notation) that web requests originate from. If the `WebACL` is associated with an
     *   Amazon CloudFront distribution and the viewer did not use an HTTP proxy or a load balancer
     *   to send the request, this is the value of the c-ip field in the CloudFront access logs.
     */
    public fun ipSetDescriptors(ipSetDescriptors: Collection<Any>) {
        _ipSetDescriptors.addAll(ipSetDescriptors)
    }

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     *   CIDR notation) that web requests originate from. If the `WebACL` is associated with an
     *   Amazon CloudFront distribution and the viewer did not use an HTTP proxy or a load balancer
     *   to send the request, this is the value of the c-ip field in the CloudFront access logs.
     */
    public fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
        cdkBuilder.ipSetDescriptors(ipSetDescriptors)
    }

    /**
     * @param name The name of the `IPSet` . You can't change the name of an `IPSet` after you
     *   create it.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnIPSetProps {
        if (_ipSetDescriptors.isNotEmpty()) cdkBuilder.ipSetDescriptors(_ipSetDescriptors)
        return cdkBuilder.build()
    }
}
