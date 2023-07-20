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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.datasync.CfnLocationSMB
import kotlin.String

@CdkDslMarker
public class CfnLocationSMBMountOptionsPropertyDsl {
    private val cdkBuilder: CfnLocationSMB.MountOptionsProperty.Builder =
        CfnLocationSMB.MountOptionsProperty.builder()

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnLocationSMB.MountOptionsProperty = cdkBuilder.build()
}
