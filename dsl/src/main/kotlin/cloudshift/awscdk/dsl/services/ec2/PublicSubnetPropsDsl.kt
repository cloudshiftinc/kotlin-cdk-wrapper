@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.PublicSubnetProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class PublicSubnetPropsDsl {
    private val cdkBuilder: PublicSubnetProps.Builder = PublicSubnetProps.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): PublicSubnetProps = cdkBuilder.build()
}
