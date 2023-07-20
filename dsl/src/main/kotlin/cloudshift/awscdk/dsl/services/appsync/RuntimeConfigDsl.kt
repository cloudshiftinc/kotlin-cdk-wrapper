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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.RuntimeConfig
import kotlin.String

@CdkDslMarker
public class RuntimeConfigDsl {
    private val cdkBuilder: RuntimeConfig.Builder = RuntimeConfig.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun runtimeVersion(runtimeVersion: String) {
        cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public fun build(): RuntimeConfig = cdkBuilder.build()
}
