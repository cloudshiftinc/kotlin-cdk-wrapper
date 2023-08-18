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

package io.cloudshiftdev.awscdkdsl.services.mediapackage

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * Holds encryption information so that access to the content can be controlled by a DRM solution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * HlsEncryptionProperty hlsEncryptionProperty = HlsEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .encryptionMethod("encryptionMethod")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationHlsEncryptionPropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.HlsEncryptionProperty.Builder =
        CfnPackagingConfiguration.HlsEncryptionProperty.builder()

    /**
     * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
     *   32-character string, used with the key for encrypting blocks. If you don't specify a
     *   constant initialization vector (IV), AWS Elemental MediaPackage periodically rotates the
     *   IV.
     */
    public fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
    }

    /** @param encryptionMethod HLS encryption type. */
    public fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
    }

    /** @param spekeKeyProvider Parameters for the SPEKE key provider. */
    public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    /** @param spekeKeyProvider Parameters for the SPEKE key provider. */
    public fun spekeKeyProvider(
        spekeKeyProvider: CfnPackagingConfiguration.SpekeKeyProviderProperty
    ) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    public fun build(): CfnPackagingConfiguration.HlsEncryptionProperty = cdkBuilder.build()
}
