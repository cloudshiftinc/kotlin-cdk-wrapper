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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDisk
import kotlin.String

@CdkDslMarker
public class CfnDiskAddOnPropertyDsl {
    private val cdkBuilder: CfnDisk.AddOnProperty.Builder = CfnDisk.AddOnProperty.builder()

    public fun addOnType(addOnType: String) {
        cdkBuilder.addOnType(addOnType)
    }

    public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable) {
        cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest)
    }

    public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: CfnDisk.AutoSnapshotAddOnProperty) {
        cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDisk.AddOnProperty = cdkBuilder.build()
}
