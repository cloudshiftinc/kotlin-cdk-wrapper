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
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.RequestedSubnet
import software.amazon.awscdk.services.ec2.SubnetConfiguration

/**
 * Subnet requested for allocation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * RequestedSubnet requestedSubnet = RequestedSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .configuration(SubnetConfiguration.builder()
 * .name("name")
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * // the properties below are optional
 * .cidrMask(123)
 * .mapPublicIpOnLaunch(false)
 * .reserved(false)
 * .build())
 * .subnetConstructId("subnetConstructId")
 * .build();
 * ```
 */
@CdkDslMarker
public class RequestedSubnetDsl {
    private val cdkBuilder: RequestedSubnet.Builder = RequestedSubnet.builder()

    /** @param availabilityZone The availability zone for the subnet. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param configuration Specify configuration parameters for a single subnet group in a VPC. */
    public fun configuration(configuration: SubnetConfigurationDsl.() -> Unit = {}) {
        val builder = SubnetConfigurationDsl()
        builder.apply(configuration)
        cdkBuilder.configuration(builder.build())
    }

    /** @param configuration Specify configuration parameters for a single subnet group in a VPC. */
    public fun configuration(configuration: SubnetConfiguration) {
        cdkBuilder.configuration(configuration)
    }

    /** @param subnetConstructId Id for the Subnet construct. */
    public fun subnetConstructId(subnetConstructId: String) {
        cdkBuilder.subnetConstructId(subnetConstructId)
    }

    public fun build(): RequestedSubnet = cdkBuilder.build()
}
