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
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * Input object for the endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * EndpointInputProperty endpointInputProperty = EndpointInputProperty.builder()
 * .endpointName("endpointName")
 * .localPath("localPath")
 * // the properties below are optional
 * .excludeFeaturesAttribute("excludeFeaturesAttribute")
 * .s3DataDistributionType("s3DataDistributionType")
 * .s3InputMode("s3InputMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-endpointinput.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleEndpointInputPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.EndpointInputProperty.Builder =
        CfnMonitoringSchedule.EndpointInputProperty.builder()

    /**
     * @param endpointName An endpoint in customer's account which has enabled `DataCaptureConfig`
     *   enabled.
     */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param excludeFeaturesAttribute The attributes of the input data to exclude from the
     *   analysis.
     */
    public fun excludeFeaturesAttribute(excludeFeaturesAttribute: String) {
        cdkBuilder.excludeFeaturesAttribute(excludeFeaturesAttribute)
    }

    /**
     * @param localPath Path to the filesystem where the endpoint data is available to the
     *   container.
     */
    public fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
    }

    /**
     * @param s3DataDistributionType Whether input data distributed in Amazon S3 is fully replicated
     *   or sharded by an Amazon S3 key. Defaults to `FullyReplicated`
     */
    public fun s3DataDistributionType(s3DataDistributionType: String) {
        cdkBuilder.s3DataDistributionType(s3DataDistributionType)
    }

    /**
     * @param s3InputMode Whether the `Pipe` or `File` is used as the input mode for transferring
     *   data for the monitoring job. `Pipe` mode is recommended for large datasets. `File` mode is
     *   useful for small files that fit in memory. Defaults to `File` .
     */
    public fun s3InputMode(s3InputMode: String) {
        cdkBuilder.s3InputMode(s3InputMode)
    }

    public fun build(): CfnMonitoringSchedule.EndpointInputProperty = cdkBuilder.build()
}
