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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterInstanceFleetConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.InstanceFleetConfigProperty.Builder =
        CfnCluster.InstanceFleetConfigProperty.builder()

    private val _instanceTypeConfigs: MutableList<Any> = mutableListOf()

    public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any) {
        _instanceTypeConfigs.addAll(listOf(*instanceTypeConfigs))
    }

    public fun instanceTypeConfigs(instanceTypeConfigs: Collection<Any>) {
        _instanceTypeConfigs.addAll(instanceTypeConfigs)
    }

    public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs)
    }

    public fun launchSpecifications(launchSpecifications: IResolvable) {
        cdkBuilder.launchSpecifications(launchSpecifications)
    }

    public fun launchSpecifications(launchSpecifications: CfnCluster.InstanceFleetProvisioningSpecificationsProperty) {
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

    public fun build(): CfnCluster.InstanceFleetConfigProperty {
        if (_instanceTypeConfigs.isNotEmpty()) cdkBuilder.instanceTypeConfigs(_instanceTypeConfigs)
        return cdkBuilder.build()
    }
}
