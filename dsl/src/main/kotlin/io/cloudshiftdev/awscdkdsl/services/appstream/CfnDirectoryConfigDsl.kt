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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.constructs.Construct

/**
 * The `AWS::AppStream::DirectoryConfig` resource specifies the configuration information required
 * to join Amazon AppStream 2.0 fleets and image builders to Microsoft Active Directory domains.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnDirectoryConfig cfnDirectoryConfig = CfnDirectoryConfig.Builder.create(this,
 * "MyCfnDirectoryConfig")
 * .directoryName("directoryName")
 * .organizationalUnitDistinguishedNames(List.of("organizationalUnitDistinguishedNames"))
 * .serviceAccountCredentials(ServiceAccountCredentialsProperty.builder()
 * .accountName("accountName")
 * .accountPassword("accountPassword")
 * .build())
 * // the properties below are optional
 * .certificateBasedAuthProperties(CertificateBasedAuthPropertiesProperty.builder()
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .status("status")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html)
 */
@CdkDslMarker
public class CfnDirectoryConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDirectoryConfig.Builder =
        CfnDirectoryConfig.Builder.create(scope, id)

    private val _organizationalUnitDistinguishedNames: MutableList<String> = mutableListOf()

    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     *
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     *   authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory
     *   domain-joined streaming instances.
     */
    public fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable) {
        cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties)
    }

    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     *
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     *   authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory
     *   domain-joined streaming instances.
     */
    public fun certificateBasedAuthProperties(
        certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty
    ) {
        cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties)
    }

    /**
     * The fully qualified name of the directory (for example, corp.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname)
     *
     * @param directoryName The fully qualified name of the directory (for example,
     *   corp.example.com).
     */
    public fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
    }

    /**
     * The distinguished names of the organizational units for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames)
     *
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     *   units for computer accounts.
     */
    public fun organizationalUnitDistinguishedNames(
        vararg organizationalUnitDistinguishedNames: String
    ) {
        _organizationalUnitDistinguishedNames.addAll(listOf(*organizationalUnitDistinguishedNames))
    }

    /**
     * The distinguished names of the organizational units for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames)
     *
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     *   units for computer accounts.
     */
    public fun organizationalUnitDistinguishedNames(
        organizationalUnitDistinguishedNames: Collection<String>
    ) {
        _organizationalUnitDistinguishedNames.addAll(organizationalUnitDistinguishedNames)
    }

    /**
     * The credentials for the service account used by the streaming instance to connect to the
     * directory.
     *
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see
     * [Do Not Embed Credentials in Your Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-serviceaccountcredentials)
     *
     * @param serviceAccountCredentials The credentials for the service account used by the
     *   streaming instance to connect to the directory.
     */
    public fun serviceAccountCredentials(serviceAccountCredentials: IResolvable) {
        cdkBuilder.serviceAccountCredentials(serviceAccountCredentials)
    }

    /**
     * The credentials for the service account used by the streaming instance to connect to the
     * directory.
     *
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see
     * [Do Not Embed Credentials in Your Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-serviceaccountcredentials)
     *
     * @param serviceAccountCredentials The credentials for the service account used by the
     *   streaming instance to connect to the directory.
     */
    public fun serviceAccountCredentials(
        serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty
    ) {
        cdkBuilder.serviceAccountCredentials(serviceAccountCredentials)
    }

    public fun build(): CfnDirectoryConfig {
        if (_organizationalUnitDistinguishedNames.isNotEmpty())
            cdkBuilder.organizationalUnitDistinguishedNames(_organizationalUnitDistinguishedNames)
        return cdkBuilder.build()
    }
}
