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
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * Represents the Amazon S3 logging configuration settings for the pipe.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * S3LogDestinationProperty s3LogDestinationProperty = S3LogDestinationProperty.builder()
 * .bucketName("bucketName")
 * .bucketOwner("bucketOwner")
 * .outputFormat("outputFormat")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-s3logdestination.html)
 */
@CdkDslMarker
public class CfnPipeS3LogDestinationPropertyDsl {
    private val cdkBuilder: CfnPipe.S3LogDestinationProperty.Builder =
        CfnPipe.S3LogDestinationProperty.builder()

    /**
     * @param bucketName The name of the Amazon S3 bucket to which EventBridge delivers the log
     *   records for the pipe.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketOwner The AWS account that owns the Amazon S3 bucket to which EventBridge
     *   delivers the log records for the pipe.
     */
    public fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
    }

    /**
     * @param outputFormat The format EventBridge uses for the log records.
     * * `json` : JSON
     * * `plain` : Plain text
     * * `w3c` :
     *   [W3C extended logging file format](https://docs.aws.amazon.com/https://www.w3.org/TR/WD-logfile)
     */
    public fun outputFormat(outputFormat: String) {
        cdkBuilder.outputFormat(outputFormat)
    }

    /**
     * @param prefix The prefix text with which to begin Amazon S3 log object names. For more
     *   information, see
     *   [Organizing objects using prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html)
     *   in the *Amazon Simple Storage Service User Guide* .
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnPipe.S3LogDestinationProperty = cdkBuilder.build()
}
