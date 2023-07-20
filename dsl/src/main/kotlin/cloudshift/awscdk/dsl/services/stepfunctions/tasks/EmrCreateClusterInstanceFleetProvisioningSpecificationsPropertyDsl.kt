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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import kotlin.Unit

@CdkDslMarker
public class EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.Builder =
        EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

    public fun spotSpecification(
        block: EmrCreateClusterSpotProvisioningSpecificationPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = EmrCreateClusterSpotProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        cdkBuilder.spotSpecification(builder.build())
    }

    public fun spotSpecification(spotSpecification: EmrCreateCluster.SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    public fun build(): EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty =
        cdkBuilder.build()
}
