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
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * An object that contains the name and file location for a file being deleted by a workflow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * DeleteStepDetailsProperty deleteStepDetailsProperty = DeleteStepDetailsProperty.builder()
 * .name("name")
 * .sourceFileLocation("sourceFileLocation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-deletestepdetails.html)
 */
@CdkDslMarker
public class CfnWorkflowDeleteStepDetailsPropertyDsl {
    private val cdkBuilder: CfnWorkflow.DeleteStepDetailsProperty.Builder =
        CfnWorkflow.DeleteStepDetailsProperty.builder()

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

    public fun build(): CfnWorkflow.DeleteStepDetailsProperty = cdkBuilder.build()
}
