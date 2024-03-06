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

package io.cloudshiftdev.awscdkdsl.services.nimblestudio

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage

/**
 * Specifies how a streaming image is encrypted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * StreamingImageEncryptionConfigurationProperty streamingImageEncryptionConfigurationProperty =
 * StreamingImageEncryptionConfigurationProperty.builder()
 * .keyType("keyType")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnStreamingImageStreamingImageEncryptionConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.Builder =
        CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.builder()

    /** @param keyArn The ARN for a KMS key that is used to encrypt studio data. */
    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    /** @param keyType The type of KMS key that is used to encrypt studio data. */
    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    public fun build(): CfnStreamingImage.StreamingImageEncryptionConfigurationProperty =
        cdkBuilder.build()
}
