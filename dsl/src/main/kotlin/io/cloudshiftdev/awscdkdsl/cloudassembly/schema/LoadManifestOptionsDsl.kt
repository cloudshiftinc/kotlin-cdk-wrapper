@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions

/**
 * Options for the loadManifest operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * LoadManifestOptions loadManifestOptions = LoadManifestOptions.builder()
 * .skipEnumCheck(false)
 * .skipVersionCheck(false)
 * .topoSort(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class LoadManifestOptionsDsl {
    private val cdkBuilder: LoadManifestOptions.Builder = LoadManifestOptions.builder()

    /**
     * @param skipEnumCheck Skip enum checks. This means you may read enum values you don't know
     *   about yet. Make sure to always check the values of enums you encounter in the manifest.
     */
    public fun skipEnumCheck(skipEnumCheck: Boolean) {
        cdkBuilder.skipEnumCheck(skipEnumCheck)
    }

    /**
     * @param skipVersionCheck Skip the version check. This means you may read a newer cloud
     *   assembly than the CX API is designed to support, and your application may not be aware of
     *   all features that in use in the Cloud Assembly.
     */
    public fun skipVersionCheck(skipVersionCheck: Boolean) {
        cdkBuilder.skipVersionCheck(skipVersionCheck)
    }

    /**
     * @param topoSort Topologically sort all artifacts. This parameter is only respected by the
     *   constructor of `CloudAssembly`. The property lives here for backwards compatibility
     *   reasons.
     */
    public fun topoSort(topoSort: Boolean) {
        cdkBuilder.topoSort(topoSort)
    }

    public fun build(): LoadManifestOptions = cdkBuilder.build()
}
