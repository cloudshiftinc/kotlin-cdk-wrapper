@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDirectoryConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnDirectoryConfigProps cfnDirectoryConfigProps = CfnDirectoryConfigProps.builder()
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
public interface CfnDirectoryConfigProps {
  /**
   * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider
   * (IdP) user identities to Active Directory domain-joined streaming instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
   */
  public fun certificateBasedAuthProperties(): Any? =
      unwrap(this).getCertificateBasedAuthProperties()

  /**
   * The fully qualified name of the directory (for example, corp.example.com).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname)
   */
  public fun directoryName(): String

  /**
   * The distinguished names of the organizational units for computer accounts.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames)
   */
  public fun organizationalUnitDistinguishedNames(): List<String>

  /**
   * The credentials for the service account used by the streaming instance to connect to the
   * directory.
   *
   * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter with
   * `noEcho` as shown in the
   * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
   * . For best practices information, see [Do Not Embed Credentials in Your
   * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-serviceaccountcredentials)
   */
  public fun serviceAccountCredentials(): Any

  /**
   * A builder for [CfnDirectoryConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances.
     */
    public fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable)

    /**
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances.
     */
    public
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty)

    /**
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b3590bf0669f8003996f708eab51c98d8a7b7dbeb5f23c8c81c3437179a6511")
    public
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder.() -> Unit)

    /**
     * @param directoryName The fully qualified name of the directory (for example,
     * corp.example.com). 
     */
    public fun directoryName(directoryName: String)

    /**
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     * units for computer accounts. 
     */
    public
        fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: List<String>)

    /**
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     * units for computer accounts. 
     */
    public fun organizationalUnitDistinguishedNames(vararg
        organizationalUnitDistinguishedNames: String)

    /**
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see [Do Not Embed Credentials in Your
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     */
    public fun serviceAccountCredentials(serviceAccountCredentials: IResolvable)

    /**
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see [Do Not Embed Credentials in Your
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     */
    public
        fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty)

    /**
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see [Do Not Embed Credentials in Your
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("976f38bbdbc165844453fd5d7a6c8d50f7b2b4054fc5d7632cba157e9d867ad7")
    public
        fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.Builder =
        software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps.builder()

    /**
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances.
     */
    override fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable) {
      cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances.
     */
    override
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty) {
      cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties.let(CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b3590bf0669f8003996f708eab51c98d8a7b7dbeb5f23c8c81c3437179a6511")
    override
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder.() -> Unit):
        Unit =
        certificateBasedAuthProperties(CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty(certificateBasedAuthProperties))

    /**
     * @param directoryName The fully qualified name of the directory (for example,
     * corp.example.com). 
     */
    override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
    }

    /**
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     * units for computer accounts. 
     */
    override
        fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: List<String>) {
      cdkBuilder.organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames)
    }

    /**
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     * units for computer accounts. 
     */
    override fun organizationalUnitDistinguishedNames(vararg
        organizationalUnitDistinguishedNames: String): Unit =
        organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames.toList())

    /**
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see [Do Not Embed Credentials in Your
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     */
    override fun serviceAccountCredentials(serviceAccountCredentials: IResolvable) {
      cdkBuilder.serviceAccountCredentials(serviceAccountCredentials.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see [Do Not Embed Credentials in Your
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     */
    override
        fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty) {
      cdkBuilder.serviceAccountCredentials(serviceAccountCredentials.let(CfnDirectoryConfig.ServiceAccountCredentialsProperty.Companion::unwrap))
    }

    /**
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see [Do Not Embed Credentials in Your
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("976f38bbdbc165844453fd5d7a6c8d50f7b2b4054fc5d7632cba157e9d867ad7")
    override
        fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.() -> Unit):
        Unit =
        serviceAccountCredentials(CfnDirectoryConfig.ServiceAccountCredentialsProperty(serviceAccountCredentials))

    public fun build(): software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps,
  ) : CdkObject(cdkObject), CfnDirectoryConfigProps {
    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     */
    override fun certificateBasedAuthProperties(): Any? =
        unwrap(this).getCertificateBasedAuthProperties()

    /**
     * The fully qualified name of the directory (for example, corp.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname)
     */
    override fun directoryName(): String = unwrap(this).getDirectoryName()

    /**
     * The distinguished names of the organizational units for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames)
     */
    override fun organizationalUnitDistinguishedNames(): List<String> =
        unwrap(this).getOrganizationalUnitDistinguishedNames()

    /**
     * The credentials for the service account used by the streaming instance to connect to the
     * directory.
     *
     * Do not use this parameter directly. Use `ServiceAccountCredentials` as an input parameter
     * with `noEcho` as shown in the
     * [Parameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html)
     * . For best practices information, see [Do Not Embed Credentials in Your
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#creds)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-serviceaccountcredentials)
     */
    override fun serviceAccountCredentials(): Any = unwrap(this).getServiceAccountCredentials()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDirectoryConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps):
        CfnDirectoryConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDirectoryConfigProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryConfigProps):
        software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps
  }
}
