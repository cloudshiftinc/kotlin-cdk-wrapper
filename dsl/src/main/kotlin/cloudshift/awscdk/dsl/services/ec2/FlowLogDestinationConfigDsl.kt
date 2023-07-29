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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.DestinationOptions
import software.amazon.awscdk.services.ec2.FlowLogDestinationConfig
import software.amazon.awscdk.services.ec2.FlowLogDestinationType
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket

/**
 * Flow Log Destination configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * LogGroup logGroup;
 * Role role;
 * FlowLogDestinationConfig flowLogDestinationConfig = FlowLogDestinationConfig.builder()
 * .logDestinationType(FlowLogDestinationType.CLOUD_WATCH_LOGS)
 * // the properties below are optional
 * .destinationOptions(DestinationOptions.builder()
 * .fileFormat(FlowLogFileFormat.PLAIN_TEXT)
 * .hiveCompatiblePartitions(false)
 * .perHourPartition(false)
 * .build())
 * .iamRole(role)
 * .keyPrefix("keyPrefix")
 * .logGroup(logGroup)
 * .s3Bucket(bucket)
 * .build();
 * ```
 */
@CdkDslMarker
public class FlowLogDestinationConfigDsl {
    private val cdkBuilder: FlowLogDestinationConfig.Builder = FlowLogDestinationConfig.builder()

    /** @param destinationOptions Options for writing flow logs to a supported destination. */
    public fun destinationOptions(destinationOptions: DestinationOptionsDsl.() -> Unit = {}) {
        val builder = DestinationOptionsDsl()
        builder.apply(destinationOptions)
        cdkBuilder.destinationOptions(builder.build())
    }

    /** @param destinationOptions Options for writing flow logs to a supported destination. */
    public fun destinationOptions(destinationOptions: DestinationOptions) {
        cdkBuilder.destinationOptions(destinationOptions)
    }

    /** @param iamRole The IAM Role that has access to publish to CloudWatch logs. */
    public fun iamRole(iamRole: IRole) {
        cdkBuilder.iamRole(iamRole)
    }

    /** @param keyPrefix S3 bucket key prefix to publish the flow logs to. */
    public fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
    }

    /** @param logDestinationType The type of destination to publish the flow logs to. */
    public fun logDestinationType(logDestinationType: FlowLogDestinationType) {
        cdkBuilder.logDestinationType(logDestinationType)
    }

    /** @param logGroup The CloudWatch Logs Log Group to publish the flow logs to. */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    /** @param s3Bucket S3 bucket to publish the flow logs to. */
    public fun s3Bucket(s3Bucket: IBucket) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun build(): FlowLogDestinationConfig = cdkBuilder.build()
}
