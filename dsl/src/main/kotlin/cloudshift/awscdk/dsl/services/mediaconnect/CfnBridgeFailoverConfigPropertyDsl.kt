@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import kotlin.String

/**
 * The settings for source failover.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * FailoverConfigProperty failoverConfigProperty = FailoverConfigProperty.builder()
 * .failoverMode("failoverMode")
 * // the properties below are optional
 * .sourcePriority(SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build())
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-failoverconfig.html)
 */
@CdkDslMarker
public class CfnBridgeFailoverConfigPropertyDsl {
    private val cdkBuilder: CfnBridge.FailoverConfigProperty.Builder =
        CfnBridge.FailoverConfigProperty.builder()

    /**
     * @param failoverMode The type of failover you choose for this flow.
     * MERGE combines the source streams into a single stream, allowing graceful recovery from any
     * single-source loss. FAILOVER allows switching between different streams.
     */
    public fun failoverMode(failoverMode: String) {
        cdkBuilder.failoverMode(failoverMode)
    }

    /**
     * @param sourcePriority The priority you want to assign to a source.
     * You can have a primary stream and a backup stream or two equally prioritized streams. This
     * setting only applies when Failover Mode is set to FAILOVER.
     */
    public fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority)
    }

    /**
     * @param sourcePriority The priority you want to assign to a source.
     * You can have a primary stream and a backup stream or two equally prioritized streams. This
     * setting only applies when Failover Mode is set to FAILOVER.
     */
    public fun sourcePriority(sourcePriority: CfnBridge.SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority)
    }

    /**
     * @param state The state of source failover on the flow.
     * If the state is inactive, the flow can have only one source. If the state is active, the flow
     * can have one or two sources.
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnBridge.FailoverConfigProperty = cdkBuilder.build()
}
