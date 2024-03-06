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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys for
 * a bucket.
 *
 * For examples and more information, see
 * [PUT Bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html)
 * in the *Amazon S3 API Reference* .
 *
 * To successfully complete the `AWS::S3::Bucket LoggingConfiguration` request, you must have
 * `s3:PutObject` and `s3:PutObjectAcl` in your IAM permissions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Object simplePrefix;
 * LoggingConfigurationProperty loggingConfigurationProperty =
 * LoggingConfigurationProperty.builder()
 * .destinationBucketName("destinationBucketName")
 * .logFilePrefix("logFilePrefix")
 * .targetObjectKeyFormat(TargetObjectKeyFormatProperty.builder()
 * .partitionedPrefix(PartitionedPrefixProperty.builder()
 * .partitionDateSource("partitionDateSource")
 * .build())
 * .simplePrefix(simplePrefix)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketLoggingConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.LoggingConfigurationProperty.Builder =
        CfnBucket.LoggingConfigurationProperty.builder()

    /**
     * @param destinationBucketName The name of the bucket where Amazon S3 should store server
     *   access log files. You can store log files in any bucket that you own. By default, logs are
     *   stored in the bucket where the `LoggingConfiguration` property is defined.
     */
    public fun destinationBucketName(destinationBucketName: String) {
        cdkBuilder.destinationBucketName(destinationBucketName)
    }

    /**
     * @param logFilePrefix A prefix for all log object keys. If you store log files from multiple
     *   Amazon S3 buckets in a single bucket, you can use a prefix to distinguish which log files
     *   came from which bucket.
     */
    public fun logFilePrefix(logFilePrefix: String) {
        cdkBuilder.logFilePrefix(logFilePrefix)
    }

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. Only one format, either
     *   PartitionedPrefix or SimplePrefix, is allowed.
     */
    public fun targetObjectKeyFormat(targetObjectKeyFormat: IResolvable) {
        cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat)
    }

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. Only one format, either
     *   PartitionedPrefix or SimplePrefix, is allowed.
     */
    public fun targetObjectKeyFormat(
        targetObjectKeyFormat: CfnBucket.TargetObjectKeyFormatProperty
    ) {
        cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat)
    }

    public fun build(): CfnBucket.LoggingConfigurationProperty = cdkBuilder.build()
}
