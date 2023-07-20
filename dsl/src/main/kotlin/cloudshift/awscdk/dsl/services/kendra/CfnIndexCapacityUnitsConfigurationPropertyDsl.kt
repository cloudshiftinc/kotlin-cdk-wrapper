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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kendra.CfnIndex
import kotlin.Number

@CdkDslMarker
public class CfnIndexCapacityUnitsConfigurationPropertyDsl {
    private val cdkBuilder: CfnIndex.CapacityUnitsConfigurationProperty.Builder =
        CfnIndex.CapacityUnitsConfigurationProperty.builder()

    public fun queryCapacityUnits(queryCapacityUnits: Number) {
        cdkBuilder.queryCapacityUnits(queryCapacityUnits)
    }

    public fun storageCapacityUnits(storageCapacityUnits: Number) {
        cdkBuilder.storageCapacityUnits(storageCapacityUnits)
    }

    public fun build(): CfnIndex.CapacityUnitsConfigurationProperty = cdkBuilder.build()
}
