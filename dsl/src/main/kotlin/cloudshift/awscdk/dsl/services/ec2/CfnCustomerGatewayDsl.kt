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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnCustomerGateway
import software.constructs.Construct

/**
 * Specifies a customer gateway.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnCustomerGateway cfnCustomerGateway = CfnCustomerGateway.Builder.create(this,
 * "MyCfnCustomerGateway")
 * .bgpAsn(123)
 * .ipAddress("ipAddress")
 * .type("type")
 * // the properties below are optional
 * .deviceName("deviceName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html)
 */
@CdkDslMarker
public class CfnCustomerGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCustomerGateway.Builder =
        CfnCustomerGateway.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * For devices that support BGP, the customer gateway's BGP ASN.
     *
     * Default: 65000
     *
     * Default: - 65000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasn)
     *
     * @param bgpAsn For devices that support BGP, the customer gateway's BGP ASN.
     */
    public fun bgpAsn(bgpAsn: Number) {
        cdkBuilder.bgpAsn(bgpAsn)
    }

    /**
     * The name of customer gateway device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
     *
     * @param deviceName The name of customer gateway device.
     */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /**
     * IPv4 address for the customer gateway device's outside interface.
     *
     * The address must be static.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
     *
     * @param ipAddress IPv4 address for the customer gateway device's outside interface.
     */
    public fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * One or more tags for the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
     *
     * @param tags One or more tags for the customer gateway.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * One or more tags for the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
     *
     * @param tags One or more tags for the customer gateway.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
     *
     * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCustomerGateway {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
