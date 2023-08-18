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
import software.amazon.awscdk.cxapi.AssemblyBuildOptions

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * AssemblyBuildOptions assemblyBuildOptions = AssemblyBuildOptions.builder().build();
 * ```
 */
@CdkDslMarker
public class AssemblyBuildOptionsDsl {
    private val cdkBuilder: AssemblyBuildOptions.Builder = AssemblyBuildOptions.builder()

    public fun build(): AssemblyBuildOptions = cdkBuilder.build()
}
