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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * The location of audio log files collected when conversation logging is enabled for a bot.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiologdestination.html)
 */
@CdkDslMarker
public class CfnBotAudioLogDestinationPropertyDsl {
    private val cdkBuilder: CfnBot.AudioLogDestinationProperty.Builder =
        CfnBot.AudioLogDestinationProperty.builder()

    /** @param s3Bucket Specifies the Amazon S3 bucket where the audio files are stored. */
    public fun s3Bucket(s3Bucket: IResolvable) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /** @param s3Bucket Specifies the Amazon S3 bucket where the audio files are stored. */
    public fun s3Bucket(s3Bucket: CfnBot.S3BucketLogDestinationProperty) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun build(): CfnBot.AudioLogDestinationProperty = cdkBuilder.build()
}
