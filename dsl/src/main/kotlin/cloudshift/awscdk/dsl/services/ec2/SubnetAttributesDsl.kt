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
import software.amazon.awscdk.services.ec2.SubnetAttributes
import kotlin.String

@CdkDslMarker
public class SubnetAttributesDsl {
    private val cdkBuilder: SubnetAttributes.Builder = SubnetAttributes.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun ipv4CidrBlock(ipv4CidrBlock: String) {
        cdkBuilder.ipv4CidrBlock(ipv4CidrBlock)
    }

    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): SubnetAttributes = cdkBuilder.build()
}
