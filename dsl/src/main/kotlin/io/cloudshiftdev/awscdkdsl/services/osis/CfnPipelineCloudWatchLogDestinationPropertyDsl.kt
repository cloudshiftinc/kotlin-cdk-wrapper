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

package io.cloudshiftdev.awscdkdsl.services.osis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.osis.CfnPipeline

/**
 * The destination for OpenSearch Ingestion logs sent to Amazon CloudWatch.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.osis.*;
 * CloudWatchLogDestinationProperty cloudWatchLogDestinationProperty =
 * CloudWatchLogDestinationProperty.builder()
 * .logGroup("logGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-cloudwatchlogdestination.html)
 */
@CdkDslMarker
public class CfnPipelineCloudWatchLogDestinationPropertyDsl {
    private val cdkBuilder: CfnPipeline.CloudWatchLogDestinationProperty.Builder =
        CfnPipeline.CloudWatchLogDestinationProperty.builder()

    /**
     * @param logGroup The name of the CloudWatch Logs group to send pipeline logs to. You can
     *   specify an existing log group or create a new one. For example,
     *   `/aws/vendedlogs/OpenSearchService/pipelines` .
     */
    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): CfnPipeline.CloudWatchLogDestinationProperty = cdkBuilder.build()
}
