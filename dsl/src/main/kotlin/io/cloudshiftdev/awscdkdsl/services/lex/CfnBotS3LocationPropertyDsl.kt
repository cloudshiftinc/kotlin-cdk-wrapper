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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Defines an Amazon S3 bucket location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3ObjectKey("s3ObjectKey")
 * // the properties below are optional
 * .s3ObjectVersion("s3ObjectVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-s3location.html)
 */
@CdkDslMarker
public class CfnBotS3LocationPropertyDsl {
    private val cdkBuilder: CfnBot.S3LocationProperty.Builder = CfnBot.S3LocationProperty.builder()

    /** @param s3Bucket The S3 bucket name. */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /** @param s3ObjectKey The path and file name to the object in the S3 bucket. */
    public fun s3ObjectKey(s3ObjectKey: String) {
        cdkBuilder.s3ObjectKey(s3ObjectKey)
    }

    /** @param s3ObjectVersion The version of the object in the S3 bucket. */
    public fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
    }

    public fun build(): CfnBot.S3LocationProperty = cdkBuilder.build()
}
