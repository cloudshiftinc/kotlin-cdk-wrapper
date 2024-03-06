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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * Represents the configuration settings for the logs to which this pipe should report events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeLogConfigurationProperty pipeLogConfigurationProperty =
 * PipeLogConfigurationProperty.builder()
 * .cloudwatchLogsLogDestination(CloudwatchLogsLogDestinationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .firehoseLogDestination(FirehoseLogDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .build())
 * .includeExecutionData(List.of("includeExecutionData"))
 * .level("level")
 * .s3LogDestination(S3LogDestinationProperty.builder()
 * .bucketName("bucketName")
 * .bucketOwner("bucketOwner")
 * .outputFormat("outputFormat")
 * .prefix("prefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipelogconfiguration.html)
 */
@CdkDslMarker
public class CfnPipePipeLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeLogConfigurationProperty.Builder =
        CfnPipe.PipeLogConfigurationProperty.builder()

    private val _includeExecutionData: MutableList<String> = mutableListOf()

    /** @param cloudwatchLogsLogDestination The logging configuration settings for the pipe. */
    public fun cloudwatchLogsLogDestination(cloudwatchLogsLogDestination: IResolvable) {
        cdkBuilder.cloudwatchLogsLogDestination(cloudwatchLogsLogDestination)
    }

    /** @param cloudwatchLogsLogDestination The logging configuration settings for the pipe. */
    public fun cloudwatchLogsLogDestination(
        cloudwatchLogsLogDestination: CfnPipe.CloudwatchLogsLogDestinationProperty
    ) {
        cdkBuilder.cloudwatchLogsLogDestination(cloudwatchLogsLogDestination)
    }

    /**
     * @param firehoseLogDestination The Amazon Data Firehose logging configuration settings for the
     *   pipe.
     */
    public fun firehoseLogDestination(firehoseLogDestination: IResolvable) {
        cdkBuilder.firehoseLogDestination(firehoseLogDestination)
    }

    /**
     * @param firehoseLogDestination The Amazon Data Firehose logging configuration settings for the
     *   pipe.
     */
    public fun firehoseLogDestination(
        firehoseLogDestination: CfnPipe.FirehoseLogDestinationProperty
    ) {
        cdkBuilder.firehoseLogDestination(firehoseLogDestination)
    }

    /**
     * @param includeExecutionData Whether the execution data (specifically, the `payload` ,
     *   `awsRequest` , and `awsResponse` fields) is included in the log messages for this pipe.
     *   This applies to all log destinations for the pipe.
     *
     * For more information, see
     * [Including execution data in logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data)
     * in the *Amazon EventBridge User Guide* .
     *
     * *Allowed values:* `ALL`
     */
    public fun includeExecutionData(vararg includeExecutionData: String) {
        _includeExecutionData.addAll(listOf(*includeExecutionData))
    }

    /**
     * @param includeExecutionData Whether the execution data (specifically, the `payload` ,
     *   `awsRequest` , and `awsResponse` fields) is included in the log messages for this pipe.
     *   This applies to all log destinations for the pipe.
     *
     * For more information, see
     * [Including execution data in logs](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-logs.html#eb-pipes-logs-execution-data)
     * in the *Amazon EventBridge User Guide* .
     *
     * *Allowed values:* `ALL`
     */
    public fun includeExecutionData(includeExecutionData: Collection<String>) {
        _includeExecutionData.addAll(includeExecutionData)
    }

    /**
     * @param level The level of logging detail to include. This applies to all log destinations for
     *   the pipe.
     */
    public fun level(level: String) {
        cdkBuilder.level(level)
    }

    /** @param s3LogDestination The Amazon S3 logging configuration settings for the pipe. */
    public fun s3LogDestination(s3LogDestination: IResolvable) {
        cdkBuilder.s3LogDestination(s3LogDestination)
    }

    /** @param s3LogDestination The Amazon S3 logging configuration settings for the pipe. */
    public fun s3LogDestination(s3LogDestination: CfnPipe.S3LogDestinationProperty) {
        cdkBuilder.s3LogDestination(s3LogDestination)
    }

    public fun build(): CfnPipe.PipeLogConfigurationProperty {
        if (_includeExecutionData.isNotEmpty())
            cdkBuilder.includeExecutionData(_includeExecutionData)
        return cdkBuilder.build()
    }
}
