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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EmrCreateClusterInstanceFleetConfigPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.InstanceFleetConfigProperty.Builder =
        EmrCreateCluster.InstanceFleetConfigProperty.builder()

    private val _instanceTypeConfigs: MutableList<EmrCreateCluster.InstanceTypeConfigProperty> =
        mutableListOf()

    public fun instanceFleetType(instanceFleetType: EmrCreateCluster.InstanceRoleType) {
        cdkBuilder.instanceFleetType(instanceFleetType)
    }

    public fun instanceTypeConfigs(instanceTypeConfigs: EmrCreateClusterInstanceTypeConfigPropertyDsl.() -> Unit) {
        _instanceTypeConfigs.add(EmrCreateClusterInstanceTypeConfigPropertyDsl().apply(instanceTypeConfigs).build())
    }

    public fun instanceTypeConfigs(instanceTypeConfigs: Collection<EmrCreateCluster.InstanceTypeConfigProperty>) {
        _instanceTypeConfigs.addAll(instanceTypeConfigs)
    }

    public fun launchSpecifications(
        block: EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl()
        builder.apply(block)
        cdkBuilder.launchSpecifications(builder.build())
    }

    public fun launchSpecifications(launchSpecifications: EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty) {
        cdkBuilder.launchSpecifications(launchSpecifications)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
        cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
    }

    public fun targetSpotCapacity(targetSpotCapacity: Number) {
        cdkBuilder.targetSpotCapacity(targetSpotCapacity)
    }

    public fun build(): EmrCreateCluster.InstanceFleetConfigProperty {
        if (_instanceTypeConfigs.isNotEmpty()) cdkBuilder.instanceTypeConfigs(_instanceTypeConfigs)
        return cdkBuilder.build()
    }
}
