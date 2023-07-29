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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage

/**
 * TODO</p>.
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

    /** @param keyArn The ARN for a KMS key that is used to encrypt studio data.</p>. */
    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    /** @param keyType <p/>. */
    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    public fun build(): CfnStreamingImage.StreamingImageEncryptionConfigurationProperty =
        cdkBuilder.build()
}
