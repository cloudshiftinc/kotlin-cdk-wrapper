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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties

/**
 * Artifact properties for nested cloud assemblies.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * NestedCloudAssemblyProperties nestedCloudAssemblyProperties =
 * NestedCloudAssemblyProperties.builder()
 * .directoryName("directoryName")
 * // the properties below are optional
 * .displayName("displayName")
 * .build();
 * ```
 */
@CdkDslMarker
public class NestedCloudAssemblyPropertiesDsl {
    private val cdkBuilder: NestedCloudAssemblyProperties.Builder =
        NestedCloudAssemblyProperties.builder()

    /** @param directoryName Relative path to the nested cloud assembly. */
    public fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
    }

    /** @param displayName Display name for the cloud assembly. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun build(): NestedCloudAssemblyProperties = cdkBuilder.build()
}
