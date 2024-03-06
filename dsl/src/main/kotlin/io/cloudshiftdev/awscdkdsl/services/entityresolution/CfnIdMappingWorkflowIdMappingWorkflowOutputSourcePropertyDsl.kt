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
 * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
 * and `Output` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * IdMappingWorkflowOutputSourceProperty idMappingWorkflowOutputSourceProperty =
 * IdMappingWorkflowOutputSourceProperty.builder()
 * .outputS3Path("outputS3Path")
 * // the properties below are optional
 * .kmsArn("kmsArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowoutputsource.html)
 */
@CdkDslMarker
public class CfnIdMappingWorkflowIdMappingWorkflowOutputSourcePropertyDsl {
    private val cdkBuilder: CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty.Builder =
        CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty.builder()

    /**
     * @param kmsArn Customer AWS KMS ARN for encryption at rest. If not provided, system will use
     *   an AWS Entity Resolution managed KMS key.
     */
    public fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
    }

    /**
     * @param outputS3Path The S3 path to which AWS Entity Resolution will write the output table.
     */
    public fun outputS3Path(outputS3Path: String) {
        cdkBuilder.outputS3Path(outputS3Path)
    }

    public fun build(): CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty =
        cdkBuilder.build()
}
