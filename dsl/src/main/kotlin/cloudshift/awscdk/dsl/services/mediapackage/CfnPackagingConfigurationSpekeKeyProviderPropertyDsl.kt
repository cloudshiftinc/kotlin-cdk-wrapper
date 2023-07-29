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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE)
 * service that provides encryption keys.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * SpekeKeyProviderProperty spekeKeyProviderProperty = SpekeKeyProviderProperty.builder()
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationSpekeKeyProviderPropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.SpekeKeyProviderProperty.Builder =
        CfnPackagingConfiguration.SpekeKeyProviderProperty.builder()

    private val _systemIds: MutableList<String> = mutableListOf()

    /**
     * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure one
     *   or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
     *   encryption contract defines which content keys are used to encrypt the audio and video
     *   tracks in your stream. To configure the encryption contract, specify which audio and video
     *   encryption presets to use.
     */
    public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
    }

    /**
     * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure one
     *   or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
     *   encryption contract defines which content keys are used to encrypt the audio and video
     *   tracks in your stream. To configure the encryption contract, specify which audio and video
     *   encryption presets to use.
     */
    public fun encryptionContractConfiguration(
        encryptionContractConfiguration:
            CfnPackagingConfiguration.EncryptionContractConfigurationProperty
    ) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
    }

    /**
     * @param roleArn The ARN for the IAM role that's granted by the key provider to provide access
     *   to the key provider API. Valid format: arn:aws:iam::{accountID}:role/{name}
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
     *   CPIX specification.
     */
    public fun systemIds(vararg systemIds: String) {
        _systemIds.addAll(listOf(*systemIds))
    }

    /**
     * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
     *   CPIX specification.
     */
    public fun systemIds(systemIds: Collection<String>) {
        _systemIds.addAll(systemIds)
    }

    /**
     * @param url URL for the key provider's key retrieval API endpoint. Must start with https://.
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnPackagingConfiguration.SpekeKeyProviderProperty {
        if (_systemIds.isNotEmpty()) cdkBuilder.systemIds(_systemIds)
        return cdkBuilder.build()
    }
}
