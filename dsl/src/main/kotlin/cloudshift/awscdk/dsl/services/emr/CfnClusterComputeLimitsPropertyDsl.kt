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
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnClusterComputeLimitsPropertyDsl {
    private val cdkBuilder: CfnCluster.ComputeLimitsProperty.Builder =
        CfnCluster.ComputeLimitsProperty.builder()

    public fun maximumCapacityUnits(maximumCapacityUnits: Number) {
        cdkBuilder.maximumCapacityUnits(maximumCapacityUnits)
    }

    public fun maximumCoreCapacityUnits(maximumCoreCapacityUnits: Number) {
        cdkBuilder.maximumCoreCapacityUnits(maximumCoreCapacityUnits)
    }

    public fun maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits: Number) {
        cdkBuilder.maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits)
    }

    public fun minimumCapacityUnits(minimumCapacityUnits: Number) {
        cdkBuilder.minimumCapacityUnits(minimumCapacityUnits)
    }

    public fun unitType(unitType: String) {
        cdkBuilder.unitType(unitType)
    }

    public fun build(): CfnCluster.ComputeLimitsProperty = cdkBuilder.build()
}
