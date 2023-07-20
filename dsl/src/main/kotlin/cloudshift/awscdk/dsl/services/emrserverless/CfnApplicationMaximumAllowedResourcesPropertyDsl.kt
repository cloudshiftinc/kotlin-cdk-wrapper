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

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.emrserverless.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationMaximumAllowedResourcesPropertyDsl {
    private val cdkBuilder: CfnApplication.MaximumAllowedResourcesProperty.Builder =
        CfnApplication.MaximumAllowedResourcesProperty.builder()

    public fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
    }

    public fun disk(disk: String) {
        cdkBuilder.disk(disk)
    }

    public fun memory(memory: String) {
        cdkBuilder.memory(memory)
    }

    public fun build(): CfnApplication.MaximumAllowedResourcesProperty = cdkBuilder.build()
}
