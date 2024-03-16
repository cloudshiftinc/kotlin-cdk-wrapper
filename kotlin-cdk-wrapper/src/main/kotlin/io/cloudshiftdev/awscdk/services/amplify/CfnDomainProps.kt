@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amplify.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .appId("appId")
 * .domainName("domainName")
 * .subDomainSettings(List.of(SubDomainSettingProperty.builder()
 * .branchName("branchName")
 * .prefix("prefix")
 * .build()))
 * // the properties below are optional
 * .autoSubDomainCreationPatterns(List.of("autoSubDomainCreationPatterns"))
 * .autoSubDomainIamRole("autoSubDomainIamRole")
 * .certificate(CertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .certificateType("certificateType")
 * .certificateVerificationDnsRecord("certificateVerificationDnsRecord")
 * .build())
 * .certificateSettings(CertificateSettingsProperty.builder()
 * .certificateType("certificateType")
 * .customCertificateArn("customCertificateArn")
 * .build())
 * .enableAutoSubDomain(false)
 * .updateStatus("updateStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html)
 */
public interface CfnDomainProps {
  /**
   * The unique ID for an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid)
   */
  public fun appId(): String

  /**
   * Sets the branch patterns for automatic subdomain creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
   */
  public fun autoSubDomainCreationPatterns(): List<String> =
      unwrap(this).getAutoSubDomainCreationPatterns() ?: emptyList()

  /**
   * The required AWS Identity and Access Management (IAMlong) service role for the Amazon Resource
   * Name (ARN) for automatically creating subdomains.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomainiamrole)
   */
  public fun autoSubDomainIamRole(): String? = unwrap(this).getAutoSubDomainIamRole()

  /**
   * Describes the SSL/TLS certificate for the domain association.
   *
   * This can be your own custom certificate or the default certificate that Amplify provisions for
   * you.
   *
   * If you are updating your domain to use a different certificate, `Certificate` points to the new
   * certificate that is being created instead of the current active certificate. Otherwise,
   * `Certificate` points to the current active certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificate)
   */
  public fun certificate(): Any? = unwrap(this).getCertificate()

  /**
   * The type of SSL/TLS certificate to use for your custom domain.
   *
   * If you don't specify a certificate type, Amplify uses the default certificate that it
   * provisions and manages for you.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
   */
  public fun certificateSettings(): Any? = unwrap(this).getCertificateSettings()

  /**
   * The domain name for the domain association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname)
   */
  public fun domainName(): String

  /**
   * Enables the automated creation of subdomains for branches.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
   */
  public fun enableAutoSubDomain(): Any? = unwrap(this).getEnableAutoSubDomain()

  /**
   * The setting for the subdomain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
   */
  public fun subDomainSettings(): Any

  /**
   * The status of the domain update operation that is currently in progress.
   *
   * The following list describes the valid update states.
   *
   * * **REQUESTING_CERTIFICATE** - The certificate is in the process of being updated.
   * * **PENDING_VERIFICATION** - Indicates that an Amplify managed certificate is in the process of
   * being verified. This occurs during the creation of a custom domain or when a custom domain is
   * updated to use a managed certificate.
   * * **IMPORTING_CUSTOM_CERTIFICATE** - Indicates that an Amplify custom certificate is in the
   * process of being imported. This occurs during the creation of a custom domain or when a custom
   * domain is updated to use a custom certificate.
   * * **PENDING_DEPLOYMENT** - Indicates that the subdomain or certificate changes are being
   * propagated.
   * * **AWAITING_APP_CNAME** - Amplify is waiting for CNAME records corresponding to subdomains to
   * be propagated. If your custom domain is on Route 53, Amplify handles this for you automatically.
   * For more information about custom domains, see [Setting up custom
   * domains](https://docs.aws.amazon.com/amplify/latest/userguide/custom-domains.html) in the *Amplify
   * Hosting User Guide* .
   * * **UPDATE_COMPLETE** - The certificate has been associated with a domain.
   * * **UPDATE_FAILED** - The certificate has failed to be provisioned or associated, and there is
   * no existing active certificate to roll back to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-updatestatus)
   */
  public fun updateStatus(): String? = unwrap(this).getUpdateStatus()

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appId The unique ID for an Amplify app. 
     */
    public fun appId(appId: String)

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation.
     */
    public fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>)

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation.
     */
    public fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String)

    /**
     * @param autoSubDomainIamRole The required AWS Identity and Access Management (IAMlong) service
     * role for the Amazon Resource Name (ARN) for automatically creating subdomains.
     */
    public fun autoSubDomainIamRole(autoSubDomainIamRole: String)

    /**
     * @param certificate Describes the SSL/TLS certificate for the domain association.
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     */
    public fun certificate(certificate: IResolvable)

    /**
     * @param certificate Describes the SSL/TLS certificate for the domain association.
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     */
    public fun certificate(certificate: CfnDomain.CertificateProperty)

    /**
     * @param certificate Describes the SSL/TLS certificate for the domain association.
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac8985efe65679454cdffeb0bff15feae171a1d263f5910e6a0e6baa42a60e9a")
    public fun certificate(certificate: CfnDomain.CertificateProperty.Builder.() -> Unit)

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    public fun certificateSettings(certificateSettings: IResolvable)

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    public fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty)

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e349f2ec27d3a6fc697ced7e01c95b182e14bc3646efc46ef9dcf118a330c2b2")
    public
        fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty.Builder.() -> Unit)

    /**
     * @param domainName The domain name for the domain association. 
     */
    public fun domainName(domainName: String)

    /**
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches.
     */
    public fun enableAutoSubDomain(enableAutoSubDomain: Boolean)

    /**
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches.
     */
    public fun enableAutoSubDomain(enableAutoSubDomain: IResolvable)

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(subDomainSettings: IResolvable)

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(subDomainSettings: List<Any>)

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    public fun subDomainSettings(vararg subDomainSettings: Any)

    /**
     * @param updateStatus The status of the domain update operation that is currently in progress.
     * The following list describes the valid update states.
     *
     * * **REQUESTING_CERTIFICATE** - The certificate is in the process of being updated.
     * * **PENDING_VERIFICATION** - Indicates that an Amplify managed certificate is in the process
     * of being verified. This occurs during the creation of a custom domain or when a custom domain is
     * updated to use a managed certificate.
     * * **IMPORTING_CUSTOM_CERTIFICATE** - Indicates that an Amplify custom certificate is in the
     * process of being imported. This occurs during the creation of a custom domain or when a custom
     * domain is updated to use a custom certificate.
     * * **PENDING_DEPLOYMENT** - Indicates that the subdomain or certificate changes are being
     * propagated.
     * * **AWAITING_APP_CNAME** - Amplify is waiting for CNAME records corresponding to subdomains
     * to be propagated. If your custom domain is on Route 53, Amplify handles this for you
     * automatically. For more information about custom domains, see [Setting up custom
     * domains](https://docs.aws.amazon.com/amplify/latest/userguide/custom-domains.html) in the
     * *Amplify Hosting User Guide* .
     * * **UPDATE_COMPLETE** - The certificate has been associated with a domain.
     * * **UPDATE_FAILED** - The certificate has failed to be provisioned or associated, and there
     * is no existing active certificate to roll back to.
     */
    public fun updateStatus(updateStatus: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnDomainProps.Builder =
        software.amazon.awscdk.services.amplify.CfnDomainProps.builder()

    /**
     * @param appId The unique ID for an Amplify app. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation.
     */
    override fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>) {
      cdkBuilder.autoSubDomainCreationPatterns(autoSubDomainCreationPatterns)
    }

    /**
     * @param autoSubDomainCreationPatterns Sets the branch patterns for automatic subdomain
     * creation.
     */
    override fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String): Unit =
        autoSubDomainCreationPatterns(autoSubDomainCreationPatterns.toList())

    /**
     * @param autoSubDomainIamRole The required AWS Identity and Access Management (IAMlong) service
     * role for the Amazon Resource Name (ARN) for automatically creating subdomains.
     */
    override fun autoSubDomainIamRole(autoSubDomainIamRole: String) {
      cdkBuilder.autoSubDomainIamRole(autoSubDomainIamRole)
    }

    /**
     * @param certificate Describes the SSL/TLS certificate for the domain association.
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     */
    override fun certificate(certificate: IResolvable) {
      cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
    }

    /**
     * @param certificate Describes the SSL/TLS certificate for the domain association.
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     */
    override fun certificate(certificate: CfnDomain.CertificateProperty) {
      cdkBuilder.certificate(certificate.let(CfnDomain.CertificateProperty::unwrap))
    }

    /**
     * @param certificate Describes the SSL/TLS certificate for the domain association.
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac8985efe65679454cdffeb0bff15feae171a1d263f5910e6a0e6baa42a60e9a")
    override fun certificate(certificate: CfnDomain.CertificateProperty.Builder.() -> Unit): Unit =
        certificate(CfnDomain.CertificateProperty(certificate))

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    override fun certificateSettings(certificateSettings: IResolvable) {
      cdkBuilder.certificateSettings(certificateSettings.let(IResolvable::unwrap))
    }

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    override fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty) {
      cdkBuilder.certificateSettings(certificateSettings.let(CfnDomain.CertificateSettingsProperty::unwrap))
    }

    /**
     * @param certificateSettings The type of SSL/TLS certificate to use for your custom domain.
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e349f2ec27d3a6fc697ced7e01c95b182e14bc3646efc46ef9dcf118a330c2b2")
    override
        fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty.Builder.() -> Unit):
        Unit = certificateSettings(CfnDomain.CertificateSettingsProperty(certificateSettings))

    /**
     * @param domainName The domain name for the domain association. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches.
     */
    override fun enableAutoSubDomain(enableAutoSubDomain: Boolean) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
    }

    /**
     * @param enableAutoSubDomain Enables the automated creation of subdomains for branches.
     */
    override fun enableAutoSubDomain(enableAutoSubDomain: IResolvable) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain.let(IResolvable::unwrap))
    }

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(subDomainSettings: IResolvable) {
      cdkBuilder.subDomainSettings(subDomainSettings.let(IResolvable::unwrap))
    }

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(subDomainSettings: List<Any>) {
      cdkBuilder.subDomainSettings(subDomainSettings)
    }

    /**
     * @param subDomainSettings The setting for the subdomain. 
     */
    override fun subDomainSettings(vararg subDomainSettings: Any): Unit =
        subDomainSettings(subDomainSettings.toList())

    /**
     * @param updateStatus The status of the domain update operation that is currently in progress.
     * The following list describes the valid update states.
     *
     * * **REQUESTING_CERTIFICATE** - The certificate is in the process of being updated.
     * * **PENDING_VERIFICATION** - Indicates that an Amplify managed certificate is in the process
     * of being verified. This occurs during the creation of a custom domain or when a custom domain is
     * updated to use a managed certificate.
     * * **IMPORTING_CUSTOM_CERTIFICATE** - Indicates that an Amplify custom certificate is in the
     * process of being imported. This occurs during the creation of a custom domain or when a custom
     * domain is updated to use a custom certificate.
     * * **PENDING_DEPLOYMENT** - Indicates that the subdomain or certificate changes are being
     * propagated.
     * * **AWAITING_APP_CNAME** - Amplify is waiting for CNAME records corresponding to subdomains
     * to be propagated. If your custom domain is on Route 53, Amplify handles this for you
     * automatically. For more information about custom domains, see [Setting up custom
     * domains](https://docs.aws.amazon.com/amplify/latest/userguide/custom-domains.html) in the
     * *Amplify Hosting User Guide* .
     * * **UPDATE_COMPLETE** - The certificate has been associated with a domain.
     * * **UPDATE_FAILED** - The certificate has failed to be provisioned or associated, and there
     * is no existing active certificate to roll back to.
     */
    override fun updateStatus(updateStatus: String) {
      cdkBuilder.updateStatus(updateStatus)
    }

    public fun build(): software.amazon.awscdk.services.amplify.CfnDomainProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplify.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    /**
     * The unique ID for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-appid)
     */
    override fun appId(): String = unwrap(this).getAppId()

    /**
     * Sets the branch patterns for automatic subdomain creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomaincreationpatterns)
     */
    override fun autoSubDomainCreationPatterns(): List<String> =
        unwrap(this).getAutoSubDomainCreationPatterns() ?: emptyList()

    /**
     * The required AWS Identity and Access Management (IAMlong) service role for the Amazon
     * Resource Name (ARN) for automatically creating subdomains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-autosubdomainiamrole)
     */
    override fun autoSubDomainIamRole(): String? = unwrap(this).getAutoSubDomainIamRole()

    /**
     * Describes the SSL/TLS certificate for the domain association.
     *
     * This can be your own custom certificate or the default certificate that Amplify provisions
     * for you.
     *
     * If you are updating your domain to use a different certificate, `Certificate` points to the
     * new certificate that is being created instead of the current active certificate. Otherwise,
     * `Certificate` points to the current active certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificate)
     */
    override fun certificate(): Any? = unwrap(this).getCertificate()

    /**
     * The type of SSL/TLS certificate to use for your custom domain.
     *
     * If you don't specify a certificate type, Amplify uses the default certificate that it
     * provisions and manages for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-certificatesettings)
     */
    override fun certificateSettings(): Any? = unwrap(this).getCertificateSettings()

    /**
     * The domain name for the domain association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * Enables the automated creation of subdomains for branches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-enableautosubdomain)
     */
    override fun enableAutoSubDomain(): Any? = unwrap(this).getEnableAutoSubDomain()

    /**
     * The setting for the subdomain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-subdomainsettings)
     */
    override fun subDomainSettings(): Any = unwrap(this).getSubDomainSettings()

    /**
     * The status of the domain update operation that is currently in progress.
     *
     * The following list describes the valid update states.
     *
     * * **REQUESTING_CERTIFICATE** - The certificate is in the process of being updated.
     * * **PENDING_VERIFICATION** - Indicates that an Amplify managed certificate is in the process
     * of being verified. This occurs during the creation of a custom domain or when a custom domain is
     * updated to use a managed certificate.
     * * **IMPORTING_CUSTOM_CERTIFICATE** - Indicates that an Amplify custom certificate is in the
     * process of being imported. This occurs during the creation of a custom domain or when a custom
     * domain is updated to use a custom certificate.
     * * **PENDING_DEPLOYMENT** - Indicates that the subdomain or certificate changes are being
     * propagated.
     * * **AWAITING_APP_CNAME** - Amplify is waiting for CNAME records corresponding to subdomains
     * to be propagated. If your custom domain is on Route 53, Amplify handles this for you
     * automatically. For more information about custom domains, see [Setting up custom
     * domains](https://docs.aws.amazon.com/amplify/latest/userguide/custom-domains.html) in the
     * *Amplify Hosting User Guide* .
     * * **UPDATE_COMPLETE** - The certificate has been associated with a domain.
     * * **UPDATE_FAILED** - The certificate has failed to be provisioned or associated, and there
     * is no existing active certificate to roll back to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-domain.html#cfn-amplify-domain-updatestatus)
     */
    override fun updateStatus(): String? = unwrap(this).getUpdateStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomainProps):
        CfnDomainProps = CdkObjectWrappers.wrap(cdkObject) as CfnDomainProps

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.amplify.CfnDomainProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.amplify.CfnDomainProps
  }
}
