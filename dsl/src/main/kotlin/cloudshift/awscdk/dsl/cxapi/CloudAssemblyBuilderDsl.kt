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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder

/**
 * Can be used to build a cloud assembly.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * CloudAssemblyBuilder cloudAssemblyBuilder_;
 * CloudAssemblyBuilder cloudAssemblyBuilder = CloudAssemblyBuilder.Builder.create("outdir")
 * .assetOutdir("assetOutdir")
 * .parentBuilder(cloudAssemblyBuilder_)
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudAssemblyBuilderDsl(
    outdir: String,
) {
    private val cdkBuilder: CloudAssemblyBuilder.Builder =
        CloudAssemblyBuilder.Builder.create(outdir)

    /**
     * Use the given asset output directory.
     *
     * Default: - Same as the manifest outdir
     *
     * @param assetOutdir Use the given asset output directory.
     */
    public fun assetOutdir(assetOutdir: String) {
        cdkBuilder.assetOutdir(assetOutdir)
    }

    /**
     * If this builder is for a nested assembly, the parent assembly builder.
     *
     * Default: - This is a root assembly
     *
     * @param parentBuilder If this builder is for a nested assembly, the parent assembly builder.
     */
    public fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
        cdkBuilder.parentBuilder(parentBuilder)
    }

    public fun build(): CloudAssemblyBuilder = cdkBuilder.build()
}
