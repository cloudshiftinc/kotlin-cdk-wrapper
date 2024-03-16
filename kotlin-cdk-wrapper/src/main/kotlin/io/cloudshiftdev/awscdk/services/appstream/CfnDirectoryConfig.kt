@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppStream::DirectoryConfig` resource specifies the configuration information required
 * to join Amazon AppStream 2.0 fleets and image builders to Microsoft Active Directory domains.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
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
public open class CfnDirectoryConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfig,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider
   * (IdP) user identities to Active Directory domain-joined streaming instances.
   */
  public open fun certificateBasedAuthProperties(): Any? =
      unwrap(this).getCertificateBasedAuthProperties()

  /**
   * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider
   * (IdP) user identities to Active Directory domain-joined streaming instances.
   */
  public open fun certificateBasedAuthProperties(`value`: IResolvable) {
    unwrap(this).setCertificateBasedAuthProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider
   * (IdP) user identities to Active Directory domain-joined streaming instances.
   */
  public open fun certificateBasedAuthProperties(`value`: CertificateBasedAuthPropertiesProperty) {
    unwrap(this).setCertificateBasedAuthProperties(`value`.let(CertificateBasedAuthPropertiesProperty::unwrap))
  }

  /**
   * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider
   * (IdP) user identities to Active Directory domain-joined streaming instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9796d94b3c4797087e0b00d8af75510af70387797371c8d12747f44c455276ac")
  public open
      fun certificateBasedAuthProperties(`value`: CertificateBasedAuthPropertiesProperty.Builder.() -> Unit):
      Unit = certificateBasedAuthProperties(CertificateBasedAuthPropertiesProperty(`value`))

  /**
   * The fully qualified name of the directory (for example, corp.example.com).
   */
  public open fun directoryName(): String = unwrap(this).getDirectoryName()

  /**
   * The fully qualified name of the directory (for example, corp.example.com).
   */
  public open fun directoryName(`value`: String) {
    unwrap(this).setDirectoryName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The distinguished names of the organizational units for computer accounts.
   */
  public open fun organizationalUnitDistinguishedNames(): List<String> =
      unwrap(this).getOrganizationalUnitDistinguishedNames()

  /**
   * The distinguished names of the organizational units for computer accounts.
   */
  public open fun organizationalUnitDistinguishedNames(`value`: List<String>) {
    unwrap(this).setOrganizationalUnitDistinguishedNames(`value`)
  }

  /**
   * The distinguished names of the organizational units for computer accounts.
   */
  public open fun organizationalUnitDistinguishedNames(vararg `value`: String): Unit =
      organizationalUnitDistinguishedNames(`value`.toList())

  /**
   * The credentials for the service account used by the streaming instance to connect to the
   * directory.
   */
  public open fun serviceAccountCredentials(): Any = unwrap(this).getServiceAccountCredentials()

  /**
   * The credentials for the service account used by the streaming instance to connect to the
   * directory.
   */
  public open fun serviceAccountCredentials(`value`: IResolvable) {
    unwrap(this).setServiceAccountCredentials(`value`.let(IResolvable::unwrap))
  }

  /**
   * The credentials for the service account used by the streaming instance to connect to the
   * directory.
   */
  public open fun serviceAccountCredentials(`value`: ServiceAccountCredentialsProperty) {
    unwrap(this).setServiceAccountCredentials(`value`.let(ServiceAccountCredentialsProperty::unwrap))
  }

  /**
   * The credentials for the service account used by the streaming instance to connect to the
   * directory.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3efba326cefc52ba79cbbddecb8f2cb656942263b62a3395cf104b46cde47290")
  public open
      fun serviceAccountCredentials(`value`: ServiceAccountCredentialsProperty.Builder.() -> Unit):
      Unit = serviceAccountCredentials(ServiceAccountCredentialsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnDirectoryConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances. 
     */
    public fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable)

    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances. 
     */
    public
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CertificateBasedAuthPropertiesProperty)

    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07e6d87a6faf9170028e72ab6676e76579aef55404ac67cd78d7a182f56ea872")
    public
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CertificateBasedAuthPropertiesProperty.Builder.() -> Unit)

    /**
     * The fully qualified name of the directory (for example, corp.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname)
     * @param directoryName The fully qualified name of the directory (for example,
     * corp.example.com). 
     */
    public fun directoryName(directoryName: String)

    /**
     * The distinguished names of the organizational units for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames)
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     * units for computer accounts. 
     */
    public
        fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: List<String>)

    /**
     * The distinguished names of the organizational units for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames)
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     * units for computer accounts. 
     */
    public fun organizationalUnitDistinguishedNames(vararg
        organizationalUnitDistinguishedNames: String)

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
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     */
    public fun serviceAccountCredentials(serviceAccountCredentials: IResolvable)

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
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     */
    public
        fun serviceAccountCredentials(serviceAccountCredentials: ServiceAccountCredentialsProperty)

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
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5a0c83adc83a14fb99d0a0505704c2a65f27695fe7b75e36d0429547fa893c6")
    public
        fun serviceAccountCredentials(serviceAccountCredentials: ServiceAccountCredentialsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.Builder =
        software.amazon.awscdk.services.appstream.CfnDirectoryConfig.Builder.create(scope, id)

    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances. 
     */
    override fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable) {
      cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties.let(IResolvable::unwrap))
    }

    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances. 
     */
    override
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CertificateBasedAuthPropertiesProperty) {
      cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties.let(CertificateBasedAuthPropertiesProperty::unwrap))
    }

    /**
     * The certificate-based authentication properties used to authenticate SAML 2.0 Identity
     * Provider (IdP) user identities to Active Directory domain-joined streaming instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-certificatebasedauthproperties)
     * @param certificateBasedAuthProperties The certificate-based authentication properties used to
     * authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined
     * streaming instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07e6d87a6faf9170028e72ab6676e76579aef55404ac67cd78d7a182f56ea872")
    override
        fun certificateBasedAuthProperties(certificateBasedAuthProperties: CertificateBasedAuthPropertiesProperty.Builder.() -> Unit):
        Unit =
        certificateBasedAuthProperties(CertificateBasedAuthPropertiesProperty(certificateBasedAuthProperties))

    /**
     * The fully qualified name of the directory (for example, corp.example.com).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-directoryname)
     * @param directoryName The fully qualified name of the directory (for example,
     * corp.example.com). 
     */
    override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
    }

    /**
     * The distinguished names of the organizational units for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames)
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     * units for computer accounts. 
     */
    override
        fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: List<String>) {
      cdkBuilder.organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames)
    }

    /**
     * The distinguished names of the organizational units for computer accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-directoryconfig.html#cfn-appstream-directoryconfig-organizationalunitdistinguishednames)
     * @param organizationalUnitDistinguishedNames The distinguished names of the organizational
     * units for computer accounts. 
     */
    override fun organizationalUnitDistinguishedNames(vararg
        organizationalUnitDistinguishedNames: String): Unit =
        organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames.toList())

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
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     */
    override fun serviceAccountCredentials(serviceAccountCredentials: IResolvable) {
      cdkBuilder.serviceAccountCredentials(serviceAccountCredentials.let(IResolvable::unwrap))
    }

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
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     */
    override
        fun serviceAccountCredentials(serviceAccountCredentials: ServiceAccountCredentialsProperty) {
      cdkBuilder.serviceAccountCredentials(serviceAccountCredentials.let(ServiceAccountCredentialsProperty::unwrap))
    }

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
     * @param serviceAccountCredentials The credentials for the service account used by the
     * streaming instance to connect to the directory. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5a0c83adc83a14fb99d0a0505704c2a65f27695fe7b75e36d0429547fa893c6")
    override
        fun serviceAccountCredentials(serviceAccountCredentials: ServiceAccountCredentialsProperty.Builder.() -> Unit):
        Unit =
        serviceAccountCredentials(ServiceAccountCredentialsProperty(serviceAccountCredentials))

    public fun build(): software.amazon.awscdk.services.appstream.CfnDirectoryConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDirectoryConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDirectoryConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfig):
        CfnDirectoryConfig = CfnDirectoryConfig(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryConfig):
        software.amazon.awscdk.services.appstream.CfnDirectoryConfig = wrapped.cdkObject
  }

  /**
   * The credentials for the service account used by the streaming instance to connect to the
   * directory.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * ServiceAccountCredentialsProperty serviceAccountCredentialsProperty =
   * ServiceAccountCredentialsProperty.builder()
   * .accountName("accountName")
   * .accountPassword("accountPassword")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html)
   */
  public interface ServiceAccountCredentialsProperty {
    /**
     * The user name of the account.
     *
     * This account must have the following privileges: create computer objects, join computers to
     * the domain, and change/reset the password on descendant computer objects for the organizational
     * units specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountname)
     */
    public fun accountName(): String

    /**
     * The password for the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountpassword)
     */
    public fun accountPassword(): String

    /**
     * A builder for [ServiceAccountCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountName The user name of the account. 
       * This account must have the following privileges: create computer objects, join computers to
       * the domain, and change/reset the password on descendant computer objects for the
       * organizational units specified.
       */
      public fun accountName(accountName: String)

      /**
       * @param accountPassword The password for the account. 
       */
      public fun accountPassword(accountPassword: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty.builder()

      /**
       * @param accountName The user name of the account. 
       * This account must have the following privileges: create computer objects, join computers to
       * the domain, and change/reset the password on descendant computer objects for the
       * organizational units specified.
       */
      override fun accountName(accountName: String) {
        cdkBuilder.accountName(accountName)
      }

      /**
       * @param accountPassword The password for the account. 
       */
      override fun accountPassword(accountPassword: String) {
        cdkBuilder.accountPassword(accountPassword)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty,
    ) : CdkObject(cdkObject), ServiceAccountCredentialsProperty {
      /**
       * The user name of the account.
       *
       * This account must have the following privileges: create computer objects, join computers to
       * the domain, and change/reset the password on descendant computer objects for the
       * organizational units specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountname)
       */
      override fun accountName(): String = unwrap(this).getAccountName()

      /**
       * The password for the account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountpassword)
       */
      override fun accountPassword(): String = unwrap(this).getAccountPassword()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceAccountCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty):
          ServiceAccountCredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as
          ServiceAccountCredentialsProperty

      internal fun unwrap(wrapped: ServiceAccountCredentialsProperty):
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.ServiceAccountCredentialsProperty
    }
  }

  /**
   * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider
   * (IdP) user identities to Active Directory domain-joined streaming instances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * CertificateBasedAuthPropertiesProperty certificateBasedAuthPropertiesProperty =
   * CertificateBasedAuthPropertiesProperty.builder()
   * .certificateAuthorityArn("certificateAuthorityArn")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-certificatebasedauthproperties.html)
   */
  public interface CertificateBasedAuthPropertiesProperty {
    /**
     * The ARN of the AWS Certificate Manager Private CA resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-certificatebasedauthproperties.html#cfn-appstream-directoryconfig-certificatebasedauthproperties-certificateauthorityarn)
     */
    public fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

    /**
     * The status of the certificate-based authentication properties.
     *
     * Fallback is turned on by default when certificate-based authentication is *Enabled* .
     * Fallback allows users to log in using their AD domain password if certificate-based
     * authentication is unsuccessful, or to unlock a desktop lock screen.
     * *Enabled_no_directory_login_fallback* enables certificate-based authentication, but does not
     * allow users to log in using their AD domain password. Users will be disconnected to
     * re-authenticate using certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-certificatebasedauthproperties.html#cfn-appstream-directoryconfig-certificatebasedauthproperties-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [CertificateBasedAuthPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateAuthorityArn The ARN of the AWS Certificate Manager Private CA resource.
       */
      public fun certificateAuthorityArn(certificateAuthorityArn: String)

      /**
       * @param status The status of the certificate-based authentication properties.
       * Fallback is turned on by default when certificate-based authentication is *Enabled* .
       * Fallback allows users to log in using their AD domain password if certificate-based
       * authentication is unsuccessful, or to unlock a desktop lock screen.
       * *Enabled_no_directory_login_fallback* enables certificate-based authentication, but does not
       * allow users to log in using their AD domain password. Users will be disconnected to
       * re-authenticate using certificates.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.builder()

      /**
       * @param certificateAuthorityArn The ARN of the AWS Certificate Manager Private CA resource.
       */
      override fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
      }

      /**
       * @param status The status of the certificate-based authentication properties.
       * Fallback is turned on by default when certificate-based authentication is *Enabled* .
       * Fallback allows users to log in using their AD domain password if certificate-based
       * authentication is unsuccessful, or to unlock a desktop lock screen.
       * *Enabled_no_directory_login_fallback* enables certificate-based authentication, but does not
       * allow users to log in using their AD domain password. Users will be disconnected to
       * re-authenticate using certificates.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty,
    ) : CdkObject(cdkObject), CertificateBasedAuthPropertiesProperty {
      /**
       * The ARN of the AWS Certificate Manager Private CA resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-certificatebasedauthproperties.html#cfn-appstream-directoryconfig-certificatebasedauthproperties-certificateauthorityarn)
       */
      override fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

      /**
       * The status of the certificate-based authentication properties.
       *
       * Fallback is turned on by default when certificate-based authentication is *Enabled* .
       * Fallback allows users to log in using their AD domain password if certificate-based
       * authentication is unsuccessful, or to unlock a desktop lock screen.
       * *Enabled_no_directory_login_fallback* enables certificate-based authentication, but does not
       * allow users to log in using their AD domain password. Users will be disconnected to
       * re-authenticate using certificates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-certificatebasedauthproperties.html#cfn-appstream-directoryconfig-certificatebasedauthproperties-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CertificateBasedAuthPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty):
          CertificateBasedAuthPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as
          CertificateBasedAuthPropertiesProperty

      internal fun unwrap(wrapped: CertificateBasedAuthPropertiesProperty):
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty
    }
  }
}
