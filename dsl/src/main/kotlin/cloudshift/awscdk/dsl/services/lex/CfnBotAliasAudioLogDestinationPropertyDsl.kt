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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias

/**
 * Specifies the S3 bucket location where audio logs are stored.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * AudioLogDestinationProperty audioLogDestinationProperty = AudioLogDestinationProperty.builder()
 * .s3Bucket(S3BucketLogDestinationProperty.builder()
 * .logPrefix("logPrefix")
 * .s3BucketArn("s3BucketArn")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-audiologdestination.html)
 */
@CdkDslMarker
public class CfnBotAliasAudioLogDestinationPropertyDsl {
    private val cdkBuilder: CfnBotAlias.AudioLogDestinationProperty.Builder =
        CfnBotAlias.AudioLogDestinationProperty.builder()

    /** @param s3Bucket The S3 bucket location where audio logs are stored. */
    public fun s3Bucket(s3Bucket: IResolvable) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /** @param s3Bucket The S3 bucket location where audio logs are stored. */
    public fun s3Bucket(s3Bucket: CfnBotAlias.S3BucketLogDestinationProperty) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun build(): CfnBotAlias.AudioLogDestinationProperty = cdkBuilder.build()
}
