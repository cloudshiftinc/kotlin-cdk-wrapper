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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions
import kotlin.Boolean

@CdkDslMarker
public class LoadManifestOptionsDsl {
    private val cdkBuilder: LoadManifestOptions.Builder = LoadManifestOptions.builder()

    public fun skipEnumCheck(skipEnumCheck: Boolean) {
        cdkBuilder.skipEnumCheck(skipEnumCheck)
    }

    public fun skipVersionCheck(skipVersionCheck: Boolean) {
        cdkBuilder.skipVersionCheck(skipVersionCheck)
    }

    public fun topoSort(topoSort: Boolean) {
        cdkBuilder.topoSort(topoSort)
    }

    public fun build(): LoadManifestOptions = cdkBuilder.build()
}
