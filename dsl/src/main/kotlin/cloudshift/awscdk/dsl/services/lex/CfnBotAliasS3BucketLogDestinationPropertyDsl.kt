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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBotAlias

/**
 * Specifies an Amazon S3 bucket for logging audio conversations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * S3BucketLogDestinationProperty s3BucketLogDestinationProperty =
 * S3BucketLogDestinationProperty.builder()
 * .logPrefix("logPrefix")
 * .s3BucketArn("s3BucketArn")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-s3bucketlogdestination.html)
 */
@CdkDslMarker
public class CfnBotAliasS3BucketLogDestinationPropertyDsl {
    private val cdkBuilder: CfnBotAlias.S3BucketLogDestinationProperty.Builder =
        CfnBotAlias.S3BucketLogDestinationProperty.builder()

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key
     *   for encrypting audio log files stored in an Amazon S3 bucket.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /** @param logPrefix The S3 prefix to assign to audio log files. */
    public fun logPrefix(logPrefix: String) {
        cdkBuilder.logPrefix(logPrefix)
    }

    /**
     * @param s3BucketArn The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log
     *   files are stored.
     */
    public fun s3BucketArn(s3BucketArn: String) {
        cdkBuilder.s3BucketArn(s3BucketArn)
    }

    public fun build(): CfnBotAlias.S3BucketLogDestinationProperty = cdkBuilder.build()
}
