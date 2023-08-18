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
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * The type of hostnames to assign to instances in the subnet at launch.
 *
 * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6
 * only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you
 * can specify whether DNS names use the instance IPv4 address or the instance ID. For more
 * information, see
 * [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
 * in the *Amazon Elastic Compute Cloud User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PrivateDnsNameOptionsProperty privateDnsNameOptionsProperty =
 * PrivateDnsNameOptionsProperty.builder()
 * .enableResourceNameDnsAaaaRecord(false)
 * .enableResourceNameDnsARecord(false)
 * .hostnameType("hostnameType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html)
 */
@CdkDslMarker
public class CfnInstancePrivateDnsNameOptionsPropertyDsl {
    private val cdkBuilder: CfnInstance.PrivateDnsNameOptionsProperty.Builder =
        CfnInstance.PrivateDnsNameOptionsProperty.builder()

    /**
     * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for instance
     *   hostnames with DNS A records. For more information, see
     *   [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
    }

    /**
     * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for instance
     *   hostnames with DNS A records. For more information, see
     *   [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
    }

    /**
     * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
     *   instance hostnames with DNS AAAA records. For more information, see
     *   [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
    }

    /**
     * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
     *   instance hostnames with DNS AAAA records. For more information, see
     *   [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
    }

    /**
     * @param hostnameType The type of hostnames to assign to instances in the subnet at launch. For
     *   IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
     *   IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     *   subnets, you can specify whether DNS names use the instance IPv4 address or the instance
     *   ID. For more information, see
     *   [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
    }

    public fun build(): CfnInstance.PrivateDnsNameOptionsProperty = cdkBuilder.build()
}
