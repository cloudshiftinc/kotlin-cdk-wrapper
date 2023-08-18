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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

/**
 * Key provider settings for DRM.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * SpekeKeyProviderProperty spekeKeyProviderProperty = SpekeKeyProviderProperty.builder()
 * .resourceId("resourceId")
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .certificateArn("certificateArn")
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-spekekeyprovider.html)
 */
@CdkDslMarker
public class CfnOriginEndpointSpekeKeyProviderPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.SpekeKeyProviderProperty.Builder =
        CfnOriginEndpoint.SpekeKeyProviderProperty.builder()

    private val _systemIds: MutableList<String> = mutableListOf()

    /**
     * @param certificateArn The Amazon Resource Name (ARN) for the certificate that you imported to
     *   AWS Certificate Manager to add content key encryption to this endpoint. For this feature to
     *   work, your DRM key provider must support content key encryption.
     */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

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
        encryptionContractConfiguration: CfnOriginEndpoint.EncryptionContractConfigurationProperty
    ) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
    }

    /**
     * @param resourceId Unique identifier for this endpoint, as it is configured in the key
     *   provider service.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param roleArn The ARN for the IAM role that's granted by the key provider to provide access
     *   to the key provider API. This role must have a trust policy that allows AWS Elemental
     *   MediaPackage to assume the role, and it must have a sufficient permissions policy to allow
     *   access to the specific key retrieval URL. Valid format:
     *   arn:aws:iam::{accountID}:role/{name}
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
     * @param url URL for the key provider’s key retrieval API endpoint. Must start with https://.
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnOriginEndpoint.SpekeKeyProviderProperty {
        if (_systemIds.isNotEmpty()) cdkBuilder.systemIds(_systemIds)
        return cdkBuilder.build()
    }
}
