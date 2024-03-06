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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.osis.CfnPipeline

/**
 * Container for the values required to configure logging for the pipeline.
 *
 * If you don't specify these values, OpenSearch Ingestion will not publish logs from your
 * application to CloudWatch Logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.osis.*;
 * LogPublishingOptionsProperty logPublishingOptionsProperty =
 * LogPublishingOptionsProperty.builder()
 * .cloudWatchLogDestination(CloudWatchLogDestinationProperty.builder()
 * .logGroup("logGroup")
 * .build())
 * .isLoggingEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-logpublishingoptions.html)
 */
@CdkDslMarker
public class CfnPipelineLogPublishingOptionsPropertyDsl {
    private val cdkBuilder: CfnPipeline.LogPublishingOptionsProperty.Builder =
        CfnPipeline.LogPublishingOptionsProperty.builder()

    /**
     * @param cloudWatchLogDestination The destination for OpenSearch Ingestion logs sent to Amazon
     *   CloudWatch Logs. This parameter is required if `IsLoggingEnabled` is set to `true` .
     */
    public fun cloudWatchLogDestination(cloudWatchLogDestination: IResolvable) {
        cdkBuilder.cloudWatchLogDestination(cloudWatchLogDestination)
    }

    /**
     * @param cloudWatchLogDestination The destination for OpenSearch Ingestion logs sent to Amazon
     *   CloudWatch Logs. This parameter is required if `IsLoggingEnabled` is set to `true` .
     */
    public fun cloudWatchLogDestination(
        cloudWatchLogDestination: CfnPipeline.CloudWatchLogDestinationProperty
    ) {
        cdkBuilder.cloudWatchLogDestination(cloudWatchLogDestination)
    }

    /** @param isLoggingEnabled Whether logs should be published. */
    public fun isLoggingEnabled(isLoggingEnabled: Boolean) {
        cdkBuilder.isLoggingEnabled(isLoggingEnabled)
    }

    /** @param isLoggingEnabled Whether logs should be published. */
    public fun isLoggingEnabled(isLoggingEnabled: IResolvable) {
        cdkBuilder.isLoggingEnabled(isLoggingEnabled)
    }

    public fun build(): CfnPipeline.LogPublishingOptionsProperty = cdkBuilder.build()
}
