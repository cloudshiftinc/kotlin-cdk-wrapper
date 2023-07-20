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
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS

@CdkDslMarker
public class CfnLocationFSxOpenZFSProtocolPropertyDsl {
    private val cdkBuilder: CfnLocationFSxOpenZFS.ProtocolProperty.Builder =
        CfnLocationFSxOpenZFS.ProtocolProperty.builder()

    public fun nfs(nfs: IResolvable) {
        cdkBuilder.nfs(nfs)
    }

    public fun nfs(nfs: CfnLocationFSxOpenZFS.NFSProperty) {
        cdkBuilder.nfs(nfs)
    }

    public fun build(): CfnLocationFSxOpenZFS.ProtocolProperty = cdkBuilder.build()
}
