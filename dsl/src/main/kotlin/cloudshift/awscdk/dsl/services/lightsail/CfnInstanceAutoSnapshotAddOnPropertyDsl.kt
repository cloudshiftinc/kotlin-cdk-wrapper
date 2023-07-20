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
import software.amazon.awscdk.services.lightsail.CfnInstance
import kotlin.String

@CdkDslMarker
public class CfnInstanceAutoSnapshotAddOnPropertyDsl {
    private val cdkBuilder: CfnInstance.AutoSnapshotAddOnProperty.Builder =
        CfnInstance.AutoSnapshotAddOnProperty.builder()

    public fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
        cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
    }

    public fun build(): CfnInstance.AutoSnapshotAddOnProperty = cdkBuilder.build()
}
