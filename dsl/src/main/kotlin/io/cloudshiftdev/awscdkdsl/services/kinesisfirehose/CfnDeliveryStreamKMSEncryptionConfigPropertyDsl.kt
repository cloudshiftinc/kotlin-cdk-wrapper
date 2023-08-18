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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `KMSEncryptionConfig` property type specifies the AWS Key Management Service ( AWS KMS)
 * encryption key that Amazon Simple Storage Service (Amazon S3) uses to encrypt data delivered by
 * the Amazon Kinesis Data Firehose (Kinesis Data Firehose) stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * KMSEncryptionConfigProperty kMSEncryptionConfigProperty = KMSEncryptionConfigProperty.builder()
 * .awskmsKeyArn("awskmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamKMSEncryptionConfigPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.KMSEncryptionConfigProperty.Builder =
        CfnDeliveryStream.KMSEncryptionConfigProperty.builder()

    /**
     * @param awskmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS encryption key that Amazon
     *   S3 uses to encrypt data delivered by the Kinesis Data Firehose stream. The key must belong
     *   to the same region as the destination S3 bucket.
     */
    public fun awskmsKeyArn(awskmsKeyArn: String) {
        cdkBuilder.awskmsKeyArn(awskmsKeyArn)
    }

    public fun build(): CfnDeliveryStream.KMSEncryptionConfigProperty = cdkBuilder.build()
}
