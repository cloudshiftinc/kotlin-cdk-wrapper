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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
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
 * LoggingConfigurationProperty loggingConfigurationProperty =
 * LoggingConfigurationProperty.builder()
 * .destinationBucketName("destinationBucketName")
 * .logFilePrefix("logFilePrefix")
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

    public fun build(): CfnBucket.LoggingConfigurationProperty = cdkBuilder.build()
}
