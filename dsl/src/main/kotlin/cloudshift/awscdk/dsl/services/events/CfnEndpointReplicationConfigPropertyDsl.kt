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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnEndpoint
import kotlin.String

@CdkDslMarker
public class CfnEndpointReplicationConfigPropertyDsl {
    private val cdkBuilder: CfnEndpoint.ReplicationConfigProperty.Builder =
        CfnEndpoint.ReplicationConfigProperty.builder()

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnEndpoint.ReplicationConfigProperty = cdkBuilder.build()
}
