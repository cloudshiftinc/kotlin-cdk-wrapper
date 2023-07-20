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
import software.amazon.awscdk.services.ec2.CfnHostProps
import kotlin.String

@CdkDslMarker
public class CfnHostPropsDsl {
    private val cdkBuilder: CfnHostProps.Builder = CfnHostProps.builder()

    public fun autoPlacement(autoPlacement: String) {
        cdkBuilder.autoPlacement(autoPlacement)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun hostMaintenance(hostMaintenance: String) {
        cdkBuilder.hostMaintenance(hostMaintenance)
    }

    public fun hostRecovery(hostRecovery: String) {
        cdkBuilder.hostRecovery(hostRecovery)
    }

    public fun instanceFamily(instanceFamily: String) {
        cdkBuilder.instanceFamily(instanceFamily)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    public fun build(): CfnHostProps = cdkBuilder.build()
}
