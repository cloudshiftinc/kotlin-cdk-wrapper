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

package io.cloudshiftdev.awscdkdsl.services.entityresolution

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow

/**
 * An object containing `InputSourceARN` and `SchemaName` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * IdMappingWorkflowInputSourceProperty idMappingWorkflowInputSourceProperty =
 * IdMappingWorkflowInputSourceProperty.builder()
 * .inputSourceArn("inputSourceArn")
 * .schemaArn("schemaArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html)
 */
@CdkDslMarker
public class CfnIdMappingWorkflowIdMappingWorkflowInputSourcePropertyDsl {
    private val cdkBuilder: CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty.Builder =
        CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty.builder()

    /** @param inputSourceArn An AWS Glue table ARN for the input source table. */
    public fun inputSourceArn(inputSourceArn: String) {
        cdkBuilder.inputSourceArn(inputSourceArn)
    }

    /**
     * @param schemaArn The ARN (Amazon Resource Name) that AWS Entity Resolution generated for the
     *   `SchemaMapping` .
     */
    public fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty =
        cdkBuilder.build()
}
