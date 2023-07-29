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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
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
 * MssEncryptionProperty mssEncryptionProperty = MssEncryptionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssencryption.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationMssEncryptionPropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.MssEncryptionProperty.Builder =
        CfnPackagingConfiguration.MssEncryptionProperty.builder()

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

    public fun build(): CfnPackagingConfiguration.MssEncryptionProperty = cdkBuilder.build()
}
