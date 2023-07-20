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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionRuntimePlatformPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.RuntimePlatformProperty.Builder =
        CfnTaskDefinition.RuntimePlatformProperty.builder()

    public fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
    }

    public fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
    }

    public fun build(): CfnTaskDefinition.RuntimePlatformProperty = cdkBuilder.build()
}
