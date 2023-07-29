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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.PublicSubnetProps

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PublicSubnetProps publicSubnetProps = PublicSubnetProps.builder()
 * .availabilityZone("availabilityZone")
 * .cidrBlock("cidrBlock")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .mapPublicIpOnLaunch(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class PublicSubnetPropsDsl {
    private val cdkBuilder: PublicSubnetProps.Builder = PublicSubnetProps.builder()

    /** @param availabilityZone The availability zone for the subnet. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param cidrBlock The CIDR notation for this subnet. */
    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param mapPublicIpOnLaunch Controls if a public IP is associated to an instance at launch.
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /** @param vpcId The VPC which this subnet is part of. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): PublicSubnetProps = cdkBuilder.build()
}
