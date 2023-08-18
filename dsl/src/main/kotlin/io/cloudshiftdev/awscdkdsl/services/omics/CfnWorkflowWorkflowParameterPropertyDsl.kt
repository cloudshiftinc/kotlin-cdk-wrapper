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

package io.cloudshiftdev.awscdkdsl.services.omics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnWorkflow

/**
 * A workflow parameter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * WorkflowParameterProperty workflowParameterProperty = WorkflowParameterProperty.builder()
 * .description("description")
 * .optional(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflow-workflowparameter.html)
 */
@CdkDslMarker
public class CfnWorkflowWorkflowParameterPropertyDsl {
    private val cdkBuilder: CfnWorkflow.WorkflowParameterProperty.Builder =
        CfnWorkflow.WorkflowParameterProperty.builder()

    /** @param description The parameter's description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param optional Whether the parameter is optional. */
    public fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
    }

    /** @param optional Whether the parameter is optional. */
    public fun optional(optional: IResolvable) {
        cdkBuilder.optional(optional)
    }

    public fun build(): CfnWorkflow.WorkflowParameterProperty = cdkBuilder.build()
}
