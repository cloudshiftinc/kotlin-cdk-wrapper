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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEndpoint

/**
 * Endpoints can replicate all events to the secondary Region.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * ReplicationConfigProperty replicationConfigProperty = ReplicationConfigProperty.builder()
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-replicationconfig.html)
 */
@CdkDslMarker
public class CfnEndpointReplicationConfigPropertyDsl {
    private val cdkBuilder: CfnEndpoint.ReplicationConfigProperty.Builder =
        CfnEndpoint.ReplicationConfigProperty.builder()

    /** @param state The state of event replication. */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnEndpoint.ReplicationConfigProperty = cdkBuilder.build()
}
