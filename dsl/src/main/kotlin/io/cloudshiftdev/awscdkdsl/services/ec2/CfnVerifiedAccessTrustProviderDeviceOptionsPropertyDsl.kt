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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider

/**
 * Describes the options for an AWS Verified Access device-identity based trust provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * DeviceOptionsProperty deviceOptionsProperty = DeviceOptionsProperty.builder()
 * .publicSigningKeyUrl("publicSigningKeyUrl")
 * .tenantId("tenantId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccesstrustprovider-deviceoptions.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder =
        CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.builder()

    /**
     * @param publicSigningKeyUrl The URL AWS Verified Access will use to verify the authenticity of
     *   the device tokens.
     */
    public fun publicSigningKeyUrl(publicSigningKeyUrl: String) {
        cdkBuilder.publicSigningKeyUrl(publicSigningKeyUrl)
    }

    /** @param tenantId The ID of the tenant application with the device-identity provider. */
    public fun tenantId(tenantId: String) {
        cdkBuilder.tenantId(tenantId)
    }

    public fun build(): CfnVerifiedAccessTrustProvider.DeviceOptionsProperty = cdkBuilder.build()
}
