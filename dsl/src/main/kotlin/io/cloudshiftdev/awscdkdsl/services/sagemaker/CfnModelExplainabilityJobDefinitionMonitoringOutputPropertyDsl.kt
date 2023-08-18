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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

/**
 * The output object for a monitoring job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringOutputProperty monitoringOutputProperty = MonitoringOutputProperty.builder()
 * .s3Output(S3OutputProperty.builder()
 * .localPath("localPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .s3UploadMode("s3UploadMode")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelexplainabilityjobdefinition-monitoringoutput.html)
 */
@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionMonitoringOutputPropertyDsl {
    private val cdkBuilder: CfnModelExplainabilityJobDefinition.MonitoringOutputProperty.Builder =
        CfnModelExplainabilityJobDefinition.MonitoringOutputProperty.builder()

    /**
     * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
     *   saved.
     */
    public fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output)
    }

    /**
     * @param s3Output The Amazon S3 storage location where the results of a monitoring job are
     *   saved.
     */
    public fun s3Output(s3Output: CfnModelExplainabilityJobDefinition.S3OutputProperty) {
        cdkBuilder.s3Output(s3Output)
    }

    public fun build(): CfnModelExplainabilityJobDefinition.MonitoringOutputProperty =
        cdkBuilder.build()
}
