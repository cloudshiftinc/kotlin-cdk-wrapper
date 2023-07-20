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
import software.amazon.awscdk.services.ec2.CfnHost
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnHostDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHost.Builder = CfnHost.Builder.create(scope, id)

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

    public fun build(): CfnHost = cdkBuilder.build()
}
