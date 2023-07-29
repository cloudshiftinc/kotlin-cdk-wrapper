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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnLaunch

/**
 * Use this structure to start and stop the launch.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * ExecutionStatusObjectProperty executionStatusObjectProperty =
 * ExecutionStatusObjectProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .desiredState("desiredState")
 * .reason("reason")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-launch-executionstatusobject.html)
 */
@CdkDslMarker
public class CfnLaunchExecutionStatusObjectPropertyDsl {
    private val cdkBuilder: CfnLaunch.ExecutionStatusObjectProperty.Builder =
        CfnLaunch.ExecutionStatusObjectProperty.builder()

    /**
     * @param desiredState If you are using AWS CloudFormation to stop this launch, specify either
     *   `COMPLETED` or `CANCELLED` here to indicate how to classify this experiment. If you omit
     *   this parameter, the default of `COMPLETED` is used.
     */
    public fun desiredState(desiredState: String) {
        cdkBuilder.desiredState(desiredState)
    }

    /**
     * @param reason If you are using AWS CloudFormation to stop this launch, this is an optional
     *   field that you can use to record why the launch is being stopped or cancelled.
     */
    public fun reason(reason: String) {
        cdkBuilder.reason(reason)
    }

    /**
     * @param status To start the launch now, specify `START` for this parameter. If this launch is
     *   currently running and you want to stop it now, specify `STOP` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnLaunch.ExecutionStatusObjectProperty = cdkBuilder.build()
}
