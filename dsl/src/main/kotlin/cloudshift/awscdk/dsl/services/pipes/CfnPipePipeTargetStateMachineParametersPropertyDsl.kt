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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using a Step Functions state machine as a target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetStateMachineParametersProperty pipeTargetStateMachineParametersProperty =
 * PipeTargetStateMachineParametersProperty.builder()
 * .invocationType("invocationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetstatemachineparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetStateMachineParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetStateMachineParametersProperty.Builder =
        CfnPipe.PipeTargetStateMachineParametersProperty.builder()

    /**
     * @param invocationType Specify whether to invoke the Step Functions state machine
     *   synchronously or asynchronously.
     * * `REQUEST_RESPONSE` (default) - Invoke synchronously. For more information, see
     *   [StartSyncExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartSyncExecution.html)
     *   in the *AWS Step Functions API Reference* .
     *
     * `REQUEST_RESPONSE` is not supported for `STANDARD` state machine workflows.
     * * `FIRE_AND_FORGET` - Invoke asynchronously. For more information, see
     *   [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     *   in the *AWS Step Functions API Reference* .
     *
     * For more information, see
     * [Invocation types](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-invocation)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
    }

    public fun build(): CfnPipe.PipeTargetStateMachineParametersProperty = cdkBuilder.build()
}
