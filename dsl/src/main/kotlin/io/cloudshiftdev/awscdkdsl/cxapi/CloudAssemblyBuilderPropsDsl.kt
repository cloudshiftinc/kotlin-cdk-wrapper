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

package io.cloudshiftdev.awscdkdsl.cxapi

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder
import software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps

/**
 * Construction properties for CloudAssemblyBuilder.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * CloudAssemblyBuilder cloudAssemblyBuilder;
 * CloudAssemblyBuilderProps cloudAssemblyBuilderProps = CloudAssemblyBuilderProps.builder()
 * .assetOutdir("assetOutdir")
 * .parentBuilder(cloudAssemblyBuilder)
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudAssemblyBuilderPropsDsl {
    private val cdkBuilder: CloudAssemblyBuilderProps.Builder = CloudAssemblyBuilderProps.builder()

    /** @param assetOutdir Use the given asset output directory. */
    public fun assetOutdir(assetOutdir: String) {
        cdkBuilder.assetOutdir(assetOutdir)
    }

    /**
     * @param parentBuilder If this builder is for a nested assembly, the parent assembly builder.
     */
    public fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
        cdkBuilder.parentBuilder(parentBuilder)
    }

    public fun build(): CloudAssemblyBuilderProps = cdkBuilder.build()
}
