@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.CloudAssembly
import kotlin.Boolean
import kotlin.String

/**
 * Represents a deployable cloud application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * CloudAssembly cloudAssembly = CloudAssembly.Builder.create("directory")
 * .skipEnumCheck(false)
 * .skipVersionCheck(false)
 * .topoSort(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudAssemblyDsl(
    directory: String
) {
    private val cdkBuilder: CloudAssembly.Builder = CloudAssembly.Builder.create(directory)

    /**
     * Skip enum checks.
     *
     * This means you may read enum values you don't know about yet. Make sure to always
     * check the values of enums you encounter in the manifest.
     *
     * Default: false
     *
     * @param skipEnumCheck Skip enum checks.
     */
    public fun skipEnumCheck(skipEnumCheck: Boolean) {
        cdkBuilder.skipEnumCheck(skipEnumCheck)
    }

    /**
     * Skip the version check.
     *
     * This means you may read a newer cloud assembly than the CX API is designed
     * to support, and your application may not be aware of all features that in use
     * in the Cloud Assembly.
     *
     * Default: false
     *
     * @param skipVersionCheck Skip the version check.
     */
    public fun skipVersionCheck(skipVersionCheck: Boolean) {
        cdkBuilder.skipVersionCheck(skipVersionCheck)
    }

    /**
     * Topologically sort all artifacts.
     *
     * This parameter is only respected by the constructor of `CloudAssembly`. The
     * property lives here for backwards compatibility reasons.
     *
     * Default: true
     *
     * @param topoSort Topologically sort all artifacts.
     */
    public fun topoSort(topoSort: Boolean) {
        cdkBuilder.topoSort(topoSort)
    }

    public fun build(): CloudAssembly = cdkBuilder.build()
}
