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
import software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
import kotlin.String

@CdkDslMarker
public class NestedCloudAssemblyPropertiesDsl {
    private val cdkBuilder: NestedCloudAssemblyProperties.Builder =
        NestedCloudAssemblyProperties.builder()

    public fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun build(): NestedCloudAssemblyProperties = cdkBuilder.build()
}
