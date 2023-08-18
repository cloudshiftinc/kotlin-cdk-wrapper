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

package io.cloudshiftdev.awscdkdsl.services.mediaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow

/**
 * The settings for source failover.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * FailoverConfigProperty failoverConfigProperty = FailoverConfigProperty.builder()
 * .failoverMode("failoverMode")
 * .recoveryWindow(123)
 * .sourcePriority(SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build())
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html)
 */
@CdkDslMarker
public class CfnFlowFailoverConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.FailoverConfigProperty.Builder =
        CfnFlow.FailoverConfigProperty.builder()

    /**
     * @param failoverMode The type of failover you choose for this flow. MERGE combines the source
     *   streams into a single stream, allowing graceful recovery from any single-source loss.
     *   FAILOVER allows switching between different streams. The string for this property must be
     *   entered as MERGE or FAILOVER. No other string entry is valid.
     */
    public fun failoverMode(failoverMode: String) {
        cdkBuilder.failoverMode(failoverMode)
    }

    /**
     * @param recoveryWindow The size of the buffer (delay) that the service maintains. A larger
     *   buffer means a longer delay in transmitting the stream, but more room for error correction.
     *   A smaller buffer means a shorter delay, but less room for error correction. You can choose
     *   a value from 100-500 ms. If you keep this field blank, the service uses the default value
     *   of 200 ms. This setting only applies when Failover Mode is set to MERGE.
     */
    public fun recoveryWindow(recoveryWindow: Number) {
        cdkBuilder.recoveryWindow(recoveryWindow)
    }

    /**
     * @param sourcePriority The priority you want to assign to a source. You can have a primary
     *   stream and a backup stream or two equally prioritized streams. This setting only applies
     *   when Failover Mode is set to FAILOVER.
     */
    public fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority)
    }

    /**
     * @param sourcePriority The priority you want to assign to a source. You can have a primary
     *   stream and a backup stream or two equally prioritized streams. This setting only applies
     *   when Failover Mode is set to FAILOVER.
     */
    public fun sourcePriority(sourcePriority: CfnFlow.SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority)
    }

    /**
     * @param state The state of source failover on the flow. If the state is inactive, the flow can
     *   have only one source. If the state is active, the flow can have one or two sources.
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnFlow.FailoverConfigProperty = cdkBuilder.build()
}
