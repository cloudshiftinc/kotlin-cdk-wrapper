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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * The statistics resource for a monitoring job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * StatisticsResourceProperty statisticsResourceProperty = StatisticsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-statisticsresource.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionStatisticsResourcePropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.StatisticsResourceProperty.Builder =
        CfnDataQualityJobDefinition.StatisticsResourceProperty.builder()

    /** @param s3Uri The Amazon S3 URI for the statistics resource. */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnDataQualityJobDefinition.StatisticsResourceProperty = cdkBuilder.build()
}
