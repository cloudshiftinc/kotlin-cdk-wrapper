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
import software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class AssetManifestPropertiesDsl {
    private val cdkBuilder: AssetManifestProperties.Builder = AssetManifestProperties.builder()

    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
        cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
        cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun build(): AssetManifestProperties = cdkBuilder.build()
}
