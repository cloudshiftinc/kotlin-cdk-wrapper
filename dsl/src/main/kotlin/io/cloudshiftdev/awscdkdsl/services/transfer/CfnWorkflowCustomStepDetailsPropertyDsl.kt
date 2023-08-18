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

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * Details for a step that invokes an AWS Lambda function.
 *
 * Consists of the Lambda function's name, target, and timeout (in seconds).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * CustomStepDetailsProperty customStepDetailsProperty = CustomStepDetailsProperty.builder()
 * .name("name")
 * .sourceFileLocation("sourceFileLocation")
 * .target("target")
 * .timeoutSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html)
 */
@CdkDslMarker
public class CfnWorkflowCustomStepDetailsPropertyDsl {
    private val cdkBuilder: CfnWorkflow.CustomStepDetailsProperty.Builder =
        CfnWorkflow.CustomStepDetailsProperty.builder()

    /** @param name The name of the step, used as an identifier. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
     *   the output from the previous step, or the originally uploaded file for the workflow.
     * * To use the previous file as the input, enter `${previous.file}` . In this case, this
     *   workflow step uses the output file from the previous workflow step as input. This is the
     *   default value.
     * * To use the originally uploaded file location as input for this step, enter
     *   `${original.file}` .
     */
    public fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
    }

    /** @param target The ARN for the Lambda function that is being called. */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    /** @param timeoutSeconds Timeout, in seconds, for the step. */
    public fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
    }

    public fun build(): CfnWorkflow.CustomStepDetailsProperty = cdkBuilder.build()
}
