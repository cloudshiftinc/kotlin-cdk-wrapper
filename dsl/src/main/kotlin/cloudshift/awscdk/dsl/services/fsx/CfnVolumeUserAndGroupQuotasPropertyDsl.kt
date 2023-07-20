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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fsx.CfnVolume
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnVolumeUserAndGroupQuotasPropertyDsl {
    private val cdkBuilder: CfnVolume.UserAndGroupQuotasProperty.Builder =
        CfnVolume.UserAndGroupQuotasProperty.builder()

    public fun id(id: Number) {
        cdkBuilder.id(id)
    }

    public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnVolume.UserAndGroupQuotasProperty = cdkBuilder.build()
}
