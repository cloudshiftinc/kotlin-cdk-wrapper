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
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-mssencryption.html)
 */
@CdkDslMarker
public class CfnOriginEndpointMssEncryptionPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.MssEncryptionProperty.Builder =
        CfnOriginEndpoint.MssEncryptionProperty.builder()

    /** @param spekeKeyProvider Parameters for the SPEKE key provider. */
    public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    /** @param spekeKeyProvider Parameters for the SPEKE key provider. */
    public fun spekeKeyProvider(spekeKeyProvider: CfnOriginEndpoint.SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    public fun build(): CfnOriginEndpoint.MssEncryptionProperty = cdkBuilder.build()
}
