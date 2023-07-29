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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

/**
 * Selects whether or not the state machine's AWS X-Ray tracing is enabled.
 *
 * To configure your state machine to send trace data to X-Ray, set `Enabled` to `true` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * TracingConfigurationProperty tracingConfigurationProperty =
 * TracingConfigurationProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-tracingconfiguration.html)
 */
@CdkDslMarker
public class CfnStateMachineTracingConfigurationPropertyDsl {
    private val cdkBuilder: CfnStateMachine.TracingConfigurationProperty.Builder =
        CfnStateMachine.TracingConfigurationProperty.builder()

    /** @param enabled When set to `true` , X-Ray tracing is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled When set to `true` , X-Ray tracing is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnStateMachine.TracingConfigurationProperty = cdkBuilder.build()
}
