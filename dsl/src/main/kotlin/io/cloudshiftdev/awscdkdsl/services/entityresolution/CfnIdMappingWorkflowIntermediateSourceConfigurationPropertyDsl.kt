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
 * The Amazon S3 location that temporarily stores your data while it processes.
 *
 * Your information won't be saved permanently.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * IntermediateSourceConfigurationProperty intermediateSourceConfigurationProperty =
 * IntermediateSourceConfigurationProperty.builder()
 * .intermediateS3Path("intermediateS3Path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-intermediatesourceconfiguration.html)
 */
@CdkDslMarker
public class CfnIdMappingWorkflowIntermediateSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty.Builder =
        CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty.builder()

    /**
     * @param intermediateS3Path The Amazon S3 location (bucket and prefix). For example:
     *   `s3://provider_bucket/DOC-EXAMPLE-BUCKET`
     */
    public fun intermediateS3Path(intermediateS3Path: String) {
        cdkBuilder.intermediateS3Path(intermediateS3Path)
    }

    public fun build(): CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty =
        cdkBuilder.build()
}
