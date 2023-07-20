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
import software.amazon.awscdk.services.ec2.RequestedSubnet
import software.amazon.awscdk.services.ec2.SubnetConfiguration
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class RequestedSubnetDsl {
    private val cdkBuilder: RequestedSubnet.Builder = RequestedSubnet.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun configuration(block: SubnetConfigurationDsl.() -> Unit = {}) {
        val builder = SubnetConfigurationDsl()
        builder.apply(block)
        cdkBuilder.configuration(builder.build())
    }

    public fun configuration(configuration: SubnetConfiguration) {
        cdkBuilder.configuration(configuration)
    }

    public fun subnetConstructId(subnetConstructId: String) {
        cdkBuilder.subnetConstructId(subnetConstructId)
    }

    public fun build(): RequestedSubnet = cdkBuilder.build()
}
