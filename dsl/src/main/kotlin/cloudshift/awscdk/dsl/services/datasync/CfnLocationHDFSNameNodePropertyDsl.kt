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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLocationHDFSNameNodePropertyDsl {
    private val cdkBuilder: CfnLocationHDFS.NameNodeProperty.Builder =
        CfnLocationHDFS.NameNodeProperty.builder()

    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnLocationHDFS.NameNodeProperty = cdkBuilder.build()
}
