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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.RuntimeInfo

/**
 * Information about the application's runtime components.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * RuntimeInfo runtimeInfo = RuntimeInfo.builder()
 * .libraries(Map.of(
 * "librariesKey", "libraries"))
 * .build();
 * ```
 */
@CdkDslMarker
public class RuntimeInfoDsl {
    private val cdkBuilder: RuntimeInfo.Builder = RuntimeInfo.builder()

    /**
     * @param libraries The list of libraries loaded in the application, associated with their
     *   versions.
     */
    public fun libraries(libraries: Map<String, String>) {
        cdkBuilder.libraries(libraries)
    }

    public fun build(): RuntimeInfo = cdkBuilder.build()
}
