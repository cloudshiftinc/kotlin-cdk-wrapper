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
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP
import kotlin.String

@CdkDslMarker
public class CfnLocationFSxONTAPNfsMountOptionsPropertyDsl {
    private val cdkBuilder: CfnLocationFSxONTAP.NfsMountOptionsProperty.Builder =
        CfnLocationFSxONTAP.NfsMountOptionsProperty.builder()

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnLocationFSxONTAP.NfsMountOptionsProperty = cdkBuilder.build()
}
