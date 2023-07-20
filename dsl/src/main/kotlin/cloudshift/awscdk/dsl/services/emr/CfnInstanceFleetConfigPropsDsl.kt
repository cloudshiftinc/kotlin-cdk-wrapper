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
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInstanceFleetConfigPropsDsl {
    private val cdkBuilder: CfnInstanceFleetConfigProps.Builder =
        CfnInstanceFleetConfigProps.builder()

    private val _instanceTypeConfigs: MutableList<Any> = mutableListOf()

    public fun clusterId(clusterId: String) {
        cdkBuilder.clusterId(clusterId)
    }

    public fun instanceFleetType(instanceFleetType: String) {
        cdkBuilder.instanceFleetType(instanceFleetType)
    }

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

    public fun launchSpecifications(launchSpecifications: CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty) {
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

    public fun build(): CfnInstanceFleetConfigProps {
        if (_instanceTypeConfigs.isNotEmpty()) cdkBuilder.instanceTypeConfigs(_instanceTypeConfigs)
        return cdkBuilder.build()
    }
}
