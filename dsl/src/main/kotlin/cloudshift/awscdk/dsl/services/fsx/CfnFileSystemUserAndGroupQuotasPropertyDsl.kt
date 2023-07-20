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
import software.amazon.awscdk.services.fsx.CfnFileSystem
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFileSystemUserAndGroupQuotasPropertyDsl {
    private val cdkBuilder: CfnFileSystem.UserAndGroupQuotasProperty.Builder =
        CfnFileSystem.UserAndGroupQuotasProperty.builder()

    public fun id(id: Number) {
        cdkBuilder.id(id)
    }

    public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFileSystem.UserAndGroupQuotasProperty = cdkBuilder.build()
}
