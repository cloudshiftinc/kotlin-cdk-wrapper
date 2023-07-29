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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Specifies an array of up to 5 conditions to be met, and an action to take ( `RETRY` or `EXIT` )
 * if all conditions are met.
 *
 * If none of the `EvaluateOnExit` conditions in a `RetryStrategy` match, then the job is retried.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EvaluateOnExitProperty evaluateOnExitProperty = EvaluateOnExitProperty.builder()
 * .action("action")
 * // the properties below are optional
 * .onExitCode("onExitCode")
 * .onReason("onReason")
 * .onStatusReason("onStatusReason")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-evaluateonexit.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEvaluateOnExitPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EvaluateOnExitProperty.Builder =
        CfnJobDefinition.EvaluateOnExitProperty.builder()

    /**
     * @param action Specifies the action to take if all of the specified conditions (
     *   `onStatusReason` , `onReason` , and `onExitCode` ) are met. The values aren't case
     *   sensitive.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param onExitCode Contains a glob pattern to match against the decimal representation of the
     *   `ExitCode` returned for a job. The pattern can be up to 512 characters long. It can contain
     *   only numbers, and can end with an asterisk (*) so that only the start of the string needs
     *   to be an exact match.
     *
     * The string can contain up to 512 characters.
     */
    public fun onExitCode(onExitCode: String) {
        cdkBuilder.onExitCode(onExitCode)
    }

    /**
     * @param onReason Contains a glob pattern to match against the `Reason` returned for a job. The
     *   pattern can contain up to 512 characters. It can contain letters, numbers, periods (.),
     *   colons (:), and white space (including spaces and tabs). It can optionally end with an
     *   asterisk (*) so that only the start of the string needs to be an exact match.
     */
    public fun onReason(onReason: String) {
        cdkBuilder.onReason(onReason)
    }

    /**
     * @param onStatusReason Contains a glob pattern to match against the `StatusReason` returned
     *   for a job. The pattern can contain up to 512 characters. It can contain letters, numbers,
     *   periods (.), colons (:), and white spaces (including spaces or tabs). It can optionally end
     *   with an asterisk (*) so that only the start of the string needs to be an exact match.
     */
    public fun onStatusReason(onStatusReason: String) {
        cdkBuilder.onStatusReason(onStatusReason)
    }

    public fun build(): CfnJobDefinition.EvaluateOnExitProperty = cdkBuilder.build()
}
