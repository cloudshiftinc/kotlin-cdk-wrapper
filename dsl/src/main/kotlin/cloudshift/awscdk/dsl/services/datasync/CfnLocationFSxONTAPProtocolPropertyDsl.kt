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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

@CdkDslMarker
public class CfnLocationFSxONTAPProtocolPropertyDsl {
    private val cdkBuilder: CfnLocationFSxONTAP.ProtocolProperty.Builder =
        CfnLocationFSxONTAP.ProtocolProperty.builder()

    public fun nfs(nfs: IResolvable) {
        cdkBuilder.nfs(nfs)
    }

    public fun nfs(nfs: CfnLocationFSxONTAP.NFSProperty) {
        cdkBuilder.nfs(nfs)
    }

    public fun smb(smb: IResolvable) {
        cdkBuilder.smb(smb)
    }

    public fun smb(smb: CfnLocationFSxONTAP.SMBProperty) {
        cdkBuilder.smb(smb)
    }

    public fun build(): CfnLocationFSxONTAP.ProtocolProperty = cdkBuilder.build()
}
