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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig

/**
 * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider
 * (IdP) user identities to Active Directory domain-joined streaming instances.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CertificateBasedAuthPropertiesProperty certificateBasedAuthPropertiesProperty =
 * CertificateBasedAuthPropertiesProperty.builder()
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-certificatebasedauthproperties.html)
 */
@CdkDslMarker
public class CfnDirectoryConfigCertificateBasedAuthPropertiesPropertyDsl {
    private val cdkBuilder: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder =
        CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.builder()

    /**
     * @param certificateAuthorityArn The ARN of the AWS Certificate Manager Private CA resource.
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param status The status of the certificate-based authentication properties. Fallback is
     *   turned on by default when certificate-based authentication is *Enabled* . Fallback allows
     *   users to log in using their AD domain password if certificate-based authentication is
     *   unsuccessful, or to unlock a desktop lock screen. *Enabled_no_directory_login_fallback*
     *   enables certificate-based authentication, but does not allow users to log in using their AD
     *   domain password. Users will be disconnected to re-authenticate using certificates.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty =
        cdkBuilder.build()
}
