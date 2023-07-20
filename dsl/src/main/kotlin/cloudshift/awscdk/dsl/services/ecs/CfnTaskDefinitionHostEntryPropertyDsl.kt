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
public class CfnTaskDefinitionHostEntryPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.HostEntryProperty.Builder =
        CfnTaskDefinition.HostEntryProperty.builder()

    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    public fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
    }

    public fun build(): CfnTaskDefinition.HostEntryProperty = cdkBuilder.build()
}
