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
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

/**
 * Describes the Active Directory to be used for client authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * DirectoryServiceAuthenticationRequestProperty directoryServiceAuthenticationRequestProperty =
 * DirectoryServiceAuthenticationRequestProperty.builder()
 * .directoryId("directoryId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html)
 */
@CdkDslMarker
public class CfnClientVpnEndpointDirectoryServiceAuthenticationRequestPropertyDsl {
    private val cdkBuilder:
        CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.Builder =
        CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.builder()

    /** @param directoryId The ID of the Active Directory to be used for authentication. */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    public fun build(): CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty =
        cdkBuilder.build()
}
