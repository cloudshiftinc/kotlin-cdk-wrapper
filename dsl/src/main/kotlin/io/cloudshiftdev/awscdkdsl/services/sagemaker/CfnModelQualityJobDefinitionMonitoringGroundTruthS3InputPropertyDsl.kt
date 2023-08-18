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
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

/**
 * The ground truth labels for the dataset used for the monitoring job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringGroundTruthS3InputProperty monitoringGroundTruthS3InputProperty =
 * MonitoringGroundTruthS3InputProperty.builder()
 * .s3Uri("s3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-monitoringgroundtruths3input.html)
 */
@CdkDslMarker
public class CfnModelQualityJobDefinitionMonitoringGroundTruthS3InputPropertyDsl {
    private val cdkBuilder:
        CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.Builder =
        CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.builder()

    /** @param s3Uri The address of the Amazon S3 location of the ground truth labels. */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty =
        cdkBuilder.build()
}
