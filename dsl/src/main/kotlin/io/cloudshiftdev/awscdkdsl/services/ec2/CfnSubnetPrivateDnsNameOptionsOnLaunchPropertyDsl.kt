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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSubnet

/**
 * Describes the options for instance hostnames.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PrivateDnsNameOptionsOnLaunchProperty privateDnsNameOptionsOnLaunchProperty =
 * PrivateDnsNameOptionsOnLaunchProperty.builder()
 * .enableResourceNameDnsAaaaRecord(false)
 * .enableResourceNameDnsARecord(false)
 * .hostnameType("hostnameType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-subnet-privatednsnameoptionsonlaunch.html)
 */
@CdkDslMarker
public class CfnSubnetPrivateDnsNameOptionsOnLaunchPropertyDsl {
    private val cdkBuilder: CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty.Builder =
        CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty.builder()

    /**
     * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for instance
     *   hostnames with DNS A records.
     */
    public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
    }

    /**
     * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for instance
     *   hostnames with DNS A records.
     */
    public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
    }

    /**
     * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
     *   instance hostname with DNS AAAA records.
     */
    public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
    }

    /**
     * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
     *   instance hostname with DNS AAAA records.
     */
    public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
    }

    /**
     * @param hostnameType The type of hostname for EC2 instances. For IPv4 only subnets, an
     *   instance DNS name must be based on the instance IPv4 address. For IPv6 only subnets, an
     *   instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify
     *   whether DNS names use the instance IPv4 address or the instance ID.
     */
    public fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
    }

    public fun build(): CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty = cdkBuilder.build()
}
