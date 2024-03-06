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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * The parameters for the SPEKE key provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * SpekeKeyProviderProperty spekeKeyProviderProperty = SpekeKeyProviderProperty.builder()
 * .drmSystems(List.of("drmSystems"))
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .resourceId("resourceId")
 * .roleArn("roleArn")
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html)
 */
@CdkDslMarker
public class CfnOriginEndpointSpekeKeyProviderPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.SpekeKeyProviderProperty.Builder =
        CfnOriginEndpoint.SpekeKeyProviderProperty.builder()

    private val _drmSystems: MutableList<String> = mutableListOf()

    /**
     * @param drmSystems The DRM solution provider you're using to protect your content during
     *   distribution.
     */
    public fun drmSystems(vararg drmSystems: String) {
        _drmSystems.addAll(listOf(*drmSystems))
    }

    /**
     * @param drmSystems The DRM solution provider you're using to protect your content during
     *   distribution.
     */
    public fun drmSystems(drmSystems: Collection<String>) {
        _drmSystems.addAll(drmSystems)
    }

    /**
     * @param encryptionContractConfiguration The encryption contract configuration associated with
     *   the SPEKE key provider.
     */
    public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
    }

    /**
     * @param encryptionContractConfiguration The encryption contract configuration associated with
     *   the SPEKE key provider.
     */
    public fun encryptionContractConfiguration(
        encryptionContractConfiguration: CfnOriginEndpoint.EncryptionContractConfigurationProperty
    ) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
    }

    /**
     * @param resourceId The unique identifier for the content. The service sends this identifier to
     *   the key server to identify the current endpoint. How unique you make this identifier
     *   depends on how fine-grained you want access controls to be. The service does not permit you
     *   to use the same ID for two simultaneous encryption processes. The resource ID is also known
     *   as the content ID.
     *
     * The following example shows a resource ID: `MovieNight20171126093045`
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param roleArn The ARN for the IAM role granted by the key provider that provides access to
     *   the key provider API. This role must have a trust policy that allows MediaPackage to assume
     *   the role, and it must have a sufficient permissions policy to allow access to the specific
     *   key retrieval URL. Get this from your DRM solution provider.
     *
     * Valid format: `arn:aws:iam::{accountID}:role/{name}` . The following example shows a role
     * ARN: `arn:aws:iam::444455556666:role/SpekeAccess`
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param url The URL of the SPEKE key provider. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnOriginEndpoint.SpekeKeyProviderProperty {
        if (_drmSystems.isNotEmpty()) cdkBuilder.drmSystems(_drmSystems)
        return cdkBuilder.build()
    }
}
