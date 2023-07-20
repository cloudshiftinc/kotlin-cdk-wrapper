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
import software.amazon.awscdk.services.datasync.CfnLocationHDFS
import kotlin.String

@CdkDslMarker
public class CfnLocationHDFSQopConfigurationPropertyDsl {
    private val cdkBuilder: CfnLocationHDFS.QopConfigurationProperty.Builder =
        CfnLocationHDFS.QopConfigurationProperty.builder()

    public fun dataTransferProtection(dataTransferProtection: String) {
        cdkBuilder.dataTransferProtection(dataTransferProtection)
    }

    public fun rpcProtection(rpcProtection: String) {
        cdkBuilder.rpcProtection(rpcProtection)
    }

    public fun build(): CfnLocationHDFS.QopConfigurationProperty = cdkBuilder.build()
}
