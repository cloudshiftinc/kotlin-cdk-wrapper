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
import software.amazon.awscdk.cloudassembly.schema.RuntimeInfo
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class RuntimeInfoDsl {
    private val cdkBuilder: RuntimeInfo.Builder = RuntimeInfo.builder()

    public fun libraries(libraries: Map<String, String>) {
        cdkBuilder.libraries(libraries)
    }

    public fun build(): RuntimeInfo = cdkBuilder.build()
}
